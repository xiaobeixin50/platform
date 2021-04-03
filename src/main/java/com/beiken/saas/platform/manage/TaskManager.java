package com.beiken.saas.platform.manage;

import com.alibaba.fastjson.JSONObject;
import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.TaskQuery;
import com.beiken.saas.platform.biz.vo.*;
import com.beiken.saas.platform.controller.UserController;
import com.beiken.saas.platform.enums.*;
import com.beiken.saas.platform.mapper.*;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.utils.CodeUtil;
import com.beiken.saas.platform.utils.DateUtil;
import com.beiken.saas.platform.utils.SwitchUtil;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午6:56
 */
@Component
public class TaskManager {

    @Resource
    private InspectTaskMapper taskMapper;
    @Resource
    private InspectTaskItemMapper taskItemMapper;
    @Resource
    private BgInspectItemMapper bgInspectItemMapper;
    @Resource
    private RigMapper rigMapper;
    @Resource
    private DangerManager dangerManager;
    @Resource
    private UserController userController;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private CodeUtil codeUtil;
    @Resource
    private TaskUserMapper taskUserMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private SwitchUtil switchUtil;


    /**
     * 后台列表
     *
     * @param taskQuery
     * @return
     */
    public PageBo<TaskVO> list(TaskQuery taskQuery) {
        PageBo<TaskVO> pageBo = new PageBo<>();
        List<TaskVO> taskList = Lists.newArrayList();
        InspectTaskDOExample taskExample = buildTaskExample(taskQuery);
        List<InspectTaskDO> inspectTasks = taskMapper.selectByExample(taskExample);
        for (InspectTaskDO inspectTask : inspectTasks) {
            TaskVO taskVO = new TaskVO();
            BeanUtils.copyProperties(inspectTask, taskVO);
            taskList.add(taskVO);
        }
        long count = taskMapper.countByExample(taskExample);
        pageBo.setItemList(taskList);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    /**
     * 查询当前用户有哪些巡检任务code
     */
    public List<String> getTaskCodeByInspectUser(Long inspectUserId, Integer pageNo, Integer pageSize) {
        TaskUserDOExample example = new TaskUserDOExample();
        if (pageNo != null) {
            example.setLimitStart((pageNo - 1) * pageSize);
        }
        if (pageSize != null) {
            example.setCount(pageSize);
        }
        example.setOrderByClause("gmt_create desc");
        example.createCriteria().andInspectUserIdEqualTo(inspectUserId);
        List<TaskUserDO> taskUserDOs = taskUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(taskUserDOs)) {
            return Collections.emptyList();
        }
        Set<String> collect = taskUserDOs.stream().map(TaskUserDO::getTaskCode).collect(Collectors.toSet());
        return Lists.newArrayList(collect);
    }


    public List<InspectTaskItemDO> getRigByCode(List<String> taskCodes, String rigCode) {
        if (CollectionUtils.isEmpty(taskCodes)) {
            return Collections.emptyList();
        }
        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
        InspectTaskItemDOExample.Criteria criteria = example.createCriteria().andTaskCodeIn(taskCodes);
        if (StringUtils.isNotBlank(rigCode)) {
            criteria.andRigCodeEqualTo(rigCode);
        }
        List<InspectTaskItemDO> itemDOs = taskItemMapper.selectByExample(example);
        return itemDOs;
    }


    /**
     * 获取巡检任务列表
     *
     * @param userId
     * @return
     */
    public PageBo<TaskListVO> listByUser(Long userId, String rigCode, Integer pageNo, Integer pageSize) {
        PageBo<TaskListVO> pageBo = new PageBo<>();

        Date now = new Date();
        List<String> taskCodes = getTaskCodeByInspectUser(userId, pageNo, pageSize);
        List<InspectTaskItemDO> taskItemList = getRigByCode(taskCodes, rigCode);
        Set<String> taskCodeSet = taskItemList.stream().map(InspectTaskItemDO::getTaskCode).collect(Collectors.toSet());

        List<InspectTaskDO> inspectTasks = null;
        InspectTaskDOExample taskDOExample = new InspectTaskDOExample();
        if (!CollectionUtils.isEmpty(taskCodeSet)) {
            taskDOExample.createCriteria()
                    .andTaskCodeIn(Lists.newArrayList(taskCodeSet));
            taskDOExample.setOrderByClause("start_time desc");
            inspectTasks = taskMapper.selectByExample(taskDOExample);
        }
        if (CollectionUtils.isEmpty(inspectTasks)) {
            return pageBo;
        }
        List<TaskVO> taskVOList = Lists.newArrayList();

        for (InspectTaskDO inspectTask : inspectTasks) {
            if (TaskStatusEnum.NOT_BEGIN.getStatus().equals(inspectTask.getStatus())
                    && now.compareTo(inspectTask.getEndTime()) < 0
                    && switchUtil.match("updateAfterTime", "open")) {
                updateTaskStatus(inspectTask.getTaskCode(), TaskStatusEnum.AFTER_TIME.getStatus());
                inspectTask.setStatus(TaskStatusEnum.AFTER_TIME.getStatus());
                updateAfterTimeTask(inspectTask.getTaskCode());
            }
            TaskVO taskVO = new TaskVO();
            BeanUtils.copyProperties(inspectTask, taskVO);
            taskVO.setTaskStartTime(inspectTask.getStartTime());
            taskVO.setTaskEndTime(inspectTask.getEndTime());

            InspectTaskItemDOExample taskItemDOExample = new InspectTaskItemDOExample();
            InspectTaskItemDOExample.Criteria criteria = taskItemDOExample.createCriteria()
                    .andTaskCodeEqualTo(inspectTask.getTaskCode()).andRigCodeEqualTo(rigCode);

            Long totalNum = taskItemMapper.countByExample(taskItemDOExample);
            taskVO.setItemNum(totalNum);

            criteria.andResultStatusIsNotNull();
            Long finishNum = taskItemMapper.countByExample(taskItemDOExample);
            BigDecimal bg = new BigDecimal((double)(finishNum == 0L ? 0L : finishNum) / ((totalNum == 0) ? 1 : totalNum) * 100);
            taskVO.setFinishTaskItemNum(bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

            Long dangerNum = dangerManager.countDangerNumByTask(inspectTask.getTaskCode(), rigCode);
            if (Objects.nonNull(dangerNum) && !Constants.ZERO_LONG.equals(dangerNum)) {
                taskVO.setDangerNum(dangerNum.intValue());
            }
            taskVOList.add(taskVO);
        }
        long count = taskMapper.countByExample(taskDOExample);
        pageBo.setItemList(generatorTaskList(taskVOList));
        pageBo.setTotalSize(count);
        return pageBo;
    }

    public boolean updateTaskStatus(String taskCode, Integer status) {
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        InspectTaskDO taskDO = new InspectTaskDO();
        taskDO.setStatus(status);
        int result = taskMapper.updateByExampleSelective(taskDO, example);
        if (result > 0) {
            return true;
        }
        return false;
    }

    public void updateAfterTimeTask(String taskCode) {
        InspectTaskItemDO taskItemDO = new InspectTaskItemDO();
        taskItemDO.setResultStatus(TaskItemStatusEnum.AFTER_TIME.getStatus());
        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode).andResultStatusIsNull();
        taskItemMapper.updateByExampleSelective(taskItemDO, example);
    }

    /**
     * 获取巡检任务检查项
     *
     * @param taskCode
     * @return
     */
    public PageBo<TaskItemListVO> listTaskItem(String taskCode, String rigCode) {
        PageBo<TaskItemListVO> pageBo = new PageBo<>();
        List<TaskItemListVO> result = Lists.newArrayList();

        Map<String, List<TaskItemListVO>> siteMap = Maps.newHashMap();

        List<InspectTaskItemDO> taskItems = getRigByCode(Lists.newArrayList(taskCode), rigCode);

        Set<String> bgItemCodeSet = taskItems.stream().map(InspectTaskItemDO::getBgItemCode).collect(Collectors.toSet());
        BgInspectItemDOExample bgItemExample = new BgInspectItemDOExample();
        bgItemExample.createCriteria().andBgItemCodeIn(Lists.newArrayList(bgItemCodeSet));
        List<BgInspectItemDO> bgInspectItems = bgInspectItemMapper.selectByExampleWithBLOBs(bgItemExample);
        if (CollectionUtils.isEmpty(bgInspectItems)) {
            return pageBo;
        }
        Map<String, BgInspectItemDO> bgItemMap = bgInspectItems.stream().collect(Collectors.toMap(BgInspectItemDO::getBgItemCode, p -> p));

        Long deptId = taskItems.get(0).getDeptId();

        UserDO userDO = userController.getCaptUserByDeptId(deptId, RoleEnum.RIG_MANAGER.getMsg());

        for (InspectTaskItemDO taskItem : taskItems) {
            BgInspectItemDO bgItemDO = bgItemMap.get(taskItem.getBgItemCode());
            if (bgItemDO == null) {
                continue;
            }
            TaskItemListVO.Extra extra = new TaskItemListVO.Extra();
            copyBgItem2Extra(bgItemDO, extra);
            TaskItemStatusEnum index = TaskItemStatusEnum.index(taskItem.getResultStatus());
            extra.setStatus(index == null ? null : index.getMsg());
            extra.setDeptId(deptId);
            if (userDO != null) {
                extra.setResponsibilityUserId(userDO.getId());
                extra.setResponsibilityUserName(userDO.getName());
            }
            extra.setRigCode(taskItem.getRigCode());

            if (!siteMap.containsKey(bgItemDO.getSite())) {
                TaskItemListVO vo = new TaskItemListVO();
                vo.setSite(bgItemDO.getSite());
                vo.setTaskCode(taskCode);
                vo.setEquipment(Maps.newHashMap());
                List<TaskItemListVO> taskItemList = Lists.newArrayList();
                taskItemList.add(vo);
                if (!vo.getEquipment().containsKey(bgItemDO.getEquipment())) {
                    List<TaskItemListVO.Extra> extraList = Lists.newArrayList();
                    extraList.add(extra);
                    vo.getEquipment().put(bgItemDO.getEquipment(), extraList);
                } else {
                    vo.getEquipment().get(bgItemDO.getEquipment()).add(extra);
                }
                siteMap.put(bgItemDO.getSite(), taskItemList);
            } else {
                List<TaskItemListVO> taskItemListVOs = siteMap.get(bgItemDO.getSite());
                for (TaskItemListVO vo : taskItemListVOs) {
                    if (!vo.getEquipment().containsKey(bgItemDO.getEquipment())) {
                        List<TaskItemListVO.Extra> extraList = Lists.newArrayList();
                        extraList.add(extra);
                        vo.getEquipment().put(bgItemDO.getEquipment(), extraList);
                    } else {
                        vo.getEquipment().get(bgItemDO.getEquipment()).add(extra);
                    }
                }
            }

        }
        int totalItem = 0;
        int totalFinishItem = 0;
        for (String s : siteMap.keySet()) {
            int finish = 0;
            int total = 0;
            for (TaskItemListVO taskItemListVO : siteMap.get(s)) {
                for (List<TaskItemListVO.Extra> extras : taskItemListVO.getEquipment().values()) {
                    for (TaskItemListVO.Extra extra : extras) {
                        total = total + 1;
                        totalItem = totalItem + 1;
                        if (extra.getStatus() != null) {
                            finish = finish + 1;
                            totalFinishItem = totalFinishItem + 1;
                        }
                    }
                }
                if (total != 0 && total == finish) {
                    taskItemListVO.setSiteStatus(1);
                }
            }
            result.addAll(siteMap.get(s));
        }
        if (totalItem == totalFinishItem) {
            updateTaskStatus(taskCode, TaskStatusEnum.FINISH.getStatus());
        }
        pageBo.setItemList(result);
        return pageBo;
    }



    /**
     * 查询一个人需要巡检的井
     *
     * @param userId
     * @return
     */
    public UserRigVO getTaskUserRig(Long userId, List<InspectTaskItemDO> taskItemDOs) {
        UserRigVO userRigVO = new UserRigVO();
        userRigVO.setUserId(userId);

        if (CollectionUtils.isEmpty(taskItemDOs)) {
            return null;
        }
        Set<String> rigIdSet = taskItemDOs.stream().map(InspectTaskItemDO::getRigCode).collect(Collectors.toSet());

        RigDOExample rigExample = new RigDOExample();
        rigExample.createCriteria()
                .andStatusIn(Lists.newArrayList(RigStatusEnum.BEGIN.getStatus(), RigStatusEnum.FINISH.getStatus()))
                .andRigCodeIn(Lists.newArrayList(rigIdSet));
        List<RigDO> rigDOs = rigMapper.selectByExample(rigExample);
        if (CollectionUtils.isEmpty(rigDOs)) {
            return null;
        }

        Map<DeptVO, List<RigVO>> taskTitleMap = Maps.newHashMap();
        for (RigDO rigDO : rigDOs) {
            RigVO rigVO = new RigVO();
            BeanUtils.copyProperties(rigDO, rigVO);
            rigVO.setStatus(RigStatusEnum.index(rigDO.getStatus()).getMsg());

            DeptVO deptVO = new DeptVO();
            deptVO.setDeptId(rigDO.getDeptId());
            deptVO.setDeptName(rigDO.getDeptName());

            if (!taskTitleMap.containsKey(deptVO)) {
                List<RigVO> rigList = Lists.newArrayList();
                rigList.add(rigVO);
                taskTitleMap.put(deptVO, rigList);
            } else {
                taskTitleMap.get(deptVO).add(rigVO);
            }
        }

        Map<String, List<RigVO>> resultMap = Maps.newHashMap();
        for (DeptVO deptVO : taskTitleMap.keySet()) {
            resultMap.put(JSONObject.toJSONString(deptVO), taskTitleMap.get(deptVO));
        }
        userRigVO.setTaskTitleMap(resultMap);
        userRigVO.setUserId(userId);
        return userRigVO;
    }

    public String updateTaskItem(TaskItemVO taskItemVO) {
        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
        example.createCriteria()
                .andTaskCodeEqualTo(taskItemVO.getTaskCode())
                .andBgItemCodeEqualTo(taskItemVO.getBgItemCode())
                .andRigCodeEqualTo(taskItemVO.getRigCode());

        //todo 加一个photo
        InspectTaskItemDO inspectTaskItem = new InspectTaskItemDO();
        inspectTaskItem.setEndDate(taskItemVO.getChangeEndDate());
        inspectTaskItem.setResultStatus(taskItemVO.getResultStatus());
        inspectTaskItem.setReportTime(new Date());
        inspectTaskItem.setReportExtra(taskItemVO.getReportExtra());
        inspectTaskItem.setPhoto(taskItemVO.getPhoto());
        inspectTaskItem.setRigCode(taskItemVO.getRigCode());
        inspectTaskItem.setBgItemCode(taskItemVO.getBgItemCode());
        inspectTaskItem.setTaskCode(taskItemVO.getTaskCode());
        int updateResult = taskItemMapper.updateByExampleSelective(inspectTaskItem, example);
        if (updateResult < 0) {
            return "更新任务详情失败";
        }

        //这里设计的不好,应该用一个表来存结果,时间紧迫 先这样了...
        if (TaskItemStatusEnum.DISQUALIFY.equals(
                TaskItemStatusEnum.index(taskItemVO.getResultStatus()))) {
            if (taskItemVO.getDeptId() == null) {
                return "未上传隐患单位";
            }
            if (StringUtils.isBlank(taskItemVO.getRigCode())) {
                return "未上传隐患井";
            }
            String dangerCode = codeUtil.buildDangerCode(taskItemVO.getDeptId());
            DangerVO dangerVO = new DangerVO();
            BeanUtils.copyProperties(taskItemVO, dangerVO);
            dangerVO.setChangeEndDate(taskItemVO.getChangeEndDate());
            dangerVO.setReportTime(new Date());
            dangerVO.setReportType(Constants.ZERO_INT);
            dangerVO.setInspectUserId(null);
            dangerVO.setInspectUserName(null);
            dangerVO.setFindUserId(taskItemVO.getInspectUserId());
            dangerVO.setFindUserName(taskItemVO.getInspectUserName());
            dangerVO.setResponsibilityUserId(Long.valueOf(taskItemVO.getResponsibilityUserId()));
            dangerVO.setDangerCode(dangerCode);
            dangerVO.setPhoto(taskItemVO.getPhoto());
            dangerVO.setIsInspect(0);
            Long userId = dangerVO.getFindUserId();
            UserDO userDO = userMapper.selectByPrimaryKey(userId);
            if (userDO.getRole().equals("监理")) {
                dangerVO.setIsInspect(1);
            }

            List<Integer> integerList = Constants.STATUS_MAP.get(dangerVO.getReportType()).get(dangerVO.getDangerLevel());
            if (CollectionUtils.isEmpty(integerList)) {
                return "未传隐患级别";
            }

            dangerVO.setReportStatus(integerList.get(0));
            boolean result = dangerManager.addDanger(dangerVO);
            if (!result) {
                return "隐患插入失败";
            }
        }
        return "true";
    }

    /**
     * 查询某个检查项的详细信息
     *
     * @param taskCode
     * @param bgItemCode
     * @return
     */
    public TaskItemListVO.Extra info(String taskCode, String bgItemCode, String rigCode, Integer reportType) {
        TaskItemListVO.Extra extra = new TaskItemListVO.Extra();

        InspectTaskItemDOExample example = new InspectTaskItemDOExample();
        example.createCriteria()
                .andTaskCodeEqualTo(taskCode)
                .andBgItemCodeEqualTo(bgItemCode)
                .andRigCodeEqualTo(rigCode);
        List<InspectTaskItemDO> taskItems = taskItemMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(taskItems)) {
            return null;
        }
        InspectTaskItemDO taskItemDO = taskItems.get(0);
        BgInspectItemDOExample bgItemExample = new BgInspectItemDOExample();
        bgItemExample.createCriteria().andBgItemCodeEqualTo(taskItemDO.getBgItemCode());
        List<BgInspectItemDO> bgInspectItems = bgInspectItemMapper.selectByExample(bgItemExample);
        if (CollectionUtils.isEmpty(bgInspectItems)) {
            return null;
        }
        BeanUtils.copyProperties(taskItemDO, extra);
        if (StringUtils.isNotBlank(taskItemDO.getPhoto())) {
            List<String> photo = Splitter.on(Constants.COMMON).omitEmptyStrings().trimResults().splitToList(taskItemDO.getPhoto());
            extra.setPhotoList(photo);
        }
        BgInspectItemDO bgItemDO = bgInspectItems.get(0);
        HiddenDangerDO hiddenDangerDO = dangerManager.dangerInfoByCode(taskCode, bgItemCode, rigCode, reportType);
        if (Objects.nonNull(hiddenDangerDO)) {
            BeanUtils.copyProperties(hiddenDangerDO, extra);
            extra.setInspectUserId(hiddenDangerDO.getFindUserId());
            extra.setInspectUserName(hiddenDangerDO.getFindUserName());
            extra.setDangerLevel(
                    DangerLevelEnum.index(hiddenDangerDO.getDangerLevel()) != null ? DangerLevelEnum.index(hiddenDangerDO.getDangerLevel()).getMsg() : null);
            String photo = hiddenDangerDO.getPhoto();
            if (StringUtils.isNotBlank(photo)) {
                List<String> list = Splitter.on(Constants.COMMON).omitEmptyStrings().trimResults().splitToList(photo);
                extra.setPhotoList(list);
            }
        }
        TaskItemStatusEnum index = TaskItemStatusEnum.index(taskItemDO.getResultStatus());
        extra.setStatus(index == null ? null : index.getMsg());
        extra.setTaskCode(taskCode);
        copyBgItem2Extra(bgItemDO, extra);
        InspectTaskDOExample taskExample = new InspectTaskDOExample();
        taskExample.createCriteria().andTaskCodeEqualTo(taskCode);
        List<InspectTaskDO> inspectTaskDOs = taskMapper.selectByExample(taskExample);
        if (!CollectionUtils.isEmpty(inspectTaskDOs)) {
            Long deptId = inspectTaskDOs.get(0).getDeptId();
            extra.setDeptId(deptId);
            UserDO userDO = userController.getCaptUserByDeptId(deptId, RoleEnum.MANAGER.getMsg());
            if (userDO != null) {
                extra.setResponsibilityUserId(userDO.getId());
                extra.setResponsibilityUserName(userDO.getName());
            }
        }
        return extra;
    }

    public SelfVO countTaskAndDanger(Long userId) {
        SelfVO selfVO = new SelfVO();
        selfVO.setDangerNum(0L);
        selfVO.setAfterTimeTask(0L);
        Long dangerNum = dangerManager.countDangerNumByInspectUser(userId);
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.createCriteria()
                .andInspectUserIdEqualTo(userId)
                .andStatusEqualTo(TaskStatusEnum.AFTER_TIME.getStatus());
        long finishTask = taskMapper.countByExample(example);

        selfVO.setDangerNum(dangerNum);
        selfVO.setAfterTimeTask(finishTask);
        return selfVO;
    }


    private InspectTaskDOExample buildTaskExample(TaskQuery taskQuery) {
        InspectTaskDOExample example = new InspectTaskDOExample();
        InspectTaskDOExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("start_time desc");

        example.setLimitStart((taskQuery.getPageNo() - 1) * taskQuery.getPageSize());
        example.setCount((taskQuery.getPageSize()));

        if (Objects.nonNull(taskQuery.getInspectUserId())) {
            criteria.andInspectUserIdEqualTo(taskQuery.getInspectUserId());
        }
        if (Objects.nonNull(taskQuery.getRigCode())) {
            criteria.andRigCodeEqualTo(taskQuery.getRigCode());
        }
        return example;

    }

    private List<TaskListVO> generatorTaskList(List<TaskVO> taskVOList) {
        if (CollectionUtils.isEmpty(taskVOList)) {
            return Collections.emptyList();
        }
        List<TaskListVO> taskList = Lists.newArrayList();
        Date now = new Date();

        Map<String, List<TaskVO>> map = Maps.newLinkedHashMap();

        for (TaskVO taskVO : taskVOList) {
            Date taskStartTime = taskVO.getTaskStartTime();
            String key = null;
            if (DateUtil.isSameDay(taskStartTime, now)) {
                key = "今日任务";
            } else {
                key = DateUtil.formatDate(DateUtil.getStartOfMonth(taskStartTime), DateUtil.DEFAULT_PARTERN_MONTH);
            }
            if (!map.containsKey(key)) {
                List<TaskVO> list = Lists.newArrayList();
                list.add(taskVO);
                map.put(key, list);
            } else {
                map.get(key).add(taskVO);
            }
        }
        for (String s : map.keySet()) {
            TaskListVO taskListVO = new TaskListVO();
            taskListVO.setDate(s);
            taskListVO.setTaskVOList(map.get(s));
            taskList.add(taskListVO);
        }
        return taskList;
    }

    public List<InspectTaskDO> getTaskByPlanCode(String inspectPlanCode, Date startTime, Date endTime) {
        if (StringUtils.isBlank(inspectPlanCode)) {
            return Collections.emptyList();
        }
        InspectTaskDOExample example = new InspectTaskDOExample();
        example.createCriteria()
                .andInspectPlanCodeEqualTo(inspectPlanCode)
                .andStartTimeLessThanOrEqualTo(startTime)
                .andEndTimeGreaterThanOrEqualTo(endTime);
        List<InspectTaskDO> inspectTaskDOs = taskMapper.selectByExample(example);
        return inspectTaskDOs;
    }

    private void copyBgItem2Extra(BgInspectItemDO bgItemDO, TaskItemListVO.Extra extra) {
        BeanUtils.copyProperties(bgItemDO, extra);
        extra.setAdapt(bgItemDO.getAdapt());
        extra.setControlExtra(bgItemDO.getControlExtra());
        extra.setBgItemCode(bgItemDO.getBgItemCode());
    }
}

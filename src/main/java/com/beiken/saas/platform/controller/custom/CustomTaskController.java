package com.beiken.saas.platform.controller.custom;

import com.alibaba.fastjson.JSON;
import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.*;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.manage.TaskManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 下午4:07
 */
@Api(value = "/custom/task", description = "用户端巡检任务相关接口", tags = "巡检任务接口")
@RestController
@RequestMapping("/custom/task")
public class CustomTaskController {

    @Resource
    private TaskManager taskManager;

    @ApiOperation("获取单人任务列表")
    @ResponseBody
    @GetMapping(value = "/list/{userId}/{rigCode}")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "检查人id", required = true, dataType = "Long")
            , @ApiImplicitParam(name = "rigCode", value = "井code", required = true, dataType = "String")
            , @ApiImplicitParam(name = "pageNo", value = "pageNo", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "pageSize", value = "pageSize", required = false, dataType = "Integer")})
    public Result list(@PathVariable Long userId, @PathVariable String rigCode,
                       @RequestParam(required = false)Integer pageNo, @RequestParam(required = false)Integer pageSize) {
        try {
            //mock
            PageBo<TaskListVO> mockPageBo = new PageBo<>();
            mockPageBo.setTotalSize(1L);
            mockPageBo.setTotalPage(1L);
            List<TaskListVO> result = Lists.newArrayList();
            TaskListVO taskListVO1 = new TaskListVO();
            TaskListVO taskListVO2 = new TaskListVO();
            taskListVO1.setDate("今日任务");
            List<TaskVO> taskVOList1  = Lists.newArrayList();
            TaskVO taskVO1 = new TaskVO();
            taskVO1.setTaskCode("BKNY-JCRW-12323232002");
            taskVO1.setName("日常巡检1");
            taskVO1.setQuickly(1);
            taskVO1.setStatus(0);
            taskVO1.setTaskStartTime(new Date());
            taskVO1.setTaskEndTime(new Date());
            taskVO1.setItemNum(20L);
            taskVO1.setFinishTaskItemNum(0.2);
            TaskVO taskVO2 = new TaskVO();
            taskVO2.setName("日常巡检2");
            taskVO2.setTaskStartTime(new Date());
            taskVO2.setTaskEndTime(new Date());
            taskVO2.setItemNum(30L);
            taskVO2.setStatus(1);
            taskVO2.setFinishTaskItemNum(0.0);
            taskVO2.setTaskCode("BKNY-JCRW-12323232001");
            taskVOList1.add(taskVO2);
            taskListVO1.setTaskVOList(taskVOList1);

            taskListVO2.setDate("2021-12");
            List<TaskVO> taskVOList2  = Lists.newArrayList();
            TaskVO taskVO3 = new TaskVO();
            taskVO3.setName("日常巡检3");
            taskVO3.setTaskStartTime(new Date());
            taskVO3.setTaskEndTime(new Date());
            taskVO3.setItemNum(2L);
            taskVO3.setTaskCode("BKNY-JCRW-12323232003");
            taskVO3.setStatus(2);
            taskVO3.setFinishTaskItemNum(0.0);
            TaskVO taskVO4 = new TaskVO();
            taskVO4.setName("日常巡检4");
            taskVO4.setTaskStartTime(new Date());
            taskVO4.setTaskEndTime(new Date());
            taskVO4.setItemNum(50L);
            taskVO4.setStatus(3);
            taskVO4.setTaskCode("BKNY-JCRW-12323232006");
            taskVO4.setFinishTaskItemNum(0.0);
            taskVOList2.add(taskVO4);
            taskListVO2.setTaskVOList(taskVOList2);
            result.add(taskListVO1);
            result.add(taskListVO2);
            mockPageBo.setItemList(result);
            return Result.success(mockPageBo);

            //PageBo<TaskListVO> pageBo = taskManager.listByUser(userId, rigCode);
            //return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("获取当前用户所在的的井队/对应的子公司和对应的钻井号")
    @ResponseBody
    @GetMapping(value = "/rig/{userId}")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "Long")})
    public Result getDeptByUser(@PathVariable Long userId) {
        try {
            UserRigVO taskUserRig = taskManager.getTaskUserRig(userId);
            Map<String, List<RigVO>> map = Maps.newHashMap();

            DeptVO deptVO = new DeptVO();
            deptVO.setDeptName("北疆油服21井队");
            deptVO.setDeptId(1L);

            List<RigVO> rigVOs = Lists.newArrayList();
            RigVO rigVO1 = new RigVO();
            rigVO1.setStatus("进行中");
            rigVO1.setId(1L);
            rigVO1.setRigCode("AM918");

            RigVO rigVO2 = new RigVO();
            rigVO2.setStatus("进行中");
            rigVO2.setId(2L);
            rigVO2.setRigCode("AM910");

            RigVO rigVO3 = new RigVO();
            rigVO3.setStatus("已结束");
            rigVO3.setId(3L);
            rigVO3.setRigCode("AM919");
            rigVOs.add(rigVO1);
            rigVOs.add(rigVO2);
            rigVOs.add(rigVO3);

            map.put(JSON.toJSONString(deptVO), rigVOs);

            DeptVO deptVO2 = new DeptVO();
            deptVO2.setDeptName("北疆油服21井队");
            deptVO2.setDeptId(1L);

            List<RigVO> rigVOs2 = Lists.newArrayList();
            RigVO rigVO4 = new RigVO();
            rigVO4.setStatus("进行中");
            rigVO4.setId(4L);
            rigVO4.setRigCode("AM9187");

            RigVO rigVO5 = new RigVO();
            rigVO5.setStatus("进行中");
            rigVO5.setId(6L);
            rigVO5.setRigCode("AM910324");

            RigVO rigVO6 = new RigVO();
            rigVO6.setStatus("已结束");
            rigVO6.setId(3L);
            rigVO6.setRigCode("AM919");
            rigVOs2.add(rigVO4);
            rigVOs2.add(rigVO5);
            rigVOs2.add(rigVO6);

            map.put(JSON.toJSONString(deptVO2), rigVOs2);

            taskUserRig.setTaskTitleMap(map);
//            if (Objects.isNull(taskUserRig)) {
//                return Result.error("ERROR", "暂无可用任务");
//            }
            return Result.success(taskUserRig);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }


    @ApiOperation("获取任务检查项,即任务详情")
    @ResponseBody
    @GetMapping(value = "/list/item")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskCode", value = "任务编码", required = true, dataType = "String")})
    public Result listItem(@RequestParam String taskCode) {
        try {
            //mock
            PageBo<TaskItemListVO> pageBo = new PageBo<>();
            pageBo.setTotalPage(1L);
            pageBo.setTotalSize(1L);
            TaskItemListVO taskItemListVO = new TaskItemListVO();
            taskItemListVO.setTaskCode(taskCode);
            Map<String, List<TaskItemListVO.Extra>> map = Maps.newHashMap();
            List<TaskItemListVO.Extra> list = Lists.newArrayList();

            TaskItemListVO.Extra extra1 = new TaskItemListVO.Extra();
            extra1.setAdapt("二 三开");
            extra1.setBgCode("BKNY-JCX-000001");
            extra1.setControlExtra("安全情况说明11111111111,检查点说明");
            extra1.setStatus("合格");
            TaskItemListVO.Extra extra2 = new TaskItemListVO.Extra();
            extra2.setAdapt("二 三开");
            extra2.setBgCode("BKNY-JCX-000002");
            extra2.setControlExtra("安全情况说明2222222222,检查点说明");
            extra2.setStatus("不涉及");
            list.add(extra1);
            list.add(extra2);
            map.put("压力表", list);
            taskItemListVO.setSite("远控台");
            taskItemListVO.setEquipment(map);
            List<TaskItemListVO> result = Lists.newArrayList();
            result.add(taskItemListVO);
            pageBo.setItemList(result);
            return Result.success(pageBo);
//            PageBo<TaskItemListVO> pageBo = taskManager.listTaskItem(taskCode);
//            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("合格/不合格详情")
    @ResponseBody
    @GetMapping(value = "/item/info")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskCode", value = "任务编码", required = true, dataType = "String")
            ,@ApiImplicitParam(name = "bgCode", value = "检查项code", required = true, dataType = "String")})
    public Result itemInfo(@RequestParam String taskCode, @RequestParam String bgCode) {
        try {
            //mock

            TaskItemListVO.Extra extra1 = new TaskItemListVO.Extra();
            extra1.setAdapt("二 三开");
            extra1.setBgCode("BKNY-JCX-000001");
            extra1.setControlExtra("安全情况说明11111111111,检查点说明");

            extra1.setStatus("不合格");
            extra1.setDangerCode("DIOSN-232");
            extra1.setDangerLevel("一级隐患");
            extra1.setDangerLevel("一级隐患");
            extra1.setResponsebilityUserName("责任人-王麻子");
            extra1.setBreakUserName("违章人");
            extra1.setChangeEndDate(new Date());
            extra1.setReportTime(new Date());
            return Result.success(extra1);
//            PageBo<TaskItemListVO> pageBo = taskManager.listTaskItem(taskCode);
//            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("合格/不合格")
    @ResponseBody
    @PostMapping(value = "/update-status")
    @ApiImplicitParams({@ApiImplicitParam(name = "taskItemVO", value = "任务项", required = true, dataType = "TaskItemVO", paramType = "TaskItemVO")})
    public Result update(@RequestBody TaskItemVO taskItemVO) {
        try {
            taskManager.updateTaskItem(taskItemVO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }
}

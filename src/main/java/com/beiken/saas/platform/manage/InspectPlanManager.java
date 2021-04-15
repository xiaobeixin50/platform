package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.PlanQuery;
import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.mapper.InspectPlanDeptMapper;
import com.beiken.saas.platform.mapper.InspectPlanMapper;
import com.beiken.saas.platform.pojo.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午6:04
 */
@Component
public class InspectPlanManager {
    @Resource
    private InspectPlanMapper inspectPlanMapper;
    @Resource
    private InspectPlanDeptMapper inspectPlanDeptMapper;
    @Resource
    private BgManager bgManager;
    @Resource
    private DepartManager departManager;
    @Resource
    private UserManager userManager;

    public PageBo<InspectPlanVO> planList(PlanQuery planQuery) {
        PageBo<InspectPlanVO> pageBo = new PageBo<>();
        List<InspectPlanVO> result = Lists.newArrayList();
        InspectPlanDOExample example = buildPlanExample(planQuery);
        List<InspectPlanDO> inspectPlans = inspectPlanMapper.selectByExampleWithBLOBs(example);
        Set<String> planCodeList = inspectPlans.stream()
                .map(InspectPlanDO::getInspectPlanCode).collect(Collectors.toSet());
        Map<String, List<InspectPlanDeptDO>> deptMap = queryPlanDeptByCodes(planCodeList);

        for (InspectPlanDO inspectPlan : inspectPlans) {
            InspectPlanVO planVO = new InspectPlanVO();
            BeanUtils.copyProperties(inspectPlan, planVO);
            if (Objects.nonNull(deptMap.get(inspectPlan.getInspectPlanCode()))) {
                deptMap.get(inspectPlan.getInspectPlanCode());
                //todo 受检单位信息
               /* planVO.setDeptCode(inspectPlanDept.getDeptCode());
                planVO.setDeptName(inspectPlanDept.getDeptName());
                planVO.setDeptParentCode(inspectPlanDept.getDeptParentCode());
                planVO.setDeptParentName(inspectPlanDept.getDeptParentName());*/
            }
            //todo 此处可通过group by优化
            Long itemNum = bgManager.countBgItemByCode(inspectPlan.getBgCode());
            planVO.setItemNum(itemNum);
            result.add(planVO);
        }
        pageBo.setItemList(result);
        long total = inspectPlanMapper.countByExample(example);
        pageBo.setTotalSize(total);
        return pageBo;
    }

    public Result add(InspectPlanVO inspectPlanVO) {
        InspectPlanDO inspectPlan = new InspectPlanDO();
        BeanUtils.copyProperties(inspectPlanVO, inspectPlan);
        inspectPlan.setId(null);
        inspectPlanMapper.insert(inspectPlan);
        return Result.success();
    }

    public Result<InspectPlanVO> info(String planCode) {
        PlanQuery planQuery = new PlanQuery();
        planQuery.setPlanCode(planCode);
        PageBo<InspectPlanVO> pageBo = planList(planQuery);
        if (!CollectionUtils.isEmpty(pageBo.getItemList())) {
            InspectPlanVO planVO = pageBo.getItemList().get(0);
            return Result.success(planVO);
        }
        return Result.error();
    }

    public Result addPlanDept(List<InspectPlanDeptDO> inspectPlanDepts) {
        for (InspectPlanDeptDO inspectPlanDept : inspectPlanDepts) {
            inspectPlanDept.setId(null);
            inspectPlanDeptMapper.insert(inspectPlanDept);
        }
        return Result.success();
    }

    public Result updateByPlanCode(InspectPlanVO inspectPlanVO) {
        if (StringUtils.isBlank(inspectPlanVO.getInspectPlanCode())) {
            return Result.error("ERROR", "检查计划编号为空");
        }
        InspectPlanDO inspectPlan = new InspectPlanDO();
        BeanUtils.copyProperties(inspectPlanVO, inspectPlan);
        inspectPlan.setId(null);
        InspectPlanDOExample example = new InspectPlanDOExample();
        example.createCriteria().andInspectPlanCodeEqualTo(inspectPlan.getInspectPlanCode());
        inspectPlanMapper.updateByExampleSelective(inspectPlan, example);
        return Result.success();
    }

    public Result delete(String inspectCode) {
        if (StringUtils.isBlank(inspectCode)) {
            return Result.error("ERROR", "检查计划编号为空");
        }
        InspectPlanDOExample example = new InspectPlanDOExample();
        example.createCriteria().andInspectPlanCodeEqualTo(inspectCode);
        inspectPlanMapper.deleteByExample(example);

        InspectPlanDeptDOExample deptExample = new InspectPlanDeptDOExample();
        deptExample.createCriteria().andInspcetPlanCodeEqualTo(inspectCode);
        inspectPlanDeptMapper.deleteByExample(deptExample);

        return Result.success();
    }

    private InspectPlanDOExample buildPlanExample(PlanQuery planQuery) {
        InspectPlanDOExample example = new InspectPlanDOExample();
        if (planQuery.getPageNo() != null) {
            example.setLimitStart((planQuery.getPageNo() - 1) * planQuery.getPageSize());
            example.setCount(planQuery.getPageSize());
        }
        InspectPlanDOExample.Criteria criteria = example.createCriteria()
                .andInspectPlanCodeLike(Constants.LIKE + planQuery.getPlanCode() + Constants.LIKE)
                .andNameLike(Constants.LIKE + planQuery.getPlanName() + Constants.LIKE)
                .andTypeEqualTo(planQuery.getType())
                .andStatusEqualTo(planQuery.getStatus())
                .andStartDateLessThanOrEqualTo(planQuery.getStartDate())
                .andEndDateGreaterThanOrEqualTo(planQuery.getEndDate());

        //受检单位搜索
        if (StringUtils.isNotBlank(planQuery.getDeptName())) {
            InspectPlanDeptDOExample deptExample = new InspectPlanDeptDOExample();
            deptExample.createCriteria().andDeptNameLike(Constants.LIKE + planQuery.getDeptName() + Constants.LIKE);
            List<InspectPlanDeptDO> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(deptExample);
            Set<String> inspectPlanCodeSet = inspectPlanDepts.stream().map(InspectPlanDeptDO::getInspcetPlanCode).collect(Collectors.toSet());
            criteria.andInspectPlanCodeIn(Lists.newArrayList(inspectPlanCodeSet));
        }
        return example;
    }

    public InspectPlanDO getByCode(String planCode) {
        InspectPlanDOExample example = new InspectPlanDOExample();
        example.createCriteria().andInspectPlanCodeEqualTo(planCode);
        List<InspectPlanDO> inspectPlanDOs = inspectPlanMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(inspectPlanDOs)) {
            return null;
        }
        return inspectPlanDOs.get(0);
    }

    public Map<String, List<InspectPlanDeptDO>> queryPlanDeptByCodes(Set<String> planCodes) {
        Map<String, List<InspectPlanDeptDO>> resultMap = Maps.newHashMap();

        InspectPlanDeptDOExample example = new InspectPlanDeptDOExample();
        example.createCriteria().andInspcetPlanCodeIn(Lists.newArrayList(planCodes));
        List<InspectPlanDeptDO> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(example);
        for (InspectPlanDeptDO planDept : inspectPlanDepts) {
            if (!resultMap.containsKey(planDept.getInspcetPlanCode())) {
                List<InspectPlanDeptDO> deptList = Lists.newArrayList();
                deptList.add(planDept);
                resultMap.put(planDept.getInspcetPlanCode(), deptList);
                continue;
            }
            resultMap.get(planDept.getInspcetPlanCode()).add(planDept);
        }
        return resultMap;
    }

   /* public List<InspectPlanVO> queryStartPlan() {
        List<InspectPlanVO> result = Lists.newArrayList();

        InspectPlanDOExample example = new InspectPlanDOExample();
        example.createCriteria().andStatusEqualTo(Constants.ONE_INT);
        List<InspectPlanDO> inspectPlanDOs = inspectPlanMapper.selectByExample(example);
        for (InspectPlanDO inspectPlanDO : inspectPlanDOs) {
            InspectPlanVO planVO = new InspectPlanVO();
            BeanUtils.copyProperties(inspectPlanDO, planVO);

            InspectPlanDeptDOExample planDeptDOExample = new InspectPlanDeptDOExample();
            planDeptDOExample.createCriteria().andInspcetPlanCodeEqualTo(inspectPlanDO.getInspectPlanCode());
            //先这么写 时间急迫 可以一次性查询
            List<InspectPlanDeptDO> inspectPlanDeptDOs = inspectPlanDeptMapper.selectByExample(planDeptDOExample);
            if (CollectionUtils.isEmpty(inspectPlanDeptDOs)) {
                continue;
            }
            List<Long> deptIds = inspectPlanDeptDOs.stream().map(InspectPlanDeptDO::getDeptId).collect(Collectors.toList());
            List<Long> inspectUserIds = inspectPlanDeptDOs.stream().map(InspectPlanDeptDO::getInspectUserId).collect(Collectors.toList());
            List<DepartmentDO> depts = departManager.getDeptById(deptIds);
            List<UserDO> userDos = userManager.getUserById(inspectUserIds);
            if (CollectionUtils.isEmpty(depts) || CollectionUtils.isEmpty(userDos)) {
                continue;
            }
            planVO.setDeptList(depts);
            planVO.setInspectUserList(userDos);
            result.add(planVO);
        }
        return result;
    }*/

    public List<InspectPlanVO> queryStartPlan() {
        List<InspectPlanVO> result = Lists.newArrayList();

        List<InspectPlanDeptDO> inspectPlanDeptDOs = inspectPlanDeptMapper.selectByExample(new InspectPlanDeptDOExample());

        for (InspectPlanDeptDO inspectPlanDeptDO : inspectPlanDeptDOs) {
            InspectPlanDOExample planDOExample = new InspectPlanDOExample();
            planDOExample.createCriteria().andInspectPlanCodeEqualTo(inspectPlanDeptDO.getInspcetPlanCode());
            List<InspectPlanDO> inspectPlanDOS = inspectPlanMapper.selectByExampleWithBLOBs(planDOExample);
            for (InspectPlanDO inspectPlanDO : inspectPlanDOS) {
                InspectPlanVO planVO = new InspectPlanVO();
                BeanUtils.copyProperties(inspectPlanDO, planVO);

                List<DepartmentDO> depts = departManager.getDeptById(Lists.newArrayList(inspectPlanDeptDO.getDeptId()));
                planVO.setDeptList(depts);

                UserDO userDO = userManager.getUserById(inspectPlanDeptDO.getInspectUserId());
                planVO.setInspectUserList(Lists.newArrayList(userDO));

                result.add(planVO);
            }
        }
        return result;
    }

}

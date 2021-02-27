package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.PlanQuery;
import com.beiken.saas.platform.biz.vo.InspectPlanVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.mapper.InspectPlanDeptMapper;
import com.beiken.saas.platform.mapper.InspectPlanMapper;
import com.beiken.saas.platform.pojo.InspectPlan;
import com.beiken.saas.platform.pojo.InspectPlanDept;
import com.beiken.saas.platform.pojo.InspectPlanDeptExample;
import com.beiken.saas.platform.pojo.InspectPlanExample;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
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

    public PageBo<InspectPlanVO> planList(PlanQuery planQuery) {
        PageBo<InspectPlanVO> pageBo = new PageBo<>();
        List<InspectPlanVO> result = Lists.newArrayList();
        InspectPlanExample example = buildPlanExample(planQuery);
        List<InspectPlan> inspectPlans = inspectPlanMapper.selectByExampleWithBLOBs(example);
        Set<String> planCodeList = inspectPlans.stream().map(InspectPlan::getInspectPlanCode).collect(Collectors.toSet());
        Map<String, InspectPlanDept> deptMap = queryByPlanCodes(planCodeList);

        for (InspectPlan inspectPlan : inspectPlans) {
            InspectPlanVO planVO = new InspectPlanVO();
            BeanUtils.copyProperties(inspectPlan, planVO);
            if (Objects.nonNull(deptMap.get(inspectPlan.getInspectPlanCode()))) {
                InspectPlanDept inspectPlanDept = deptMap.get(inspectPlan.getInspectPlanCode());
                planVO.setDeptCode(inspectPlanDept.getDeptCode());
                planVO.setDeptName(inspectPlanDept.getDeptName());
                planVO.setDeptParentCode(inspectPlanDept.getDeptParentCode());
                planVO.setDeptParentName(inspectPlanDept.getDeptParentName());
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
        InspectPlan inspectPlan = new InspectPlan();
        BeanUtils.copyProperties(inspectPlanVO, inspectPlan);
        inspectPlan.setId(null);
        inspectPlanMapper.insert(inspectPlan);
        return Result.success();
    }

    public Result info(String planCode) {
        PlanQuery planQuery = new PlanQuery();
        planQuery.setPlanCode(planCode);
        PageBo<InspectPlanVO> pageBo = planList(planQuery);
        if (!CollectionUtils.isEmpty(pageBo.getItemList())) {
            InspectPlanVO planVO = pageBo.getItemList().get(0);
            return Result.success(planVO);
        }
        return Result.error();
    }

    public Result addPlanDept(List<InspectPlanDept> inspectPlanDepts) {
        for (InspectPlanDept inspectPlanDept : inspectPlanDepts) {
            inspectPlanDept.setId(null);
            inspectPlanDeptMapper.insert(inspectPlanDept);
        }
        return Result.success();
    }

    public Result updateByPlanCode(InspectPlanVO inspectPlanVO) {
        if (StringUtils.isBlank(inspectPlanVO.getInspectPlanCode())) {
            return Result.error("ERROR", "检查计划编号为空");
        }
        InspectPlan inspectPlan = new InspectPlan();
        BeanUtils.copyProperties(inspectPlanVO, inspectPlan);
        inspectPlan.setId(null);
        InspectPlanExample example = new InspectPlanExample();
        example.createCriteria().andInspectPlanCodeEqualTo(inspectPlan.getInspectPlanCode());
        inspectPlanMapper.updateByExampleSelective(inspectPlan, example);
        return Result.success();
    }

    public Result delete(String inspectCode) {
        if (StringUtils.isBlank(inspectCode)) {
            return Result.error("ERROR", "检查计划编号为空");
        }
        InspectPlanExample example = new InspectPlanExample();
        example.createCriteria().andInspectPlanCodeEqualTo(inspectCode);
        inspectPlanMapper.deleteByExample(example);

        InspectPlanDeptExample deptExample = new InspectPlanDeptExample();
        deptExample.createCriteria().andInspcetPlanCodeEqualTo(inspectCode);
        inspectPlanDeptMapper.deleteByExample(deptExample);

        return Result.success();
    }

    private InspectPlanExample buildPlanExample(PlanQuery planQuery) {
        InspectPlanExample example = new InspectPlanExample();
        example.setLimitStart(planQuery.getPageNo());
        example.setCount((planQuery.getPageNo() - 1) * planQuery.getPageSize());
        InspectPlanExample.Criteria criteria = example.createCriteria()
                .andInspectPlanCodeLike(Constants.LIKE + planQuery.getPlanCode() + Constants.LIKE)
                .andNameLike(Constants.LIKE + planQuery.getPlanName() + Constants.LIKE)
                .andTypeEqualTo(planQuery.getType())
                .andStatusEqualTo(planQuery.getStatus())
                .andStartDateLessThanOrEqualTo(planQuery.getStartDate())
                .andEndDateGreaterThanOrEqualTo(planQuery.getEndDate());

        //受检单位搜索
        if (StringUtils.isNotBlank(planQuery.getDeptName())) {
            InspectPlanDeptExample deptExample = new InspectPlanDeptExample();
            deptExample.createCriteria().andDeptNameLike(Constants.LIKE + planQuery.getDeptName() + Constants.LIKE);
            List<InspectPlanDept> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(deptExample);
            Set<String> inspectPlanCodeSet = inspectPlanDepts.stream().map(InspectPlanDept::getInspcetPlanCode).collect(Collectors.toSet());
            criteria.andInspectPlanCodeIn(Lists.newArrayList(inspectPlanCodeSet));
        }
        return example;
    }

    private Map<String, InspectPlanDept> queryByPlanCodes(Set<String> planCodes) {
        InspectPlanDeptExample example = new InspectPlanDeptExample();
        example.createCriteria().andInspcetPlanCodeIn(Lists.newArrayList(planCodes));
        List<InspectPlanDept> inspectPlanDepts = inspectPlanDeptMapper.selectByExample(example);
        return inspectPlanDepts.stream().collect(Collectors.toMap(InspectPlanDept::getInspcetPlanCode, p -> p));
    }

}

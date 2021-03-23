package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.pojo.HiddenDangerDO;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午9:07
 */
@Component
public class DangerManager {

    private static final Integer INSPECT_USER = 0;

    @Resource
    private HiddenDangerMapper dangerMapper;

    public PageBo<DangerVO> listByUser(Long userId, DangerQuery dangerQuery) {
        //HiddenDangerDOExample example = buildDangerExample(userId, dangerQuery);
        //List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExample(example);
        return null;
    }

    /**
     * 根据task获取隐患数量
     * @param taskCode
     * @return
     */
    public Long countDangerNumByTask(String taskCode) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        return dangerMapper.countByExample(example);
    }

    /**
     * 根据task获取隐患数量
     * @return
     */
    public Long countDangerNumByInspectUser(Long inspectUserId) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andInspectUserIdEqualTo(inspectUserId);
        return dangerMapper.countByExample(example);
    }

    /**
     * 通过taskcode和bgItemCode以及reportType确定唯一一个隐患
     * @param taskCode
     * @param bgItemCode
     * @param reportType
     * @return
     */
    public HiddenDangerDO dangerInfoByCode(String taskCode, String bgItemCode, Integer reportType) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        HiddenDangerDOExample.Criteria criteria = example.createCriteria()
                .andTaskCodeEqualTo(taskCode)
                .andBgItemCodeEqualTo(bgItemCode);
        if (Objects.nonNull(reportType)) {
            criteria.andReportTypeEqualTo(reportType);
        }
        List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(hiddenDangerDOs)) {
            return null;
        }
        return hiddenDangerDOs.get(0);
    }

    public boolean addDanger(DangerVO dangerVO) {
        if (dangerVO == null) {
            return false;
        }
        HiddenDangerDO dangerDO = new HiddenDangerDO();
        BeanUtils.copyProperties(dangerVO, dangerDO);
        int result = dangerMapper.insert(dangerDO);
        if (result > 0) {
            return true;
        }
        return false;
    }



    private HiddenDangerDOExample buildDangerExample(Long userId, DangerQuery dangerQuery) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.setLimitStart((dangerQuery.getPageNo() - 1) * dangerQuery.getPageSize());
        example.setCount(dangerQuery.getPageSize());
        example.setOrderByClause("change_end_date " + dangerQuery.getSort());

        HiddenDangerDOExample.Criteria criteria = example.createCriteria()
                .andDangerLevelEqualTo(dangerQuery.getDangerLevel())
                .andResultStatusEqualTo(dangerQuery.getResultStatus());
        if (INSPECT_USER.equals(dangerQuery.getRoleType())) {
            criteria.andInspectUserIdEqualTo(userId);
        } else {
            criteria.andResponsibilityUserIdEqualTo(userId);
        }

        return null;
    }



}

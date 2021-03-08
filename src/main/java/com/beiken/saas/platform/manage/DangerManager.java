package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.pojo.HiddenDangerDO;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午9:07
 */
@Component
public class DangerManager {
    @Resource
    private HiddenDangerMapper dangerMapper;

    public PageBo<DangerVO> listByUser(Long inspectUserId, DangerQuery dangerQuery) {
        HiddenDangerDOExample example = buildDangerExample(inspectUserId, dangerQuery);
        List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExample(example);

        return null;
    }

    private HiddenDangerDOExample buildDangerExample(Long inspectUserId, DangerQuery dangerQuery) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.setLimitStart(dangerQuery.getPageNo());
        example.setCount((dangerQuery.getPageNo() - 1) * dangerQuery.getPageSize());
        example.setOrderByClause("change_end_date " + dangerQuery.getSort());

        example.createCriteria()
                .andInspectUserIdEqualTo(inspectUserId)
                .andDangerLevelEqualTo(dangerQuery.getDangerLevel())
                .andResultStatusEqualTo(dangerQuery.getResultStatus());
        return  example;
    }

}

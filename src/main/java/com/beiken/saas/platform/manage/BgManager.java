package com.beiken.saas.platform.manage;


import com.beiken.saas.platform.mapper.BgInspectItemMapper;
import com.beiken.saas.platform.pojo.BgInspectItemExample;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午8:45
 */
@Component
public class BgManager {

    @Resource
    private BgInspectItemMapper bgInspectItemMapper;


    public Long countBgItemByCode(String bgCode) {
        BgInspectItemExample example = new BgInspectItemExample();
        example.createCriteria().andBgCodeEqualTo(bgCode);
        return bgInspectItemMapper.countByExample(example);
    }
}

package com.beiken.saas.platform.utils;

import com.beiken.saas.platform.mapper.SwitchMapper;
import com.beiken.saas.platform.pojo.SwitchDO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * User: panboliang
 * Date: 21/3/30
 * Time: 下午5:20
 */
@Component
public class SwitchUtil {
    @Resource
    private SwitchMapper switchMapper;

    public boolean match(String key, String value) {
        if (StringUtils.isBlank(key) || StringUtils.isBlank(value)) {
            return false;
        }
        SwitchDO switchDO = switchMapper.selectByPrimaryKey(key);
        if (Objects.isNull(switchDO)) {
            return false;
        }
        if (value.equals(switchDO.getValue())) {
            return true;
        }
        return false;
    }
}

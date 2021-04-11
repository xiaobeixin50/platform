package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.mapper.EnvMapper;
import com.beiken.saas.platform.pojo.EnvDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * User: panboliang
 * Date: 21/4/11
 * Time: 下午6:05
 */
@Component
public class EnvManager {
    @Resource
    private EnvMapper envMapper;

    public void addEnvDO(EnvDO envDO) {
        envMapper.insert(envDO);
    }
}

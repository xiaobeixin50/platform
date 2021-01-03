package com.beiken.saas.platform.service;

import com.beiken.saas.platform.entity.InspectionStopcard;
import com.beiken.saas.platform.pojo.HiddenDanger;

import java.util.List;

public interface HiddenDangerService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    HiddenDanger queryById(Long id);


    List<HiddenDanger> queryHiddenDanger(Integer id);

    int addHiddenDanger(HiddenDanger hiddenDanger);

}

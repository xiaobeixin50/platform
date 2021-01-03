package com.beiken.saas.platform.service.impl;


import com.beiken.saas.platform.entity.InspectionStopcard;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.pojo.HiddenDanger;
import com.beiken.saas.platform.pojo.HiddenDangerExample;
import com.beiken.saas.platform.service.HiddenDangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HiddenDangerServiceImpl implements HiddenDangerService {

    @Autowired
    private HiddenDangerMapper hiddenDangerMapper;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public HiddenDanger queryById(Long id) {

        return this.hiddenDangerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HiddenDanger> queryHiddenDanger(Integer id) {
        HiddenDangerExample example = new HiddenDangerExample();
        example.createCriteria();
        List<HiddenDanger> hiddenDangers = hiddenDangerMapper.selectByExample(example);
        return hiddenDangers;
    }

    public int addHiddenDanger(HiddenDanger hiddenDanger){
        //填充必填字段
        hiddenDanger.setDeleted(0);
        hiddenDanger.setGmtCreate(new Date());
        hiddenDanger.setGmtModified(new Date());
        hiddenDanger.setStatus(0);
        int i = this.hiddenDangerMapper.insert(hiddenDanger);

        return i;
    }
}

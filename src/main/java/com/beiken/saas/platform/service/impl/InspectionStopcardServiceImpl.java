package com.beiken.saas.platform.service.impl;

import com.beiken.saas.platform.dao.InspectionStopcardDao;
import com.beiken.saas.platform.entity.InspectionStopcard;
import com.beiken.saas.platform.service.InspectionStopcardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InspectionStopcard)表服务实现类
 *
 * @author xiaobeixin
 * @since 2020-11-22 13:12:12
 */
@Deprecated
@Service
public class InspectionStopcardServiceImpl implements InspectionStopcardService {
    @Resource
    private InspectionStopcardDao inspectionStopcardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public InspectionStopcard queryById(Integer id) {
        return this.inspectionStopcardDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<InspectionStopcard> queryAllByLimit(int offset, int limit) {
        return this.inspectionStopcardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param inspectionStopcard 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionStopcard insert(InspectionStopcard inspectionStopcard) {
        this.inspectionStopcardDao.insert(inspectionStopcard);
        return inspectionStopcard;
    }

    /**
     * 修改数据
     *
     * @param inspectionStopcard 实例对象
     * @return 实例对象
     */
    @Override
    public InspectionStopcard update(InspectionStopcard inspectionStopcard) {
        this.inspectionStopcardDao.update(inspectionStopcard);
        return this.queryById(inspectionStopcard.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.inspectionStopcardDao.deleteById(id) > 0;
    }
}
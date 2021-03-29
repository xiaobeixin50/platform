package com.beiken.saas.platform.utils;

import com.beiken.saas.platform.mapper.BgInspectItemMapper;
import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.InspectTaskMapper;
import com.beiken.saas.platform.pojo.BgInspectItemDOExample;
import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.DepartmentDOExample;
import com.beiken.saas.platform.pojo.InspectTaskDOExample;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午12:23
 */
@Component
public class CodeUtil {
    private static final String GLOBAL_COMPANY = "BKNY-";

    @Resource
    private DepartmentMapper deptMapper;
    @Resource
    private BgInspectItemMapper bgItemMapper;
    @Resource
    private InspectTaskMapper taskMapper;

    public String buildDeptCode(String company, Integer level) {
        long count = deptMapper.countByExample(new DepartmentDOExample());
        String pre = ChineseCharToEnUtil.getAllFirstLetter(company);
        return pre + level + (count + 1L);
    }

    public String buildBgItemCode(String company) {
        String pre = ChineseCharToEnUtil.getAllFirstLetter(company);
        long count = bgItemMapper.countByExample(new BgInspectItemDOExample());
        return pre + bgNo(count);
    }

    public String buildTaskCode(String deptCode) {
        long count = taskMapper.countByExample(new InspectTaskDOExample());
        return deptCode + "-JCRW-" + System.currentTimeMillis() + taskNo(count);
    }

    public String buildDangerCode(Long deptId) {
        DepartmentDO departmentDO = deptMapper.selectByPrimaryKey(deptId);
        if (departmentDO == null) {
            return null;
        }
        String s = DateUtil.formatDate(new Date(), DateUtil.DEFAULT_PARTERN_DETAIL);
        return departmentDO.getDeptCode() + "-YH-" + s;
    }


    private String bgNo(Long count) {
        String s = String.valueOf(count + 1L);
        if (s.length() > 6) {
            return s;
        }
        if (s.length() > 5) {
            return  s;
        }
        if (s.length() > 4) {
            return "0" + s;
        }
        if (s.length() > 3) {
            return "00" + s;
        }
        if (s.length() > 2) {
            return "000" + s;
        }
        if (s.length() > 1) {
            return "0000" + s;
        }
        if (s.length() > 0) {
            return "000000" + s;
        }
        return s;
    }

    private String taskNo(Long count) {
        String s = String.valueOf(count + 1L);
        if (s.length() > 3) {
            return s;
        }
        if (s.length() > 2) {
            return  s;
        }
        if (s.length() > 1) {
            return "0" + s;
        }
        if (s.length() > 0) {
            return "00" + s;
        }
        return s;
    }

}

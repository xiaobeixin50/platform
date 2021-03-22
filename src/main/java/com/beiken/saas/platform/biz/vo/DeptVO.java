package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * User: panboliang
 * Date: 21/3/9
 * Time: 下午7:34
 */
@Data
public class DeptVO implements Serializable{
    private static final long serialVersionUID = -1145600506027368719L;

    @ApiModelProperty(name = "deptId", value = "井队/子公司id,所有有传参的地儿都用这个id")
    private Long deptId;

    @ApiModelProperty(name = "deptName", value = "井队/子公司")
    private String deptName;

    @ApiModelProperty(name = "deptType", value = "井队/子公司")
    private String deptType;

    @ApiModelProperty(name = "userVO", value = "责任人,默认井队长")
    private UserVO userVO;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof DeptVO)) return false;

        DeptVO deptVO = (DeptVO) object;

        if (deptId != null ? !deptId.equals(deptVO.deptId) : deptVO.deptId != null) return false;
        if (deptName != null ? !deptName.equals(deptVO.deptName) : deptVO.deptName != null) return false;
        return !(deptType != null ? !deptType.equals(deptVO.deptType) : deptVO.deptType != null);

    }

    @Override
    public int hashCode() {
        int result = deptId != null ? deptId.hashCode() : 0;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (deptType != null ? deptType.hashCode() : 0);
        return result;
    }
}

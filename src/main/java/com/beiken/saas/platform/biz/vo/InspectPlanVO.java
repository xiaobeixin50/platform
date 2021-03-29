package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.DepartmentDO;
import com.beiken.saas.platform.pojo.InspectPlanDO;
import com.beiken.saas.platform.pojo.UserDO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午8:52
 */
@Data
public class InspectPlanVO extends InspectPlanDO implements Serializable {

    private static final long serialVersionUID = -3976939367523254441L;

    /**
     * 受检单位list
     */
    private List<DepartmentDO> deptList;

    /**
     * 检查人list
     */
    private List<UserDO> inspectUserList;

    /**
     * 受检单位,key->deptId
     */
    @ApiModelProperty(name = "deptInfoMap", value = "受检单位"
            , required = false, example = "21井队")
    private Map<Long, DepartmentDO> deptInfoMap;

    /**
     * 受检单位上级单位,key->deptCode
     */
    @ApiModelProperty(name = "deptParentInfoMap", value = "受检单位所属公司"
            , required = false, example = "子公司")
    private Map<String, DepartmentDO> deptParentInfoMap;

    @ApiModelProperty(name = "itemNum", value = "检查项数量"
            , required = false, example = "35")
    private Long itemNum;

    /**
     * 检查人 key->userId
     */
    @ApiModelProperty(name = "inspectUserMap", value = "检查人"
            , required = false, example = "")
    private Map<Long, UserDO> inspectUserMap;
}


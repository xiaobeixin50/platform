package com.beiken.saas.platform.biz.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午8:17
 */
@Data
public class DangerQuery extends BaseQuery implements Serializable{
    private static final long serialVersionUID = 8895826397920513204L;

    @ApiModelProperty(name = "dangerId", value = "隐患id"
            , required = false, example = "")
    private Long dangerId;

    private Long deptId;

    @ApiModelProperty(name = "dangerLevel", value = "隐患级别,0-一级隐患,1-二级隐患,以此类推"
            , required = false, example = "")
    private Integer dangerLevel;

    private String dangerName;

    @ApiModelProperty(name = "reportStatus", value = "隐患状态,不填默认所有"
            , required = false, example = "")
    private Integer reportStatus;

    @ApiModelProperty(name = "sort", value = "排序规则"
            , required = false, example = "AES/DESC")
    private String sort;

    @ApiModelProperty(name = "roleType", value = "0-监理, 1-井队长, 2-后台管理员, 必填"
            , required = false, example = "")
    private Integer roleType;

    @ApiModelProperty(name = "rigCode", value = "井code"
            , required = false, example = "")
    private String rigCode;

    @ApiModelProperty(name = "bgItemCode", value = "检查设备编号"
            , required = false, example = "")
    private String bgItemCode;

    @ApiModelProperty(name = "reportType", value = "上报类型,0-任务上报," +
            "1-主动上报,不填查询所有的"
            , required = false, example = "")
    private Integer reportType;

    private List<String> rigCodes;

}

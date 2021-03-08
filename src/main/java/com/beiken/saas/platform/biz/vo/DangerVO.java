package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午8:32
 */
@Data
public class DangerVO implements Serializable{
    private static final long serialVersionUID = 3842240211543414146L;

    @ApiModelProperty(name = "gmtCreate", value = "隐患创建时间"
            , example = "")
    private Date gmtCreate;

    @ApiModelProperty(name = "gmtModified", value = "隐患修改时间"
            , example = "")
    private Date gmtModified;

    @ApiModelProperty(name = "dangerCode", value = "隐患编码"
            , example = "")
    private String dangerCode;

    @ApiModelProperty(name = "photo", value = "图片地址"
            , example = "多个英文,号分割")
    private String photo;

    @ApiModelProperty(name = "gmtModified", value = "说明"
            , example = "")
    private String extra;

    @ApiModelProperty(name = "taskCode", value = "任务编码"
            , example = "")
    private String taskCode;

    @ApiModelProperty(name = "bgItemCode", value = "检查项编码"
            , example = "")
    private String bgItemCode;

    @ApiModelProperty(name = "deptCode", value = "被检单位code"
            , example = "")
    private String deptCode;

    @ApiModelProperty(name = "deptName", value = "被检单位名"
            , example = "")
    private String deptName;

    @ApiModelProperty(name = "deptParentCode", value = "被检单位上级code"
            , example = "")
    private String deptParentCode;

    @ApiModelProperty(name = "deptParentName", value = "被检单位上级名"
            , example = "")
    private String deptParentName;

    @ApiModelProperty(name = "dangerLevel", value = "隐患级别"
            , example = "")
    private String dangerLevel;

    @ApiModelProperty(name = "breakUser", value = "违章人"
            , example = "")
    private String breakUser;

    @ApiModelProperty(name = "responsbilityUser", value = "责任人"
            , example = "")
    private String responsbilityUser;

    @ApiModelProperty(name = "changeEndDate", value = "整改结束时间"
            , example = "")
    private Date changeEndDate;

    @ApiModelProperty(name = "resultStatus", value = "隐患状态"
            , example = "")
    private Integer resultStatus;

    @ApiModelProperty(name = "reportType", value = "上报类型"
            , example = "")
    private String reportType;

    @ApiModelProperty(name = "inspectUserId", value = "检查人id"
            , example = "")
    private Long inspectUserId;

    @ApiModelProperty(name = "inspectUserName", value = "检查人名"
            , example = "")
    private String inspectUserName;

    @ApiModelProperty(name = "reportStatus", value = "上报状态"
            , example = "")
    private String reportStatus;

    @ApiModelProperty(name = "reportTime", value = "上报时间"
            , example = "")
    private Date reportTime;

    @ApiModelProperty(name = "confirmTime", value = "确认时间"
            , example = "")
    private Date confirmTime;

    @ApiModelProperty(name = "disLevelUserId", value = "隐患分级人id"
            , example = "")
    private Long disLevelUserId;

    @ApiModelProperty(name = "disLevelUserName", value = "隐患分级人名"
            , example = "")
    private String disLevelUserName;

    @ApiModelProperty(name = "disLevelTime", value = "分级时间"
            , example = "")
    private Date disLevelTime;

    @ApiModelProperty(name = "changeAttach", value = "附件地址"
            , example = "")
    private String changeAttach;

    @ApiModelProperty(name = "changeMoney", value = "预算金额"
            , example = "")
    private Double changeMoney;

    @ApiModelProperty(name = "changeUserId", value = "方案制定人id"
            , example = "")
    private Integer changeUserId;

    @ApiModelProperty(name = "changeUserName", value = "方案制定人名"
            , example = "")
    private String changeUserName;

    @ApiModelProperty(name = "changeSubmitTime", value = "方案提交时间"
            , example = "")
    private Date changeSubmitTime;

    @ApiModelProperty(name = "changePlan", value = "整改计划"
            , example = "")
    private String changePlan;

    @ApiModelProperty(name = "processNum", value = "流程展示数量"
            , example = "")
    private Integer processNum;
}

package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 下午4:18
 */
@Data
public class TaskItemVO implements Serializable {
    private static final long serialVersionUID = -6984849536115165582L;

    @ApiModelProperty(name = "gmtCreate", value = "任务检查项"
            , required = false, example = "")
    private Date gmtCreate;

    @ApiModelProperty(name = "gmtModified", value = "任务检查项"
            , required = false, example = "")
    private Date gmtModified;

    @ApiModelProperty(name = "bgItemCode", value = "表格检查项code"
            , required = false, example = "")
    private String bgItemCode;

    @ApiModelProperty(name = "bgCode", value = "表格编码"
            , required = false, example = "")
    private String bgCode;

    @ApiModelProperty(name = "inspectType", value = "检查项类型"
            , required = false, example = "行为类/非行为类")
    private String inspectType;

    @ApiModelProperty(name = "manageType", value = "管理类型"
            , required = false, example = "井控管理")
    private String manageType;

    @ApiModelProperty(name = "region", value = "区域"
            , required = false, example = "")
    private String region;

    @ApiModelProperty(name = "equipment", value = "设备"
            , required = false, example = "")
    private String equipment;

    @ApiModelProperty(name = "adapt", value = "适用情况"
            , required = false, example = "")
    private String adapt;

    @ApiModelProperty(name = "dangerLevel", value = "隐患级别"
            , required = false, example = "")
    private Integer dangerLevel;

    @ApiModelProperty(name = "site", value = "检查地点"
            , required = false, example = "")
    private String site;

    @ApiModelProperty(name = "isPhoto", value = "是否拍照"
            , required = false, example = "0-否,1-是")
    private Integer isPhoto;

    @ApiModelProperty(name = "isCard", value = "是否打卡"
            , required = false, example = "0-否,1-是")
    private Integer isCard;

    @ApiModelProperty(name = "cardSite", value = "打卡地点"
            , required = false, example = "")
    private String cardSite;

    @ApiModelProperty(name = "controlExtra", value = "安全控制点说明"
            , required = false, example = "")
    private String controlExtra;

    @ApiModelProperty(name = "itemCode", value = "任务检查项"
            , required = false, example = "")
    private String itemCode;

    @ApiModelProperty(name = "taskCode", value = "检查任务编码"
            , required = false, example = "")
    private String taskCode;

    @ApiModelProperty(name = "inspectPlanCode", value = "检查计划编码"
            , required = false, example = "")
    private String inspectPlanCode;

    @ApiModelProperty(name = "photo", value = "上传图片地址"
            , required = false, example = "")
    private String photo;

    @ApiModelProperty(name = "reportExtra", value = "说明"
            , required = false, example = "")
    private String reportExtra;

    @ApiModelProperty(name = "breakUser", value = "任务检查项"
            , required = false, example = "违章人")
    private String breakUserName;

    @ApiModelProperty(name = "responsibilityUser", value = "责任人"
            , required = false, example = "")
    private String responsibilityUser;

    @ApiModelProperty(name = "resultStatus", value = "检查项结果"
            , required = false, example = "0-合格/1-不合格/2-不涉及")
    private Integer resultStatus;

    @ApiModelProperty(name = "endDate", value = "整改截止日期"
            , required = false, example = "")
    private Date endDate;
}

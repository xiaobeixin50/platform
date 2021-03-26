package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/3/17
 * Time: 上午12:16
 */
@Data
public class TaskItemListVO implements Serializable {
    private static final long serialVersionUID = 5257948016746886043L;

    @ApiModelProperty(name = "site", value = "位置,例如:远控台"
            , required = false, example = "")
    private String site;

    @ApiModelProperty(name = "taskCode", value = "任务编码"
            , required = false, example = "")
    private String taskCode;

    @ApiModelProperty(name = "equipment", value = "设备:例如:压力表"
            , required = false, example = "")
    private Map<String, List<Extra>> equipment;

    @ApiModelProperty(name = "siteStatus", value = "目录状态"
            , required = false, example = "")
    private Integer siteStatus;

    @Data
    public static class Extra implements Serializable{
        private static final long serialVersionUID = -4916287407723367855L;

        @ApiModelProperty(name = "taskCode", value = "taskCode"
                , required = false, example = "")
        private String taskCode;

        @ApiModelProperty(name = "bgItemCode", value = "检查项编码"
                , required = false, example = "")
        private String bgItemCode;

        @ApiModelProperty(name = "controlExtra", value = "控制类型说明"
                , required = false, example = "")
        private String controlExtra;

        @ApiModelProperty(name = "adapt", value = "适用情况"
                , required = false, example = "")
        private String adapt;

        @ApiModelProperty(name = "status", value = "状态"
                , required = false, example = "")
        private String status;

        @ApiModelProperty(name = "responsibilityUserName", value = "责任人"
                , required = false, example = "")
        private String responsibilityUserName;

        @ApiModelProperty(name = "responsibilityUserId", value = "责任人id"
                , required = false, example = "")
        private Long responsibilityUserId;

        @ApiModelProperty(name = "breakUserName", value = "违章人"
                , required = false, example = "")
        private String breakUserName;

        @ApiModelProperty(name = "inspectUserId", value = "检查人id"
                , required = false, example = "")
        private Long inspectUserId;

        @ApiModelProperty(name = "inspectUserName", value = "检查人"
                , required = false, example = "")
        private String inspectUserName;

        @ApiModelProperty(name = "deptId", value = "受检井队id"
                , required = false, example = "")
        private Long deptId;

        @ApiModelProperty(name = "changeEndDate", value = "整改结束时间"
                , example = "")
        private Date changeEndDate;

        @ApiModelProperty(name = "reportTime", value = "上报时间"
                , example = "")
        private Date reportTime;

        @ApiModelProperty(name = "dangerLevel", value = "隐患级别"
                , required = false, example = "")
        private String dangerLevel;

        @ApiModelProperty(name = "dangerCode", value = "隐患编号"
                , required = false, example = "")
        private String dangerCode;

        @ApiModelProperty(name = "extra", value = "情况说明"
                , required = false, example = "")
        private String reportExtra;

        @ApiModelProperty(name = "rigCode", value = "井code"
                , required = false, example = "")
        private String rigCode;
    }
}

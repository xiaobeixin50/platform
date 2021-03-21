package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.Department;
import com.beiken.saas.platform.pojo.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午5:42
 */
@Data
@ApiModel(description = "任务实体", value = "任务实体类")
public class TaskVO implements Serializable {
    private static final long serialVersionUID = 3761249756717533455L;

    @ApiModelProperty(name = "gmtCreate", value = "创建时间"
            , required = false, example = "")
    private Date gmtCreate;

    @ApiModelProperty(name = "gmtModified", value = "修改时间"
            , required = false, example = "")
    private Date gmtModified;

    @ApiModelProperty(name = "inspectPlanCode", value = "检查计划编码"
            , required = false, example = "【总公司名称前四个字的首字母】+【-检查计划首字母】+【-时间戳】+【001】")
    private String inspectPlanCode;

    @ApiModelProperty(name = "name", value = "任务名"
            , required = false, example = "巡检任务")
    private String name;

    @ApiModelProperty(name = "type", value = "检查类型"
            , required = false, example = "日常检查/专项检查/临时检查")
    private String type;

    @ApiModelProperty(name = "priority", value = "优先级"
            , required = false, example = "正常/紧急")
    private String priority;

    @ApiModelProperty(name = "status", value = "任务状态"
            , required = false, example = "0-未完成，1-已完成，2-已过期")
    private Integer status;

    @ApiModelProperty(name = "freq", value = "频次"
            , required = false, example = "单次/每日/每周/每月")
    private String freq;

    @ApiModelProperty(name = "startDate", value = "任务开始天"
            , required = false, example = "2021-02-28")
    private Date startDate;

    @ApiModelProperty(name = "endDate", value = "任务结束天"
            , required = false, example = "2021-03-28")
    private Date endDate;

    @ApiModelProperty(name = "startTime", value = "任务开始time"
            , required = false, example = "08:30")
    private String startTime;

    @ApiModelProperty(name = "endTime", value = "任务结束time"
            , required = false, example = "10:30")
    private String endTime;

    @ApiModelProperty(name = "everyDay", value = "每日次数"
            , required = false, example = "2")
    private Integer everyDay;

    @ApiModelProperty(name = "countDay", value = "没几天一次"
            , required = false, example = "2")
    private Integer countDay;

    @ApiModelProperty(name = "startNumber", value = "任务开始编号"
            , required = false, example = "1")
    private Integer startNumber;

    @ApiModelProperty(name = "endNumber", value = "任务结束编号"
            , required = false, example = "2")
    private Integer endNumber;

    @ApiModelProperty(name = "bgCode", value = "表格编码"
            , required = false, example = "BKNY-3333")
    private String bgCode;

    @ApiModelProperty(name = "step", value = "当前进行到第几步"
            , required = false, example = "2")
    private Integer step;

    @ApiModelProperty(name = "extra", value = "说明"
            , required = false, example = "lalala")
    private String extra;

    /**
     * 受检单位,key->deptCode
     */
    @ApiModelProperty(name = "deptInfoMap", value = "受检单位"
            , required = false, example = "21井队")
    private Map<String, Department> deptInfoMap;

    /**
     * 受检单位上级单位,key->deptCode
     */
    @ApiModelProperty(name = "deptParentInfoMap", value = "受检单位所属公司"
            , required = false, example = "子公司")
    private Map<String, Department> deptParentInfoMap;

    @ApiModelProperty(name = "itemNum", value = "检查项数量"
            , required = false, example = "35")
    private Long itemNum;

    @ApiModelProperty(name = "inspectUserMap", value = "检查人"
            , required = false, example = "")
    private Map<Long, User> inspectUserMap;

    @ApiModelProperty(name = "itemCode", value = "检查项编号"
            , required = false, example = "BKNY-JCX-000001")
    private String itemCode;

    @ApiModelProperty(name = "taskCode", value = "任务编号"
            , required = false, example = "【组织编号】+【-检查任务首字母】+【-时间戳】+【001】")
    private String taskCode;

    @ApiModelProperty(name = "taskStartTime", value = "任务开始时间"
            , required = false, example = "2021-12-21 08:00:00")
    private Date taskStartTime;

    @ApiModelProperty(name = "taskEndTime", value = "任务结束时间"
            , required = false, example = "2021-12-21 08:00:00")
    private Date taskEndTime;

    @ApiModelProperty(name = "taskFinishTime", value = "任务完成时间"
            , required = false, example = "2021-12-21 08:00:00")
    private Date taskFinishTime;

    @ApiModelProperty(name = "dangerNum", value = "隐患数量"
            , required = false, example = "10")
    private Integer dangerNum;

    @ApiModelProperty(name = "taskItems", value = "任务检查项"
            , required = false, example = "")
    private List<TaskItemVO> taskItems;

    @ApiModelProperty(name = "taskItemNum", value = "任务检查项总个数"
            , required = false, example = "")
    private Long taskItemNum;

    @ApiModelProperty(name = "finishTaskItemNum", value = "完成占比"
            , required = false, example = "")
    private Double finishTaskItemNum;

    @ApiModelProperty(name = "quickly", value = "是否紧急,0-不紧急,1-紧急"
            , required = false, example = "")
    private Integer quickly;

}

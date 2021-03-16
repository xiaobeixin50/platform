package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/17
 * Time: 上午12:04
 */
@Data
public class TaskListVO implements Serializable{


    private static final long serialVersionUID = -8432248465660076277L;

    @ApiModelProperty(name = "date", value = "今日/过去月"
            , required = false, example = "")
    private String date;

    @ApiModelProperty(name = "taskVOList", value = "任务列表"
            , required = false, example = "")
    private List<TaskVO> taskVOList;
}

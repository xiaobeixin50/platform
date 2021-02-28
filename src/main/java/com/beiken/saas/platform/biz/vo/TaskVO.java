package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.InspectTaskItem;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 上午5:42
 */
@Data
public class TaskVO extends InspectPlanVO implements Serializable{
    private static final long serialVersionUID = 3761249756717533455L;

    private String itemCode;

    private String taskCode;

    private Date startTime;

    private Date endTime;

    private Date finishTime;

    private Integer status;

    private Integer dangerNum;

    private List<InspectTaskItem> taskItems;

}

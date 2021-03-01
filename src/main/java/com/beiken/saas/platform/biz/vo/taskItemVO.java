package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.BgInspectItemDO;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: panboliang
 * Date: 21/2/28
 * Time: 下午4:18
 */
@Data
public class TaskItemVO extends BgInspectItemDO implements Serializable {
    private static final long serialVersionUID = -6984849536115165582L;

    private String itemCode;

    private String taskCode;

    private String inspectPlanCode;

    private String bgItemCode;

    private String photo;

    private String extra;

    private String breakUser;

    private String responsbilityUser;

    private Integer resultStatus;

    private Date endDate;
}

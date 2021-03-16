package com.beiken.saas.platform.biz.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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

    @ApiModelProperty(name = "equipment", value = "设备:例如:压力表"
            , required = false, example = "")
    private String equipment;

    private List<Extra> list;


    @Data
    private class Extra implements Serializable{
        private static final long serialVersionUID = -4916287407723367855L;

        @ApiModelProperty(name = "bgCode", value = "检查项编码"
                , required = false, example = "")
        private String bgCode;

        @ApiModelProperty(name = "controlExtra", value = "控制类型说明"
                , required = false, example = "")
        private String controlExtra;

        @ApiModelProperty(name = "adapt", value = "适用情况"
                , required = false, example = "")
        private String adapt;
    }
}

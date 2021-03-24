package com.beiken.saas.platform.biz.vo;

import com.beiken.saas.platform.pojo.HiddenDangerDO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午8:32
 */
@Data
public class DangerVO extends HiddenDangerDO implements Serializable{
    private static final long serialVersionUID = 3842240211543414146L;

    @ApiModelProperty(name = "photoList", value = "图片地址返回结果,返回结果用"
            , example = "多个英文,号分割")
    private List<String> photoList;

    @ApiModelProperty(name = "inspectPhotoList", value = "监理验收图片地址,返回结果用"
            , example = "多个英文,号分割")
    private List<String> inspectPhotoList;

    @ApiModelProperty(name = "evnPhotoList", value = "环保部门验收图片地址,返回结果用"
            , example = "多个英文,号分割")
    private List<String> evnPhotoList;

    @ApiModelProperty(name = "bgItemDetail", value = "eg:非行为类-井控管理-远控台-压力表" +
            "需要什么自行截取"
            , example = "")
    private String bgItemDetail;

    @ApiModelProperty(name = "dangerLevelStr", value = "隐患级别,中文"
            , example = "")
    private String dangerLevelStr;

    @ApiModelProperty(name = "breakUserId", value = "违章人id,返回结果用"
            , example = "")
    private List<String> breakUserIdList;

    @ApiModelProperty(name = "breakUserNameList", value = "违章人姓名列表,返回结果用"
            , example = "")
    private List<String> breakUserNameList;

    @ApiModelProperty(name = "processNum", value = "包含的状态(数字), " +
            "比如有4个状态,就返回[0,1,2,3],具体每个数字代表什么从字典表中查询"
            , example = "")
    private List<Integer> processNum;

}

package com.beiken.saas.platform.biz.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/19
 * Time: 下午1:56
 */
@Data
public class DeptStructVO implements Serializable{

    private static final long serialVersionUID = -5364148312221930005L;

    private String value;

    private List<DeptStructVO> voList;

}

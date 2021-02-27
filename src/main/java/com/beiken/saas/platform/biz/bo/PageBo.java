package com.beiken.saas.platform.biz.bo;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午11:03
 */
public class PageBo<T> implements Serializable {
    private static final long serialVersionUID = -1361914300188645979L;

    private Integer pageNo;

    private Integer pageSize;

    private Long totalPage = 0L;

    private Long totalSize = 0L;

    private List<T> itemList = Lists.newArrayList();

    public PageBo(List<T> itemList) {
        this.itemList = itemList;
    }

    public PageBo(Integer pageNo, Integer pageSize, Long totalPage, Long totalSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalSize = totalSize;
    }

    public PageBo(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public PageBo() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        if (this.pageSize != null && this.pageSize > 0 && totalSize != null) {
            this.totalPage = (totalSize - 1) / pageSize + 1;
        }
    }

    public List<T> getItemList() {
        return itemList;
    }

    public void setItemList(List<T> itemList) {
        this.itemList = itemList;
    }
}

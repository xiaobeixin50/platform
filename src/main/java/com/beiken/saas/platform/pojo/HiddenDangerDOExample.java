package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiddenDangerDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public HiddenDangerDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setCount(int count) {
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andDangerCodeIsNull() {
            addCriterion("danger_code is null");
            return (Criteria) this;
        }

        public Criteria andDangerCodeIsNotNull() {
            addCriterion("danger_code is not null");
            return (Criteria) this;
        }

        public Criteria andDangerCodeEqualTo(String value) {
            addCriterion("danger_code =", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeNotEqualTo(String value) {
            addCriterion("danger_code <>", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeGreaterThan(String value) {
            addCriterion("danger_code >", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("danger_code >=", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeLessThan(String value) {
            addCriterion("danger_code <", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeLessThanOrEqualTo(String value) {
            addCriterion("danger_code <=", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeLike(String value) {
            addCriterion("danger_code like", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeNotLike(String value) {
            addCriterion("danger_code not like", value, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeIn(List<String> values) {
            addCriterion("danger_code in", values, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeNotIn(List<String> values) {
            addCriterion("danger_code not in", values, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeBetween(String value1, String value2) {
            addCriterion("danger_code between", value1, value2, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andDangerCodeNotBetween(String value1, String value2) {
            addCriterion("danger_code not between", value1, value2, "dangerCode");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andReportExtraIsNull() {
            addCriterion("report_extra is null");
            return (Criteria) this;
        }

        public Criteria andReportExtraIsNotNull() {
            addCriterion("report_extra is not null");
            return (Criteria) this;
        }

        public Criteria andReportExtraEqualTo(String value) {
            addCriterion("report_extra =", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraNotEqualTo(String value) {
            addCriterion("report_extra <>", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraGreaterThan(String value) {
            addCriterion("report_extra >", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraGreaterThanOrEqualTo(String value) {
            addCriterion("report_extra >=", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraLessThan(String value) {
            addCriterion("report_extra <", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraLessThanOrEqualTo(String value) {
            addCriterion("report_extra <=", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraLike(String value) {
            addCriterion("report_extra like", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraNotLike(String value) {
            addCriterion("report_extra not like", value, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraIn(List<String> values) {
            addCriterion("report_extra in", values, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraNotIn(List<String> values) {
            addCriterion("report_extra not in", values, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraBetween(String value1, String value2) {
            addCriterion("report_extra between", value1, value2, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andReportExtraNotBetween(String value1, String value2) {
            addCriterion("report_extra not between", value1, value2, "reportExtra");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeIsNull() {
            addCriterion("bg_item_code is null");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeIsNotNull() {
            addCriterion("bg_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeEqualTo(String value) {
            addCriterion("bg_item_code =", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeNotEqualTo(String value) {
            addCriterion("bg_item_code <>", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeGreaterThan(String value) {
            addCriterion("bg_item_code >", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bg_item_code >=", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeLessThan(String value) {
            addCriterion("bg_item_code <", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeLessThanOrEqualTo(String value) {
            addCriterion("bg_item_code <=", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeLike(String value) {
            addCriterion("bg_item_code like", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeNotLike(String value) {
            addCriterion("bg_item_code not like", value, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeIn(List<String> values) {
            addCriterion("bg_item_code in", values, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeNotIn(List<String> values) {
            addCriterion("bg_item_code not in", values, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeBetween(String value1, String value2) {
            addCriterion("bg_item_code between", value1, value2, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andBgItemCodeNotBetween(String value1, String value2) {
            addCriterion("bg_item_code not between", value1, value2, "bgItemCode");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Long value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Long value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Long value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Long value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Long> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Long> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Long value1, Long value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIsNull() {
            addCriterion("parent_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIsNotNull() {
            addCriterion("parent_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdEqualTo(Long value) {
            addCriterion("parent_dept_id =", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotEqualTo(Long value) {
            addCriterion("parent_dept_id <>", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdGreaterThan(Long value) {
            addCriterion("parent_dept_id >", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_dept_id >=", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdLessThan(Long value) {
            addCriterion("parent_dept_id <", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_dept_id <=", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIn(List<Long> values) {
            addCriterion("parent_dept_id in", values, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotIn(List<Long> values) {
            addCriterion("parent_dept_id not in", values, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdBetween(Long value1, Long value2) {
            addCriterion("parent_dept_id between", value1, value2, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_dept_id not between", value1, value2, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameIsNull() {
            addCriterion("parent_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameIsNotNull() {
            addCriterion("parent_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameEqualTo(String value) {
            addCriterion("parent_dept_name =", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameNotEqualTo(String value) {
            addCriterion("parent_dept_name <>", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameGreaterThan(String value) {
            addCriterion("parent_dept_name >", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_dept_name >=", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameLessThan(String value) {
            addCriterion("parent_dept_name <", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameLessThanOrEqualTo(String value) {
            addCriterion("parent_dept_name <=", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameLike(String value) {
            addCriterion("parent_dept_name like", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameNotLike(String value) {
            addCriterion("parent_dept_name not like", value, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameIn(List<String> values) {
            addCriterion("parent_dept_name in", values, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameNotIn(List<String> values) {
            addCriterion("parent_dept_name not in", values, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameBetween(String value1, String value2) {
            addCriterion("parent_dept_name between", value1, value2, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptNameNotBetween(String value1, String value2) {
            addCriterion("parent_dept_name not between", value1, value2, "parentDeptName");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIsNull() {
            addCriterion("danger_level is null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIsNotNull() {
            addCriterion("danger_level is not null");
            return (Criteria) this;
        }

        public Criteria andDangerLevelEqualTo(Integer value) {
            addCriterion("danger_level =", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotEqualTo(Integer value) {
            addCriterion("danger_level <>", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelGreaterThan(Integer value) {
            addCriterion("danger_level >", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("danger_level >=", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelLessThan(Integer value) {
            addCriterion("danger_level <", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("danger_level <=", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIn(List<Integer> values) {
            addCriterion("danger_level in", values, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotIn(List<Integer> values) {
            addCriterion("danger_level not in", values, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelBetween(Integer value1, Integer value2) {
            addCriterion("danger_level between", value1, value2, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("danger_level not between", value1, value2, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdIsNull() {
            addCriterion("break_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdIsNotNull() {
            addCriterion("break_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdEqualTo(String value) {
            addCriterion("break_user_id =", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdNotEqualTo(String value) {
            addCriterion("break_user_id <>", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdGreaterThan(String value) {
            addCriterion("break_user_id >", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("break_user_id >=", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdLessThan(String value) {
            addCriterion("break_user_id <", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdLessThanOrEqualTo(String value) {
            addCriterion("break_user_id <=", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdLike(String value) {
            addCriterion("break_user_id like", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdNotLike(String value) {
            addCriterion("break_user_id not like", value, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdIn(List<String> values) {
            addCriterion("break_user_id in", values, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdNotIn(List<String> values) {
            addCriterion("break_user_id not in", values, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdBetween(String value1, String value2) {
            addCriterion("break_user_id between", value1, value2, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserIdNotBetween(String value1, String value2) {
            addCriterion("break_user_id not between", value1, value2, "breakUserId");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameIsNull() {
            addCriterion("break_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameIsNotNull() {
            addCriterion("break_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameEqualTo(String value) {
            addCriterion("break_user_name =", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameNotEqualTo(String value) {
            addCriterion("break_user_name <>", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameGreaterThan(String value) {
            addCriterion("break_user_name >", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("break_user_name >=", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameLessThan(String value) {
            addCriterion("break_user_name <", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameLessThanOrEqualTo(String value) {
            addCriterion("break_user_name <=", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameLike(String value) {
            addCriterion("break_user_name like", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameNotLike(String value) {
            addCriterion("break_user_name not like", value, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameIn(List<String> values) {
            addCriterion("break_user_name in", values, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameNotIn(List<String> values) {
            addCriterion("break_user_name not in", values, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameBetween(String value1, String value2) {
            addCriterion("break_user_name between", value1, value2, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andBreakUserNameNotBetween(String value1, String value2) {
            addCriterion("break_user_name not between", value1, value2, "breakUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdIsNull() {
            addCriterion("responsibility_user_id is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdIsNotNull() {
            addCriterion("responsibility_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdEqualTo(Long value) {
            addCriterion("responsibility_user_id =", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdNotEqualTo(Long value) {
            addCriterion("responsibility_user_id <>", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdGreaterThan(Long value) {
            addCriterion("responsibility_user_id >", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("responsibility_user_id >=", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdLessThan(Long value) {
            addCriterion("responsibility_user_id <", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdLessThanOrEqualTo(Long value) {
            addCriterion("responsibility_user_id <=", value, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdIn(List<Long> values) {
            addCriterion("responsibility_user_id in", values, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdNotIn(List<Long> values) {
            addCriterion("responsibility_user_id not in", values, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdBetween(Long value1, Long value2) {
            addCriterion("responsibility_user_id between", value1, value2, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserIdNotBetween(Long value1, Long value2) {
            addCriterion("responsibility_user_id not between", value1, value2, "responsibilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameIsNull() {
            addCriterion("responsibility_user_name is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameIsNotNull() {
            addCriterion("responsibility_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameEqualTo(String value) {
            addCriterion("responsibility_user_name =", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameNotEqualTo(String value) {
            addCriterion("responsibility_user_name <>", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameGreaterThan(String value) {
            addCriterion("responsibility_user_name >", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility_user_name >=", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameLessThan(String value) {
            addCriterion("responsibility_user_name <", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameLessThanOrEqualTo(String value) {
            addCriterion("responsibility_user_name <=", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameLike(String value) {
            addCriterion("responsibility_user_name like", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameNotLike(String value) {
            addCriterion("responsibility_user_name not like", value, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameIn(List<String> values) {
            addCriterion("responsibility_user_name in", values, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameNotIn(List<String> values) {
            addCriterion("responsibility_user_name not in", values, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameBetween(String value1, String value2) {
            addCriterion("responsibility_user_name between", value1, value2, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityUserNameNotBetween(String value1, String value2) {
            addCriterion("responsibility_user_name not between", value1, value2, "responsibilityUserName");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateIsNull() {
            addCriterion("change_end_date is null");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateIsNotNull() {
            addCriterion("change_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateEqualTo(Date value) {
            addCriterion("change_end_date =", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateNotEqualTo(Date value) {
            addCriterion("change_end_date <>", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateGreaterThan(Date value) {
            addCriterion("change_end_date >", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("change_end_date >=", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateLessThan(Date value) {
            addCriterion("change_end_date <", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateLessThanOrEqualTo(Date value) {
            addCriterion("change_end_date <=", value, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateIn(List<Date> values) {
            addCriterion("change_end_date in", values, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateNotIn(List<Date> values) {
            addCriterion("change_end_date not in", values, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateBetween(Date value1, Date value2) {
            addCriterion("change_end_date between", value1, value2, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andChangeEndDateNotBetween(Date value1, Date value2) {
            addCriterion("change_end_date not between", value1, value2, "changeEndDate");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(Integer value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(Integer value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(Integer value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(Integer value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<Integer> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<Integer> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(Integer value1, Integer value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(Integer value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Integer value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Integer value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Integer value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Integer value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Integer> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Integer> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Integer value1, Integer value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("report_status not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdIsNull() {
            addCriterion("dis_level_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdIsNotNull() {
            addCriterion("dis_level_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdEqualTo(Long value) {
            addCriterion("dis_level_user_id =", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdNotEqualTo(Long value) {
            addCriterion("dis_level_user_id <>", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdGreaterThan(Long value) {
            addCriterion("dis_level_user_id >", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dis_level_user_id >=", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdLessThan(Long value) {
            addCriterion("dis_level_user_id <", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdLessThanOrEqualTo(Long value) {
            addCriterion("dis_level_user_id <=", value, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdIn(List<Long> values) {
            addCriterion("dis_level_user_id in", values, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdNotIn(List<Long> values) {
            addCriterion("dis_level_user_id not in", values, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdBetween(Long value1, Long value2) {
            addCriterion("dis_level_user_id between", value1, value2, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserIdNotBetween(Long value1, Long value2) {
            addCriterion("dis_level_user_id not between", value1, value2, "disLevelUserId");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameIsNull() {
            addCriterion("dis_level_user_name is null");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameIsNotNull() {
            addCriterion("dis_level_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameEqualTo(String value) {
            addCriterion("dis_level_user_name =", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameNotEqualTo(String value) {
            addCriterion("dis_level_user_name <>", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameGreaterThan(String value) {
            addCriterion("dis_level_user_name >", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("dis_level_user_name >=", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameLessThan(String value) {
            addCriterion("dis_level_user_name <", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameLessThanOrEqualTo(String value) {
            addCriterion("dis_level_user_name <=", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameLike(String value) {
            addCriterion("dis_level_user_name like", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameNotLike(String value) {
            addCriterion("dis_level_user_name not like", value, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameIn(List<String> values) {
            addCriterion("dis_level_user_name in", values, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameNotIn(List<String> values) {
            addCriterion("dis_level_user_name not in", values, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameBetween(String value1, String value2) {
            addCriterion("dis_level_user_name between", value1, value2, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelUserNameNotBetween(String value1, String value2) {
            addCriterion("dis_level_user_name not between", value1, value2, "disLevelUserName");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeIsNull() {
            addCriterion("dis_level_time is null");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeIsNotNull() {
            addCriterion("dis_level_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeEqualTo(Date value) {
            addCriterion("dis_level_time =", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeNotEqualTo(Date value) {
            addCriterion("dis_level_time <>", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeGreaterThan(Date value) {
            addCriterion("dis_level_time >", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dis_level_time >=", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeLessThan(Date value) {
            addCriterion("dis_level_time <", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeLessThanOrEqualTo(Date value) {
            addCriterion("dis_level_time <=", value, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeIn(List<Date> values) {
            addCriterion("dis_level_time in", values, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeNotIn(List<Date> values) {
            addCriterion("dis_level_time not in", values, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeBetween(Date value1, Date value2) {
            addCriterion("dis_level_time between", value1, value2, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andDisLevelTimeNotBetween(Date value1, Date value2) {
            addCriterion("dis_level_time not between", value1, value2, "disLevelTime");
            return (Criteria) this;
        }

        public Criteria andChangeAttachIsNull() {
            addCriterion("change_attach is null");
            return (Criteria) this;
        }

        public Criteria andChangeAttachIsNotNull() {
            addCriterion("change_attach is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAttachEqualTo(String value) {
            addCriterion("change_attach =", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachNotEqualTo(String value) {
            addCriterion("change_attach <>", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachGreaterThan(String value) {
            addCriterion("change_attach >", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachGreaterThanOrEqualTo(String value) {
            addCriterion("change_attach >=", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachLessThan(String value) {
            addCriterion("change_attach <", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachLessThanOrEqualTo(String value) {
            addCriterion("change_attach <=", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachLike(String value) {
            addCriterion("change_attach like", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachNotLike(String value) {
            addCriterion("change_attach not like", value, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachIn(List<String> values) {
            addCriterion("change_attach in", values, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachNotIn(List<String> values) {
            addCriterion("change_attach not in", values, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachBetween(String value1, String value2) {
            addCriterion("change_attach between", value1, value2, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeAttachNotBetween(String value1, String value2) {
            addCriterion("change_attach not between", value1, value2, "changeAttach");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNull() {
            addCriterion("change_money is null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNotNull() {
            addCriterion("change_money is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyEqualTo(Double value) {
            addCriterion("change_money =", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotEqualTo(Double value) {
            addCriterion("change_money <>", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThan(Double value) {
            addCriterion("change_money >", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("change_money >=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThan(Double value) {
            addCriterion("change_money <", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("change_money <=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIn(List<Double> values) {
            addCriterion("change_money in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotIn(List<Double> values) {
            addCriterion("change_money not in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyBetween(Double value1, Double value2) {
            addCriterion("change_money between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("change_money not between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdIsNull() {
            addCriterion("change_user_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdIsNotNull() {
            addCriterion("change_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdEqualTo(Integer value) {
            addCriterion("change_user_id =", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotEqualTo(Integer value) {
            addCriterion("change_user_id <>", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdGreaterThan(Integer value) {
            addCriterion("change_user_id >", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_user_id >=", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdLessThan(Integer value) {
            addCriterion("change_user_id <", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("change_user_id <=", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdIn(List<Integer> values) {
            addCriterion("change_user_id in", values, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotIn(List<Integer> values) {
            addCriterion("change_user_id not in", values, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("change_user_id between", value1, value2, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("change_user_id not between", value1, value2, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIsNull() {
            addCriterion("change_user_name is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIsNotNull() {
            addCriterion("change_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameEqualTo(String value) {
            addCriterion("change_user_name =", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotEqualTo(String value) {
            addCriterion("change_user_name <>", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameGreaterThan(String value) {
            addCriterion("change_user_name >", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("change_user_name >=", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLessThan(String value) {
            addCriterion("change_user_name <", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLessThanOrEqualTo(String value) {
            addCriterion("change_user_name <=", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLike(String value) {
            addCriterion("change_user_name like", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotLike(String value) {
            addCriterion("change_user_name not like", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIn(List<String> values) {
            addCriterion("change_user_name in", values, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotIn(List<String> values) {
            addCriterion("change_user_name not in", values, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameBetween(String value1, String value2) {
            addCriterion("change_user_name between", value1, value2, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotBetween(String value1, String value2) {
            addCriterion("change_user_name not between", value1, value2, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeIsNull() {
            addCriterion("change_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeIsNotNull() {
            addCriterion("change_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeEqualTo(Date value) {
            addCriterion("change_submit_time =", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeNotEqualTo(Date value) {
            addCriterion("change_submit_time <>", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeGreaterThan(Date value) {
            addCriterion("change_submit_time >", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_submit_time >=", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeLessThan(Date value) {
            addCriterion("change_submit_time <", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_submit_time <=", value, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeIn(List<Date> values) {
            addCriterion("change_submit_time in", values, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeNotIn(List<Date> values) {
            addCriterion("change_submit_time not in", values, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("change_submit_time between", value1, value2, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andChangeSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_submit_time not between", value1, value2, "changeSubmitTime");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdIsNull() {
            addCriterion("inspect_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdIsNotNull() {
            addCriterion("inspect_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdEqualTo(Long value) {
            addCriterion("inspect_user_id =", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdNotEqualTo(Long value) {
            addCriterion("inspect_user_id <>", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdGreaterThan(Long value) {
            addCriterion("inspect_user_id >", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspect_user_id >=", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdLessThan(Long value) {
            addCriterion("inspect_user_id <", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdLessThanOrEqualTo(Long value) {
            addCriterion("inspect_user_id <=", value, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdIn(List<Long> values) {
            addCriterion("inspect_user_id in", values, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdNotIn(List<Long> values) {
            addCriterion("inspect_user_id not in", values, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdBetween(Long value1, Long value2) {
            addCriterion("inspect_user_id between", value1, value2, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserIdNotBetween(Long value1, Long value2) {
            addCriterion("inspect_user_id not between", value1, value2, "inspectUserId");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameIsNull() {
            addCriterion("inspect_user_name is null");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameIsNotNull() {
            addCriterion("inspect_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameEqualTo(String value) {
            addCriterion("inspect_user_name =", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameNotEqualTo(String value) {
            addCriterion("inspect_user_name <>", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameGreaterThan(String value) {
            addCriterion("inspect_user_name >", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_user_name >=", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameLessThan(String value) {
            addCriterion("inspect_user_name <", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameLessThanOrEqualTo(String value) {
            addCriterion("inspect_user_name <=", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameLike(String value) {
            addCriterion("inspect_user_name like", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameNotLike(String value) {
            addCriterion("inspect_user_name not like", value, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameIn(List<String> values) {
            addCriterion("inspect_user_name in", values, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameNotIn(List<String> values) {
            addCriterion("inspect_user_name not in", values, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameBetween(String value1, String value2) {
            addCriterion("inspect_user_name between", value1, value2, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectUserNameNotBetween(String value1, String value2) {
            addCriterion("inspect_user_name not between", value1, value2, "inspectUserName");
            return (Criteria) this;
        }

        public Criteria andInspectExtraIsNull() {
            addCriterion("inspect_extra is null");
            return (Criteria) this;
        }

        public Criteria andInspectExtraIsNotNull() {
            addCriterion("inspect_extra is not null");
            return (Criteria) this;
        }

        public Criteria andInspectExtraEqualTo(String value) {
            addCriterion("inspect_extra =", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraNotEqualTo(String value) {
            addCriterion("inspect_extra <>", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraGreaterThan(String value) {
            addCriterion("inspect_extra >", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_extra >=", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraLessThan(String value) {
            addCriterion("inspect_extra <", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraLessThanOrEqualTo(String value) {
            addCriterion("inspect_extra <=", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraLike(String value) {
            addCriterion("inspect_extra like", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraNotLike(String value) {
            addCriterion("inspect_extra not like", value, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraIn(List<String> values) {
            addCriterion("inspect_extra in", values, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraNotIn(List<String> values) {
            addCriterion("inspect_extra not in", values, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraBetween(String value1, String value2) {
            addCriterion("inspect_extra between", value1, value2, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectExtraNotBetween(String value1, String value2) {
            addCriterion("inspect_extra not between", value1, value2, "inspectExtra");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoIsNull() {
            addCriterion("inspect_photo is null");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoIsNotNull() {
            addCriterion("inspect_photo is not null");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoEqualTo(String value) {
            addCriterion("inspect_photo =", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoNotEqualTo(String value) {
            addCriterion("inspect_photo <>", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoGreaterThan(String value) {
            addCriterion("inspect_photo >", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_photo >=", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoLessThan(String value) {
            addCriterion("inspect_photo <", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoLessThanOrEqualTo(String value) {
            addCriterion("inspect_photo <=", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoLike(String value) {
            addCriterion("inspect_photo like", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoNotLike(String value) {
            addCriterion("inspect_photo not like", value, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoIn(List<String> values) {
            addCriterion("inspect_photo in", values, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoNotIn(List<String> values) {
            addCriterion("inspect_photo not in", values, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoBetween(String value1, String value2) {
            addCriterion("inspect_photo between", value1, value2, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectPhotoNotBetween(String value1, String value2) {
            addCriterion("inspect_photo not between", value1, value2, "inspectPhoto");
            return (Criteria) this;
        }

        public Criteria andInspectStatusIsNull() {
            addCriterion("inspect_status is null");
            return (Criteria) this;
        }

        public Criteria andInspectStatusIsNotNull() {
            addCriterion("inspect_status is not null");
            return (Criteria) this;
        }

        public Criteria andInspectStatusEqualTo(Integer value) {
            addCriterion("inspect_status =", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusNotEqualTo(Integer value) {
            addCriterion("inspect_status <>", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusGreaterThan(Integer value) {
            addCriterion("inspect_status >", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspect_status >=", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusLessThan(Integer value) {
            addCriterion("inspect_status <", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("inspect_status <=", value, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusIn(List<Integer> values) {
            addCriterion("inspect_status in", values, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusNotIn(List<Integer> values) {
            addCriterion("inspect_status not in", values, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusBetween(Integer value1, Integer value2) {
            addCriterion("inspect_status between", value1, value2, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("inspect_status not between", value1, value2, "inspectStatus");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIsNull() {
            addCriterion("inspect_time is null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIsNotNull() {
            addCriterion("inspect_time is not null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeEqualTo(Date value) {
            addCriterion("inspect_time =", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotEqualTo(Date value) {
            addCriterion("inspect_time <>", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThan(Date value) {
            addCriterion("inspect_time >", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inspect_time >=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThan(Date value) {
            addCriterion("inspect_time <", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThanOrEqualTo(Date value) {
            addCriterion("inspect_time <=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIn(List<Date> values) {
            addCriterion("inspect_time in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotIn(List<Date> values) {
            addCriterion("inspect_time not in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeBetween(Date value1, Date value2) {
            addCriterion("inspect_time between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotBetween(Date value1, Date value2) {
            addCriterion("inspect_time not between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andRigCodeIsNull() {
            addCriterion("rig_code is null");
            return (Criteria) this;
        }

        public Criteria andRigCodeIsNotNull() {
            addCriterion("rig_code is not null");
            return (Criteria) this;
        }

        public Criteria andRigCodeEqualTo(String value) {
            addCriterion("rig_code =", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeNotEqualTo(String value) {
            addCriterion("rig_code <>", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeGreaterThan(String value) {
            addCriterion("rig_code >", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rig_code >=", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeLessThan(String value) {
            addCriterion("rig_code <", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeLessThanOrEqualTo(String value) {
            addCriterion("rig_code <=", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeLike(String value) {
            addCriterion("rig_code like", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeNotLike(String value) {
            addCriterion("rig_code not like", value, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeIn(List<String> values) {
            addCriterion("rig_code in", values, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeNotIn(List<String> values) {
            addCriterion("rig_code not in", values, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeBetween(String value1, String value2) {
            addCriterion("rig_code between", value1, value2, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigCodeNotBetween(String value1, String value2) {
            addCriterion("rig_code not between", value1, value2, "rigCode");
            return (Criteria) this;
        }

        public Criteria andRigIdIsNull() {
            addCriterion("rig_id is null");
            return (Criteria) this;
        }

        public Criteria andRigIdIsNotNull() {
            addCriterion("rig_id is not null");
            return (Criteria) this;
        }

        public Criteria andRigIdEqualTo(Long value) {
            addCriterion("rig_id =", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdNotEqualTo(Long value) {
            addCriterion("rig_id <>", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdGreaterThan(Long value) {
            addCriterion("rig_id >", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rig_id >=", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdLessThan(Long value) {
            addCriterion("rig_id <", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdLessThanOrEqualTo(Long value) {
            addCriterion("rig_id <=", value, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdIn(List<Long> values) {
            addCriterion("rig_id in", values, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdNotIn(List<Long> values) {
            addCriterion("rig_id not in", values, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdBetween(Long value1, Long value2) {
            addCriterion("rig_id between", value1, value2, "rigId");
            return (Criteria) this;
        }

        public Criteria andRigIdNotBetween(Long value1, Long value2) {
            addCriterion("rig_id not between", value1, value2, "rigId");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoIsNull() {
            addCriterion("evn_photo is null");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoIsNotNull() {
            addCriterion("evn_photo is not null");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoEqualTo(String value) {
            addCriterion("evn_photo =", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoNotEqualTo(String value) {
            addCriterion("evn_photo <>", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoGreaterThan(String value) {
            addCriterion("evn_photo >", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("evn_photo >=", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoLessThan(String value) {
            addCriterion("evn_photo <", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoLessThanOrEqualTo(String value) {
            addCriterion("evn_photo <=", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoLike(String value) {
            addCriterion("evn_photo like", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoNotLike(String value) {
            addCriterion("evn_photo not like", value, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoIn(List<String> values) {
            addCriterion("evn_photo in", values, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoNotIn(List<String> values) {
            addCriterion("evn_photo not in", values, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoBetween(String value1, String value2) {
            addCriterion("evn_photo between", value1, value2, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnPhotoNotBetween(String value1, String value2) {
            addCriterion("evn_photo not between", value1, value2, "evnPhoto");
            return (Criteria) this;
        }

        public Criteria andEvnExtraIsNull() {
            addCriterion("evn_extra is null");
            return (Criteria) this;
        }

        public Criteria andEvnExtraIsNotNull() {
            addCriterion("evn_extra is not null");
            return (Criteria) this;
        }

        public Criteria andEvnExtraEqualTo(String value) {
            addCriterion("evn_extra =", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraNotEqualTo(String value) {
            addCriterion("evn_extra <>", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraGreaterThan(String value) {
            addCriterion("evn_extra >", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraGreaterThanOrEqualTo(String value) {
            addCriterion("evn_extra >=", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraLessThan(String value) {
            addCriterion("evn_extra <", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraLessThanOrEqualTo(String value) {
            addCriterion("evn_extra <=", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraLike(String value) {
            addCriterion("evn_extra like", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraNotLike(String value) {
            addCriterion("evn_extra not like", value, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraIn(List<String> values) {
            addCriterion("evn_extra in", values, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraNotIn(List<String> values) {
            addCriterion("evn_extra not in", values, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraBetween(String value1, String value2) {
            addCriterion("evn_extra between", value1, value2, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnExtraNotBetween(String value1, String value2) {
            addCriterion("evn_extra not between", value1, value2, "evnExtra");
            return (Criteria) this;
        }

        public Criteria andEvnStatusIsNull() {
            addCriterion("evn_status is null");
            return (Criteria) this;
        }

        public Criteria andEvnStatusIsNotNull() {
            addCriterion("evn_status is not null");
            return (Criteria) this;
        }

        public Criteria andEvnStatusEqualTo(Integer value) {
            addCriterion("evn_status =", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusNotEqualTo(Integer value) {
            addCriterion("evn_status <>", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusGreaterThan(Integer value) {
            addCriterion("evn_status >", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("evn_status >=", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusLessThan(Integer value) {
            addCriterion("evn_status <", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("evn_status <=", value, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusIn(List<Integer> values) {
            addCriterion("evn_status in", values, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusNotIn(List<Integer> values) {
            addCriterion("evn_status not in", values, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusBetween(Integer value1, Integer value2) {
            addCriterion("evn_status between", value1, value2, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("evn_status not between", value1, value2, "evnStatus");
            return (Criteria) this;
        }

        public Criteria andEvnTimeIsNull() {
            addCriterion("evn_time is null");
            return (Criteria) this;
        }

        public Criteria andEvnTimeIsNotNull() {
            addCriterion("evn_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvnTimeEqualTo(Date value) {
            addCriterion("evn_time =", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeNotEqualTo(Date value) {
            addCriterion("evn_time <>", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeGreaterThan(Date value) {
            addCriterion("evn_time >", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evn_time >=", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeLessThan(Date value) {
            addCriterion("evn_time <", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeLessThanOrEqualTo(Date value) {
            addCriterion("evn_time <=", value, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeIn(List<Date> values) {
            addCriterion("evn_time in", values, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeNotIn(List<Date> values) {
            addCriterion("evn_time not in", values, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeBetween(Date value1, Date value2) {
            addCriterion("evn_time between", value1, value2, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnTimeNotBetween(Date value1, Date value2) {
            addCriterion("evn_time not between", value1, value2, "evnTime");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdIsNull() {
            addCriterion("evn_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdIsNotNull() {
            addCriterion("evn_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdEqualTo(Long value) {
            addCriterion("evn_user_id =", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdNotEqualTo(Long value) {
            addCriterion("evn_user_id <>", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdGreaterThan(Long value) {
            addCriterion("evn_user_id >", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evn_user_id >=", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdLessThan(Long value) {
            addCriterion("evn_user_id <", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdLessThanOrEqualTo(Long value) {
            addCriterion("evn_user_id <=", value, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdIn(List<Long> values) {
            addCriterion("evn_user_id in", values, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdNotIn(List<Long> values) {
            addCriterion("evn_user_id not in", values, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdBetween(Long value1, Long value2) {
            addCriterion("evn_user_id between", value1, value2, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserIdNotBetween(Long value1, Long value2) {
            addCriterion("evn_user_id not between", value1, value2, "evnUserId");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameIsNull() {
            addCriterion("evn_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameIsNotNull() {
            addCriterion("evn_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameEqualTo(String value) {
            addCriterion("evn_user_name =", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameNotEqualTo(String value) {
            addCriterion("evn_user_name <>", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameGreaterThan(String value) {
            addCriterion("evn_user_name >", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("evn_user_name >=", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameLessThan(String value) {
            addCriterion("evn_user_name <", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameLessThanOrEqualTo(String value) {
            addCriterion("evn_user_name <=", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameLike(String value) {
            addCriterion("evn_user_name like", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameNotLike(String value) {
            addCriterion("evn_user_name not like", value, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameIn(List<String> values) {
            addCriterion("evn_user_name in", values, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameNotIn(List<String> values) {
            addCriterion("evn_user_name not in", values, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameBetween(String value1, String value2) {
            addCriterion("evn_user_name between", value1, value2, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andEvnUserNameNotBetween(String value1, String value2) {
            addCriterion("evn_user_name not between", value1, value2, "evnUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserIdIsNull() {
            addCriterion("find_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFindUserIdIsNotNull() {
            addCriterion("find_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFindUserIdEqualTo(Long value) {
            addCriterion("find_user_id =", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdNotEqualTo(Long value) {
            addCriterion("find_user_id <>", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdGreaterThan(Long value) {
            addCriterion("find_user_id >", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("find_user_id >=", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdLessThan(Long value) {
            addCriterion("find_user_id <", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdLessThanOrEqualTo(Long value) {
            addCriterion("find_user_id <=", value, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdIn(List<Long> values) {
            addCriterion("find_user_id in", values, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdNotIn(List<Long> values) {
            addCriterion("find_user_id not in", values, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdBetween(Long value1, Long value2) {
            addCriterion("find_user_id between", value1, value2, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserIdNotBetween(Long value1, Long value2) {
            addCriterion("find_user_id not between", value1, value2, "findUserId");
            return (Criteria) this;
        }

        public Criteria andFindUserNameIsNull() {
            addCriterion("find_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFindUserNameIsNotNull() {
            addCriterion("find_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFindUserNameEqualTo(String value) {
            addCriterion("find_user_name =", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameNotEqualTo(String value) {
            addCriterion("find_user_name <>", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameGreaterThan(String value) {
            addCriterion("find_user_name >", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("find_user_name >=", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameLessThan(String value) {
            addCriterion("find_user_name <", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameLessThanOrEqualTo(String value) {
            addCriterion("find_user_name <=", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameLike(String value) {
            addCriterion("find_user_name like", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameNotLike(String value) {
            addCriterion("find_user_name not like", value, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameIn(List<String> values) {
            addCriterion("find_user_name in", values, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameNotIn(List<String> values) {
            addCriterion("find_user_name not in", values, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameBetween(String value1, String value2) {
            addCriterion("find_user_name between", value1, value2, "findUserName");
            return (Criteria) this;
        }

        public Criteria andFindUserNameNotBetween(String value1, String value2) {
            addCriterion("find_user_name not between", value1, value2, "findUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdIsNull() {
            addCriterion("confirm_user_id is null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdIsNotNull() {
            addCriterion("confirm_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdEqualTo(Long value) {
            addCriterion("confirm_user_id =", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdNotEqualTo(Long value) {
            addCriterion("confirm_user_id <>", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdGreaterThan(Long value) {
            addCriterion("confirm_user_id >", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("confirm_user_id >=", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdLessThan(Long value) {
            addCriterion("confirm_user_id <", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdLessThanOrEqualTo(Long value) {
            addCriterion("confirm_user_id <=", value, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdIn(List<Long> values) {
            addCriterion("confirm_user_id in", values, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdNotIn(List<Long> values) {
            addCriterion("confirm_user_id not in", values, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdBetween(Long value1, Long value2) {
            addCriterion("confirm_user_id between", value1, value2, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIdNotBetween(Long value1, Long value2) {
            addCriterion("confirm_user_id not between", value1, value2, "confirmUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameIsNull() {
            addCriterion("confirm_user_name is null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameIsNotNull() {
            addCriterion("confirm_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameEqualTo(String value) {
            addCriterion("confirm_user_name =", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameNotEqualTo(String value) {
            addCriterion("confirm_user_name <>", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameGreaterThan(String value) {
            addCriterion("confirm_user_name >", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_user_name >=", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameLessThan(String value) {
            addCriterion("confirm_user_name <", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameLessThanOrEqualTo(String value) {
            addCriterion("confirm_user_name <=", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameLike(String value) {
            addCriterion("confirm_user_name like", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameNotLike(String value) {
            addCriterion("confirm_user_name not like", value, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameIn(List<String> values) {
            addCriterion("confirm_user_name in", values, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameNotIn(List<String> values) {
            addCriterion("confirm_user_name not in", values, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameBetween(String value1, String value2) {
            addCriterion("confirm_user_name between", value1, value2, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNameNotBetween(String value1, String value2) {
            addCriterion("confirm_user_name not between", value1, value2, "confirmUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
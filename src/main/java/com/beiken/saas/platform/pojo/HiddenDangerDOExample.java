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

        public Criteria andDisUserRoleIsNull() {
            addCriterion("dis_user_role is null");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleIsNotNull() {
            addCriterion("dis_user_role is not null");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleEqualTo(String value) {
            addCriterion("dis_user_role =", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleNotEqualTo(String value) {
            addCriterion("dis_user_role <>", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleGreaterThan(String value) {
            addCriterion("dis_user_role >", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("dis_user_role >=", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleLessThan(String value) {
            addCriterion("dis_user_role <", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleLessThanOrEqualTo(String value) {
            addCriterion("dis_user_role <=", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleLike(String value) {
            addCriterion("dis_user_role like", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleNotLike(String value) {
            addCriterion("dis_user_role not like", value, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleIn(List<String> values) {
            addCriterion("dis_user_role in", values, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleNotIn(List<String> values) {
            addCriterion("dis_user_role not in", values, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleBetween(String value1, String value2) {
            addCriterion("dis_user_role between", value1, value2, "disUserRole");
            return (Criteria) this;
        }

        public Criteria andDisUserRoleNotBetween(String value1, String value2) {
            addCriterion("dis_user_role not between", value1, value2, "disUserRole");
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

        public Criteria andChangePlanIsNull() {
            addCriterion("change_plan is null");
            return (Criteria) this;
        }

        public Criteria andChangePlanIsNotNull() {
            addCriterion("change_plan is not null");
            return (Criteria) this;
        }

        public Criteria andChangePlanEqualTo(String value) {
            addCriterion("change_plan =", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanNotEqualTo(String value) {
            addCriterion("change_plan <>", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanGreaterThan(String value) {
            addCriterion("change_plan >", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanGreaterThanOrEqualTo(String value) {
            addCriterion("change_plan >=", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanLessThan(String value) {
            addCriterion("change_plan <", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanLessThanOrEqualTo(String value) {
            addCriterion("change_plan <=", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanLike(String value) {
            addCriterion("change_plan like", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanNotLike(String value) {
            addCriterion("change_plan not like", value, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanIn(List<String> values) {
            addCriterion("change_plan in", values, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanNotIn(List<String> values) {
            addCriterion("change_plan not in", values, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanBetween(String value1, String value2) {
            addCriterion("change_plan between", value1, value2, "changePlan");
            return (Criteria) this;
        }

        public Criteria andChangePlanNotBetween(String value1, String value2) {
            addCriterion("change_plan not between", value1, value2, "changePlan");
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

        public Criteria andChangeUserRoleIsNull() {
            addCriterion("change_user_role is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleIsNotNull() {
            addCriterion("change_user_role is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleEqualTo(String value) {
            addCriterion("change_user_role =", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleNotEqualTo(String value) {
            addCriterion("change_user_role <>", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleGreaterThan(String value) {
            addCriterion("change_user_role >", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("change_user_role >=", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleLessThan(String value) {
            addCriterion("change_user_role <", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleLessThanOrEqualTo(String value) {
            addCriterion("change_user_role <=", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleLike(String value) {
            addCriterion("change_user_role like", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleNotLike(String value) {
            addCriterion("change_user_role not like", value, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleIn(List<String> values) {
            addCriterion("change_user_role in", values, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleNotIn(List<String> values) {
            addCriterion("change_user_role not in", values, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleBetween(String value1, String value2) {
            addCriterion("change_user_role between", value1, value2, "changeUserRole");
            return (Criteria) this;
        }

        public Criteria andChangeUserRoleNotBetween(String value1, String value2) {
            addCriterion("change_user_role not between", value1, value2, "changeUserRole");
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

        public Criteria andInspectUserRoleIsNull() {
            addCriterion("inspect_user_role is null");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleIsNotNull() {
            addCriterion("inspect_user_role is not null");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleEqualTo(String value) {
            addCriterion("inspect_user_role =", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleNotEqualTo(String value) {
            addCriterion("inspect_user_role <>", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleGreaterThan(String value) {
            addCriterion("inspect_user_role >", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_user_role >=", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleLessThan(String value) {
            addCriterion("inspect_user_role <", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleLessThanOrEqualTo(String value) {
            addCriterion("inspect_user_role <=", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleLike(String value) {
            addCriterion("inspect_user_role like", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleNotLike(String value) {
            addCriterion("inspect_user_role not like", value, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleIn(List<String> values) {
            addCriterion("inspect_user_role in", values, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleNotIn(List<String> values) {
            addCriterion("inspect_user_role not in", values, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleBetween(String value1, String value2) {
            addCriterion("inspect_user_role between", value1, value2, "inspectUserRole");
            return (Criteria) this;
        }

        public Criteria andInspectUserRoleNotBetween(String value1, String value2) {
            addCriterion("inspect_user_role not between", value1, value2, "inspectUserRole");
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

        public Criteria andEnvPhotoIsNull() {
            addCriterion("env_photo is null");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoIsNotNull() {
            addCriterion("env_photo is not null");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoEqualTo(String value) {
            addCriterion("env_photo =", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoNotEqualTo(String value) {
            addCriterion("env_photo <>", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoGreaterThan(String value) {
            addCriterion("env_photo >", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("env_photo >=", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoLessThan(String value) {
            addCriterion("env_photo <", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoLessThanOrEqualTo(String value) {
            addCriterion("env_photo <=", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoLike(String value) {
            addCriterion("env_photo like", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoNotLike(String value) {
            addCriterion("env_photo not like", value, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoIn(List<String> values) {
            addCriterion("env_photo in", values, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoNotIn(List<String> values) {
            addCriterion("env_photo not in", values, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoBetween(String value1, String value2) {
            addCriterion("env_photo between", value1, value2, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvPhotoNotBetween(String value1, String value2) {
            addCriterion("env_photo not between", value1, value2, "envPhoto");
            return (Criteria) this;
        }

        public Criteria andEnvExtraIsNull() {
            addCriterion("env_extra is null");
            return (Criteria) this;
        }

        public Criteria andEnvExtraIsNotNull() {
            addCriterion("env_extra is not null");
            return (Criteria) this;
        }

        public Criteria andEnvExtraEqualTo(String value) {
            addCriterion("env_extra =", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraNotEqualTo(String value) {
            addCriterion("env_extra <>", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraGreaterThan(String value) {
            addCriterion("env_extra >", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraGreaterThanOrEqualTo(String value) {
            addCriterion("env_extra >=", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraLessThan(String value) {
            addCriterion("env_extra <", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraLessThanOrEqualTo(String value) {
            addCriterion("env_extra <=", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraLike(String value) {
            addCriterion("env_extra like", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraNotLike(String value) {
            addCriterion("env_extra not like", value, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraIn(List<String> values) {
            addCriterion("env_extra in", values, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraNotIn(List<String> values) {
            addCriterion("env_extra not in", values, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraBetween(String value1, String value2) {
            addCriterion("env_extra between", value1, value2, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvExtraNotBetween(String value1, String value2) {
            addCriterion("env_extra not between", value1, value2, "envExtra");
            return (Criteria) this;
        }

        public Criteria andEnvStatusIsNull() {
            addCriterion("env_status is null");
            return (Criteria) this;
        }

        public Criteria andEnvStatusIsNotNull() {
            addCriterion("env_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnvStatusEqualTo(Integer value) {
            addCriterion("env_status =", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusNotEqualTo(Integer value) {
            addCriterion("env_status <>", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusGreaterThan(Integer value) {
            addCriterion("env_status >", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("env_status >=", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusLessThan(Integer value) {
            addCriterion("env_status <", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusLessThanOrEqualTo(Integer value) {
            addCriterion("env_status <=", value, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusIn(List<Integer> values) {
            addCriterion("env_status in", values, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusNotIn(List<Integer> values) {
            addCriterion("env_status not in", values, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusBetween(Integer value1, Integer value2) {
            addCriterion("env_status between", value1, value2, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("env_status not between", value1, value2, "envStatus");
            return (Criteria) this;
        }

        public Criteria andEnvTimeIsNull() {
            addCriterion("env_time is null");
            return (Criteria) this;
        }

        public Criteria andEnvTimeIsNotNull() {
            addCriterion("env_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnvTimeEqualTo(Date value) {
            addCriterion("env_time =", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeNotEqualTo(Date value) {
            addCriterion("env_time <>", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeGreaterThan(Date value) {
            addCriterion("env_time >", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("env_time >=", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeLessThan(Date value) {
            addCriterion("env_time <", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeLessThanOrEqualTo(Date value) {
            addCriterion("env_time <=", value, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeIn(List<Date> values) {
            addCriterion("env_time in", values, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeNotIn(List<Date> values) {
            addCriterion("env_time not in", values, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeBetween(Date value1, Date value2) {
            addCriterion("env_time between", value1, value2, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvTimeNotBetween(Date value1, Date value2) {
            addCriterion("env_time not between", value1, value2, "envTime");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdIsNull() {
            addCriterion("env_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdIsNotNull() {
            addCriterion("env_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdEqualTo(Long value) {
            addCriterion("env_user_id =", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdNotEqualTo(Long value) {
            addCriterion("env_user_id <>", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdGreaterThan(Long value) {
            addCriterion("env_user_id >", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("env_user_id >=", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdLessThan(Long value) {
            addCriterion("env_user_id <", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdLessThanOrEqualTo(Long value) {
            addCriterion("env_user_id <=", value, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdIn(List<Long> values) {
            addCriterion("env_user_id in", values, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdNotIn(List<Long> values) {
            addCriterion("env_user_id not in", values, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdBetween(Long value1, Long value2) {
            addCriterion("env_user_id between", value1, value2, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserIdNotBetween(Long value1, Long value2) {
            addCriterion("env_user_id not between", value1, value2, "envUserId");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameIsNull() {
            addCriterion("env_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameIsNotNull() {
            addCriterion("env_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameEqualTo(String value) {
            addCriterion("env_user_name =", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameNotEqualTo(String value) {
            addCriterion("env_user_name <>", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameGreaterThan(String value) {
            addCriterion("env_user_name >", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("env_user_name >=", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameLessThan(String value) {
            addCriterion("env_user_name <", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameLessThanOrEqualTo(String value) {
            addCriterion("env_user_name <=", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameLike(String value) {
            addCriterion("env_user_name like", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameNotLike(String value) {
            addCriterion("env_user_name not like", value, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameIn(List<String> values) {
            addCriterion("env_user_name in", values, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameNotIn(List<String> values) {
            addCriterion("env_user_name not in", values, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameBetween(String value1, String value2) {
            addCriterion("env_user_name between", value1, value2, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserNameNotBetween(String value1, String value2) {
            addCriterion("env_user_name not between", value1, value2, "envUserName");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleIsNull() {
            addCriterion("env_user_role is null");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleIsNotNull() {
            addCriterion("env_user_role is not null");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleEqualTo(String value) {
            addCriterion("env_user_role =", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleNotEqualTo(String value) {
            addCriterion("env_user_role <>", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleGreaterThan(String value) {
            addCriterion("env_user_role >", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("env_user_role >=", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleLessThan(String value) {
            addCriterion("env_user_role <", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleLessThanOrEqualTo(String value) {
            addCriterion("env_user_role <=", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleLike(String value) {
            addCriterion("env_user_role like", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleNotLike(String value) {
            addCriterion("env_user_role not like", value, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleIn(List<String> values) {
            addCriterion("env_user_role in", values, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleNotIn(List<String> values) {
            addCriterion("env_user_role not in", values, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleBetween(String value1, String value2) {
            addCriterion("env_user_role between", value1, value2, "envUserRole");
            return (Criteria) this;
        }

        public Criteria andEnvUserRoleNotBetween(String value1, String value2) {
            addCriterion("env_user_role not between", value1, value2, "envUserRole");
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

        public Criteria andCloseUserIdIsNull() {
            addCriterion("close_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdIsNotNull() {
            addCriterion("close_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdEqualTo(Long value) {
            addCriterion("close_user_id =", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotEqualTo(Long value) {
            addCriterion("close_user_id <>", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdGreaterThan(Long value) {
            addCriterion("close_user_id >", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("close_user_id >=", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdLessThan(Long value) {
            addCriterion("close_user_id <", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdLessThanOrEqualTo(Long value) {
            addCriterion("close_user_id <=", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdIn(List<Long> values) {
            addCriterion("close_user_id in", values, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotIn(List<Long> values) {
            addCriterion("close_user_id not in", values, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdBetween(Long value1, Long value2) {
            addCriterion("close_user_id between", value1, value2, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotBetween(Long value1, Long value2) {
            addCriterion("close_user_id not between", value1, value2, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameIsNull() {
            addCriterion("close_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameIsNotNull() {
            addCriterion("close_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameEqualTo(String value) {
            addCriterion("close_user_name =", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameNotEqualTo(String value) {
            addCriterion("close_user_name <>", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameGreaterThan(String value) {
            addCriterion("close_user_name >", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("close_user_name >=", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameLessThan(String value) {
            addCriterion("close_user_name <", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameLessThanOrEqualTo(String value) {
            addCriterion("close_user_name <=", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameLike(String value) {
            addCriterion("close_user_name like", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameNotLike(String value) {
            addCriterion("close_user_name not like", value, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameIn(List<String> values) {
            addCriterion("close_user_name in", values, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameNotIn(List<String> values) {
            addCriterion("close_user_name not in", values, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameBetween(String value1, String value2) {
            addCriterion("close_user_name between", value1, value2, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseUserNameNotBetween(String value1, String value2) {
            addCriterion("close_user_name not between", value1, value2, "closeUserName");
            return (Criteria) this;
        }

        public Criteria andCloseExtraIsNull() {
            addCriterion("close_extra is null");
            return (Criteria) this;
        }

        public Criteria andCloseExtraIsNotNull() {
            addCriterion("close_extra is not null");
            return (Criteria) this;
        }

        public Criteria andCloseExtraEqualTo(String value) {
            addCriterion("close_extra =", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraNotEqualTo(String value) {
            addCriterion("close_extra <>", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraGreaterThan(String value) {
            addCriterion("close_extra >", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraGreaterThanOrEqualTo(String value) {
            addCriterion("close_extra >=", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraLessThan(String value) {
            addCriterion("close_extra <", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraLessThanOrEqualTo(String value) {
            addCriterion("close_extra <=", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraLike(String value) {
            addCriterion("close_extra like", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraNotLike(String value) {
            addCriterion("close_extra not like", value, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraIn(List<String> values) {
            addCriterion("close_extra in", values, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraNotIn(List<String> values) {
            addCriterion("close_extra not in", values, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraBetween(String value1, String value2) {
            addCriterion("close_extra between", value1, value2, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andCloseExtraNotBetween(String value1, String value2) {
            addCriterion("close_extra not between", value1, value2, "closeExtra");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeIsNull() {
            addCriterion("change_end_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeIsNotNull() {
            addCriterion("change_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeEqualTo(Date value) {
            addCriterion("change_end_time =", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeNotEqualTo(Date value) {
            addCriterion("change_end_time <>", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeGreaterThan(Date value) {
            addCriterion("change_end_time >", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_end_time >=", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeLessThan(Date value) {
            addCriterion("change_end_time <", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_end_time <=", value, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeIn(List<Date> values) {
            addCriterion("change_end_time in", values, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeNotIn(List<Date> values) {
            addCriterion("change_end_time not in", values, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeBetween(Date value1, Date value2) {
            addCriterion("change_end_time between", value1, value2, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andChangeEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_end_time not between", value1, value2, "changeEndTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andIsInspectIsNull() {
            addCriterion("is_inspect is null");
            return (Criteria) this;
        }

        public Criteria andIsInspectIsNotNull() {
            addCriterion("is_inspect is not null");
            return (Criteria) this;
        }

        public Criteria andIsInspectEqualTo(Integer value) {
            addCriterion("is_inspect =", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotEqualTo(Integer value) {
            addCriterion("is_inspect <>", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectGreaterThan(Integer value) {
            addCriterion("is_inspect >", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_inspect >=", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectLessThan(Integer value) {
            addCriterion("is_inspect <", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectLessThanOrEqualTo(Integer value) {
            addCriterion("is_inspect <=", value, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectIn(List<Integer> values) {
            addCriterion("is_inspect in", values, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotIn(List<Integer> values) {
            addCriterion("is_inspect not in", values, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectBetween(Integer value1, Integer value2) {
            addCriterion("is_inspect between", value1, value2, "isInspect");
            return (Criteria) this;
        }

        public Criteria andIsInspectNotBetween(Integer value1, Integer value2) {
            addCriterion("is_inspect not between", value1, value2, "isInspect");
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
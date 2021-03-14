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

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
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

        public Criteria andDeptParentCodeIsNull() {
            addCriterion("dept_parent_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeIsNotNull() {
            addCriterion("dept_parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeEqualTo(String value) {
            addCriterion("dept_parent_code =", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeNotEqualTo(String value) {
            addCriterion("dept_parent_code <>", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeGreaterThan(String value) {
            addCriterion("dept_parent_code >", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_parent_code >=", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeLessThan(String value) {
            addCriterion("dept_parent_code <", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_parent_code <=", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeLike(String value) {
            addCriterion("dept_parent_code like", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeNotLike(String value) {
            addCriterion("dept_parent_code not like", value, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeIn(List<String> values) {
            addCriterion("dept_parent_code in", values, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeNotIn(List<String> values) {
            addCriterion("dept_parent_code not in", values, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeBetween(String value1, String value2) {
            addCriterion("dept_parent_code between", value1, value2, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentCodeNotBetween(String value1, String value2) {
            addCriterion("dept_parent_code not between", value1, value2, "deptParentCode");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameIsNull() {
            addCriterion("dept_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameIsNotNull() {
            addCriterion("dept_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameEqualTo(String value) {
            addCriterion("dept_parent_name =", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameNotEqualTo(String value) {
            addCriterion("dept_parent_name <>", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameGreaterThan(String value) {
            addCriterion("dept_parent_name >", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_parent_name >=", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameLessThan(String value) {
            addCriterion("dept_parent_name <", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameLessThanOrEqualTo(String value) {
            addCriterion("dept_parent_name <=", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameLike(String value) {
            addCriterion("dept_parent_name like", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameNotLike(String value) {
            addCriterion("dept_parent_name not like", value, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameIn(List<String> values) {
            addCriterion("dept_parent_name in", values, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameNotIn(List<String> values) {
            addCriterion("dept_parent_name not in", values, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameBetween(String value1, String value2) {
            addCriterion("dept_parent_name between", value1, value2, "deptParentName");
            return (Criteria) this;
        }

        public Criteria andDeptParentNameNotBetween(String value1, String value2) {
            addCriterion("dept_parent_name not between", value1, value2, "deptParentName");
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

        public Criteria andDangerLevelEqualTo(String value) {
            addCriterion("danger_level =", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotEqualTo(String value) {
            addCriterion("danger_level <>", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelGreaterThan(String value) {
            addCriterion("danger_level >", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("danger_level >=", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelLessThan(String value) {
            addCriterion("danger_level <", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelLessThanOrEqualTo(String value) {
            addCriterion("danger_level <=", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelLike(String value) {
            addCriterion("danger_level like", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotLike(String value) {
            addCriterion("danger_level not like", value, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelIn(List<String> values) {
            addCriterion("danger_level in", values, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotIn(List<String> values) {
            addCriterion("danger_level not in", values, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelBetween(String value1, String value2) {
            addCriterion("danger_level between", value1, value2, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andDangerLevelNotBetween(String value1, String value2) {
            addCriterion("danger_level not between", value1, value2, "dangerLevel");
            return (Criteria) this;
        }

        public Criteria andBreakUserIsNull() {
            addCriterion("break_user is null");
            return (Criteria) this;
        }

        public Criteria andBreakUserIsNotNull() {
            addCriterion("break_user is not null");
            return (Criteria) this;
        }

        public Criteria andBreakUserEqualTo(String value) {
            addCriterion("break_user =", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserNotEqualTo(String value) {
            addCriterion("break_user <>", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserGreaterThan(String value) {
            addCriterion("break_user >", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserGreaterThanOrEqualTo(String value) {
            addCriterion("break_user >=", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserLessThan(String value) {
            addCriterion("break_user <", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserLessThanOrEqualTo(String value) {
            addCriterion("break_user <=", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserLike(String value) {
            addCriterion("break_user like", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserNotLike(String value) {
            addCriterion("break_user not like", value, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserIn(List<String> values) {
            addCriterion("break_user in", values, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserNotIn(List<String> values) {
            addCriterion("break_user not in", values, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserBetween(String value1, String value2) {
            addCriterion("break_user between", value1, value2, "breakUser");
            return (Criteria) this;
        }

        public Criteria andBreakUserNotBetween(String value1, String value2) {
            addCriterion("break_user not between", value1, value2, "breakUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdIsNull() {
            addCriterion("responsebility_user_id is null");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdIsNotNull() {
            addCriterion("responsebility_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdEqualTo(Long value) {
            addCriterion("responsebility_user_id =", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdNotEqualTo(Long value) {
            addCriterion("responsebility_user_id <>", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdGreaterThan(Long value) {
            addCriterion("responsebility_user_id >", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("responsebility_user_id >=", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdLessThan(Long value) {
            addCriterion("responsebility_user_id <", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdLessThanOrEqualTo(Long value) {
            addCriterion("responsebility_user_id <=", value, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdIn(List<Long> values) {
            addCriterion("responsebility_user_id in", values, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdNotIn(List<Long> values) {
            addCriterion("responsebility_user_id not in", values, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdBetween(Long value1, Long value2) {
            addCriterion("responsebility_user_id between", value1, value2, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIdNotBetween(Long value1, Long value2) {
            addCriterion("responsebility_user_id not between", value1, value2, "responsebilityUserId");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIsNull() {
            addCriterion("responsebility_user is null");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIsNotNull() {
            addCriterion("responsebility_user is not null");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserEqualTo(String value) {
            addCriterion("responsebility_user =", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserNotEqualTo(String value) {
            addCriterion("responsebility_user <>", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserGreaterThan(String value) {
            addCriterion("responsebility_user >", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserGreaterThanOrEqualTo(String value) {
            addCriterion("responsebility_user >=", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserLessThan(String value) {
            addCriterion("responsebility_user <", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserLessThanOrEqualTo(String value) {
            addCriterion("responsebility_user <=", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserLike(String value) {
            addCriterion("responsebility_user like", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserNotLike(String value) {
            addCriterion("responsebility_user not like", value, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserIn(List<String> values) {
            addCriterion("responsebility_user in", values, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserNotIn(List<String> values) {
            addCriterion("responsebility_user not in", values, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserBetween(String value1, String value2) {
            addCriterion("responsebility_user between", value1, value2, "responsebilityUser");
            return (Criteria) this;
        }

        public Criteria andResponsebilityUserNotBetween(String value1, String value2) {
            addCriterion("responsebility_user not between", value1, value2, "responsebilityUser");
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

        public Criteria andResultStatusIsNull() {
            addCriterion("result_status is null");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNotNull() {
            addCriterion("result_status is not null");
            return (Criteria) this;
        }

        public Criteria andResultStatusEqualTo(Integer value) {
            addCriterion("result_status =", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotEqualTo(Integer value) {
            addCriterion("result_status <>", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThan(Integer value) {
            addCriterion("result_status >", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_status >=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThan(Integer value) {
            addCriterion("result_status <", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThanOrEqualTo(Integer value) {
            addCriterion("result_status <=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusIn(List<Integer> values) {
            addCriterion("result_status in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotIn(List<Integer> values) {
            addCriterion("result_status not in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusBetween(Integer value1, Integer value2) {
            addCriterion("result_status between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("result_status not between", value1, value2, "resultStatus");
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

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
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

        public Criteria andReportStatusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(String value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(String value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(String value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(String value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(String value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLike(String value) {
            addCriterion("report_status like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotLike(String value) {
            addCriterion("report_status not like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<String> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<String> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(String value1, String value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(String value1, String value2) {
            addCriterion("report_status not between", value1, value2, "reportStatus");
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

        public Criteria andDangerTypeIsNull() {
            addCriterion("danger_type is null");
            return (Criteria) this;
        }

        public Criteria andDangerTypeIsNotNull() {
            addCriterion("danger_type is not null");
            return (Criteria) this;
        }

        public Criteria andDangerTypeEqualTo(Integer value) {
            addCriterion("danger_type =", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeNotEqualTo(Integer value) {
            addCriterion("danger_type <>", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeGreaterThan(Integer value) {
            addCriterion("danger_type >", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("danger_type >=", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeLessThan(Integer value) {
            addCriterion("danger_type <", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("danger_type <=", value, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeIn(List<Integer> values) {
            addCriterion("danger_type in", values, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeNotIn(List<Integer> values) {
            addCriterion("danger_type not in", values, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeBetween(Integer value1, Integer value2) {
            addCriterion("danger_type between", value1, value2, "dangerType");
            return (Criteria) this;
        }

        public Criteria andDangerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("danger_type not between", value1, value2, "dangerType");
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
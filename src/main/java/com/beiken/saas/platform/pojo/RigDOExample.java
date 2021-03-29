package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RigDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public RigDOExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
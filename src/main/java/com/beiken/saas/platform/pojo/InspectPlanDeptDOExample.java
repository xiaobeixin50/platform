package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectPlanDeptDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public InspectPlanDeptDOExample() {
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

        public Criteria andInspcetPlanCodeIsNull() {
            addCriterion("inspcet_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeIsNotNull() {
            addCriterion("inspcet_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeEqualTo(String value) {
            addCriterion("inspcet_plan_code =", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeNotEqualTo(String value) {
            addCriterion("inspcet_plan_code <>", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeGreaterThan(String value) {
            addCriterion("inspcet_plan_code >", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inspcet_plan_code >=", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeLessThan(String value) {
            addCriterion("inspcet_plan_code <", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("inspcet_plan_code <=", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeLike(String value) {
            addCriterion("inspcet_plan_code like", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeNotLike(String value) {
            addCriterion("inspcet_plan_code not like", value, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeIn(List<String> values) {
            addCriterion("inspcet_plan_code in", values, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeNotIn(List<String> values) {
            addCriterion("inspcet_plan_code not in", values, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeBetween(String value1, String value2) {
            addCriterion("inspcet_plan_code between", value1, value2, "inspcetPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspcetPlanCodeNotBetween(String value1, String value2) {
            addCriterion("inspcet_plan_code not between", value1, value2, "inspcetPlanCode");
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
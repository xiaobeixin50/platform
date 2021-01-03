package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectionPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionPlanExample() {
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNull() {
            addCriterion("first_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNotNull() {
            addCriterion("first_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeEqualTo(Date value) {
            addCriterion("first_time =", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotEqualTo(Date value) {
            addCriterion("first_time <>", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThan(Date value) {
            addCriterion("first_time >", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_time >=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThan(Date value) {
            addCriterion("first_time <", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_time <=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIn(List<Date> values) {
            addCriterion("first_time in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotIn(List<Date> values) {
            addCriterion("first_time not in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeBetween(Date value1, Date value2) {
            addCriterion("first_time between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_time not between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNull() {
            addCriterion("valid_period is null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNotNull() {
            addCriterion("valid_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodEqualTo(Date value) {
            addCriterion("valid_period =", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotEqualTo(Date value) {
            addCriterion("valid_period <>", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThan(Date value) {
            addCriterion("valid_period >", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_period >=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThan(Date value) {
            addCriterion("valid_period <", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThanOrEqualTo(Date value) {
            addCriterion("valid_period <=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIn(List<Date> values) {
            addCriterion("valid_period in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotIn(List<Date> values) {
            addCriterion("valid_period not in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodBetween(Date value1, Date value2) {
            addCriterion("valid_period between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotBetween(Date value1, Date value2) {
            addCriterion("valid_period not between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeIsNull() {
            addCriterion("dispatch_scope is null");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeIsNotNull() {
            addCriterion("dispatch_scope is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeEqualTo(String value) {
            addCriterion("dispatch_scope =", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeNotEqualTo(String value) {
            addCriterion("dispatch_scope <>", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeGreaterThan(String value) {
            addCriterion("dispatch_scope >", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch_scope >=", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeLessThan(String value) {
            addCriterion("dispatch_scope <", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeLessThanOrEqualTo(String value) {
            addCriterion("dispatch_scope <=", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeLike(String value) {
            addCriterion("dispatch_scope like", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeNotLike(String value) {
            addCriterion("dispatch_scope not like", value, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeIn(List<String> values) {
            addCriterion("dispatch_scope in", values, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeNotIn(List<String> values) {
            addCriterion("dispatch_scope not in", values, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeBetween(String value1, String value2) {
            addCriterion("dispatch_scope between", value1, value2, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andDispatchScopeNotBetween(String value1, String value2) {
            addCriterion("dispatch_scope not between", value1, value2, "dispatchScope");
            return (Criteria) this;
        }

        public Criteria andItemListIsNull() {
            addCriterion("item_list is null");
            return (Criteria) this;
        }

        public Criteria andItemListIsNotNull() {
            addCriterion("item_list is not null");
            return (Criteria) this;
        }

        public Criteria andItemListEqualTo(String value) {
            addCriterion("item_list =", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListNotEqualTo(String value) {
            addCriterion("item_list <>", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListGreaterThan(String value) {
            addCriterion("item_list >", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListGreaterThanOrEqualTo(String value) {
            addCriterion("item_list >=", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListLessThan(String value) {
            addCriterion("item_list <", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListLessThanOrEqualTo(String value) {
            addCriterion("item_list <=", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListLike(String value) {
            addCriterion("item_list like", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListNotLike(String value) {
            addCriterion("item_list not like", value, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListIn(List<String> values) {
            addCriterion("item_list in", values, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListNotIn(List<String> values) {
            addCriterion("item_list not in", values, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListBetween(String value1, String value2) {
            addCriterion("item_list between", value1, value2, "itemList");
            return (Criteria) this;
        }

        public Criteria andItemListNotBetween(String value1, String value2) {
            addCriterion("item_list not between", value1, value2, "itemList");
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
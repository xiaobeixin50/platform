package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public InspectPlanExample() {
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

        public Criteria andInspectPlanCodeIsNull() {
            addCriterion("inspect_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeIsNotNull() {
            addCriterion("inspect_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeEqualTo(String value) {
            addCriterion("inspect_plan_code =", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeNotEqualTo(String value) {
            addCriterion("inspect_plan_code <>", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeGreaterThan(String value) {
            addCriterion("inspect_plan_code >", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_plan_code >=", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeLessThan(String value) {
            addCriterion("inspect_plan_code <", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("inspect_plan_code <=", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeLike(String value) {
            addCriterion("inspect_plan_code like", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeNotLike(String value) {
            addCriterion("inspect_plan_code not like", value, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeIn(List<String> values) {
            addCriterion("inspect_plan_code in", values, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeNotIn(List<String> values) {
            addCriterion("inspect_plan_code not in", values, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeBetween(String value1, String value2) {
            addCriterion("inspect_plan_code between", value1, value2, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andInspectPlanCodeNotBetween(String value1, String value2) {
            addCriterion("inspect_plan_code not between", value1, value2, "inspectPlanCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andFreqIsNull() {
            addCriterion("freq is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("freq is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(String value) {
            addCriterion("freq =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(String value) {
            addCriterion("freq <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(String value) {
            addCriterion("freq >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(String value) {
            addCriterion("freq >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(String value) {
            addCriterion("freq <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(String value) {
            addCriterion("freq <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLike(String value) {
            addCriterion("freq like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotLike(String value) {
            addCriterion("freq not like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<String> values) {
            addCriterion("freq in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<String> values) {
            addCriterion("freq not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(String value1, String value2) {
            addCriterion("freq between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(String value1, String value2) {
            addCriterion("freq not between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEveryDayIsNull() {
            addCriterion("every_day is null");
            return (Criteria) this;
        }

        public Criteria andEveryDayIsNotNull() {
            addCriterion("every_day is not null");
            return (Criteria) this;
        }

        public Criteria andEveryDayEqualTo(Integer value) {
            addCriterion("every_day =", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotEqualTo(Integer value) {
            addCriterion("every_day <>", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayGreaterThan(Integer value) {
            addCriterion("every_day >", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("every_day >=", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayLessThan(Integer value) {
            addCriterion("every_day <", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayLessThanOrEqualTo(Integer value) {
            addCriterion("every_day <=", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayIn(List<Integer> values) {
            addCriterion("every_day in", values, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotIn(List<Integer> values) {
            addCriterion("every_day not in", values, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayBetween(Integer value1, Integer value2) {
            addCriterion("every_day between", value1, value2, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotBetween(Integer value1, Integer value2) {
            addCriterion("every_day not between", value1, value2, "everyDay");
            return (Criteria) this;
        }

        public Criteria andCountDayIsNull() {
            addCriterion("count_day is null");
            return (Criteria) this;
        }

        public Criteria andCountDayIsNotNull() {
            addCriterion("count_day is not null");
            return (Criteria) this;
        }

        public Criteria andCountDayEqualTo(Integer value) {
            addCriterion("count_day =", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayNotEqualTo(Integer value) {
            addCriterion("count_day <>", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayGreaterThan(Integer value) {
            addCriterion("count_day >", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_day >=", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayLessThan(Integer value) {
            addCriterion("count_day <", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayLessThanOrEqualTo(Integer value) {
            addCriterion("count_day <=", value, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayIn(List<Integer> values) {
            addCriterion("count_day in", values, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayNotIn(List<Integer> values) {
            addCriterion("count_day not in", values, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayBetween(Integer value1, Integer value2) {
            addCriterion("count_day between", value1, value2, "countDay");
            return (Criteria) this;
        }

        public Criteria andCountDayNotBetween(Integer value1, Integer value2) {
            addCriterion("count_day not between", value1, value2, "countDay");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNull() {
            addCriterion("start_number is null");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNotNull() {
            addCriterion("start_number is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumberEqualTo(Integer value) {
            addCriterion("start_number =", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotEqualTo(Integer value) {
            addCriterion("start_number <>", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThan(Integer value) {
            addCriterion("start_number >", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_number >=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThan(Integer value) {
            addCriterion("start_number <", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("start_number <=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberIn(List<Integer> values) {
            addCriterion("start_number in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotIn(List<Integer> values) {
            addCriterion("start_number not in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberBetween(Integer value1, Integer value2) {
            addCriterion("start_number between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("start_number not between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNull() {
            addCriterion("end_number is null");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNotNull() {
            addCriterion("end_number is not null");
            return (Criteria) this;
        }

        public Criteria andEndNumberEqualTo(Integer value) {
            addCriterion("end_number =", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotEqualTo(Integer value) {
            addCriterion("end_number <>", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThan(Integer value) {
            addCriterion("end_number >", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_number >=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThan(Integer value) {
            addCriterion("end_number <", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThanOrEqualTo(Integer value) {
            addCriterion("end_number <=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIn(List<Integer> values) {
            addCriterion("end_number in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotIn(List<Integer> values) {
            addCriterion("end_number not in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberBetween(Integer value1, Integer value2) {
            addCriterion("end_number between", value1, value2, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("end_number not between", value1, value2, "endNumber");
            return (Criteria) this;
        }

        public Criteria andBgCodeIsNull() {
            addCriterion("bg_code is null");
            return (Criteria) this;
        }

        public Criteria andBgCodeIsNotNull() {
            addCriterion("bg_code is not null");
            return (Criteria) this;
        }

        public Criteria andBgCodeEqualTo(String value) {
            addCriterion("bg_code =", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotEqualTo(String value) {
            addCriterion("bg_code <>", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeGreaterThan(String value) {
            addCriterion("bg_code >", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bg_code >=", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLessThan(String value) {
            addCriterion("bg_code <", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLessThanOrEqualTo(String value) {
            addCriterion("bg_code <=", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeLike(String value) {
            addCriterion("bg_code like", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotLike(String value) {
            addCriterion("bg_code not like", value, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeIn(List<String> values) {
            addCriterion("bg_code in", values, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotIn(List<String> values) {
            addCriterion("bg_code not in", values, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeBetween(String value1, String value2) {
            addCriterion("bg_code between", value1, value2, "bgCode");
            return (Criteria) this;
        }

        public Criteria andBgCodeNotBetween(String value1, String value2) {
            addCriterion("bg_code not between", value1, value2, "bgCode");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Integer value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Integer value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Integer value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Integer value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Integer value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Integer> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Integer> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Integer value1, Integer value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Integer value1, Integer value2) {
            addCriterion("step not between", value1, value2, "step");
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
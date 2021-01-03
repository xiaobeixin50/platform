package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiddenDangerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiddenDangerExample() {
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

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordIsNull() {
            addCriterion("onsite_record is null");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordIsNotNull() {
            addCriterion("onsite_record is not null");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordEqualTo(String value) {
            addCriterion("onsite_record =", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordNotEqualTo(String value) {
            addCriterion("onsite_record <>", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordGreaterThan(String value) {
            addCriterion("onsite_record >", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordGreaterThanOrEqualTo(String value) {
            addCriterion("onsite_record >=", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordLessThan(String value) {
            addCriterion("onsite_record <", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordLessThanOrEqualTo(String value) {
            addCriterion("onsite_record <=", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordLike(String value) {
            addCriterion("onsite_record like", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordNotLike(String value) {
            addCriterion("onsite_record not like", value, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordIn(List<String> values) {
            addCriterion("onsite_record in", values, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordNotIn(List<String> values) {
            addCriterion("onsite_record not in", values, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordBetween(String value1, String value2) {
            addCriterion("onsite_record between", value1, value2, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteRecordNotBetween(String value1, String value2) {
            addCriterion("onsite_record not between", value1, value2, "onsiteRecord");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerIsNull() {
            addCriterion("onsite_manager is null");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerIsNotNull() {
            addCriterion("onsite_manager is not null");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerEqualTo(String value) {
            addCriterion("onsite_manager =", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerNotEqualTo(String value) {
            addCriterion("onsite_manager <>", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerGreaterThan(String value) {
            addCriterion("onsite_manager >", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerGreaterThanOrEqualTo(String value) {
            addCriterion("onsite_manager >=", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerLessThan(String value) {
            addCriterion("onsite_manager <", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerLessThanOrEqualTo(String value) {
            addCriterion("onsite_manager <=", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerLike(String value) {
            addCriterion("onsite_manager like", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerNotLike(String value) {
            addCriterion("onsite_manager not like", value, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerIn(List<String> values) {
            addCriterion("onsite_manager in", values, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerNotIn(List<String> values) {
            addCriterion("onsite_manager not in", values, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerBetween(String value1, String value2) {
            addCriterion("onsite_manager between", value1, value2, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerNotBetween(String value1, String value2) {
            addCriterion("onsite_manager not between", value1, value2, "onsiteManager");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeIsNull() {
            addCriterion("onsite_manager_code is null");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeIsNotNull() {
            addCriterion("onsite_manager_code is not null");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeEqualTo(String value) {
            addCriterion("onsite_manager_code =", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeNotEqualTo(String value) {
            addCriterion("onsite_manager_code <>", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeGreaterThan(String value) {
            addCriterion("onsite_manager_code >", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("onsite_manager_code >=", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeLessThan(String value) {
            addCriterion("onsite_manager_code <", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeLessThanOrEqualTo(String value) {
            addCriterion("onsite_manager_code <=", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeLike(String value) {
            addCriterion("onsite_manager_code like", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeNotLike(String value) {
            addCriterion("onsite_manager_code not like", value, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeIn(List<String> values) {
            addCriterion("onsite_manager_code in", values, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeNotIn(List<String> values) {
            addCriterion("onsite_manager_code not in", values, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeBetween(String value1, String value2) {
            addCriterion("onsite_manager_code between", value1, value2, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andOnsiteManagerCodeNotBetween(String value1, String value2) {
            addCriterion("onsite_manager_code not between", value1, value2, "onsiteManagerCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpIsNull() {
            addCriterion("follow_up is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIsNotNull() {
            addCriterion("follow_up is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpEqualTo(String value) {
            addCriterion("follow_up =", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotEqualTo(String value) {
            addCriterion("follow_up <>", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThan(String value) {
            addCriterion("follow_up >", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up >=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThan(String value) {
            addCriterion("follow_up <", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThanOrEqualTo(String value) {
            addCriterion("follow_up <=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLike(String value) {
            addCriterion("follow_up like", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotLike(String value) {
            addCriterion("follow_up not like", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpIn(List<String> values) {
            addCriterion("follow_up in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotIn(List<String> values) {
            addCriterion("follow_up not in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpBetween(String value1, String value2) {
            addCriterion("follow_up between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotBetween(String value1, String value2) {
            addCriterion("follow_up not between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNull() {
            addCriterion("plan_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNotNull() {
            addCriterion("plan_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeEqualTo(Date value) {
            addCriterion("plan_time =", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotEqualTo(Date value) {
            addCriterion("plan_time <>", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThan(Date value) {
            addCriterion("plan_time >", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_time >=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThan(Date value) {
            addCriterion("plan_time <", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_time <=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIn(List<Date> values) {
            addCriterion("plan_time in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotIn(List<Date> values) {
            addCriterion("plan_time not in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeBetween(Date value1, Date value2) {
            addCriterion("plan_time between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_time not between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("supervisor is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(String value) {
            addCriterion("supervisor =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(String value) {
            addCriterion("supervisor <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(String value) {
            addCriterion("supervisor >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(String value) {
            addCriterion("supervisor <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(String value) {
            addCriterion("supervisor <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLike(String value) {
            addCriterion("supervisor like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotLike(String value) {
            addCriterion("supervisor not like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<String> values) {
            addCriterion("supervisor in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<String> values) {
            addCriterion("supervisor not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(String value1, String value2) {
            addCriterion("supervisor between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(String value1, String value2) {
            addCriterion("supervisor not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeIsNull() {
            addCriterion("supervisor_code is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeIsNotNull() {
            addCriterion("supervisor_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeEqualTo(String value) {
            addCriterion("supervisor_code =", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeNotEqualTo(String value) {
            addCriterion("supervisor_code <>", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeGreaterThan(String value) {
            addCriterion("supervisor_code >", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor_code >=", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeLessThan(String value) {
            addCriterion("supervisor_code <", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeLessThanOrEqualTo(String value) {
            addCriterion("supervisor_code <=", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeLike(String value) {
            addCriterion("supervisor_code like", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeNotLike(String value) {
            addCriterion("supervisor_code not like", value, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeIn(List<String> values) {
            addCriterion("supervisor_code in", values, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeNotIn(List<String> values) {
            addCriterion("supervisor_code not in", values, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeBetween(String value1, String value2) {
            addCriterion("supervisor_code between", value1, value2, "supervisorCode");
            return (Criteria) this;
        }

        public Criteria andSupervisorCodeNotBetween(String value1, String value2) {
            addCriterion("supervisor_code not between", value1, value2, "supervisorCode");
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

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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
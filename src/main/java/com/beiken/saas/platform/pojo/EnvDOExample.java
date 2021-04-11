package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnvDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public EnvDOExample() {
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

        public Criteria andDangerIdIsNull() {
            addCriterion("danger_id is null");
            return (Criteria) this;
        }

        public Criteria andDangerIdIsNotNull() {
            addCriterion("danger_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangerIdEqualTo(Long value) {
            addCriterion("danger_id =", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdNotEqualTo(Long value) {
            addCriterion("danger_id <>", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdGreaterThan(Long value) {
            addCriterion("danger_id >", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("danger_id >=", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdLessThan(Long value) {
            addCriterion("danger_id <", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdLessThanOrEqualTo(Long value) {
            addCriterion("danger_id <=", value, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdIn(List<Long> values) {
            addCriterion("danger_id in", values, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdNotIn(List<Long> values) {
            addCriterion("danger_id not in", values, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdBetween(Long value1, Long value2) {
            addCriterion("danger_id between", value1, value2, "dangerId");
            return (Criteria) this;
        }

        public Criteria andDangerIdNotBetween(Long value1, Long value2) {
            addCriterion("danger_id not between", value1, value2, "dangerId");
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
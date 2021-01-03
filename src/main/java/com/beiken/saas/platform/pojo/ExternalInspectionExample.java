package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExternalInspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExternalInspectionExample() {
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

        public Criteria andGmtCreateEqualTo(String value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(String value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(String value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(String value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(String value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLike(String value) {
            addCriterion("gmt_create like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotLike(String value) {
            addCriterion("gmt_create not like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<String> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<String> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(String value1, String value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(String value1, String value2) {
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

        public Criteria andGmtModifiedEqualTo(String value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(String value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(String value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(String value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(String value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLike(String value) {
            addCriterion("gmt_modified like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotLike(String value) {
            addCriterion("gmt_modified not like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<String> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<String> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(String value1, String value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(String value1, String value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andInspectUnitIsNull() {
            addCriterion("inspect_unit is null");
            return (Criteria) this;
        }

        public Criteria andInspectUnitIsNotNull() {
            addCriterion("inspect_unit is not null");
            return (Criteria) this;
        }

        public Criteria andInspectUnitEqualTo(String value) {
            addCriterion("inspect_unit =", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitNotEqualTo(String value) {
            addCriterion("inspect_unit <>", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitGreaterThan(String value) {
            addCriterion("inspect_unit >", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_unit >=", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitLessThan(String value) {
            addCriterion("inspect_unit <", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitLessThanOrEqualTo(String value) {
            addCriterion("inspect_unit <=", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitLike(String value) {
            addCriterion("inspect_unit like", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitNotLike(String value) {
            addCriterion("inspect_unit not like", value, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitIn(List<String> values) {
            addCriterion("inspect_unit in", values, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitNotIn(List<String> values) {
            addCriterion("inspect_unit not in", values, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitBetween(String value1, String value2) {
            addCriterion("inspect_unit between", value1, value2, "inspectUnit");
            return (Criteria) this;
        }

        public Criteria andInspectUnitNotBetween(String value1, String value2) {
            addCriterion("inspect_unit not between", value1, value2, "inspectUnit");
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

        public Criteria andInspectTimeEqualTo(String value) {
            addCriterion("inspect_time =", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotEqualTo(String value) {
            addCriterion("inspect_time <>", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThan(String value) {
            addCriterion("inspect_time >", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_time >=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThan(String value) {
            addCriterion("inspect_time <", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThanOrEqualTo(String value) {
            addCriterion("inspect_time <=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLike(String value) {
            addCriterion("inspect_time like", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotLike(String value) {
            addCriterion("inspect_time not like", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIn(List<String> values) {
            addCriterion("inspect_time in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotIn(List<String> values) {
            addCriterion("inspect_time not in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeBetween(String value1, String value2) {
            addCriterion("inspect_time between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotBetween(String value1, String value2) {
            addCriterion("inspect_time not between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andProductionUnitIsNull() {
            addCriterion("\" production_unit\" is null");
            return (Criteria) this;
        }

        public Criteria andProductionUnitIsNotNull() {
            addCriterion("\" production_unit\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductionUnitEqualTo(String value) {
            addCriterion("\" production_unit\" =", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitNotEqualTo(String value) {
            addCriterion("\" production_unit\" <>", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitGreaterThan(String value) {
            addCriterion("\" production_unit\" >", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitGreaterThanOrEqualTo(String value) {
            addCriterion("\" production_unit\" >=", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitLessThan(String value) {
            addCriterion("\" production_unit\" <", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitLessThanOrEqualTo(String value) {
            addCriterion("\" production_unit\" <=", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitLike(String value) {
            addCriterion("\" production_unit\" like", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitNotLike(String value) {
            addCriterion("\" production_unit\" not like", value, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitIn(List<String> values) {
            addCriterion("\" production_unit\" in", values, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitNotIn(List<String> values) {
            addCriterion("\" production_unit\" not in", values, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitBetween(String value1, String value2) {
            addCriterion("\" production_unit\" between", value1, value2, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andProductionUnitNotBetween(String value1, String value2) {
            addCriterion("\" production_unit\" not between", value1, value2, "productionUnit");
            return (Criteria) this;
        }

        public Criteria andInspectResultIsNull() {
            addCriterion("inspect_result is null");
            return (Criteria) this;
        }

        public Criteria andInspectResultIsNotNull() {
            addCriterion("inspect_result is not null");
            return (Criteria) this;
        }

        public Criteria andInspectResultEqualTo(String value) {
            addCriterion("inspect_result =", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultNotEqualTo(String value) {
            addCriterion("inspect_result <>", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultGreaterThan(String value) {
            addCriterion("inspect_result >", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_result >=", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultLessThan(String value) {
            addCriterion("inspect_result <", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultLessThanOrEqualTo(String value) {
            addCriterion("inspect_result <=", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultLike(String value) {
            addCriterion("inspect_result like", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultNotLike(String value) {
            addCriterion("inspect_result not like", value, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultIn(List<String> values) {
            addCriterion("inspect_result in", values, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultNotIn(List<String> values) {
            addCriterion("inspect_result not in", values, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultBetween(String value1, String value2) {
            addCriterion("inspect_result between", value1, value2, "inspectResult");
            return (Criteria) this;
        }

        public Criteria andInspectResultNotBetween(String value1, String value2) {
            addCriterion("inspect_result not between", value1, value2, "inspectResult");
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
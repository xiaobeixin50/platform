package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InspectionItemPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionItemPlanExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andCategoryFirstIsNull() {
            addCriterion("category_first is null");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIsNotNull() {
            addCriterion("category_first is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstEqualTo(String value) {
            addCriterion("category_first =", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstNotEqualTo(String value) {
            addCriterion("category_first <>", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstGreaterThan(String value) {
            addCriterion("category_first >", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstGreaterThanOrEqualTo(String value) {
            addCriterion("category_first >=", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstLessThan(String value) {
            addCriterion("category_first <", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstLessThanOrEqualTo(String value) {
            addCriterion("category_first <=", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstLike(String value) {
            addCriterion("category_first like", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstNotLike(String value) {
            addCriterion("category_first not like", value, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstIn(List<String> values) {
            addCriterion("category_first in", values, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstNotIn(List<String> values) {
            addCriterion("category_first not in", values, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstBetween(String value1, String value2) {
            addCriterion("category_first between", value1, value2, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategoryFirstNotBetween(String value1, String value2) {
            addCriterion("category_first not between", value1, value2, "categoryFirst");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIsNull() {
            addCriterion("category_second is null");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIsNotNull() {
            addCriterion("category_second is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySecondEqualTo(String value) {
            addCriterion("category_second =", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondNotEqualTo(String value) {
            addCriterion("category_second <>", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondGreaterThan(String value) {
            addCriterion("category_second >", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondGreaterThanOrEqualTo(String value) {
            addCriterion("category_second >=", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondLessThan(String value) {
            addCriterion("category_second <", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondLessThanOrEqualTo(String value) {
            addCriterion("category_second <=", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondLike(String value) {
            addCriterion("category_second like", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondNotLike(String value) {
            addCriterion("category_second not like", value, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondIn(List<String> values) {
            addCriterion("category_second in", values, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondNotIn(List<String> values) {
            addCriterion("category_second not in", values, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondBetween(String value1, String value2) {
            addCriterion("category_second between", value1, value2, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCategorySecondNotBetween(String value1, String value2) {
            addCriterion("category_second not between", value1, value2, "categorySecond");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdIsNull() {
            addCriterion("catetory_third is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdIsNotNull() {
            addCriterion("catetory_third is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdEqualTo(String value) {
            addCriterion("catetory_third =", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdNotEqualTo(String value) {
            addCriterion("catetory_third <>", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdGreaterThan(String value) {
            addCriterion("catetory_third >", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdGreaterThanOrEqualTo(String value) {
            addCriterion("catetory_third >=", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdLessThan(String value) {
            addCriterion("catetory_third <", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdLessThanOrEqualTo(String value) {
            addCriterion("catetory_third <=", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdLike(String value) {
            addCriterion("catetory_third like", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdNotLike(String value) {
            addCriterion("catetory_third not like", value, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdIn(List<String> values) {
            addCriterion("catetory_third in", values, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdNotIn(List<String> values) {
            addCriterion("catetory_third not in", values, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdBetween(String value1, String value2) {
            addCriterion("catetory_third between", value1, value2, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCatetoryThirdNotBetween(String value1, String value2) {
            addCriterion("catetory_third not between", value1, value2, "catetoryThird");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthIsNull() {
            addCriterion("category_fourth is null");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthIsNotNull() {
            addCriterion("category_fourth is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthEqualTo(String value) {
            addCriterion("category_fourth =", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthNotEqualTo(String value) {
            addCriterion("category_fourth <>", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthGreaterThan(String value) {
            addCriterion("category_fourth >", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthGreaterThanOrEqualTo(String value) {
            addCriterion("category_fourth >=", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthLessThan(String value) {
            addCriterion("category_fourth <", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthLessThanOrEqualTo(String value) {
            addCriterion("category_fourth <=", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthLike(String value) {
            addCriterion("category_fourth like", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthNotLike(String value) {
            addCriterion("category_fourth not like", value, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthIn(List<String> values) {
            addCriterion("category_fourth in", values, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthNotIn(List<String> values) {
            addCriterion("category_fourth not in", values, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthBetween(String value1, String value2) {
            addCriterion("category_fourth between", value1, value2, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andCategoryFourthNotBetween(String value1, String value2) {
            addCriterion("category_fourth not between", value1, value2, "categoryFourth");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNull() {
            addCriterion("cycle_unit is null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNotNull() {
            addCriterion("cycle_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitEqualTo(String value) {
            addCriterion("cycle_unit =", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotEqualTo(String value) {
            addCriterion("cycle_unit <>", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThan(String value) {
            addCriterion("cycle_unit >", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_unit >=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThan(String value) {
            addCriterion("cycle_unit <", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThanOrEqualTo(String value) {
            addCriterion("cycle_unit <=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLike(String value) {
            addCriterion("cycle_unit like", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotLike(String value) {
            addCriterion("cycle_unit not like", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIn(List<String> values) {
            addCriterion("cycle_unit in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotIn(List<String> values) {
            addCriterion("cycle_unit not in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitBetween(String value1, String value2) {
            addCriterion("cycle_unit between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotBetween(String value1, String value2) {
            addCriterion("cycle_unit not between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleCountIsNull() {
            addCriterion("cycle_count is null");
            return (Criteria) this;
        }

        public Criteria andCycleCountIsNotNull() {
            addCriterion("cycle_count is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCountEqualTo(Integer value) {
            addCriterion("cycle_count =", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotEqualTo(Integer value) {
            addCriterion("cycle_count <>", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountGreaterThan(Integer value) {
            addCriterion("cycle_count >", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_count >=", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountLessThan(Integer value) {
            addCriterion("cycle_count <", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_count <=", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountIn(List<Integer> values) {
            addCriterion("cycle_count in", values, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotIn(List<Integer> values) {
            addCriterion("cycle_count not in", values, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountBetween(Integer value1, Integer value2) {
            addCriterion("cycle_count between", value1, value2, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_count not between", value1, value2, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyIsNull() {
            addCriterion("check_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyIsNotNull() {
            addCriterion("check_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyEqualTo(Integer value) {
            addCriterion("check_frequency =", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyNotEqualTo(Integer value) {
            addCriterion("check_frequency <>", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyGreaterThan(Integer value) {
            addCriterion("check_frequency >", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_frequency >=", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyLessThan(Integer value) {
            addCriterion("check_frequency <", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("check_frequency <=", value, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyIn(List<Integer> values) {
            addCriterion("check_frequency in", values, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyNotIn(List<Integer> values) {
            addCriterion("check_frequency not in", values, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("check_frequency between", value1, value2, "checkFrequency");
            return (Criteria) this;
        }

        public Criteria andCheckFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("check_frequency not between", value1, value2, "checkFrequency");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time not between", value1, value2, "startTime");
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

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time not between", value1, value2, "endTime");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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
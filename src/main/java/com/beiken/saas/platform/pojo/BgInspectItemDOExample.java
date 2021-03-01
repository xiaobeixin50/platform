package com.beiken.saas.platform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgInspectItemDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public BgInspectItemDOExample() {
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

        public Criteria andInspectTypeIsNull() {
            addCriterion("inspect_type is null");
            return (Criteria) this;
        }

        public Criteria andInspectTypeIsNotNull() {
            addCriterion("inspect_type is not null");
            return (Criteria) this;
        }

        public Criteria andInspectTypeEqualTo(String value) {
            addCriterion("inspect_type =", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeNotEqualTo(String value) {
            addCriterion("inspect_type <>", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeGreaterThan(String value) {
            addCriterion("inspect_type >", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_type >=", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeLessThan(String value) {
            addCriterion("inspect_type <", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeLessThanOrEqualTo(String value) {
            addCriterion("inspect_type <=", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeLike(String value) {
            addCriterion("inspect_type like", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeNotLike(String value) {
            addCriterion("inspect_type not like", value, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeIn(List<String> values) {
            addCriterion("inspect_type in", values, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeNotIn(List<String> values) {
            addCriterion("inspect_type not in", values, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeBetween(String value1, String value2) {
            addCriterion("inspect_type between", value1, value2, "inspectType");
            return (Criteria) this;
        }

        public Criteria andInspectTypeNotBetween(String value1, String value2) {
            addCriterion("inspect_type not between", value1, value2, "inspectType");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNull() {
            addCriterion("manage_type is null");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNotNull() {
            addCriterion("manage_type is not null");
            return (Criteria) this;
        }

        public Criteria andManageTypeEqualTo(String value) {
            addCriterion("manage_type =", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotEqualTo(String value) {
            addCriterion("manage_type <>", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThan(String value) {
            addCriterion("manage_type >", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("manage_type >=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThan(String value) {
            addCriterion("manage_type <", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThanOrEqualTo(String value) {
            addCriterion("manage_type <=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLike(String value) {
            addCriterion("manage_type like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotLike(String value) {
            addCriterion("manage_type not like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeIn(List<String> values) {
            addCriterion("manage_type in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotIn(List<String> values) {
            addCriterion("manage_type not in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeBetween(String value1, String value2) {
            addCriterion("manage_type between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotBetween(String value1, String value2) {
            addCriterion("manage_type not between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andEquipmentIsNull() {
            addCriterion("equipment is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIsNotNull() {
            addCriterion("equipment is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentEqualTo(String value) {
            addCriterion("equipment =", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotEqualTo(String value) {
            addCriterion("equipment <>", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentGreaterThan(String value) {
            addCriterion("equipment >", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("equipment >=", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLessThan(String value) {
            addCriterion("equipment <", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLessThanOrEqualTo(String value) {
            addCriterion("equipment <=", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLike(String value) {
            addCriterion("equipment like", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotLike(String value) {
            addCriterion("equipment not like", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentIn(List<String> values) {
            addCriterion("equipment in", values, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotIn(List<String> values) {
            addCriterion("equipment not in", values, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentBetween(String value1, String value2) {
            addCriterion("equipment between", value1, value2, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotBetween(String value1, String value2) {
            addCriterion("equipment not between", value1, value2, "equipment");
            return (Criteria) this;
        }

        public Criteria andAdaptIsNull() {
            addCriterion("adapt is null");
            return (Criteria) this;
        }

        public Criteria andAdaptIsNotNull() {
            addCriterion("adapt is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptEqualTo(String value) {
            addCriterion("adapt =", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptNotEqualTo(String value) {
            addCriterion("adapt <>", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptGreaterThan(String value) {
            addCriterion("adapt >", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptGreaterThanOrEqualTo(String value) {
            addCriterion("adapt >=", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptLessThan(String value) {
            addCriterion("adapt <", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptLessThanOrEqualTo(String value) {
            addCriterion("adapt <=", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptLike(String value) {
            addCriterion("adapt like", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptNotLike(String value) {
            addCriterion("adapt not like", value, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptIn(List<String> values) {
            addCriterion("adapt in", values, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptNotIn(List<String> values) {
            addCriterion("adapt not in", values, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptBetween(String value1, String value2) {
            addCriterion("adapt between", value1, value2, "adapt");
            return (Criteria) this;
        }

        public Criteria andAdaptNotBetween(String value1, String value2) {
            addCriterion("adapt not between", value1, value2, "adapt");
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

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andIsPhotoIsNull() {
            addCriterion("is_photo is null");
            return (Criteria) this;
        }

        public Criteria andIsPhotoIsNotNull() {
            addCriterion("is_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhotoEqualTo(Integer value) {
            addCriterion("is_photo =", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoNotEqualTo(Integer value) {
            addCriterion("is_photo <>", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoGreaterThan(Integer value) {
            addCriterion("is_photo >", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_photo >=", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoLessThan(Integer value) {
            addCriterion("is_photo <", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("is_photo <=", value, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoIn(List<Integer> values) {
            addCriterion("is_photo in", values, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoNotIn(List<Integer> values) {
            addCriterion("is_photo not in", values, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoBetween(Integer value1, Integer value2) {
            addCriterion("is_photo between", value1, value2, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_photo not between", value1, value2, "isPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNull() {
            addCriterion("is_card is null");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNotNull() {
            addCriterion("is_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardEqualTo(Integer value) {
            addCriterion("is_card =", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotEqualTo(Integer value) {
            addCriterion("is_card <>", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThan(Integer value) {
            addCriterion("is_card >", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_card >=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThan(Integer value) {
            addCriterion("is_card <", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThanOrEqualTo(Integer value) {
            addCriterion("is_card <=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardIn(List<Integer> values) {
            addCriterion("is_card in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotIn(List<Integer> values) {
            addCriterion("is_card not in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardBetween(Integer value1, Integer value2) {
            addCriterion("is_card between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_card not between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andCardSiteIsNull() {
            addCriterion("card_site is null");
            return (Criteria) this;
        }

        public Criteria andCardSiteIsNotNull() {
            addCriterion("card_site is not null");
            return (Criteria) this;
        }

        public Criteria andCardSiteEqualTo(String value) {
            addCriterion("card_site =", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteNotEqualTo(String value) {
            addCriterion("card_site <>", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteGreaterThan(String value) {
            addCriterion("card_site >", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteGreaterThanOrEqualTo(String value) {
            addCriterion("card_site >=", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteLessThan(String value) {
            addCriterion("card_site <", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteLessThanOrEqualTo(String value) {
            addCriterion("card_site <=", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteLike(String value) {
            addCriterion("card_site like", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteNotLike(String value) {
            addCriterion("card_site not like", value, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteIn(List<String> values) {
            addCriterion("card_site in", values, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteNotIn(List<String> values) {
            addCriterion("card_site not in", values, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteBetween(String value1, String value2) {
            addCriterion("card_site between", value1, value2, "cardSite");
            return (Criteria) this;
        }

        public Criteria andCardSiteNotBetween(String value1, String value2) {
            addCriterion("card_site not between", value1, value2, "cardSite");
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
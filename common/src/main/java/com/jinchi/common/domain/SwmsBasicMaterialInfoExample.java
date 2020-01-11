package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class SwmsBasicMaterialInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public SwmsBasicMaterialInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIsNull() {
            addCriterion("material_name_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIsNotNull() {
            addCriterion("material_name_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeEqualTo(String value) {
            addCriterion("material_name_code =", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotEqualTo(String value) {
            addCriterion("material_name_code <>", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeGreaterThan(String value) {
            addCriterion("material_name_code >", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_name_code >=", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLessThan(String value) {
            addCriterion("material_name_code <", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLessThanOrEqualTo(String value) {
            addCriterion("material_name_code <=", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeLike(String value) {
            addCriterion("material_name_code like", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotLike(String value) {
            addCriterion("material_name_code not like", value, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeIn(List<String> values) {
            addCriterion("material_name_code in", values, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotIn(List<String> values) {
            addCriterion("material_name_code not in", values, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeBetween(String value1, String value2) {
            addCriterion("material_name_code between", value1, value2, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameCodeNotBetween(String value1, String value2) {
            addCriterion("material_name_code not between", value1, value2, "materialNameCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdIsNull() {
            addCriterion("material_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdIsNotNull() {
            addCriterion("material_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdEqualTo(Integer value) {
            addCriterion("material_type_id =", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotEqualTo(Integer value) {
            addCriterion("material_type_id <>", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdGreaterThan(Integer value) {
            addCriterion("material_type_id >", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_type_id >=", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdLessThan(Integer value) {
            addCriterion("material_type_id <", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("material_type_id <=", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdIn(List<Integer> values) {
            addCriterion("material_type_id in", values, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotIn(List<Integer> values) {
            addCriterion("material_type_id not in", values, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("material_type_id between", value1, value2, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("material_type_id not between", value1, value2, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdIsNull() {
            addCriterion("sub_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdIsNotNull() {
            addCriterion("sub_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdEqualTo(Integer value) {
            addCriterion("sub_type_id =", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdNotEqualTo(Integer value) {
            addCriterion("sub_type_id <>", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdGreaterThan(Integer value) {
            addCriterion("sub_type_id >", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_type_id >=", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdLessThan(Integer value) {
            addCriterion("sub_type_id <", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_type_id <=", value, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdIn(List<Integer> values) {
            addCriterion("sub_type_id in", values, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdNotIn(List<Integer> values) {
            addCriterion("sub_type_id not in", values, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_type_id between", value1, value2, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andSubTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_type_id not between", value1, value2, "subTypeId");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNull() {
            addCriterion("measure_unit is null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNotNull() {
            addCriterion("measure_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitEqualTo(String value) {
            addCriterion("measure_unit =", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotEqualTo(String value) {
            addCriterion("measure_unit <>", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThan(String value) {
            addCriterion("measure_unit >", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThanOrEqualTo(String value) {
            addCriterion("measure_unit >=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThan(String value) {
            addCriterion("measure_unit <", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThanOrEqualTo(String value) {
            addCriterion("measure_unit <=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLike(String value) {
            addCriterion("measure_unit like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotLike(String value) {
            addCriterion("measure_unit not like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIn(List<String> values) {
            addCriterion("measure_unit in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotIn(List<String> values) {
            addCriterion("measure_unit not in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitBetween(String value1, String value2) {
            addCriterion("measure_unit between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotBetween(String value1, String value2) {
            addCriterion("measure_unit not between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andNiFlagIsNull() {
            addCriterion("NI_flag is null");
            return (Criteria) this;
        }

        public Criteria andNiFlagIsNotNull() {
            addCriterion("NI_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNiFlagEqualTo(Boolean value) {
            addCriterion("NI_flag =", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagNotEqualTo(Boolean value) {
            addCriterion("NI_flag <>", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagGreaterThan(Boolean value) {
            addCriterion("NI_flag >", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NI_flag >=", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagLessThan(Boolean value) {
            addCriterion("NI_flag <", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("NI_flag <=", value, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagIn(List<Boolean> values) {
            addCriterion("NI_flag in", values, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagNotIn(List<Boolean> values) {
            addCriterion("NI_flag not in", values, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("NI_flag between", value1, value2, "niFlag");
            return (Criteria) this;
        }

        public Criteria andNiFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NI_flag not between", value1, value2, "niFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagIsNull() {
            addCriterion("CO_flag is null");
            return (Criteria) this;
        }

        public Criteria andCoFlagIsNotNull() {
            addCriterion("CO_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCoFlagEqualTo(Boolean value) {
            addCriterion("CO_flag =", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagNotEqualTo(Boolean value) {
            addCriterion("CO_flag <>", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagGreaterThan(Boolean value) {
            addCriterion("CO_flag >", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CO_flag >=", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagLessThan(Boolean value) {
            addCriterion("CO_flag <", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("CO_flag <=", value, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagIn(List<Boolean> values) {
            addCriterion("CO_flag in", values, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagNotIn(List<Boolean> values) {
            addCriterion("CO_flag not in", values, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("CO_flag between", value1, value2, "coFlag");
            return (Criteria) this;
        }

        public Criteria andCoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CO_flag not between", value1, value2, "coFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagIsNull() {
            addCriterion("MN_flag is null");
            return (Criteria) this;
        }

        public Criteria andMnFlagIsNotNull() {
            addCriterion("MN_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMnFlagEqualTo(Boolean value) {
            addCriterion("MN_flag =", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagNotEqualTo(Boolean value) {
            addCriterion("MN_flag <>", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagGreaterThan(Boolean value) {
            addCriterion("MN_flag >", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MN_flag >=", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagLessThan(Boolean value) {
            addCriterion("MN_flag <", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("MN_flag <=", value, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagIn(List<Boolean> values) {
            addCriterion("MN_flag in", values, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagNotIn(List<Boolean> values) {
            addCriterion("MN_flag not in", values, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("MN_flag between", value1, value2, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andMnFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MN_flag not between", value1, value2, "mnFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagIsNull() {
            addCriterion("NH_flag is null");
            return (Criteria) this;
        }

        public Criteria andNhFlagIsNotNull() {
            addCriterion("NH_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNhFlagEqualTo(Boolean value) {
            addCriterion("NH_flag =", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagNotEqualTo(Boolean value) {
            addCriterion("NH_flag <>", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagGreaterThan(Boolean value) {
            addCriterion("NH_flag >", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NH_flag >=", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagLessThan(Boolean value) {
            addCriterion("NH_flag <", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("NH_flag <=", value, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagIn(List<Boolean> values) {
            addCriterion("NH_flag in", values, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagNotIn(List<Boolean> values) {
            addCriterion("NH_flag not in", values, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("NH_flag between", value1, value2, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andNhFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NH_flag not between", value1, value2, "nhFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagIsNull() {
            addCriterion("Alkali_flag is null");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagIsNotNull() {
            addCriterion("Alkali_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagEqualTo(Boolean value) {
            addCriterion("Alkali_flag =", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagNotEqualTo(Boolean value) {
            addCriterion("Alkali_flag <>", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagGreaterThan(Boolean value) {
            addCriterion("Alkali_flag >", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Alkali_flag >=", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagLessThan(Boolean value) {
            addCriterion("Alkali_flag <", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("Alkali_flag <=", value, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagIn(List<Boolean> values) {
            addCriterion("Alkali_flag in", values, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagNotIn(List<Boolean> values) {
            addCriterion("Alkali_flag not in", values, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("Alkali_flag between", value1, value2, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAlkaliFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Alkali_flag not between", value1, value2, "alkaliFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNull() {
            addCriterion("auto_flag is null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNotNull() {
            addCriterion("auto_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagEqualTo(Boolean value) {
            addCriterion("auto_flag =", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotEqualTo(Boolean value) {
            addCriterion("auto_flag <>", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThan(Boolean value) {
            addCriterion("auto_flag >", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_flag >=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThan(Boolean value) {
            addCriterion("auto_flag <", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_flag <=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIn(List<Boolean> values) {
            addCriterion("auto_flag in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotIn(List<Boolean> values) {
            addCriterion("auto_flag not in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_flag between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_flag not between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagIsNull() {
            addCriterion("stream_flag is null");
            return (Criteria) this;
        }

        public Criteria andStreamFlagIsNotNull() {
            addCriterion("stream_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStreamFlagEqualTo(Boolean value) {
            addCriterion("stream_flag =", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagNotEqualTo(Boolean value) {
            addCriterion("stream_flag <>", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagGreaterThan(Boolean value) {
            addCriterion("stream_flag >", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stream_flag >=", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagLessThan(Boolean value) {
            addCriterion("stream_flag <", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("stream_flag <=", value, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagIn(List<Boolean> values) {
            addCriterion("stream_flag in", values, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagNotIn(List<Boolean> values) {
            addCriterion("stream_flag not in", values, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("stream_flag between", value1, value2, "streamFlag");
            return (Criteria) this;
        }

        public Criteria andStreamFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stream_flag not between", value1, value2, "streamFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SWMS_basic_material_info
     *
     * @mbggenerated
     */
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
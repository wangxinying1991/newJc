package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class BasicInfoPrecursorMaterialLineWeightExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public BasicInfoPrecursorMaterialLineWeightExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
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
     * This method corresponds to the database table basic_info_precursor_material_line_weight
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
     * This method corresponds to the database table basic_info_precursor_material_line_weight
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_precursor_material_line_weight
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
     * This class corresponds to the database table basic_info_precursor_material_line_weight
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(Integer value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(Integer value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(Integer value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(Integer value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(Integer value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<Integer> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<Integer> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(Integer value1, Integer value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNull() {
            addCriterion("line_code is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("line_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(Integer value) {
            addCriterion("line_code =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(Integer value) {
            addCriterion("line_code <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(Integer value) {
            addCriterion("line_code >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_code >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(Integer value) {
            addCriterion("line_code <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(Integer value) {
            addCriterion("line_code <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<Integer> values) {
            addCriterion("line_code in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<Integer> values) {
            addCriterion("line_code not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(Integer value1, Integer value2) {
            addCriterion("line_code between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("line_code not between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andWeightValueIsNull() {
            addCriterion("weight_value is null");
            return (Criteria) this;
        }

        public Criteria andWeightValueIsNotNull() {
            addCriterion("weight_value is not null");
            return (Criteria) this;
        }

        public Criteria andWeightValueEqualTo(Float value) {
            addCriterion("weight_value =", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotEqualTo(Float value) {
            addCriterion("weight_value <>", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueGreaterThan(Float value) {
            addCriterion("weight_value >", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueGreaterThanOrEqualTo(Float value) {
            addCriterion("weight_value >=", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueLessThan(Float value) {
            addCriterion("weight_value <", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueLessThanOrEqualTo(Float value) {
            addCriterion("weight_value <=", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueIn(List<Float> values) {
            addCriterion("weight_value in", values, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotIn(List<Float> values) {
            addCriterion("weight_value not in", values, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueBetween(Float value1, Float value2) {
            addCriterion("weight_value between", value1, value2, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotBetween(Float value1, Float value2) {
            addCriterion("weight_value not between", value1, value2, "weightValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table basic_info_precursor_material_line_weight
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
     * This class corresponds to the database table basic_info_precursor_material_line_weight
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
package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class AuxiliaryMaterialsStatisticByLineTotalsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public AuxiliaryMaterialsStatisticByLineTotalsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
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
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
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
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
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
     * This class corresponds to the database table auxiliary_materials_statistic_by_line_totals
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

        public Criteria andCodeEqualTo(Long value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Long value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Long value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Long value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Long value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Long> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Long> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Long value1, Long value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Long value1, Long value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeIsNull() {
            addCriterion("statistic_code is null");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeIsNotNull() {
            addCriterion("statistic_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeEqualTo(Long value) {
            addCriterion("statistic_code =", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeNotEqualTo(Long value) {
            addCriterion("statistic_code <>", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeGreaterThan(Long value) {
            addCriterion("statistic_code >", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("statistic_code >=", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeLessThan(Long value) {
            addCriterion("statistic_code <", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeLessThanOrEqualTo(Long value) {
            addCriterion("statistic_code <=", value, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeIn(List<Long> values) {
            addCriterion("statistic_code in", values, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeNotIn(List<Long> values) {
            addCriterion("statistic_code not in", values, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeBetween(Long value1, Long value2) {
            addCriterion("statistic_code between", value1, value2, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andStatisticCodeNotBetween(Long value1, Long value2) {
            addCriterion("statistic_code not between", value1, value2, "statisticCode");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNull() {
            addCriterion("periods is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNotNull() {
            addCriterion("periods is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsEqualTo(Integer value) {
            addCriterion("periods =", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotEqualTo(Integer value) {
            addCriterion("periods <>", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThan(Integer value) {
            addCriterion("periods >", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("periods >=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThan(Integer value) {
            addCriterion("periods <", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThanOrEqualTo(Integer value) {
            addCriterion("periods <=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsIn(List<Integer> values) {
            addCriterion("periods in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotIn(List<Integer> values) {
            addCriterion("periods not in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsBetween(Integer value1, Integer value2) {
            addCriterion("periods between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotBetween(Integer value1, Integer value2) {
            addCriterion("periods not between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andTotalsIsNull() {
            addCriterion("totals is null");
            return (Criteria) this;
        }

        public Criteria andTotalsIsNotNull() {
            addCriterion("totals is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsEqualTo(Float value) {
            addCriterion("totals =", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotEqualTo(Float value) {
            addCriterion("totals <>", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThan(Float value) {
            addCriterion("totals >", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThanOrEqualTo(Float value) {
            addCriterion("totals >=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThan(Float value) {
            addCriterion("totals <", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThanOrEqualTo(Float value) {
            addCriterion("totals <=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsIn(List<Float> values) {
            addCriterion("totals in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotIn(List<Float> values) {
            addCriterion("totals not in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsBetween(Float value1, Float value2) {
            addCriterion("totals between", value1, value2, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotBetween(Float value1, Float value2) {
            addCriterion("totals not between", value1, value2, "totals");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueIsNull() {
            addCriterion("ammonia_value is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueIsNotNull() {
            addCriterion("ammonia_value is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueEqualTo(Float value) {
            addCriterion("ammonia_value =", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueNotEqualTo(Float value) {
            addCriterion("ammonia_value <>", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueGreaterThan(Float value) {
            addCriterion("ammonia_value >", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueGreaterThanOrEqualTo(Float value) {
            addCriterion("ammonia_value >=", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueLessThan(Float value) {
            addCriterion("ammonia_value <", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueLessThanOrEqualTo(Float value) {
            addCriterion("ammonia_value <=", value, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueIn(List<Float> values) {
            addCriterion("ammonia_value in", values, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueNotIn(List<Float> values) {
            addCriterion("ammonia_value not in", values, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueBetween(Float value1, Float value2) {
            addCriterion("ammonia_value between", value1, value2, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAmmoniaValueNotBetween(Float value1, Float value2) {
            addCriterion("ammonia_value not between", value1, value2, "ammoniaValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueIsNull() {
            addCriterion("alkali_value is null");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueIsNotNull() {
            addCriterion("alkali_value is not null");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueEqualTo(Float value) {
            addCriterion("alkali_value =", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueNotEqualTo(Float value) {
            addCriterion("alkali_value <>", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueGreaterThan(Float value) {
            addCriterion("alkali_value >", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueGreaterThanOrEqualTo(Float value) {
            addCriterion("alkali_value >=", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueLessThan(Float value) {
            addCriterion("alkali_value <", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueLessThanOrEqualTo(Float value) {
            addCriterion("alkali_value <=", value, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueIn(List<Float> values) {
            addCriterion("alkali_value in", values, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueNotIn(List<Float> values) {
            addCriterion("alkali_value not in", values, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueBetween(Float value1, Float value2) {
            addCriterion("alkali_value between", value1, value2, "alkaliValue");
            return (Criteria) this;
        }

        public Criteria andAlkaliValueNotBetween(Float value1, Float value2) {
            addCriterion("alkali_value not between", value1, value2, "alkaliValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table auxiliary_materials_statistic_by_line_totals
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
     * This class corresponds to the database table auxiliary_materials_statistic_by_line_totals
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
package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialDeliveryStatisticNickelSulfateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public MaterialDeliveryStatisticNickelSulfateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
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
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
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
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_nickel_sulfate
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
     * This class corresponds to the database table material_delivery_statistic_nickel_sulfate
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

        public Criteria andMaterialTypeCodeIsNull() {
            addCriterion("material_type_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeIsNotNull() {
            addCriterion("material_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeEqualTo(Integer value) {
            addCriterion("material_type_code =", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotEqualTo(Integer value) {
            addCriterion("material_type_code <>", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeGreaterThan(Integer value) {
            addCriterion("material_type_code >", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_type_code >=", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeLessThan(Integer value) {
            addCriterion("material_type_code <", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("material_type_code <=", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeIn(List<Integer> values) {
            addCriterion("material_type_code in", values, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotIn(List<Integer> values) {
            addCriterion("material_type_code not in", values, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("material_type_code between", value1, value2, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("material_type_code not between", value1, value2, "materialTypeCode");
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

        public Criteria andEncoderIsNull() {
            addCriterion("encoder is null");
            return (Criteria) this;
        }

        public Criteria andEncoderIsNotNull() {
            addCriterion("encoder is not null");
            return (Criteria) this;
        }

        public Criteria andEncoderEqualTo(String value) {
            addCriterion("encoder =", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderNotEqualTo(String value) {
            addCriterion("encoder <>", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderGreaterThan(String value) {
            addCriterion("encoder >", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderGreaterThanOrEqualTo(String value) {
            addCriterion("encoder >=", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderLessThan(String value) {
            addCriterion("encoder <", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderLessThanOrEqualTo(String value) {
            addCriterion("encoder <=", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderLike(String value) {
            addCriterion("encoder like", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderNotLike(String value) {
            addCriterion("encoder not like", value, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderIn(List<String> values) {
            addCriterion("encoder in", values, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderNotIn(List<String> values) {
            addCriterion("encoder not in", values, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderBetween(String value1, String value2) {
            addCriterion("encoder between", value1, value2, "encoder");
            return (Criteria) this;
        }

        public Criteria andEncoderNotBetween(String value1, String value2) {
            addCriterion("encoder not between", value1, value2, "encoder");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andWeightsIsNull() {
            addCriterion("weights is null");
            return (Criteria) this;
        }

        public Criteria andWeightsIsNotNull() {
            addCriterion("weights is not null");
            return (Criteria) this;
        }

        public Criteria andWeightsEqualTo(Float value) {
            addCriterion("weights =", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsNotEqualTo(Float value) {
            addCriterion("weights <>", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsGreaterThan(Float value) {
            addCriterion("weights >", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsGreaterThanOrEqualTo(Float value) {
            addCriterion("weights >=", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsLessThan(Float value) {
            addCriterion("weights <", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsLessThanOrEqualTo(Float value) {
            addCriterion("weights <=", value, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsIn(List<Float> values) {
            addCriterion("weights in", values, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsNotIn(List<Float> values) {
            addCriterion("weights not in", values, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsBetween(Float value1, Float value2) {
            addCriterion("weights between", value1, value2, "weights");
            return (Criteria) this;
        }

        public Criteria andWeightsNotBetween(Float value1, Float value2) {
            addCriterion("weights not between", value1, value2, "weights");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIsNull() {
            addCriterion("ni_concentration is null");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIsNotNull() {
            addCriterion("ni_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationEqualTo(Float value) {
            addCriterion("ni_concentration =", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotEqualTo(Float value) {
            addCriterion("ni_concentration <>", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationGreaterThan(Float value) {
            addCriterion("ni_concentration >", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("ni_concentration >=", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationLessThan(Float value) {
            addCriterion("ni_concentration <", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("ni_concentration <=", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIn(List<Float> values) {
            addCriterion("ni_concentration in", values, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotIn(List<Float> values) {
            addCriterion("ni_concentration not in", values, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationBetween(Float value1, Float value2) {
            addCriterion("ni_concentration between", value1, value2, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("ni_concentration not between", value1, value2, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIsNull() {
            addCriterion("co_concentration is null");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIsNotNull() {
            addCriterion("co_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationEqualTo(Float value) {
            addCriterion("co_concentration =", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotEqualTo(Float value) {
            addCriterion("co_concentration <>", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationGreaterThan(Float value) {
            addCriterion("co_concentration >", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("co_concentration >=", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationLessThan(Float value) {
            addCriterion("co_concentration <", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("co_concentration <=", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIn(List<Float> values) {
            addCriterion("co_concentration in", values, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotIn(List<Float> values) {
            addCriterion("co_concentration not in", values, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationBetween(Float value1, Float value2) {
            addCriterion("co_concentration between", value1, value2, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("co_concentration not between", value1, value2, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIsNull() {
            addCriterion("mn_concentration is null");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIsNotNull() {
            addCriterion("mn_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationEqualTo(Float value) {
            addCriterion("mn_concentration =", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotEqualTo(Float value) {
            addCriterion("mn_concentration <>", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationGreaterThan(Float value) {
            addCriterion("mn_concentration >", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("mn_concentration >=", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationLessThan(Float value) {
            addCriterion("mn_concentration <", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("mn_concentration <=", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIn(List<Float> values) {
            addCriterion("mn_concentration in", values, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotIn(List<Float> values) {
            addCriterion("mn_concentration not in", values, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationBetween(Float value1, Float value2) {
            addCriterion("mn_concentration between", value1, value2, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("mn_concentration not between", value1, value2, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIsNull() {
            addCriterion("ni_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIsNotNull() {
            addCriterion("ni_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityEqualTo(Float value) {
            addCriterion("ni_metallicity =", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotEqualTo(Float value) {
            addCriterion("ni_metallicity <>", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityGreaterThan(Float value) {
            addCriterion("ni_metallicity >", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("ni_metallicity >=", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityLessThan(Float value) {
            addCriterion("ni_metallicity <", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("ni_metallicity <=", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIn(List<Float> values) {
            addCriterion("ni_metallicity in", values, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotIn(List<Float> values) {
            addCriterion("ni_metallicity not in", values, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityBetween(Float value1, Float value2) {
            addCriterion("ni_metallicity between", value1, value2, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("ni_metallicity not between", value1, value2, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIsNull() {
            addCriterion("co_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIsNotNull() {
            addCriterion("co_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityEqualTo(Float value) {
            addCriterion("co_metallicity =", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotEqualTo(Float value) {
            addCriterion("co_metallicity <>", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityGreaterThan(Float value) {
            addCriterion("co_metallicity >", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("co_metallicity >=", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityLessThan(Float value) {
            addCriterion("co_metallicity <", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("co_metallicity <=", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIn(List<Float> values) {
            addCriterion("co_metallicity in", values, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotIn(List<Float> values) {
            addCriterion("co_metallicity not in", values, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityBetween(Float value1, Float value2) {
            addCriterion("co_metallicity between", value1, value2, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("co_metallicity not between", value1, value2, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIsNull() {
            addCriterion("mn_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIsNotNull() {
            addCriterion("mn_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityEqualTo(Float value) {
            addCriterion("mn_metallicity =", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotEqualTo(Float value) {
            addCriterion("mn_metallicity <>", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityGreaterThan(Float value) {
            addCriterion("mn_metallicity >", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("mn_metallicity >=", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityLessThan(Float value) {
            addCriterion("mn_metallicity <", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("mn_metallicity <=", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIn(List<Float> values) {
            addCriterion("mn_metallicity in", values, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotIn(List<Float> values) {
            addCriterion("mn_metallicity not in", values, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityBetween(Float value1, Float value2) {
            addCriterion("mn_metallicity between", value1, value2, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("mn_metallicity not between", value1, value2, "mnMetallicity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table material_delivery_statistic_nickel_sulfate
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
     * This class corresponds to the database table material_delivery_statistic_nickel_sulfate
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
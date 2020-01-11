package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class BasicInfoAnodeCalculateCoefficientExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public BasicInfoAnodeCalculateCoefficientExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
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
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
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
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
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
     * This class corresponds to the database table basic_info_anode_calculate_coefficient
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

        public Criteria andCodeEqualTo(Byte value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Byte value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Byte value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Byte value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Byte value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Byte> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Byte> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Byte value1, Byte value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andBagWeightIsNull() {
            addCriterion("bag_weight is null");
            return (Criteria) this;
        }

        public Criteria andBagWeightIsNotNull() {
            addCriterion("bag_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBagWeightEqualTo(Float value) {
            addCriterion("bag_weight =", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightNotEqualTo(Float value) {
            addCriterion("bag_weight <>", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightGreaterThan(Float value) {
            addCriterion("bag_weight >", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("bag_weight >=", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightLessThan(Float value) {
            addCriterion("bag_weight <", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightLessThanOrEqualTo(Float value) {
            addCriterion("bag_weight <=", value, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightIn(List<Float> values) {
            addCriterion("bag_weight in", values, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightNotIn(List<Float> values) {
            addCriterion("bag_weight not in", values, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightBetween(Float value1, Float value2) {
            addCriterion("bag_weight between", value1, value2, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBagWeightNotBetween(Float value1, Float value2) {
            addCriterion("bag_weight not between", value1, value2, "bagWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightIsNull() {
            addCriterion("bowl_fill_weight is null");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightIsNotNull() {
            addCriterion("bowl_fill_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightEqualTo(Float value) {
            addCriterion("bowl_fill_weight =", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightNotEqualTo(Float value) {
            addCriterion("bowl_fill_weight <>", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightGreaterThan(Float value) {
            addCriterion("bowl_fill_weight >", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("bowl_fill_weight >=", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightLessThan(Float value) {
            addCriterion("bowl_fill_weight <", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightLessThanOrEqualTo(Float value) {
            addCriterion("bowl_fill_weight <=", value, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightIn(List<Float> values) {
            addCriterion("bowl_fill_weight in", values, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightNotIn(List<Float> values) {
            addCriterion("bowl_fill_weight not in", values, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightBetween(Float value1, Float value2) {
            addCriterion("bowl_fill_weight between", value1, value2, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlFillWeightNotBetween(Float value1, Float value2) {
            addCriterion("bowl_fill_weight not between", value1, value2, "bowlFillWeight");
            return (Criteria) this;
        }

        public Criteria andBowlNumIsNull() {
            addCriterion("bowl_num is null");
            return (Criteria) this;
        }

        public Criteria andBowlNumIsNotNull() {
            addCriterion("bowl_num is not null");
            return (Criteria) this;
        }

        public Criteria andBowlNumEqualTo(Byte value) {
            addCriterion("bowl_num =", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumNotEqualTo(Byte value) {
            addCriterion("bowl_num <>", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumGreaterThan(Byte value) {
            addCriterion("bowl_num >", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("bowl_num >=", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumLessThan(Byte value) {
            addCriterion("bowl_num <", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumLessThanOrEqualTo(Byte value) {
            addCriterion("bowl_num <=", value, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumIn(List<Byte> values) {
            addCriterion("bowl_num in", values, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumNotIn(List<Byte> values) {
            addCriterion("bowl_num not in", values, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumBetween(Byte value1, Byte value2) {
            addCriterion("bowl_num between", value1, value2, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBowlNumNotBetween(Byte value1, Byte value2) {
            addCriterion("bowl_num not between", value1, value2, "bowlNum");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateIsNull() {
            addCriterion("burning_loss_rate is null");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateIsNotNull() {
            addCriterion("burning_loss_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateEqualTo(Float value) {
            addCriterion("burning_loss_rate =", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateNotEqualTo(Float value) {
            addCriterion("burning_loss_rate <>", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateGreaterThan(Float value) {
            addCriterion("burning_loss_rate >", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateGreaterThanOrEqualTo(Float value) {
            addCriterion("burning_loss_rate >=", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateLessThan(Float value) {
            addCriterion("burning_loss_rate <", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateLessThanOrEqualTo(Float value) {
            addCriterion("burning_loss_rate <=", value, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateIn(List<Float> values) {
            addCriterion("burning_loss_rate in", values, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateNotIn(List<Float> values) {
            addCriterion("burning_loss_rate not in", values, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateBetween(Float value1, Float value2) {
            addCriterion("burning_loss_rate between", value1, value2, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andBurningLossRateNotBetween(Float value1, Float value2) {
            addCriterion("burning_loss_rate not between", value1, value2, "burningLossRate");
            return (Criteria) this;
        }

        public Criteria andSmashWeightIsNull() {
            addCriterion("smash_weight is null");
            return (Criteria) this;
        }

        public Criteria andSmashWeightIsNotNull() {
            addCriterion("smash_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSmashWeightEqualTo(Float value) {
            addCriterion("smash_weight =", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightNotEqualTo(Float value) {
            addCriterion("smash_weight <>", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightGreaterThan(Float value) {
            addCriterion("smash_weight >", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("smash_weight >=", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightLessThan(Float value) {
            addCriterion("smash_weight <", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightLessThanOrEqualTo(Float value) {
            addCriterion("smash_weight <=", value, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightIn(List<Float> values) {
            addCriterion("smash_weight in", values, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightNotIn(List<Float> values) {
            addCriterion("smash_weight not in", values, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightBetween(Float value1, Float value2) {
            addCriterion("smash_weight between", value1, value2, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andSmashWeightNotBetween(Float value1, Float value2) {
            addCriterion("smash_weight not between", value1, value2, "smashWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightIsNull() {
            addCriterion("presintering_weight is null");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightIsNotNull() {
            addCriterion("presintering_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightEqualTo(Float value) {
            addCriterion("presintering_weight =", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightNotEqualTo(Float value) {
            addCriterion("presintering_weight <>", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightGreaterThan(Float value) {
            addCriterion("presintering_weight >", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("presintering_weight >=", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightLessThan(Float value) {
            addCriterion("presintering_weight <", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightLessThanOrEqualTo(Float value) {
            addCriterion("presintering_weight <=", value, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightIn(List<Float> values) {
            addCriterion("presintering_weight in", values, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightNotIn(List<Float> values) {
            addCriterion("presintering_weight not in", values, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightBetween(Float value1, Float value2) {
            addCriterion("presintering_weight between", value1, value2, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andPresinteringWeightNotBetween(Float value1, Float value2) {
            addCriterion("presintering_weight not between", value1, value2, "presinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightIsNull() {
            addCriterion("second_sintering_weight is null");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightIsNotNull() {
            addCriterion("second_sintering_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightEqualTo(Float value) {
            addCriterion("second_sintering_weight =", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightNotEqualTo(Float value) {
            addCriterion("second_sintering_weight <>", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightGreaterThan(Float value) {
            addCriterion("second_sintering_weight >", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("second_sintering_weight >=", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightLessThan(Float value) {
            addCriterion("second_sintering_weight <", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightLessThanOrEqualTo(Float value) {
            addCriterion("second_sintering_weight <=", value, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightIn(List<Float> values) {
            addCriterion("second_sintering_weight in", values, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightNotIn(List<Float> values) {
            addCriterion("second_sintering_weight not in", values, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightBetween(Float value1, Float value2) {
            addCriterion("second_sintering_weight between", value1, value2, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andSecondSinteringWeightNotBetween(Float value1, Float value2) {
            addCriterion("second_sintering_weight not between", value1, value2, "secondSinteringWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightIsNull() {
            addCriterion("high_mixing_machine_weight is null");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightIsNotNull() {
            addCriterion("high_mixing_machine_weight is not null");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightEqualTo(Float value) {
            addCriterion("high_mixing_machine_weight =", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightNotEqualTo(Float value) {
            addCriterion("high_mixing_machine_weight <>", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightGreaterThan(Float value) {
            addCriterion("high_mixing_machine_weight >", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("high_mixing_machine_weight >=", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightLessThan(Float value) {
            addCriterion("high_mixing_machine_weight <", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightLessThanOrEqualTo(Float value) {
            addCriterion("high_mixing_machine_weight <=", value, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightIn(List<Float> values) {
            addCriterion("high_mixing_machine_weight in", values, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightNotIn(List<Float> values) {
            addCriterion("high_mixing_machine_weight not in", values, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightBetween(Float value1, Float value2) {
            addCriterion("high_mixing_machine_weight between", value1, value2, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andHighMixingMachineWeightNotBetween(Float value1, Float value2) {
            addCriterion("high_mixing_machine_weight not between", value1, value2, "highMixingMachineWeight");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsIsNull() {
            addCriterion("matching_coefficient_precursors is null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsIsNotNull() {
            addCriterion("matching_coefficient_precursors is not null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsEqualTo(Float value) {
            addCriterion("matching_coefficient_precursors =", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsNotEqualTo(Float value) {
            addCriterion("matching_coefficient_precursors <>", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsGreaterThan(Float value) {
            addCriterion("matching_coefficient_precursors >", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsGreaterThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_precursors >=", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsLessThan(Float value) {
            addCriterion("matching_coefficient_precursors <", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsLessThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_precursors <=", value, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsIn(List<Float> values) {
            addCriterion("matching_coefficient_precursors in", values, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsNotIn(List<Float> values) {
            addCriterion("matching_coefficient_precursors not in", values, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_precursors between", value1, value2, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientPrecursorsNotBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_precursors not between", value1, value2, "matchingCoefficientPrecursors");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateIsNull() {
            addCriterion("matching_coefficient_lithium_carbonate is null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateIsNotNull() {
            addCriterion("matching_coefficient_lithium_carbonate is not null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateEqualTo(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate =", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateNotEqualTo(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate <>", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateGreaterThan(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate >", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateGreaterThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate >=", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateLessThan(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate <", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateLessThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_lithium_carbonate <=", value, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateIn(List<Float> values) {
            addCriterion("matching_coefficient_lithium_carbonate in", values, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateNotIn(List<Float> values) {
            addCriterion("matching_coefficient_lithium_carbonate not in", values, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_lithium_carbonate between", value1, value2, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientLithiumCarbonateNotBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_lithium_carbonate not between", value1, value2, "matchingCoefficientLithiumCarbonate");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketIsNull() {
            addCriterion("matching_coefficient_hop_pocket is null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketIsNotNull() {
            addCriterion("matching_coefficient_hop_pocket is not null");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketEqualTo(Float value) {
            addCriterion("matching_coefficient_hop_pocket =", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketNotEqualTo(Float value) {
            addCriterion("matching_coefficient_hop_pocket <>", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketGreaterThan(Float value) {
            addCriterion("matching_coefficient_hop_pocket >", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketGreaterThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_hop_pocket >=", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketLessThan(Float value) {
            addCriterion("matching_coefficient_hop_pocket <", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketLessThanOrEqualTo(Float value) {
            addCriterion("matching_coefficient_hop_pocket <=", value, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketIn(List<Float> values) {
            addCriterion("matching_coefficient_hop_pocket in", values, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketNotIn(List<Float> values) {
            addCriterion("matching_coefficient_hop_pocket not in", values, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_hop_pocket between", value1, value2, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }

        public Criteria andMatchingCoefficientHopPocketNotBetween(Float value1, Float value2) {
            addCriterion("matching_coefficient_hop_pocket not between", value1, value2, "matchingCoefficientHopPocket");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table basic_info_anode_calculate_coefficient
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
     * This class corresponds to the database table basic_info_anode_calculate_coefficient
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
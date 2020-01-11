package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsInProcessStatisticAgeingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public GoodsInProcessStatisticAgeingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
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
     * This method corresponds to the database table goods_in_process_statistic_ageing
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
     * This method corresponds to the database table goods_in_process_statistic_ageing
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_ageing
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
     * This class corresponds to the database table goods_in_process_statistic_ageing
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

        public Criteria andProcessCodeIsNull() {
            addCriterion("process_code is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("process_code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(Integer value) {
            addCriterion("process_code =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(Integer value) {
            addCriterion("process_code <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(Integer value) {
            addCriterion("process_code >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_code >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(Integer value) {
            addCriterion("process_code <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(Integer value) {
            addCriterion("process_code <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<Integer> values) {
            addCriterion("process_code in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<Integer> values) {
            addCriterion("process_code not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(Integer value1, Integer value2) {
            addCriterion("process_code between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_code not between", value1, value2, "processCode");
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

        public Criteria andVolumesIsNull() {
            addCriterion("volumes is null");
            return (Criteria) this;
        }

        public Criteria andVolumesIsNotNull() {
            addCriterion("volumes is not null");
            return (Criteria) this;
        }

        public Criteria andVolumesEqualTo(Float value) {
            addCriterion("volumes =", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesNotEqualTo(Float value) {
            addCriterion("volumes <>", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesGreaterThan(Float value) {
            addCriterion("volumes >", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesGreaterThanOrEqualTo(Float value) {
            addCriterion("volumes >=", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesLessThan(Float value) {
            addCriterion("volumes <", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesLessThanOrEqualTo(Float value) {
            addCriterion("volumes <=", value, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesIn(List<Float> values) {
            addCriterion("volumes in", values, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesNotIn(List<Float> values) {
            addCriterion("volumes not in", values, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesBetween(Float value1, Float value2) {
            addCriterion("volumes between", value1, value2, "volumes");
            return (Criteria) this;
        }

        public Criteria andVolumesNotBetween(Float value1, Float value2) {
            addCriterion("volumes not between", value1, value2, "volumes");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentIsNull() {
            addCriterion("solid_containing_content is null");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentIsNotNull() {
            addCriterion("solid_containing_content is not null");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentEqualTo(Float value) {
            addCriterion("solid_containing_content =", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentNotEqualTo(Float value) {
            addCriterion("solid_containing_content <>", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentGreaterThan(Float value) {
            addCriterion("solid_containing_content >", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentGreaterThanOrEqualTo(Float value) {
            addCriterion("solid_containing_content >=", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentLessThan(Float value) {
            addCriterion("solid_containing_content <", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentLessThanOrEqualTo(Float value) {
            addCriterion("solid_containing_content <=", value, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentIn(List<Float> values) {
            addCriterion("solid_containing_content in", values, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentNotIn(List<Float> values) {
            addCriterion("solid_containing_content not in", values, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentBetween(Float value1, Float value2) {
            addCriterion("solid_containing_content between", value1, value2, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andSolidContainingContentNotBetween(Float value1, Float value2) {
            addCriterion("solid_containing_content not between", value1, value2, "solidContainingContent");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIsNull() {
            addCriterion("Ni_concentration is null");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIsNotNull() {
            addCriterion("Ni_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationEqualTo(Float value) {
            addCriterion("Ni_concentration =", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotEqualTo(Float value) {
            addCriterion("Ni_concentration <>", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationGreaterThan(Float value) {
            addCriterion("Ni_concentration >", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("Ni_concentration >=", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationLessThan(Float value) {
            addCriterion("Ni_concentration <", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("Ni_concentration <=", value, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationIn(List<Float> values) {
            addCriterion("Ni_concentration in", values, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotIn(List<Float> values) {
            addCriterion("Ni_concentration not in", values, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationBetween(Float value1, Float value2) {
            addCriterion("Ni_concentration between", value1, value2, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andNiConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("Ni_concentration not between", value1, value2, "niConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIsNull() {
            addCriterion("Co_concentration is null");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIsNotNull() {
            addCriterion("Co_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationEqualTo(Float value) {
            addCriterion("Co_concentration =", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotEqualTo(Float value) {
            addCriterion("Co_concentration <>", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationGreaterThan(Float value) {
            addCriterion("Co_concentration >", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("Co_concentration >=", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationLessThan(Float value) {
            addCriterion("Co_concentration <", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("Co_concentration <=", value, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationIn(List<Float> values) {
            addCriterion("Co_concentration in", values, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotIn(List<Float> values) {
            addCriterion("Co_concentration not in", values, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationBetween(Float value1, Float value2) {
            addCriterion("Co_concentration between", value1, value2, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andCoConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("Co_concentration not between", value1, value2, "coConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIsNull() {
            addCriterion("Mn_concentration is null");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIsNotNull() {
            addCriterion("Mn_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationEqualTo(Float value) {
            addCriterion("Mn_concentration =", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotEqualTo(Float value) {
            addCriterion("Mn_concentration <>", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationGreaterThan(Float value) {
            addCriterion("Mn_concentration >", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationGreaterThanOrEqualTo(Float value) {
            addCriterion("Mn_concentration >=", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationLessThan(Float value) {
            addCriterion("Mn_concentration <", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationLessThanOrEqualTo(Float value) {
            addCriterion("Mn_concentration <=", value, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationIn(List<Float> values) {
            addCriterion("Mn_concentration in", values, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotIn(List<Float> values) {
            addCriterion("Mn_concentration not in", values, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationBetween(Float value1, Float value2) {
            addCriterion("Mn_concentration between", value1, value2, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andMnConcentrationNotBetween(Float value1, Float value2) {
            addCriterion("Mn_concentration not between", value1, value2, "mnConcentration");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIsNull() {
            addCriterion("Ni_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIsNotNull() {
            addCriterion("Ni_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityEqualTo(Float value) {
            addCriterion("Ni_metallicity =", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotEqualTo(Float value) {
            addCriterion("Ni_metallicity <>", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityGreaterThan(Float value) {
            addCriterion("Ni_metallicity >", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("Ni_metallicity >=", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityLessThan(Float value) {
            addCriterion("Ni_metallicity <", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("Ni_metallicity <=", value, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityIn(List<Float> values) {
            addCriterion("Ni_metallicity in", values, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotIn(List<Float> values) {
            addCriterion("Ni_metallicity not in", values, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityBetween(Float value1, Float value2) {
            addCriterion("Ni_metallicity between", value1, value2, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andNiMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("Ni_metallicity not between", value1, value2, "niMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIsNull() {
            addCriterion("Co_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIsNotNull() {
            addCriterion("Co_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityEqualTo(Float value) {
            addCriterion("Co_metallicity =", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotEqualTo(Float value) {
            addCriterion("Co_metallicity <>", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityGreaterThan(Float value) {
            addCriterion("Co_metallicity >", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("Co_metallicity >=", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityLessThan(Float value) {
            addCriterion("Co_metallicity <", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("Co_metallicity <=", value, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityIn(List<Float> values) {
            addCriterion("Co_metallicity in", values, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotIn(List<Float> values) {
            addCriterion("Co_metallicity not in", values, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityBetween(Float value1, Float value2) {
            addCriterion("Co_metallicity between", value1, value2, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andCoMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("Co_metallicity not between", value1, value2, "coMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIsNull() {
            addCriterion("Mn_metallicity is null");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIsNotNull() {
            addCriterion("Mn_metallicity is not null");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityEqualTo(Float value) {
            addCriterion("Mn_metallicity =", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotEqualTo(Float value) {
            addCriterion("Mn_metallicity <>", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityGreaterThan(Float value) {
            addCriterion("Mn_metallicity >", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityGreaterThanOrEqualTo(Float value) {
            addCriterion("Mn_metallicity >=", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityLessThan(Float value) {
            addCriterion("Mn_metallicity <", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityLessThanOrEqualTo(Float value) {
            addCriterion("Mn_metallicity <=", value, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityIn(List<Float> values) {
            addCriterion("Mn_metallicity in", values, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotIn(List<Float> values) {
            addCriterion("Mn_metallicity not in", values, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityBetween(Float value1, Float value2) {
            addCriterion("Mn_metallicity between", value1, value2, "mnMetallicity");
            return (Criteria) this;
        }

        public Criteria andMnMetallicityNotBetween(Float value1, Float value2) {
            addCriterion("Mn_metallicity not between", value1, value2, "mnMetallicity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods_in_process_statistic_ageing
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
     * This class corresponds to the database table goods_in_process_statistic_ageing
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
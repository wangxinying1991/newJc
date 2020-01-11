package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class AnodeGoodsInProcessStatisticByProcessTotalsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public AnodeGoodsInProcessStatisticByProcessTotalsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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
     * This class corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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

        public Criteria andTypeCodeIsNull() {
            addCriterion("type_code is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("type_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(Integer value) {
            addCriterion("type_code =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(Integer value) {
            addCriterion("type_code <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(Integer value) {
            addCriterion("type_code >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_code >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(Integer value) {
            addCriterion("type_code <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("type_code <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<Integer> values) {
            addCriterion("type_code in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<Integer> values) {
            addCriterion("type_code not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("type_code between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("type_code not between", value1, value2, "typeCode");
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

        public Criteria andFeedstockTotalsIsNull() {
            addCriterion("feedstock_totals is null");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsIsNotNull() {
            addCriterion("feedstock_totals is not null");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsEqualTo(Float value) {
            addCriterion("feedstock_totals =", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsNotEqualTo(Float value) {
            addCriterion("feedstock_totals <>", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsGreaterThan(Float value) {
            addCriterion("feedstock_totals >", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsGreaterThanOrEqualTo(Float value) {
            addCriterion("feedstock_totals >=", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsLessThan(Float value) {
            addCriterion("feedstock_totals <", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsLessThanOrEqualTo(Float value) {
            addCriterion("feedstock_totals <=", value, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsIn(List<Float> values) {
            addCriterion("feedstock_totals in", values, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsNotIn(List<Float> values) {
            addCriterion("feedstock_totals not in", values, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsBetween(Float value1, Float value2) {
            addCriterion("feedstock_totals between", value1, value2, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andFeedstockTotalsNotBetween(Float value1, Float value2) {
            addCriterion("feedstock_totals not between", value1, value2, "feedstockTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsIsNull() {
            addCriterion("consume_totals is null");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsIsNotNull() {
            addCriterion("consume_totals is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsEqualTo(Float value) {
            addCriterion("consume_totals =", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsNotEqualTo(Float value) {
            addCriterion("consume_totals <>", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsGreaterThan(Float value) {
            addCriterion("consume_totals >", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsGreaterThanOrEqualTo(Float value) {
            addCriterion("consume_totals >=", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsLessThan(Float value) {
            addCriterion("consume_totals <", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsLessThanOrEqualTo(Float value) {
            addCriterion("consume_totals <=", value, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsIn(List<Float> values) {
            addCriterion("consume_totals in", values, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsNotIn(List<Float> values) {
            addCriterion("consume_totals not in", values, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsBetween(Float value1, Float value2) {
            addCriterion("consume_totals between", value1, value2, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andConsumeTotalsNotBetween(Float value1, Float value2) {
            addCriterion("consume_totals not between", value1, value2, "consumeTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsIsNull() {
            addCriterion("balance_totals is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsIsNotNull() {
            addCriterion("balance_totals is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsEqualTo(Float value) {
            addCriterion("balance_totals =", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsNotEqualTo(Float value) {
            addCriterion("balance_totals <>", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsGreaterThan(Float value) {
            addCriterion("balance_totals >", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsGreaterThanOrEqualTo(Float value) {
            addCriterion("balance_totals >=", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsLessThan(Float value) {
            addCriterion("balance_totals <", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsLessThanOrEqualTo(Float value) {
            addCriterion("balance_totals <=", value, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsIn(List<Float> values) {
            addCriterion("balance_totals in", values, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsNotIn(List<Float> values) {
            addCriterion("balance_totals not in", values, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsBetween(Float value1, Float value2) {
            addCriterion("balance_totals between", value1, value2, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andBalanceTotalsNotBetween(Float value1, Float value2) {
            addCriterion("balance_totals not between", value1, value2, "balanceTotals");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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
     * This class corresponds to the database table anode_goods_in_process_statistic_by_process_totals
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
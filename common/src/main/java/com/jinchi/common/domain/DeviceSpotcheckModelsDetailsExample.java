package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class DeviceSpotcheckModelsDetailsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public DeviceSpotcheckModelsDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
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
     * This method corresponds to the database table device_spotcheck_models_details
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
     * This method corresponds to the database table device_spotcheck_models_details
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_models_details
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
     * This class corresponds to the database table device_spotcheck_models_details
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

        public Criteria andModelCodeIsNull() {
            addCriterion("model_code is null");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNotNull() {
            addCriterion("model_code is not null");
            return (Criteria) this;
        }

        public Criteria andModelCodeEqualTo(Long value) {
            addCriterion("model_code =", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotEqualTo(Long value) {
            addCriterion("model_code <>", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThan(Long value) {
            addCriterion("model_code >", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("model_code >=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThan(Long value) {
            addCriterion("model_code <", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThanOrEqualTo(Long value) {
            addCriterion("model_code <=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeIn(List<Long> values) {
            addCriterion("model_code in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotIn(List<Long> values) {
            addCriterion("model_code not in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeBetween(Long value1, Long value2) {
            addCriterion("model_code between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotBetween(Long value1, Long value2) {
            addCriterion("model_code not between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsIsNull() {
            addCriterion("spotcheck_items is null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsIsNotNull() {
            addCriterion("spotcheck_items is not null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsEqualTo(String value) {
            addCriterion("spotcheck_items =", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsNotEqualTo(String value) {
            addCriterion("spotcheck_items <>", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsGreaterThan(String value) {
            addCriterion("spotcheck_items >", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsGreaterThanOrEqualTo(String value) {
            addCriterion("spotcheck_items >=", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsLessThan(String value) {
            addCriterion("spotcheck_items <", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsLessThanOrEqualTo(String value) {
            addCriterion("spotcheck_items <=", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsLike(String value) {
            addCriterion("spotcheck_items like", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsNotLike(String value) {
            addCriterion("spotcheck_items not like", value, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsIn(List<String> values) {
            addCriterion("spotcheck_items in", values, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsNotIn(List<String> values) {
            addCriterion("spotcheck_items not in", values, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsBetween(String value1, String value2) {
            addCriterion("spotcheck_items between", value1, value2, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckItemsNotBetween(String value1, String value2) {
            addCriterion("spotcheck_items not between", value1, value2, "spotcheckItems");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentIsNull() {
            addCriterion("spotcheck_content is null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentIsNotNull() {
            addCriterion("spotcheck_content is not null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentEqualTo(String value) {
            addCriterion("spotcheck_content =", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentNotEqualTo(String value) {
            addCriterion("spotcheck_content <>", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentGreaterThan(String value) {
            addCriterion("spotcheck_content >", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentGreaterThanOrEqualTo(String value) {
            addCriterion("spotcheck_content >=", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentLessThan(String value) {
            addCriterion("spotcheck_content <", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentLessThanOrEqualTo(String value) {
            addCriterion("spotcheck_content <=", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentLike(String value) {
            addCriterion("spotcheck_content like", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentNotLike(String value) {
            addCriterion("spotcheck_content not like", value, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentIn(List<String> values) {
            addCriterion("spotcheck_content in", values, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentNotIn(List<String> values) {
            addCriterion("spotcheck_content not in", values, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentBetween(String value1, String value2) {
            addCriterion("spotcheck_content between", value1, value2, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckContentNotBetween(String value1, String value2) {
            addCriterion("spotcheck_content not between", value1, value2, "spotcheckContent");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodIsNull() {
            addCriterion("spotcheck_period is null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodIsNotNull() {
            addCriterion("spotcheck_period is not null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodEqualTo(String value) {
            addCriterion("spotcheck_period =", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodNotEqualTo(String value) {
            addCriterion("spotcheck_period <>", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodGreaterThan(String value) {
            addCriterion("spotcheck_period >", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("spotcheck_period >=", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodLessThan(String value) {
            addCriterion("spotcheck_period <", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodLessThanOrEqualTo(String value) {
            addCriterion("spotcheck_period <=", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodLike(String value) {
            addCriterion("spotcheck_period like", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodNotLike(String value) {
            addCriterion("spotcheck_period not like", value, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodIn(List<String> values) {
            addCriterion("spotcheck_period in", values, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodNotIn(List<String> values) {
            addCriterion("spotcheck_period not in", values, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodBetween(String value1, String value2) {
            addCriterion("spotcheck_period between", value1, value2, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckPeriodNotBetween(String value1, String value2) {
            addCriterion("spotcheck_period not between", value1, value2, "spotcheckPeriod");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressIsNull() {
            addCriterion("spotcheck_address is null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressIsNotNull() {
            addCriterion("spotcheck_address is not null");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressEqualTo(String value) {
            addCriterion("spotcheck_address =", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressNotEqualTo(String value) {
            addCriterion("spotcheck_address <>", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressGreaterThan(String value) {
            addCriterion("spotcheck_address >", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressGreaterThanOrEqualTo(String value) {
            addCriterion("spotcheck_address >=", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressLessThan(String value) {
            addCriterion("spotcheck_address <", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressLessThanOrEqualTo(String value) {
            addCriterion("spotcheck_address <=", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressLike(String value) {
            addCriterion("spotcheck_address like", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressNotLike(String value) {
            addCriterion("spotcheck_address not like", value, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressIn(List<String> values) {
            addCriterion("spotcheck_address in", values, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressNotIn(List<String> values) {
            addCriterion("spotcheck_address not in", values, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressBetween(String value1, String value2) {
            addCriterion("spotcheck_address between", value1, value2, "spotcheckAddress");
            return (Criteria) this;
        }

        public Criteria andSpotcheckAddressNotBetween(String value1, String value2) {
            addCriterion("spotcheck_address not between", value1, value2, "spotcheckAddress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table device_spotcheck_models_details
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
     * This class corresponds to the database table device_spotcheck_models_details
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
package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class FireMageLabelItemsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public FireMageLabelItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
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
     * This method corresponds to the database table fire_mage_label_items
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
     * This method corresponds to the database table fire_mage_label_items
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_label_items
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
     * This class corresponds to the database table fire_mage_label_items
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

        public Criteria andItemCodesIsNull() {
            addCriterion("item_codes is null");
            return (Criteria) this;
        }

        public Criteria andItemCodesIsNotNull() {
            addCriterion("item_codes is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodesEqualTo(String value) {
            addCriterion("item_codes =", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesNotEqualTo(String value) {
            addCriterion("item_codes <>", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesGreaterThan(String value) {
            addCriterion("item_codes >", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesGreaterThanOrEqualTo(String value) {
            addCriterion("item_codes >=", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesLessThan(String value) {
            addCriterion("item_codes <", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesLessThanOrEqualTo(String value) {
            addCriterion("item_codes <=", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesLike(String value) {
            addCriterion("item_codes like", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesNotLike(String value) {
            addCriterion("item_codes not like", value, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesIn(List<String> values) {
            addCriterion("item_codes in", values, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesNotIn(List<String> values) {
            addCriterion("item_codes not in", values, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesBetween(String value1, String value2) {
            addCriterion("item_codes between", value1, value2, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemCodesNotBetween(String value1, String value2) {
            addCriterion("item_codes not between", value1, value2, "itemCodes");
            return (Criteria) this;
        }

        public Criteria andItemNamesIsNull() {
            addCriterion("item_names is null");
            return (Criteria) this;
        }

        public Criteria andItemNamesIsNotNull() {
            addCriterion("item_names is not null");
            return (Criteria) this;
        }

        public Criteria andItemNamesEqualTo(String value) {
            addCriterion("item_names =", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesNotEqualTo(String value) {
            addCriterion("item_names <>", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesGreaterThan(String value) {
            addCriterion("item_names >", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesGreaterThanOrEqualTo(String value) {
            addCriterion("item_names >=", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesLessThan(String value) {
            addCriterion("item_names <", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesLessThanOrEqualTo(String value) {
            addCriterion("item_names <=", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesLike(String value) {
            addCriterion("item_names like", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesNotLike(String value) {
            addCriterion("item_names not like", value, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesIn(List<String> values) {
            addCriterion("item_names in", values, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesNotIn(List<String> values) {
            addCriterion("item_names not in", values, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesBetween(String value1, String value2) {
            addCriterion("item_names between", value1, value2, "itemNames");
            return (Criteria) this;
        }

        public Criteria andItemNamesNotBetween(String value1, String value2) {
            addCriterion("item_names not between", value1, value2, "itemNames");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fire_mage_label_items
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
     * This class corresponds to the database table fire_mage_label_items
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
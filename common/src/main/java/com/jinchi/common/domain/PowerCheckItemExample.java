package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class PowerCheckItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerCheckItemExample() {
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

        public Criteria andSiteCodeIsNull() {
            addCriterion("site_code is null");
            return (Criteria) this;
        }

        public Criteria andSiteCodeIsNotNull() {
            addCriterion("site_code is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCodeEqualTo(Long value) {
            addCriterion("site_code =", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotEqualTo(Long value) {
            addCriterion("site_code <>", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeGreaterThan(Long value) {
            addCriterion("site_code >", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("site_code >=", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeLessThan(Long value) {
            addCriterion("site_code <", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeLessThanOrEqualTo(Long value) {
            addCriterion("site_code <=", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeIn(List<Long> values) {
            addCriterion("site_code in", values, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotIn(List<Long> values) {
            addCriterion("site_code not in", values, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeBetween(Long value1, Long value2) {
            addCriterion("site_code between", value1, value2, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotBetween(Long value1, Long value2) {
            addCriterion("site_code not between", value1, value2, "siteCode");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andCheckItemIsNull() {
            addCriterion("check_item is null");
            return (Criteria) this;
        }

        public Criteria andCheckItemIsNotNull() {
            addCriterion("check_item is not null");
            return (Criteria) this;
        }

        public Criteria andCheckItemEqualTo(String value) {
            addCriterion("check_item =", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemNotEqualTo(String value) {
            addCriterion("check_item <>", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemGreaterThan(String value) {
            addCriterion("check_item >", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemGreaterThanOrEqualTo(String value) {
            addCriterion("check_item >=", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemLessThan(String value) {
            addCriterion("check_item <", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemLessThanOrEqualTo(String value) {
            addCriterion("check_item <=", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemLike(String value) {
            addCriterion("check_item like", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemNotLike(String value) {
            addCriterion("check_item not like", value, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemIn(List<String> values) {
            addCriterion("check_item in", values, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemNotIn(List<String> values) {
            addCriterion("check_item not in", values, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemBetween(String value1, String value2) {
            addCriterion("check_item between", value1, value2, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckItemNotBetween(String value1, String value2) {
            addCriterion("check_item not between", value1, value2, "checkItem");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNull() {
            addCriterion("check_content is null");
            return (Criteria) this;
        }

        public Criteria andCheckContentIsNotNull() {
            addCriterion("check_content is not null");
            return (Criteria) this;
        }

        public Criteria andCheckContentEqualTo(String value) {
            addCriterion("check_content =", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotEqualTo(String value) {
            addCriterion("check_content <>", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThan(String value) {
            addCriterion("check_content >", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentGreaterThanOrEqualTo(String value) {
            addCriterion("check_content >=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThan(String value) {
            addCriterion("check_content <", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLessThanOrEqualTo(String value) {
            addCriterion("check_content <=", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentLike(String value) {
            addCriterion("check_content like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotLike(String value) {
            addCriterion("check_content not like", value, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentIn(List<String> values) {
            addCriterion("check_content in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotIn(List<String> values) {
            addCriterion("check_content not in", values, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentBetween(String value1, String value2) {
            addCriterion("check_content between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andCheckContentNotBetween(String value1, String value2) {
            addCriterion("check_content not between", value1, value2, "checkContent");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Byte value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Byte value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Byte value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Byte value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Byte value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Byte> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Byte> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Byte value1, Byte value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
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
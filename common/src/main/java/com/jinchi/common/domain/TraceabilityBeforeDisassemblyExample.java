package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.List;

public class TraceabilityBeforeDisassemblyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public TraceabilityBeforeDisassemblyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
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
     * This method corresponds to the database table traceabilitybeforedisassembly
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
     * This method corresponds to the database table traceabilitybeforedisassembly
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table traceabilitybeforedisassembly
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
     * This class corresponds to the database table traceabilitybeforedisassembly
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeIsNull() {
            addCriterion("BatteryPackTraceCode is null");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeIsNotNull() {
            addCriterion("BatteryPackTraceCode is not null");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeEqualTo(String value) {
            addCriterion("BatteryPackTraceCode =", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeNotEqualTo(String value) {
            addCriterion("BatteryPackTraceCode <>", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeGreaterThan(String value) {
            addCriterion("BatteryPackTraceCode >", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeGreaterThanOrEqualTo(String value) {
            addCriterion("BatteryPackTraceCode >=", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeLessThan(String value) {
            addCriterion("BatteryPackTraceCode <", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeLessThanOrEqualTo(String value) {
            addCriterion("BatteryPackTraceCode <=", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeLike(String value) {
            addCriterion("BatteryPackTraceCode like", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeNotLike(String value) {
            addCriterion("BatteryPackTraceCode not like", value, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeIn(List<String> values) {
            addCriterion("BatteryPackTraceCode in", values, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeNotIn(List<String> values) {
            addCriterion("BatteryPackTraceCode not in", values, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeBetween(String value1, String value2) {
            addCriterion("BatteryPackTraceCode between", value1, value2, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andBatterypacktracecodeNotBetween(String value1, String value2) {
            addCriterion("BatteryPackTraceCode not between", value1, value2, "batterypacktracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeIsNull() {
            addCriterion("ModuleTraceCode is null");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeIsNotNull() {
            addCriterion("ModuleTraceCode is not null");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeEqualTo(String value) {
            addCriterion("ModuleTraceCode =", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeNotEqualTo(String value) {
            addCriterion("ModuleTraceCode <>", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeGreaterThan(String value) {
            addCriterion("ModuleTraceCode >", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ModuleTraceCode >=", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeLessThan(String value) {
            addCriterion("ModuleTraceCode <", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeLessThanOrEqualTo(String value) {
            addCriterion("ModuleTraceCode <=", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeLike(String value) {
            addCriterion("ModuleTraceCode like", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeNotLike(String value) {
            addCriterion("ModuleTraceCode not like", value, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeIn(List<String> values) {
            addCriterion("ModuleTraceCode in", values, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeNotIn(List<String> values) {
            addCriterion("ModuleTraceCode not in", values, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeBetween(String value1, String value2) {
            addCriterion("ModuleTraceCode between", value1, value2, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andModuletracecodeNotBetween(String value1, String value2) {
            addCriterion("ModuleTraceCode not between", value1, value2, "moduletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeIsNull() {
            addCriterion("SingleTraceCode is null");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeIsNotNull() {
            addCriterion("SingleTraceCode is not null");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeEqualTo(String value) {
            addCriterion("SingleTraceCode =", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeNotEqualTo(String value) {
            addCriterion("SingleTraceCode <>", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeGreaterThan(String value) {
            addCriterion("SingleTraceCode >", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SingleTraceCode >=", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeLessThan(String value) {
            addCriterion("SingleTraceCode <", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeLessThanOrEqualTo(String value) {
            addCriterion("SingleTraceCode <=", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeLike(String value) {
            addCriterion("SingleTraceCode like", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeNotLike(String value) {
            addCriterion("SingleTraceCode not like", value, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeIn(List<String> values) {
            addCriterion("SingleTraceCode in", values, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeNotIn(List<String> values) {
            addCriterion("SingleTraceCode not in", values, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeBetween(String value1, String value2) {
            addCriterion("SingleTraceCode between", value1, value2, "singletracecode");
            return (Criteria) this;
        }

        public Criteria andSingletracecodeNotBetween(String value1, String value2) {
            addCriterion("SingleTraceCode not between", value1, value2, "singletracecode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table traceabilitybeforedisassembly
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
     * This class corresponds to the database table traceabilitybeforedisassembly
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
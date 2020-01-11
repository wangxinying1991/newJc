package com.jinchi.app.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppDeviceStatisticHeadExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public AppDeviceStatisticHeadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
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
     * This method corresponds to the database table app_device_statistic_head
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
     * This method corresponds to the database table app_device_statistic_head
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_device_statistic_head
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
     * This class corresponds to the database table app_device_statistic_head
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(Integer value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(Integer value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(Integer value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(Integer value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<Integer> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<Integer> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(Integer value1, Integer value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateIsNull() {
            addCriterion("statistical_date is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateIsNotNull() {
            addCriterion("statistical_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateEqualTo(Date value) {
            addCriterion("statistical_date =", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateNotEqualTo(Date value) {
            addCriterion("statistical_date <>", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateGreaterThan(Date value) {
            addCriterion("statistical_date >", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("statistical_date >=", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateLessThan(Date value) {
            addCriterion("statistical_date <", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateLessThanOrEqualTo(Date value) {
            addCriterion("statistical_date <=", value, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateIn(List<Date> values) {
            addCriterion("statistical_date in", values, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateNotIn(List<Date> values) {
            addCriterion("statistical_date not in", values, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateBetween(Date value1, Date value2) {
            addCriterion("statistical_date between", value1, value2, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andStatisticalDateNotBetween(Date value1, Date value2) {
            addCriterion("statistical_date not between", value1, value2, "statisticalDate");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceIsNull() {
            addCriterion("total_device is null");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceIsNotNull() {
            addCriterion("total_device is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceEqualTo(Integer value) {
            addCriterion("total_device =", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceNotEqualTo(Integer value) {
            addCriterion("total_device <>", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceGreaterThan(Integer value) {
            addCriterion("total_device >", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_device >=", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceLessThan(Integer value) {
            addCriterion("total_device <", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceLessThanOrEqualTo(Integer value) {
            addCriterion("total_device <=", value, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceIn(List<Integer> values) {
            addCriterion("total_device in", values, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceNotIn(List<Integer> values) {
            addCriterion("total_device not in", values, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceBetween(Integer value1, Integer value2) {
            addCriterion("total_device between", value1, value2, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalDeviceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_device not between", value1, value2, "totalDevice");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceIsNull() {
            addCriterion("total_in_service is null");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceIsNotNull() {
            addCriterion("total_in_service is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceEqualTo(Integer value) {
            addCriterion("total_in_service =", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceNotEqualTo(Integer value) {
            addCriterion("total_in_service <>", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceGreaterThan(Integer value) {
            addCriterion("total_in_service >", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_in_service >=", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceLessThan(Integer value) {
            addCriterion("total_in_service <", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceLessThanOrEqualTo(Integer value) {
            addCriterion("total_in_service <=", value, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceIn(List<Integer> values) {
            addCriterion("total_in_service in", values, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceNotIn(List<Integer> values) {
            addCriterion("total_in_service not in", values, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceBetween(Integer value1, Integer value2) {
            addCriterion("total_in_service between", value1, value2, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalInServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_in_service not between", value1, value2, "totalInService");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyIsNull() {
            addCriterion("total_standby is null");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyIsNotNull() {
            addCriterion("total_standby is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyEqualTo(Integer value) {
            addCriterion("total_standby =", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyNotEqualTo(Integer value) {
            addCriterion("total_standby <>", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyGreaterThan(Integer value) {
            addCriterion("total_standby >", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_standby >=", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyLessThan(Integer value) {
            addCriterion("total_standby <", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyLessThanOrEqualTo(Integer value) {
            addCriterion("total_standby <=", value, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyIn(List<Integer> values) {
            addCriterion("total_standby in", values, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyNotIn(List<Integer> values) {
            addCriterion("total_standby not in", values, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyBetween(Integer value1, Integer value2) {
            addCriterion("total_standby between", value1, value2, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalStandbyNotBetween(Integer value1, Integer value2) {
            addCriterion("total_standby not between", value1, value2, "totalStandby");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionIsNull() {
            addCriterion("total_recondition is null");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionIsNotNull() {
            addCriterion("total_recondition is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionEqualTo(Integer value) {
            addCriterion("total_recondition =", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionNotEqualTo(Integer value) {
            addCriterion("total_recondition <>", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionGreaterThan(Integer value) {
            addCriterion("total_recondition >", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_recondition >=", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionLessThan(Integer value) {
            addCriterion("total_recondition <", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionLessThanOrEqualTo(Integer value) {
            addCriterion("total_recondition <=", value, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionIn(List<Integer> values) {
            addCriterion("total_recondition in", values, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionNotIn(List<Integer> values) {
            addCriterion("total_recondition not in", values, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionBetween(Integer value1, Integer value2) {
            addCriterion("total_recondition between", value1, value2, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalReconditionNotBetween(Integer value1, Integer value2) {
            addCriterion("total_recondition not between", value1, value2, "totalRecondition");
            return (Criteria) this;
        }

        public Criteria andTotalScrapIsNull() {
            addCriterion("total_scrap is null");
            return (Criteria) this;
        }

        public Criteria andTotalScrapIsNotNull() {
            addCriterion("total_scrap is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScrapEqualTo(Integer value) {
            addCriterion("total_scrap =", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapNotEqualTo(Integer value) {
            addCriterion("total_scrap <>", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapGreaterThan(Integer value) {
            addCriterion("total_scrap >", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_scrap >=", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapLessThan(Integer value) {
            addCriterion("total_scrap <", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapLessThanOrEqualTo(Integer value) {
            addCriterion("total_scrap <=", value, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapIn(List<Integer> values) {
            addCriterion("total_scrap in", values, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapNotIn(List<Integer> values) {
            addCriterion("total_scrap not in", values, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapBetween(Integer value1, Integer value2) {
            addCriterion("total_scrap between", value1, value2, "totalScrap");
            return (Criteria) this;
        }

        public Criteria andTotalScrapNotBetween(Integer value1, Integer value2) {
            addCriterion("total_scrap not between", value1, value2, "totalScrap");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_device_statistic_head
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
     * This class corresponds to the database table app_device_statistic_head
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
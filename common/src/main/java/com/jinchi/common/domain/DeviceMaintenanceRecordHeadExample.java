package com.jinchi.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceMaintenanceRecordHeadExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public DeviceMaintenanceRecordHeadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
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
     * This method corresponds to the database table device_maintenance_record_head
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
     * This method corresponds to the database table device_maintenance_record_head
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_record_head
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
     * This class corresponds to the database table device_maintenance_record_head
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

        public Criteria andPlanCodeIsNull() {
            addCriterion("plan_code is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(Long value) {
            addCriterion("plan_code =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(Long value) {
            addCriterion("plan_code <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(Long value) {
            addCriterion("plan_code >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_code >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(Long value) {
            addCriterion("plan_code <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(Long value) {
            addCriterion("plan_code <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<Long> values) {
            addCriterion("plan_code in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<Long> values) {
            addCriterion("plan_code not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(Long value1, Long value2) {
            addCriterion("plan_code between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(Long value1, Long value2) {
            addCriterion("plan_code not between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNull() {
            addCriterion("device_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNotNull() {
            addCriterion("device_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeEqualTo(Long value) {
            addCriterion("device_code =", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotEqualTo(Long value) {
            addCriterion("device_code <>", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThan(Long value) {
            addCriterion("device_code >", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("device_code >=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThan(Long value) {
            addCriterion("device_code <", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThanOrEqualTo(Long value) {
            addCriterion("device_code <=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIn(List<Long> values) {
            addCriterion("device_code in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotIn(List<Long> values) {
            addCriterion("device_code not in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeBetween(Long value1, Long value2) {
            addCriterion("device_code between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotBetween(Long value1, Long value2) {
            addCriterion("device_code not between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeIsNull() {
            addCriterion("fixedassets_code is null");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeIsNotNull() {
            addCriterion("fixedassets_code is not null");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeEqualTo(String value) {
            addCriterion("fixedassets_code =", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeNotEqualTo(String value) {
            addCriterion("fixedassets_code <>", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeGreaterThan(String value) {
            addCriterion("fixedassets_code >", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fixedassets_code >=", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeLessThan(String value) {
            addCriterion("fixedassets_code <", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeLessThanOrEqualTo(String value) {
            addCriterion("fixedassets_code <=", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeLike(String value) {
            addCriterion("fixedassets_code like", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeNotLike(String value) {
            addCriterion("fixedassets_code not like", value, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeIn(List<String> values) {
            addCriterion("fixedassets_code in", values, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeNotIn(List<String> values) {
            addCriterion("fixedassets_code not in", values, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeBetween(String value1, String value2) {
            addCriterion("fixedassets_code between", value1, value2, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andFixedassetsCodeNotBetween(String value1, String value2) {
            addCriterion("fixedassets_code not between", value1, value2, "fixedassetsCode");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
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

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("receive_date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("receive_date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("receive_date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("receive_date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("receive_date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("receive_date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("receive_date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("receive_date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("receive_date not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateIsNull() {
            addCriterion("finishi_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishiDateIsNotNull() {
            addCriterion("finishi_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishiDateEqualTo(Date value) {
            addCriterion("finishi_date =", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateNotEqualTo(Date value) {
            addCriterion("finishi_date <>", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateGreaterThan(Date value) {
            addCriterion("finishi_date >", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finishi_date >=", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateLessThan(Date value) {
            addCriterion("finishi_date <", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateLessThanOrEqualTo(Date value) {
            addCriterion("finishi_date <=", value, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateIn(List<Date> values) {
            addCriterion("finishi_date in", values, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateNotIn(List<Date> values) {
            addCriterion("finishi_date not in", values, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateBetween(Date value1, Date value2) {
            addCriterion("finishi_date between", value1, value2, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andFinishiDateNotBetween(Date value1, Date value2) {
            addCriterion("finishi_date not between", value1, value2, "finishiDate");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleIsNull() {
            addCriterion("maint_people is null");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleIsNotNull() {
            addCriterion("maint_people is not null");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleEqualTo(Integer value) {
            addCriterion("maint_people =", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleNotEqualTo(Integer value) {
            addCriterion("maint_people <>", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleGreaterThan(Integer value) {
            addCriterion("maint_people >", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("maint_people >=", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleLessThan(Integer value) {
            addCriterion("maint_people <", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("maint_people <=", value, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleIn(List<Integer> values) {
            addCriterion("maint_people in", values, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleNotIn(List<Integer> values) {
            addCriterion("maint_people not in", values, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleBetween(Integer value1, Integer value2) {
            addCriterion("maint_people between", value1, value2, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andMaintPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("maint_people not between", value1, value2, "maintPeople");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentIsNull() {
            addCriterion("abnormalcontent is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentIsNotNull() {
            addCriterion("abnormalcontent is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentEqualTo(String value) {
            addCriterion("abnormalcontent =", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentNotEqualTo(String value) {
            addCriterion("abnormalcontent <>", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentGreaterThan(String value) {
            addCriterion("abnormalcontent >", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentGreaterThanOrEqualTo(String value) {
            addCriterion("abnormalcontent >=", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentLessThan(String value) {
            addCriterion("abnormalcontent <", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentLessThanOrEqualTo(String value) {
            addCriterion("abnormalcontent <=", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentLike(String value) {
            addCriterion("abnormalcontent like", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentNotLike(String value) {
            addCriterion("abnormalcontent not like", value, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentIn(List<String> values) {
            addCriterion("abnormalcontent in", values, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentNotIn(List<String> values) {
            addCriterion("abnormalcontent not in", values, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentBetween(String value1, String value2) {
            addCriterion("abnormalcontent between", value1, value2, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andAbnormalcontentNotBetween(String value1, String value2) {
            addCriterion("abnormalcontent not between", value1, value2, "abnormalcontent");
            return (Criteria) this;
        }

        public Criteria andEditFlagIsNull() {
            addCriterion("edit_flag is null");
            return (Criteria) this;
        }

        public Criteria andEditFlagIsNotNull() {
            addCriterion("edit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEditFlagEqualTo(Integer value) {
            addCriterion("edit_flag =", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotEqualTo(Integer value) {
            addCriterion("edit_flag <>", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThan(Integer value) {
            addCriterion("edit_flag >", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_flag >=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThan(Integer value) {
            addCriterion("edit_flag <", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThanOrEqualTo(Integer value) {
            addCriterion("edit_flag <=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagIn(List<Integer> values) {
            addCriterion("edit_flag in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotIn(List<Integer> values) {
            addCriterion("edit_flag not in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagBetween(Integer value1, Integer value2) {
            addCriterion("edit_flag between", value1, value2, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_flag not between", value1, value2, "editFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table device_maintenance_record_head
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
     * This class corresponds to the database table device_maintenance_record_head
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
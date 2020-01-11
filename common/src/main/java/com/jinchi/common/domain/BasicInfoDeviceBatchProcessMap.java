package com.jinchi.common.domain;

public class BasicInfoDeviceBatchProcessMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_device_batch_process_map.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_device_batch_process_map.process_code
     *
     * @mbggenerated
     */
    private Short processCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_device_batch_process_map.rule_detail_code
     *
     * @mbggenerated
     */
    private Short ruleDetailCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_device_batch_process_map.rule_value
     *
     * @mbggenerated
     */
    private String ruleValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_batch_process_map
     *
     * @mbggenerated
     */
    public BasicInfoDeviceBatchProcessMap(Long code, Short processCode, Short ruleDetailCode, String ruleValue) {
        this.code = code;
        this.processCode = processCode;
        this.ruleDetailCode = ruleDetailCode;
        this.ruleValue = ruleValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_batch_process_map
     *
     * @mbggenerated
     */
    public BasicInfoDeviceBatchProcessMap() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_device_batch_process_map.code
     *
     * @return the value of basic_info_device_batch_process_map.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_device_batch_process_map.code
     *
     * @param code the value for basic_info_device_batch_process_map.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_device_batch_process_map.process_code
     *
     * @return the value of basic_info_device_batch_process_map.process_code
     *
     * @mbggenerated
     */
    public Short getProcessCode() {
        return processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_device_batch_process_map.process_code
     *
     * @param processCode the value for basic_info_device_batch_process_map.process_code
     *
     * @mbggenerated
     */
    public void setProcessCode(Short processCode) {
        this.processCode = processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_device_batch_process_map.rule_detail_code
     *
     * @return the value of basic_info_device_batch_process_map.rule_detail_code
     *
     * @mbggenerated
     */
    public Short getRuleDetailCode() {
        return ruleDetailCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_device_batch_process_map.rule_detail_code
     *
     * @param ruleDetailCode the value for basic_info_device_batch_process_map.rule_detail_code
     *
     * @mbggenerated
     */
    public void setRuleDetailCode(Short ruleDetailCode) {
        this.ruleDetailCode = ruleDetailCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_device_batch_process_map.rule_value
     *
     * @return the value of basic_info_device_batch_process_map.rule_value
     *
     * @mbggenerated
     */
    public String getRuleValue() {
        return ruleValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_device_batch_process_map.rule_value
     *
     * @param ruleValue the value for basic_info_device_batch_process_map.rule_value
     *
     * @mbggenerated
     */
    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue == null ? null : ruleValue.trim();
    }
}
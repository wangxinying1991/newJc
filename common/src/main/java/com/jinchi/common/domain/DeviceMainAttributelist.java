package com.jinchi.common.domain;

public class DeviceMainAttributelist {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_main_attributelist.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_main_attributelist.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_main_attributelist.att_value
     *
     * @mbggenerated
     */
    private String attValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_main_attributelist.main_code
     *
     * @mbggenerated
     */
    private Long mainCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_main_attributelist
     *
     * @mbggenerated
     */
     public DeviceMainAttributelist(Long code, String name, String attValue, Long mainCode) {
        this.code = code;
        this.name = name;
        this.attValue = attValue;
        this.mainCode = mainCode;
    }
    public DeviceMainAttributelist(){}

    public void setCode(Long code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttValue(String attValue) {
        this.attValue = attValue;
    }

    public void setMainCode(Long mainCode) {
        this.mainCode = mainCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_main_attributelist.code
     *
     * @return the value of device_main_attributelist.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_main_attributelist.name
     *
     * @return the value of device_main_attributelist.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_main_attributelist.att_value
     *
     * @return the value of device_main_attributelist.att_value
     *
     * @mbggenerated
     */
    public String getAttValue() {
        return attValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_main_attributelist.main_code
     *
     * @return the value of device_main_attributelist.main_code
     *
     * @mbggenerated
     */
    public Long getMainCode() {
        return mainCode;
    }
}
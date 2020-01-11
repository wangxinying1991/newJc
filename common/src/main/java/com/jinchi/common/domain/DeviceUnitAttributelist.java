package com.jinchi.common.domain;

public class DeviceUnitAttributelist {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_unit_attributelist.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_unit_attributelist.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_unit_attributelist.att_values
     *
     * @mbggenerated
     */
    private String attValues;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_unit_attributelist.unit_code
     *
     * @mbggenerated
     */
    private Long unitCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_unit_attributelist
     *
     * @mbggenerated
     */
    public DeviceUnitAttributelist(Long code, String name, String attValues, Long unitCode) {
        this.code = code;
        this.name = name;
        this.attValues = attValues;
        this.unitCode = unitCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_unit_attributelist
     *
     * @mbggenerated
     */
    public DeviceUnitAttributelist() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_unit_attributelist.code
     *
     * @return the value of device_unit_attributelist.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_unit_attributelist.code
     *
     * @param code the value for device_unit_attributelist.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_unit_attributelist.name
     *
     * @return the value of device_unit_attributelist.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_unit_attributelist.name
     *
     * @param name the value for device_unit_attributelist.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_unit_attributelist.att_values
     *
     * @return the value of device_unit_attributelist.att_values
     *
     * @mbggenerated
     */
    public String getAttValues() {
        return attValues;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_unit_attributelist.att_values
     *
     * @param attValues the value for device_unit_attributelist.att_values
     *
     * @mbggenerated
     */
    public void setAttValues(String attValues) {
        this.attValues = attValues == null ? null : attValues.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_unit_attributelist.unit_code
     *
     * @return the value of device_unit_attributelist.unit_code
     *
     * @mbggenerated
     */
    public Long getUnitCode() {
        return unitCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_unit_attributelist.unit_code
     *
     * @param unitCode the value for device_unit_attributelist.unit_code
     *
     * @mbggenerated
     */
    public void setUnitCode(Long unitCode) {
        this.unitCode = unitCode;
    }
}
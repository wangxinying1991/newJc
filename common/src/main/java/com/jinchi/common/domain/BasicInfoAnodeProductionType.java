package com.jinchi.common.domain;

public class BasicInfoAnodeProductionType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_production_type.code
     *
     * @mbggenerated
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_production_type.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_production_type
     *
     * @mbggenerated
     */
    public BasicInfoAnodeProductionType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_production_type
     *
     * @mbggenerated
     */
    public BasicInfoAnodeProductionType() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_production_type.code
     *
     * @return the value of basic_info_anode_production_type.code
     *
     * @mbggenerated
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_production_type.code
     *
     * @param code the value for basic_info_anode_production_type.code
     *
     * @mbggenerated
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_production_type.name
     *
     * @return the value of basic_info_anode_production_type.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_production_type.name
     *
     * @param name the value for basic_info_anode_production_type.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
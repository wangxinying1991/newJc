package com.jinchi.common.domain;

public class BasicInfoAnodeProductionLine {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_production_line.code
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_production_line.name
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_production_line.flag
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    private Boolean flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_production_line
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public BasicInfoAnodeProductionLine(Integer code, String name, Boolean flag) {
        this.code = code;
        this.name = name;
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_production_line
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public BasicInfoAnodeProductionLine() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_production_line.code
     *
     * @return the value of basic_info_anode_production_line.code
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_production_line.code
     *
     * @param code the value for basic_info_anode_production_line.code
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_production_line.name
     *
     * @return the value of basic_info_anode_production_line.name
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_production_line.name
     *
     * @param name the value for basic_info_anode_production_line.name
     *
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_production_line.flag
     *
     * @return the value of basic_info_anode_production_line.flag
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_production_line.flag
     *
     * @param flag the value for basic_info_anode_production_line.flag
     * @mbggenerated Fri Dec 27 09:48:25 CST 2019
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
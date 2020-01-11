package com.jinchi.common.domain;

public class BasicInfoAnodeMaterialTypes {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_material_types.code
     *
     * @mbggenerated
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_material_types.material_name
     *
     * @mbggenerated
     */
    private String materialName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_material_types.data_type
     *
     * @mbggenerated
     */
    private Byte dataType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_material_types.process_code
     *
     * @mbggenerated
     */
    private Integer processCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column basic_info_anode_material_types.flag
     *
     * @mbggenerated
     */
    private Boolean flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_material_types
     *
     * @mbggenerated
     */
    public BasicInfoAnodeMaterialTypes(Integer code, String materialName, Byte dataType, Integer processCode, Boolean flag) {
        this.code = code;
        this.materialName = materialName;
        this.dataType = dataType;
        this.processCode = processCode;
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_material_types
     *
     * @mbggenerated
     */
    public BasicInfoAnodeMaterialTypes() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_material_types.code
     *
     * @return the value of basic_info_anode_material_types.code
     *
     * @mbggenerated
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_material_types.code
     *
     * @param code the value for basic_info_anode_material_types.code
     *
     * @mbggenerated
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_material_types.material_name
     *
     * @return the value of basic_info_anode_material_types.material_name
     *
     * @mbggenerated
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_material_types.material_name
     *
     * @param materialName the value for basic_info_anode_material_types.material_name
     *
     * @mbggenerated
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_material_types.data_type
     *
     * @return the value of basic_info_anode_material_types.data_type
     *
     * @mbggenerated
     */
    public Byte getDataType() {
        return dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_material_types.data_type
     *
     * @param dataType the value for basic_info_anode_material_types.data_type
     *
     * @mbggenerated
     */
    public void setDataType(Byte dataType) {
        this.dataType = dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_material_types.process_code
     *
     * @return the value of basic_info_anode_material_types.process_code
     *
     * @mbggenerated
     */
    public Integer getProcessCode() {
        return processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_material_types.process_code
     *
     * @param processCode the value for basic_info_anode_material_types.process_code
     *
     * @mbggenerated
     */
    public void setProcessCode(Integer processCode) {
        this.processCode = processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column basic_info_anode_material_types.flag
     *
     * @return the value of basic_info_anode_material_types.flag
     *
     * @mbggenerated
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column basic_info_anode_material_types.flag
     *
     * @param flag the value for basic_info_anode_material_types.flag
     *
     * @mbggenerated
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
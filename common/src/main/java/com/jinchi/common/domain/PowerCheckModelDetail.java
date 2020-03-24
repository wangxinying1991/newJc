package com.jinchi.common.domain;

public class PowerCheckModelDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.code
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.model_code
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private Long modelCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.place
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.check_item
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private String checkItem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.check_content
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private String checkContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.data_type
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private Byte dataType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.frequency
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private String frequency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_check_model_detail.item_code
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    private Long itemCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_check_model_detail
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public PowerCheckModelDetail(Long code, Long modelCode, String place, String checkItem, String checkContent, Byte dataType, String frequency, Long itemCode) {
        this.code = code;
        this.modelCode = modelCode;
        this.place = place;
        this.checkItem = checkItem;
        this.checkContent = checkContent;
        this.dataType = dataType;
        this.frequency = frequency;
        this.itemCode = itemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_check_model_detail
     *
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public PowerCheckModelDetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.code
     *
     * @return the value of power_check_model_detail.code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.code
     *
     * @param code the value for power_check_model_detail.code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.model_code
     *
     * @return the value of power_check_model_detail.model_code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public Long getModelCode() {
        return modelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.model_code
     *
     * @param modelCode the value for power_check_model_detail.model_code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setModelCode(Long modelCode) {
        this.modelCode = modelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.place
     *
     * @return the value of power_check_model_detail.place
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.place
     *
     * @param place the value for power_check_model_detail.place
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.check_item
     *
     * @return the value of power_check_model_detail.check_item
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public String getCheckItem() {
        return checkItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.check_item
     *
     * @param checkItem the value for power_check_model_detail.check_item
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem == null ? null : checkItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.check_content
     *
     * @return the value of power_check_model_detail.check_content
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public String getCheckContent() {
        return checkContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.check_content
     *
     * @param checkContent the value for power_check_model_detail.check_content
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent == null ? null : checkContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.data_type
     *
     * @return the value of power_check_model_detail.data_type
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public Byte getDataType() {
        return dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.data_type
     *
     * @param dataType the value for power_check_model_detail.data_type
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setDataType(Byte dataType) {
        this.dataType = dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.frequency
     *
     * @return the value of power_check_model_detail.frequency
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.frequency
     *
     * @param frequency the value for power_check_model_detail.frequency
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_check_model_detail.item_code
     *
     * @return the value of power_check_model_detail.item_code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public Long getItemCode() {
        return itemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_check_model_detail.item_code
     *
     * @param itemCode the value for power_check_model_detail.item_code
     * @mbggenerated Tue Mar 24 23:00:37 CST 2020
     */
    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }
}
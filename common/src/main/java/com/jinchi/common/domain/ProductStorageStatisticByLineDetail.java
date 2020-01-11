package com.jinchi.common.domain;

public class ProductStorageStatisticByLineDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.statistic_code
     *
     * @mbggenerated
     */
    private Long statisticCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.periods
     *
     * @mbggenerated
     */
    private Integer periods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.line_code
     *
     * @mbggenerated
     */
    private Integer lineCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.totals
     *
     * @mbggenerated
     */
    private Float totals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.ni_value
     *
     * @mbggenerated
     */
    private Float niValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.co_value
     *
     * @mbggenerated
     */
    private Float coValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_storage_statistic_by_line_detail.mn_value
     *
     * @mbggenerated
     */
    private Float mnValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_storage_statistic_by_line_detail
     *
     * @mbggenerated
     */
    public ProductStorageStatisticByLineDetail(Long code, Long statisticCode, Integer periods, Integer lineCode, Float totals, Float niValue, Float coValue, Float mnValue) {
        this.code = code;
        this.statisticCode = statisticCode;
        this.periods = periods;
        this.lineCode = lineCode;
        this.totals = totals;
        this.niValue = niValue;
        this.coValue = coValue;
        this.mnValue = mnValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_storage_statistic_by_line_detail
     *
     * @mbggenerated
     */
    public ProductStorageStatisticByLineDetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.code
     *
     * @return the value of product_storage_statistic_by_line_detail.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.code
     *
     * @param code the value for product_storage_statistic_by_line_detail.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.statistic_code
     *
     * @return the value of product_storage_statistic_by_line_detail.statistic_code
     *
     * @mbggenerated
     */
    public Long getStatisticCode() {
        return statisticCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.statistic_code
     *
     * @param statisticCode the value for product_storage_statistic_by_line_detail.statistic_code
     *
     * @mbggenerated
     */
    public void setStatisticCode(Long statisticCode) {
        this.statisticCode = statisticCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.periods
     *
     * @return the value of product_storage_statistic_by_line_detail.periods
     *
     * @mbggenerated
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.periods
     *
     * @param periods the value for product_storage_statistic_by_line_detail.periods
     *
     * @mbggenerated
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.line_code
     *
     * @return the value of product_storage_statistic_by_line_detail.line_code
     *
     * @mbggenerated
     */
    public Integer getLineCode() {
        return lineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.line_code
     *
     * @param lineCode the value for product_storage_statistic_by_line_detail.line_code
     *
     * @mbggenerated
     */
    public void setLineCode(Integer lineCode) {
        this.lineCode = lineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.totals
     *
     * @return the value of product_storage_statistic_by_line_detail.totals
     *
     * @mbggenerated
     */
    public Float getTotals() {
        return totals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.totals
     *
     * @param totals the value for product_storage_statistic_by_line_detail.totals
     *
     * @mbggenerated
     */
    public void setTotals(Float totals) {
        this.totals = totals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.ni_value
     *
     * @return the value of product_storage_statistic_by_line_detail.ni_value
     *
     * @mbggenerated
     */
    public Float getNiValue() {
        return niValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.ni_value
     *
     * @param niValue the value for product_storage_statistic_by_line_detail.ni_value
     *
     * @mbggenerated
     */
    public void setNiValue(Float niValue) {
        this.niValue = niValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.co_value
     *
     * @return the value of product_storage_statistic_by_line_detail.co_value
     *
     * @mbggenerated
     */
    public Float getCoValue() {
        return coValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.co_value
     *
     * @param coValue the value for product_storage_statistic_by_line_detail.co_value
     *
     * @mbggenerated
     */
    public void setCoValue(Float coValue) {
        this.coValue = coValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_storage_statistic_by_line_detail.mn_value
     *
     * @return the value of product_storage_statistic_by_line_detail.mn_value
     *
     * @mbggenerated
     */
    public Float getMnValue() {
        return mnValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_storage_statistic_by_line_detail.mn_value
     *
     * @param mnValue the value for product_storage_statistic_by_line_detail.mn_value
     *
     * @mbggenerated
     */
    public void setMnValue(Float mnValue) {
        this.mnValue = mnValue;
    }
}
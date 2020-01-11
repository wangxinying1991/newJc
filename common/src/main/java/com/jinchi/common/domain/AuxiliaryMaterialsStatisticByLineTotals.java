package com.jinchi.common.domain;

public class AuxiliaryMaterialsStatisticByLineTotals {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.statistic_code
     *
     * @mbggenerated
     */
    private Long statisticCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.periods
     *
     * @mbggenerated
     */
    private Integer periods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.totals
     *
     * @mbggenerated
     */
    private Float totals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.ammonia_value
     *
     * @mbggenerated
     */
    private Float ammoniaValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auxiliary_materials_statistic_by_line_totals.alkali_value
     *
     * @mbggenerated
     */
    private Float alkaliValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public AuxiliaryMaterialsStatisticByLineTotals(Long code, Long statisticCode, Integer periods, Float totals, Float ammoniaValue, Float alkaliValue) {
        this.code = code;
        this.statisticCode = statisticCode;
        this.periods = periods;
        this.totals = totals;
        this.ammoniaValue = ammoniaValue;
        this.alkaliValue = alkaliValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    public AuxiliaryMaterialsStatisticByLineTotals() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.code
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.code
     *
     * @param code the value for auxiliary_materials_statistic_by_line_totals.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.statistic_code
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.statistic_code
     *
     * @mbggenerated
     */
    public Long getStatisticCode() {
        return statisticCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.statistic_code
     *
     * @param statisticCode the value for auxiliary_materials_statistic_by_line_totals.statistic_code
     *
     * @mbggenerated
     */
    public void setStatisticCode(Long statisticCode) {
        this.statisticCode = statisticCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.periods
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.periods
     *
     * @mbggenerated
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.periods
     *
     * @param periods the value for auxiliary_materials_statistic_by_line_totals.periods
     *
     * @mbggenerated
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.totals
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.totals
     *
     * @mbggenerated
     */
    public Float getTotals() {
        return totals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.totals
     *
     * @param totals the value for auxiliary_materials_statistic_by_line_totals.totals
     *
     * @mbggenerated
     */
    public void setTotals(Float totals) {
        this.totals = totals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.ammonia_value
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.ammonia_value
     *
     * @mbggenerated
     */
    public Float getAmmoniaValue() {
        return ammoniaValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.ammonia_value
     *
     * @param ammoniaValue the value for auxiliary_materials_statistic_by_line_totals.ammonia_value
     *
     * @mbggenerated
     */
    public void setAmmoniaValue(Float ammoniaValue) {
        this.ammoniaValue = ammoniaValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auxiliary_materials_statistic_by_line_totals.alkali_value
     *
     * @return the value of auxiliary_materials_statistic_by_line_totals.alkali_value
     *
     * @mbggenerated
     */
    public Float getAlkaliValue() {
        return alkaliValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auxiliary_materials_statistic_by_line_totals.alkali_value
     *
     * @param alkaliValue the value for auxiliary_materials_statistic_by_line_totals.alkali_value
     *
     * @mbggenerated
     */
    public void setAlkaliValue(Float alkaliValue) {
        this.alkaliValue = alkaliValue;
    }
}
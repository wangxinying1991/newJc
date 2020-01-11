package com.jinchi.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GoodsInProcessStatisticHead {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.period_code
     *
     * @mbggenerated
     */
    private Integer periodCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.line_name
     *
     * @mbggenerated
     */
    private Integer lineName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.start_time
     *
     * @mbggenerated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.end_time
     *
     * @mbggenerated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_in_process_statistic_head.flag
     *
     * @mbggenerated
     */
    private Byte flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_head
     *
     * @mbggenerated
     */
    public GoodsInProcessStatisticHead(Long code, Integer periodCode, Integer lineName, Date startTime, Date endTime, Byte flag) {
        this.code = code;
        this.periodCode = periodCode;
        this.lineName = lineName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_head
     *
     * @mbggenerated
     */
    public GoodsInProcessStatisticHead() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.code
     *
     * @return the value of goods_in_process_statistic_head.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.code
     *
     * @param code the value for goods_in_process_statistic_head.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.period_code
     *
     * @return the value of goods_in_process_statistic_head.period_code
     *
     * @mbggenerated
     */
    public Integer getPeriodCode() {
        return periodCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.period_code
     *
     * @param periodCode the value for goods_in_process_statistic_head.period_code
     *
     * @mbggenerated
     */
    public void setPeriodCode(Integer periodCode) {
        this.periodCode = periodCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.line_name
     *
     * @return the value of goods_in_process_statistic_head.line_name
     *
     * @mbggenerated
     */
    public Integer getLineName() {
        return lineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.line_name
     *
     * @param lineName the value for goods_in_process_statistic_head.line_name
     *
     * @mbggenerated
     */
    public void setLineName(Integer lineName) {
        this.lineName = lineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.start_time
     *
     * @return the value of goods_in_process_statistic_head.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.start_time
     *
     * @param startTime the value for goods_in_process_statistic_head.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.end_time
     *
     * @return the value of goods_in_process_statistic_head.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.end_time
     *
     * @param endTime the value for goods_in_process_statistic_head.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_in_process_statistic_head.flag
     *
     * @return the value of goods_in_process_statistic_head.flag
     *
     * @mbggenerated
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_in_process_statistic_head.flag
     *
     * @param flag the value for goods_in_process_statistic_head.flag
     *
     * @mbggenerated
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }
}
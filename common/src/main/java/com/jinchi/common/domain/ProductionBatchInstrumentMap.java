package com.jinchi.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProductionBatchInstrumentMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.batch_code
     *
     * @mbggenerated
     */
    private Long batchCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.batch
     *
     * @mbggenerated
     */
    private String batch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.instrument_code
     *
     * @mbggenerated
     */
    private Long instrumentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.cell_num
     *
     * @mbggenerated
     */
    private String cellNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.start_time
     *
     * @mbggenerated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_batch_instrument_map.end_time
     *
     * @mbggenerated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_instrument_map
     *
     * @mbggenerated
     */
    public ProductionBatchInstrumentMap(Long code, Long batchCode, String batch, Long instrumentCode, String cellNum, Date startTime, Date endTime) {
        this.code = code;
        this.batchCode = batchCode;
        this.batch = batch;
        this.instrumentCode = instrumentCode;
        this.cellNum = cellNum;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_instrument_map
     *
     * @mbggenerated
     */
    public ProductionBatchInstrumentMap() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.code
     *
     * @return the value of production_batch_instrument_map.code
     *
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.code
     *
     * @param code the value for production_batch_instrument_map.code
     *
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.batch_code
     *
     * @return the value of production_batch_instrument_map.batch_code
     *
     * @mbggenerated
     */
    public Long getBatchCode() {
        return batchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.batch_code
     *
     * @param batchCode the value for production_batch_instrument_map.batch_code
     *
     * @mbggenerated
     */
    public void setBatchCode(Long batchCode) {
        this.batchCode = batchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.batch
     *
     * @return the value of production_batch_instrument_map.batch
     *
     * @mbggenerated
     */
    public String getBatch() {
        return batch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.batch
     *
     * @param batch the value for production_batch_instrument_map.batch
     *
     * @mbggenerated
     */
    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.instrument_code
     *
     * @return the value of production_batch_instrument_map.instrument_code
     *
     * @mbggenerated
     */
    public Long getInstrumentCode() {
        return instrumentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.instrument_code
     *
     * @param instrumentCode the value for production_batch_instrument_map.instrument_code
     *
     * @mbggenerated
     */
    public void setInstrumentCode(Long instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.cell_num
     *
     * @return the value of production_batch_instrument_map.cell_num
     *
     * @mbggenerated
     */
    public String getCellNum() {
        return cellNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.cell_num
     *
     * @param cellNum the value for production_batch_instrument_map.cell_num
     *
     * @mbggenerated
     */
    public void setCellNum(String cellNum) {
        this.cellNum = cellNum == null ? null : cellNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.start_time
     *
     * @return the value of production_batch_instrument_map.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.start_time
     *
     * @param startTime the value for production_batch_instrument_map.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_batch_instrument_map.end_time
     *
     * @return the value of production_batch_instrument_map.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_batch_instrument_map.end_time
     *
     * @param endTime the value for production_batch_instrument_map.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
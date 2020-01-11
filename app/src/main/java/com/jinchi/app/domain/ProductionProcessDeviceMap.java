package com.jinchi.app.domain;

import java.util.Date;

public class ProductionProcessDeviceMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.code
     *
     * @mbggenerated
     */
    private Long code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.process_code
     *
     * @mbggenerated
     */
    private Short processCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.process_name
     *
     * @mbggenerated
     */
    private String processName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.dept_code
     *
     * @mbggenerated
     */
    private Integer deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.device_code
     *
     * @mbggenerated
     */
    private Long deviceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.fixedassets_code
     *
     * @mbggenerated
     */
    private String fixedassetsCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.device_name
     *
     * @mbggenerated
     */
    private String deviceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.specification
     *
     * @mbggenerated
     */
    private String specification;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.ID_code
     *
     * @mbggenerated
     */
    private String idCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.start_date
     *
     * @mbggenerated
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_process_device_map.status_code
     *
     * @mbggenerated
     */
    private Integer statusCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_process_device_map
     *
     * @mbggenerated
     */
    public ProductionProcessDeviceMap(Long code, Short processCode, String processName, Integer deptCode, Long deviceCode, String fixedassetsCode, String deviceName, String specification, String idCode, Date startDate, Integer statusCode) {
        this.code = code;
        this.processCode = processCode;
        this.processName = processName;
        this.deptCode = deptCode;
        this.deviceCode = deviceCode;
        this.fixedassetsCode = fixedassetsCode;
        this.deviceName = deviceName;
        this.specification = specification;
        this.idCode = idCode;
        this.startDate = startDate;
        this.statusCode = statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_process_device_map
     *
     * @mbggenerated
     */
    public ProductionProcessDeviceMap() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.code
     *
     * @return the value of production_process_device_map.code
     * @mbggenerated
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.code
     *
     * @param code the value for production_process_device_map.code
     * @mbggenerated
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.process_code
     *
     * @return the value of production_process_device_map.process_code
     * @mbggenerated
     */
    public Short getProcessCode() {
        return processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.process_code
     *
     * @param processCode the value for production_process_device_map.process_code
     * @mbggenerated
     */
    public void setProcessCode(Short processCode) {
        this.processCode = processCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.process_name
     *
     * @return the value of production_process_device_map.process_name
     * @mbggenerated
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.process_name
     *
     * @param processName the value for production_process_device_map.process_name
     * @mbggenerated
     */
    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.dept_code
     *
     * @return the value of production_process_device_map.dept_code
     * @mbggenerated
     */
    public Integer getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.dept_code
     *
     * @param deptCode the value for production_process_device_map.dept_code
     * @mbggenerated
     */
    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.device_code
     *
     * @return the value of production_process_device_map.device_code
     * @mbggenerated
     */
    public Long getDeviceCode() {
        return deviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.device_code
     *
     * @param deviceCode the value for production_process_device_map.device_code
     * @mbggenerated
     */
    public void setDeviceCode(Long deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.fixedassets_code
     *
     * @return the value of production_process_device_map.fixedassets_code
     * @mbggenerated
     */
    public String getFixedassetsCode() {
        return fixedassetsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.fixedassets_code
     *
     * @param fixedassetsCode the value for production_process_device_map.fixedassets_code
     * @mbggenerated
     */
    public void setFixedassetsCode(String fixedassetsCode) {
        this.fixedassetsCode = fixedassetsCode == null ? null : fixedassetsCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.device_name
     *
     * @return the value of production_process_device_map.device_name
     * @mbggenerated
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.device_name
     *
     * @param deviceName the value for production_process_device_map.device_name
     * @mbggenerated
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.specification
     *
     * @return the value of production_process_device_map.specification
     * @mbggenerated
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.specification
     *
     * @param specification the value for production_process_device_map.specification
     * @mbggenerated
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.ID_code
     *
     * @return the value of production_process_device_map.ID_code
     * @mbggenerated
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.ID_code
     *
     * @param idCode the value for production_process_device_map.ID_code
     * @mbggenerated
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.start_date
     *
     * @return the value of production_process_device_map.start_date
     * @mbggenerated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.start_date
     *
     * @param startDate the value for production_process_device_map.start_date
     * @mbggenerated
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_process_device_map.status_code
     *
     * @return the value of production_process_device_map.status_code
     * @mbggenerated
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_process_device_map.status_code
     *
     * @param statusCode the value for production_process_device_map.status_code
     * @mbggenerated
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
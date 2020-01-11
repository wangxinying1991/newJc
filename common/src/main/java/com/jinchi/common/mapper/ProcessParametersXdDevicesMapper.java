package com.jinchi.common.mapper;

import com.jinchi.common.domain.ProcessParametersXdDevices;
import com.jinchi.common.domain.ProcessParametersXdDevicesExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface ProcessParametersXdDevicesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int countByExample(ProcessParametersXdDevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int deleteByExample(ProcessParametersXdDevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    @Delete({
        "delete from process_parameters_XD_devices",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    @Insert({
        "insert into process_parameters_XD_devices (process_code, device_code, ",
        "tech_parameters)",
        "values (#{processCode,jdbcType=BIGINT}, #{deviceCode,jdbcType=BIGINT}, ",
        "#{techParameters,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(ProcessParametersXdDevices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int insertSelective(ProcessParametersXdDevices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    List<ProcessParametersXdDevices> selectByExample(ProcessParametersXdDevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, process_code, device_code, tech_parameters",
        "from process_parameters_XD_devices",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ProcessParametersXdDevices selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProcessParametersXdDevices record, @Param("example") ProcessParametersXdDevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProcessParametersXdDevices record, @Param("example") ProcessParametersXdDevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProcessParametersXdDevices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_XD_devices
     *
     * @mbggenerated
     */
    @Update({
        "update process_parameters_XD_devices",
        "set process_code = #{processCode,jdbcType=BIGINT},",
          "device_code = #{deviceCode,jdbcType=BIGINT},",
          "tech_parameters = #{techParameters,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProcessParametersXdDevices record);
}
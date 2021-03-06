package com.jinchi.common.mapper;

import com.jinchi.common.domain.ProcessParametersHcDetail;
import com.jinchi.common.domain.ProcessParametersHcDetailExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface ProcessParametersHcDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int countByExample(ProcessParametersHcDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int deleteByExample(ProcessParametersHcDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    @Delete({
        "delete from process_parameters_hc_detail",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    @Insert({
        "insert into process_parameters_hc_detail (process_code, production_code, ",
        "flow_standard1, flow_bias1, ",
        "flow_standard2, flow_bias2, ",
        "rotate_speed_standard, rotate_speed_bias, ",
        "temperature_standard, temperature_bias, ",
        "basicity_standard, basicity_bias, ",
        "solid_containing_content_standard, solid_containing_content_bias, ",
        "nitrogen_flow_standard, nitrogen_flow_bias, ",
        "size_d70, size_d30_standard, ",
        "size_d30_bias, size_d90, ",
        "comment)",
        "values (#{processCode,jdbcType=BIGINT}, #{productionCode,jdbcType=SMALLINT}, ",
        "#{flowStandard1,jdbcType=REAL}, #{flowBias1,jdbcType=REAL}, ",
        "#{flowStandard2,jdbcType=REAL}, #{flowBias2,jdbcType=REAL}, ",
        "#{rotateSpeedStandard,jdbcType=INTEGER}, #{rotateSpeedBias,jdbcType=INTEGER}, ",
        "#{temperatureStandard,jdbcType=REAL}, #{temperatureBias,jdbcType=REAL}, ",
        "#{basicityStandard,jdbcType=REAL}, #{basicityBias,jdbcType=REAL}, ",
        "#{solidContainingContentStandard,jdbcType=INTEGER}, #{solidContainingContentBias,jdbcType=INTEGER}, ",
        "#{nitrogenFlowStandard,jdbcType=INTEGER}, #{nitrogenFlowBias,jdbcType=INTEGER}, ",
        "#{sizeD70,jdbcType=VARCHAR}, #{sizeD30Standard,jdbcType=REAL}, ",
        "#{sizeD30Bias,jdbcType=REAL}, #{sizeD90,jdbcType=VARCHAR}, ",
        "#{comment,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(ProcessParametersHcDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int insertSelective(ProcessParametersHcDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    List<ProcessParametersHcDetail> selectByExample(ProcessParametersHcDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, process_code, production_code, flow_standard1, flow_bias1, flow_standard2, ",
        "flow_bias2, rotate_speed_standard, rotate_speed_bias, temperature_standard, ",
        "temperature_bias, basicity_standard, basicity_bias, solid_containing_content_standard, ",
        "solid_containing_content_bias, nitrogen_flow_standard, nitrogen_flow_bias, size_d70, ",
        "size_d30_standard, size_d30_bias, size_d90, comment",
        "from process_parameters_hc_detail",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ProcessParametersHcDetail selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProcessParametersHcDetail record, @Param("example") ProcessParametersHcDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProcessParametersHcDetail record, @Param("example") ProcessParametersHcDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProcessParametersHcDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_parameters_hc_detail
     *
     * @mbggenerated
     */
    @Update({
        "update process_parameters_hc_detail",
        "set process_code = #{processCode,jdbcType=BIGINT},",
          "production_code = #{productionCode,jdbcType=SMALLINT},",
          "flow_standard1 = #{flowStandard1,jdbcType=REAL},",
          "flow_bias1 = #{flowBias1,jdbcType=REAL},",
          "flow_standard2 = #{flowStandard2,jdbcType=REAL},",
          "flow_bias2 = #{flowBias2,jdbcType=REAL},",
          "rotate_speed_standard = #{rotateSpeedStandard,jdbcType=INTEGER},",
          "rotate_speed_bias = #{rotateSpeedBias,jdbcType=INTEGER},",
          "temperature_standard = #{temperatureStandard,jdbcType=REAL},",
          "temperature_bias = #{temperatureBias,jdbcType=REAL},",
          "basicity_standard = #{basicityStandard,jdbcType=REAL},",
          "basicity_bias = #{basicityBias,jdbcType=REAL},",
          "solid_containing_content_standard = #{solidContainingContentStandard,jdbcType=INTEGER},",
          "solid_containing_content_bias = #{solidContainingContentBias,jdbcType=INTEGER},",
          "nitrogen_flow_standard = #{nitrogenFlowStandard,jdbcType=INTEGER},",
          "nitrogen_flow_bias = #{nitrogenFlowBias,jdbcType=INTEGER},",
          "size_d70 = #{sizeD70,jdbcType=VARCHAR},",
          "size_d30_standard = #{sizeD30Standard,jdbcType=REAL},",
          "size_d30_bias = #{sizeD30Bias,jdbcType=REAL},",
          "size_d90 = #{sizeD90,jdbcType=VARCHAR},",
          "comment = #{comment,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProcessParametersHcDetail record);
}
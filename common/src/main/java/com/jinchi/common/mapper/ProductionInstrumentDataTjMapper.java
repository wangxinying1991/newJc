package com.jinchi.common.mapper;

import com.jinchi.common.domain.ProductionInstrumentDataTj;
import com.jinchi.common.domain.ProductionInstrumentDataTjExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface ProductionInstrumentDataTjMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int countByExample(ProductionInstrumentDataTjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int deleteByExample(ProductionInstrumentDataTjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    @Delete({
        "delete from production_instrument_data_tj",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    @Insert({
        "insert into production_instrument_data_tj (cell_num, ph_value_min, ",
        "ph_value_max, ph_value_avg, ",
        "temperature_min, temperature_max, ",
        "temperature_avg, salt_flow1_min, ",
        "salt_flow1_max, salt_flow1_avg, ",
        "salt_flow2_min, salt_flow2_max, ",
        "salt_flow2_avg, salt_flow3_min, ",
        "salt_flow3_max, salt_flow3_avg, ",
        "salt_flow4_min, salt_flow4_max, ",
        "salt_flow4_avg, ammonia_bases1_min, ",
        "ammonia_bases1_max, ammonia_bases1_avg, ",
        "ammonia_bases2_min, ammonia_bases2_max, ",
        "ammonia_bases2_avg, ammonia_water_min, ",
        "ammonia_water_max, ammonia_water_avg, ",
        "ammonia_gas_min, ammonia_gas_max, ",
        "ammonia_gas_avg, solid_containing_content_min, ",
        "solid_containing_content_max, solid_containing_content_avg, ",
        "transducer_show_min, transducer_show_max, ",
        "transducer_show_avg, measured_3c_min, ",
        "measured_3c_max, measured_3c_avg)",
        "values (#{cellNum,jdbcType=VARCHAR}, #{phValueMin,jdbcType=REAL}, ",
        "#{phValueMax,jdbcType=REAL}, #{phValueAvg,jdbcType=REAL}, ",
        "#{temperatureMin,jdbcType=REAL}, #{temperatureMax,jdbcType=REAL}, ",
        "#{temperatureAvg,jdbcType=REAL}, #{saltFlow1Min,jdbcType=REAL}, ",
        "#{saltFlow1Max,jdbcType=REAL}, #{saltFlow1Avg,jdbcType=REAL}, ",
        "#{saltFlow2Min,jdbcType=REAL}, #{saltFlow2Max,jdbcType=REAL}, ",
        "#{saltFlow2Avg,jdbcType=REAL}, #{saltFlow3Min,jdbcType=REAL}, ",
        "#{saltFlow3Max,jdbcType=REAL}, #{saltFlow3Avg,jdbcType=REAL}, ",
        "#{saltFlow4Min,jdbcType=REAL}, #{saltFlow4Max,jdbcType=REAL}, ",
        "#{saltFlow4Avg,jdbcType=REAL}, #{ammoniaBases1Min,jdbcType=REAL}, ",
        "#{ammoniaBases1Max,jdbcType=REAL}, #{ammoniaBases1Avg,jdbcType=REAL}, ",
        "#{ammoniaBases2Min,jdbcType=REAL}, #{ammoniaBases2Max,jdbcType=REAL}, ",
        "#{ammoniaBases2Avg,jdbcType=REAL}, #{ammoniaWaterMin,jdbcType=REAL}, ",
        "#{ammoniaWaterMax,jdbcType=REAL}, #{ammoniaWaterAvg,jdbcType=REAL}, ",
        "#{ammoniaGasMin,jdbcType=REAL}, #{ammoniaGasMax,jdbcType=REAL}, ",
        "#{ammoniaGasAvg,jdbcType=REAL}, #{solidContainingContentMin,jdbcType=REAL}, ",
        "#{solidContainingContentMax,jdbcType=REAL}, #{solidContainingContentAvg,jdbcType=REAL}, ",
        "#{transducerShowMin,jdbcType=REAL}, #{transducerShowMax,jdbcType=REAL}, ",
        "#{transducerShowAvg,jdbcType=REAL}, #{measured3cMin,jdbcType=REAL}, ",
        "#{measured3cMax,jdbcType=REAL}, #{measured3cAvg,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(ProductionInstrumentDataTj record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int insertSelective(ProductionInstrumentDataTj record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    List<ProductionInstrumentDataTj> selectByExample(ProductionInstrumentDataTjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, cell_num, ph_value_min, ph_value_max, ph_value_avg, temperature_min, temperature_max, ",
        "temperature_avg, salt_flow1_min, salt_flow1_max, salt_flow1_avg, salt_flow2_min, ",
        "salt_flow2_max, salt_flow2_avg, salt_flow3_min, salt_flow3_max, salt_flow3_avg, ",
        "salt_flow4_min, salt_flow4_max, salt_flow4_avg, ammonia_bases1_min, ammonia_bases1_max, ",
        "ammonia_bases1_avg, ammonia_bases2_min, ammonia_bases2_max, ammonia_bases2_avg, ",
        "ammonia_water_min, ammonia_water_max, ammonia_water_avg, ammonia_gas_min, ammonia_gas_max, ",
        "ammonia_gas_avg, solid_containing_content_min, solid_containing_content_max, ",
        "solid_containing_content_avg, transducer_show_min, transducer_show_max, transducer_show_avg, ",
        "measured_3c_min, measured_3c_max, measured_3c_avg",
        "from production_instrument_data_tj",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ProductionInstrumentDataTj selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductionInstrumentDataTj record, @Param("example") ProductionInstrumentDataTjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductionInstrumentDataTj record, @Param("example") ProductionInstrumentDataTjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductionInstrumentDataTj record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_instrument_data_tj
     *
     * @mbggenerated
     */
    @Update({
        "update production_instrument_data_tj",
        "set cell_num = #{cellNum,jdbcType=VARCHAR},",
          "ph_value_min = #{phValueMin,jdbcType=REAL},",
          "ph_value_max = #{phValueMax,jdbcType=REAL},",
          "ph_value_avg = #{phValueAvg,jdbcType=REAL},",
          "temperature_min = #{temperatureMin,jdbcType=REAL},",
          "temperature_max = #{temperatureMax,jdbcType=REAL},",
          "temperature_avg = #{temperatureAvg,jdbcType=REAL},",
          "salt_flow1_min = #{saltFlow1Min,jdbcType=REAL},",
          "salt_flow1_max = #{saltFlow1Max,jdbcType=REAL},",
          "salt_flow1_avg = #{saltFlow1Avg,jdbcType=REAL},",
          "salt_flow2_min = #{saltFlow2Min,jdbcType=REAL},",
          "salt_flow2_max = #{saltFlow2Max,jdbcType=REAL},",
          "salt_flow2_avg = #{saltFlow2Avg,jdbcType=REAL},",
          "salt_flow3_min = #{saltFlow3Min,jdbcType=REAL},",
          "salt_flow3_max = #{saltFlow3Max,jdbcType=REAL},",
          "salt_flow3_avg = #{saltFlow3Avg,jdbcType=REAL},",
          "salt_flow4_min = #{saltFlow4Min,jdbcType=REAL},",
          "salt_flow4_max = #{saltFlow4Max,jdbcType=REAL},",
          "salt_flow4_avg = #{saltFlow4Avg,jdbcType=REAL},",
          "ammonia_bases1_min = #{ammoniaBases1Min,jdbcType=REAL},",
          "ammonia_bases1_max = #{ammoniaBases1Max,jdbcType=REAL},",
          "ammonia_bases1_avg = #{ammoniaBases1Avg,jdbcType=REAL},",
          "ammonia_bases2_min = #{ammoniaBases2Min,jdbcType=REAL},",
          "ammonia_bases2_max = #{ammoniaBases2Max,jdbcType=REAL},",
          "ammonia_bases2_avg = #{ammoniaBases2Avg,jdbcType=REAL},",
          "ammonia_water_min = #{ammoniaWaterMin,jdbcType=REAL},",
          "ammonia_water_max = #{ammoniaWaterMax,jdbcType=REAL},",
          "ammonia_water_avg = #{ammoniaWaterAvg,jdbcType=REAL},",
          "ammonia_gas_min = #{ammoniaGasMin,jdbcType=REAL},",
          "ammonia_gas_max = #{ammoniaGasMax,jdbcType=REAL},",
          "ammonia_gas_avg = #{ammoniaGasAvg,jdbcType=REAL},",
          "solid_containing_content_min = #{solidContainingContentMin,jdbcType=REAL},",
          "solid_containing_content_max = #{solidContainingContentMax,jdbcType=REAL},",
          "solid_containing_content_avg = #{solidContainingContentAvg,jdbcType=REAL},",
          "transducer_show_min = #{transducerShowMin,jdbcType=REAL},",
          "transducer_show_max = #{transducerShowMax,jdbcType=REAL},",
          "transducer_show_avg = #{transducerShowAvg,jdbcType=REAL},",
          "measured_3c_min = #{measured3cMin,jdbcType=REAL},",
          "measured_3c_max = #{measured3cMax,jdbcType=REAL},",
          "measured_3c_avg = #{measured3cAvg,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProductionInstrumentDataTj record);
}
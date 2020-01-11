package com.jinchi.common.mapper;

import com.jinchi.common.domain.BasicInfoAnodeCalculateCoefficient;
import com.jinchi.common.domain.BasicInfoAnodeCalculateCoefficientExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BasicInfoAnodeCalculateCoefficientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int countByExample(BasicInfoAnodeCalculateCoefficientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int deleteByExample(BasicInfoAnodeCalculateCoefficientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    @Delete({
        "delete from basic_info_anode_calculate_coefficient",
        "where code = #{code,jdbcType=TINYINT}"
    })
    int deleteByPrimaryKey(Byte code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    @Insert({
        "insert into basic_info_anode_calculate_coefficient (bag_weight, bowl_fill_weight, ",
        "bowl_num, burning_loss_rate, ",
        "smash_weight, presintering_weight, ",
        "second_sintering_weight, high_mixing_machine_weight, ",
        "matching_coefficient_precursors, matching_coefficient_lithium_carbonate, ",
        "matching_coefficient_hop_pocket)",
        "values (#{bagWeight,jdbcType=REAL}, #{bowlFillWeight,jdbcType=REAL}, ",
        "#{bowlNum,jdbcType=TINYINT}, #{burningLossRate,jdbcType=REAL}, ",
        "#{smashWeight,jdbcType=REAL}, #{presinteringWeight,jdbcType=REAL}, ",
        "#{secondSinteringWeight,jdbcType=REAL}, #{highMixingMachineWeight,jdbcType=REAL}, ",
        "#{matchingCoefficientPrecursors,jdbcType=REAL}, #{matchingCoefficientLithiumCarbonate,jdbcType=REAL}, ",
        "#{matchingCoefficientHopPocket,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Byte.class)
    int insert(BasicInfoAnodeCalculateCoefficient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int insertSelective(BasicInfoAnodeCalculateCoefficient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    List<BasicInfoAnodeCalculateCoefficient> selectByExample(BasicInfoAnodeCalculateCoefficientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, bag_weight, bowl_fill_weight, bowl_num, burning_loss_rate, smash_weight, ",
        "presintering_weight, second_sintering_weight, high_mixing_machine_weight, matching_coefficient_precursors, ",
        "matching_coefficient_lithium_carbonate, matching_coefficient_hop_pocket",
        "from basic_info_anode_calculate_coefficient",
        "where code = #{code,jdbcType=TINYINT}"
    })
    @ResultMap("BaseResultMap")
    BasicInfoAnodeCalculateCoefficient selectByPrimaryKey(Byte code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BasicInfoAnodeCalculateCoefficient record, @Param("example") BasicInfoAnodeCalculateCoefficientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BasicInfoAnodeCalculateCoefficient record, @Param("example") BasicInfoAnodeCalculateCoefficientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BasicInfoAnodeCalculateCoefficient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_anode_calculate_coefficient
     *
     * @mbggenerated
     */
    @Update({
        "update basic_info_anode_calculate_coefficient",
        "set bag_weight = #{bagWeight,jdbcType=REAL},",
          "bowl_fill_weight = #{bowlFillWeight,jdbcType=REAL},",
          "bowl_num = #{bowlNum,jdbcType=TINYINT},",
          "burning_loss_rate = #{burningLossRate,jdbcType=REAL},",
          "smash_weight = #{smashWeight,jdbcType=REAL},",
          "presintering_weight = #{presinteringWeight,jdbcType=REAL},",
          "second_sintering_weight = #{secondSinteringWeight,jdbcType=REAL},",
          "high_mixing_machine_weight = #{highMixingMachineWeight,jdbcType=REAL},",
          "matching_coefficient_precursors = #{matchingCoefficientPrecursors,jdbcType=REAL},",
          "matching_coefficient_lithium_carbonate = #{matchingCoefficientLithiumCarbonate,jdbcType=REAL},",
          "matching_coefficient_hop_pocket = #{matchingCoefficientHopPocket,jdbcType=REAL}",
        "where code = #{code,jdbcType=TINYINT}"
    })
    int updateByPrimaryKey(BasicInfoAnodeCalculateCoefficient record);
}
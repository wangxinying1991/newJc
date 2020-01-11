package com.jinchi.common.mapper;

import com.jinchi.common.domain.MaterialDeliveryStatisticCrystals;
import com.jinchi.common.domain.MaterialDeliveryStatisticCrystalsExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface MaterialDeliveryStatisticCrystalsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int countByExample(MaterialDeliveryStatisticCrystalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int deleteByExample(MaterialDeliveryStatisticCrystalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    @Delete({
        "delete from material_delivery_statistic_crystals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    @Insert({
        "insert into material_delivery_statistic_crystals (statistic_code, material_type_code, ",
        "material_code, material_name, ",
        "weights, ni_concentration, ",
        "co_concentration, mn_concentration, ",
        "ni_metallicity, co_metallicity, ",
        "mn_metallicity)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{materialTypeCode,jdbcType=INTEGER}, ",
        "#{materialCode,jdbcType=INTEGER}, #{materialName,jdbcType=VARCHAR}, ",
        "#{weights,jdbcType=REAL}, #{niConcentration,jdbcType=REAL}, ",
        "#{coConcentration,jdbcType=REAL}, #{mnConcentration,jdbcType=REAL}, ",
        "#{niMetallicity,jdbcType=REAL}, #{coMetallicity,jdbcType=REAL}, ",
        "#{mnMetallicity,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(MaterialDeliveryStatisticCrystals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int insertSelective(MaterialDeliveryStatisticCrystals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    List<MaterialDeliveryStatisticCrystals> selectByExample(MaterialDeliveryStatisticCrystalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, material_type_code, material_code, material_name, weights, ",
        "ni_concentration, co_concentration, mn_concentration, ni_metallicity, co_metallicity, ",
        "mn_metallicity",
        "from material_delivery_statistic_crystals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    MaterialDeliveryStatisticCrystals selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MaterialDeliveryStatisticCrystals record, @Param("example") MaterialDeliveryStatisticCrystalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MaterialDeliveryStatisticCrystals record, @Param("example") MaterialDeliveryStatisticCrystalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MaterialDeliveryStatisticCrystals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_crystals
     *
     * @mbggenerated
     */
    @Update({
        "update material_delivery_statistic_crystals",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "material_type_code = #{materialTypeCode,jdbcType=INTEGER},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "material_name = #{materialName,jdbcType=VARCHAR},",
          "weights = #{weights,jdbcType=REAL},",
          "ni_concentration = #{niConcentration,jdbcType=REAL},",
          "co_concentration = #{coConcentration,jdbcType=REAL},",
          "mn_concentration = #{mnConcentration,jdbcType=REAL},",
          "ni_metallicity = #{niMetallicity,jdbcType=REAL},",
          "co_metallicity = #{coMetallicity,jdbcType=REAL},",
          "mn_metallicity = #{mnMetallicity,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MaterialDeliveryStatisticCrystals record);
}
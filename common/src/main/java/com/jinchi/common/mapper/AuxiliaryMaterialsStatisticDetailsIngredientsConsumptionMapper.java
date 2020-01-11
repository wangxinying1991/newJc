package com.jinchi.common.mapper;

import com.jinchi.common.domain.AuxiliaryMaterialsStatisticDetailsIngredientsConsumption;
import com.jinchi.common.domain.AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int countByExample(AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int deleteByExample(AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    @Delete({
        "delete from auxiliary_materials_statistic_details_ingredients_consumption",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    @Insert({
        "insert into auxiliary_materials_statistic_details_ingredients_consumption (statistic_code, process_code, ",
        "material_code, totals, ",
        "ammonia_concentration, alkali_concentration, ",
        "ammonia_value, alkali_value)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{processCode,jdbcType=INTEGER}, ",
        "#{materialCode,jdbcType=INTEGER}, #{totals,jdbcType=REAL}, ",
        "#{ammoniaConcentration,jdbcType=REAL}, #{alkaliConcentration,jdbcType=REAL}, ",
        "#{ammoniaValue,jdbcType=REAL}, #{alkaliValue,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int insertSelective(AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    List<AuxiliaryMaterialsStatisticDetailsIngredientsConsumption> selectByExample(AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, process_code, material_code, totals, ammonia_concentration, ",
        "alkali_concentration, ammonia_value, alkali_value",
        "from auxiliary_materials_statistic_details_ingredients_consumption",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    AuxiliaryMaterialsStatisticDetailsIngredientsConsumption selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record, @Param("example") AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record, @Param("example") AuxiliaryMaterialsStatisticDetailsIngredientsConsumptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_details_ingredients_consumption
     *
     * @mbggenerated
     */
    @Update({
        "update auxiliary_materials_statistic_details_ingredients_consumption",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "process_code = #{processCode,jdbcType=INTEGER},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "totals = #{totals,jdbcType=REAL},",
          "ammonia_concentration = #{ammoniaConcentration,jdbcType=REAL},",
          "alkali_concentration = #{alkaliConcentration,jdbcType=REAL},",
          "ammonia_value = #{ammoniaValue,jdbcType=REAL},",
          "alkali_value = #{alkaliValue,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AuxiliaryMaterialsStatisticDetailsIngredientsConsumption record);
}
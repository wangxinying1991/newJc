package com.jinchi.common.mapper;

import com.jinchi.common.domain.AuxiliaryMaterialsStatisticByLineTotals;
import com.jinchi.common.domain.AuxiliaryMaterialsStatisticByLineTotalsExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface AuxiliaryMaterialsStatisticByLineTotalsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int countByExample(AuxiliaryMaterialsStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int deleteByExample(AuxiliaryMaterialsStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Delete({
        "delete from auxiliary_materials_statistic_by_line_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Insert({
        "insert into auxiliary_materials_statistic_by_line_totals (statistic_code, periods, ",
        "totals, ammonia_value, ",
        "alkali_value)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{periods,jdbcType=INTEGER}, ",
        "#{totals,jdbcType=REAL}, #{ammoniaValue,jdbcType=REAL}, ",
        "#{alkaliValue,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(AuxiliaryMaterialsStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int insertSelective(AuxiliaryMaterialsStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    List<AuxiliaryMaterialsStatisticByLineTotals> selectByExample(AuxiliaryMaterialsStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, periods, totals, ammonia_value, alkali_value",
        "from auxiliary_materials_statistic_by_line_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    AuxiliaryMaterialsStatisticByLineTotals selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AuxiliaryMaterialsStatisticByLineTotals record, @Param("example") AuxiliaryMaterialsStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AuxiliaryMaterialsStatisticByLineTotals record, @Param("example") AuxiliaryMaterialsStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AuxiliaryMaterialsStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auxiliary_materials_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Update({
        "update auxiliary_materials_statistic_by_line_totals",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "periods = #{periods,jdbcType=INTEGER},",
          "totals = #{totals,jdbcType=REAL},",
          "ammonia_value = #{ammoniaValue,jdbcType=REAL},",
          "alkali_value = #{alkaliValue,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AuxiliaryMaterialsStatisticByLineTotals record);
}
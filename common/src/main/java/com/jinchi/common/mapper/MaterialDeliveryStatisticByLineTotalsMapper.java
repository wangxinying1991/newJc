package com.jinchi.common.mapper;

import com.jinchi.common.domain.MaterialDeliveryStatisticByLineTotals;
import com.jinchi.common.domain.MaterialDeliveryStatisticByLineTotalsExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface MaterialDeliveryStatisticByLineTotalsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int countByExample(MaterialDeliveryStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int deleteByExample(MaterialDeliveryStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Delete({
        "delete from material_delivery_statistic_by_line_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Insert({
        "insert into material_delivery_statistic_by_line_totals (statistic_code, periods, ",
        "totals, ni_value, co_value, ",
        "mn_value)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{periods,jdbcType=INTEGER}, ",
        "#{totals,jdbcType=REAL}, #{niValue,jdbcType=REAL}, #{coValue,jdbcType=REAL}, ",
        "#{mnValue,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(MaterialDeliveryStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int insertSelective(MaterialDeliveryStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    List<MaterialDeliveryStatisticByLineTotals> selectByExample(MaterialDeliveryStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, periods, totals, ni_value, co_value, mn_value",
        "from material_delivery_statistic_by_line_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    MaterialDeliveryStatisticByLineTotals selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MaterialDeliveryStatisticByLineTotals record, @Param("example") MaterialDeliveryStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MaterialDeliveryStatisticByLineTotals record, @Param("example") MaterialDeliveryStatisticByLineTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MaterialDeliveryStatisticByLineTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_delivery_statistic_by_line_totals
     *
     * @mbggenerated
     */
    @Update({
        "update material_delivery_statistic_by_line_totals",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "periods = #{periods,jdbcType=INTEGER},",
          "totals = #{totals,jdbcType=REAL},",
          "ni_value = #{niValue,jdbcType=REAL},",
          "co_value = #{coValue,jdbcType=REAL},",
          "mn_value = #{mnValue,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MaterialDeliveryStatisticByLineTotals record);
}
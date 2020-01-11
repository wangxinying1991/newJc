package com.jinchi.common.mapper;

import com.jinchi.common.domain.CostAccountingStatisticTotals;
import com.jinchi.common.domain.CostAccountingStatisticTotalsExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface CostAccountingStatisticTotalsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int countByExample(CostAccountingStatisticTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int deleteByExample(CostAccountingStatisticTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    @Delete({
        "delete from cost_accounting_statistic_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    @Insert({
        "insert into cost_accounting_statistic_totals (statistic_code, periods, ",
        "material_type, element_type, ",
        "material_requisitions, current_goods_in_process, ",
        "last_goods_in_process, product_storage, ",
        "intermediate_products_variation, unit_consumption)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{periods,jdbcType=INTEGER}, ",
        "#{materialType,jdbcType=TINYINT}, #{elementType,jdbcType=TINYINT}, ",
        "#{materialRequisitions,jdbcType=REAL}, #{currentGoodsInProcess,jdbcType=REAL}, ",
        "#{lastGoodsInProcess,jdbcType=REAL}, #{productStorage,jdbcType=REAL}, ",
        "#{intermediateProductsVariation,jdbcType=REAL}, #{unitConsumption,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(CostAccountingStatisticTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int insertSelective(CostAccountingStatisticTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    List<CostAccountingStatisticTotals> selectByExample(CostAccountingStatisticTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, periods, material_type, element_type, material_requisitions, ",
        "current_goods_in_process, last_goods_in_process, product_storage, intermediate_products_variation, ",
        "unit_consumption",
        "from cost_accounting_statistic_totals",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    CostAccountingStatisticTotals selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CostAccountingStatisticTotals record, @Param("example") CostAccountingStatisticTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CostAccountingStatisticTotals record, @Param("example") CostAccountingStatisticTotalsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CostAccountingStatisticTotals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_accounting_statistic_totals
     *
     * @mbggenerated
     */
    @Update({
        "update cost_accounting_statistic_totals",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "periods = #{periods,jdbcType=INTEGER},",
          "material_type = #{materialType,jdbcType=TINYINT},",
          "element_type = #{elementType,jdbcType=TINYINT},",
          "material_requisitions = #{materialRequisitions,jdbcType=REAL},",
          "current_goods_in_process = #{currentGoodsInProcess,jdbcType=REAL},",
          "last_goods_in_process = #{lastGoodsInProcess,jdbcType=REAL},",
          "product_storage = #{productStorage,jdbcType=REAL},",
          "intermediate_products_variation = #{intermediateProductsVariation,jdbcType=REAL},",
          "unit_consumption = #{unitConsumption,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CostAccountingStatisticTotals record);
}
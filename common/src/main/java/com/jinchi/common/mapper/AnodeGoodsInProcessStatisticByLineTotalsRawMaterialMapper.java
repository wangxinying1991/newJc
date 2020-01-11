package com.jinchi.common.mapper;

import com.jinchi.common.domain.AnodeGoodsInProcessStatisticByLineTotalsRawMaterial;
import com.jinchi.common.domain.AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface AnodeGoodsInProcessStatisticByLineTotalsRawMaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int countByExample(AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int deleteByExample(AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    @Delete({
        "delete from anode_goods_in_process_statistic_by_line_totals_raw_material",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    @Insert({
        "insert into anode_goods_in_process_statistic_by_line_totals_raw_material (line_statistic_code, material_code, ",
        "periods, feedstock, ",
        "balance)",
        "values (#{lineStatisticCode,jdbcType=BIGINT}, #{materialCode,jdbcType=INTEGER}, ",
        "#{periods,jdbcType=INTEGER}, #{feedstock,jdbcType=REAL}, ",
        "#{balance,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int insertSelective(AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    List<AnodeGoodsInProcessStatisticByLineTotalsRawMaterial> selectByExample(AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, line_statistic_code, material_code, periods, feedstock, balance",
        "from anode_goods_in_process_statistic_by_line_totals_raw_material",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    AnodeGoodsInProcessStatisticByLineTotalsRawMaterial selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record, @Param("example") AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record, @Param("example") AnodeGoodsInProcessStatisticByLineTotalsRawMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table anode_goods_in_process_statistic_by_line_totals_raw_material
     *
     * @mbggenerated
     */
    @Update({
        "update anode_goods_in_process_statistic_by_line_totals_raw_material",
        "set line_statistic_code = #{lineStatisticCode,jdbcType=BIGINT},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "periods = #{periods,jdbcType=INTEGER},",
          "feedstock = #{feedstock,jdbcType=REAL},",
          "balance = #{balance,jdbcType=REAL}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AnodeGoodsInProcessStatisticByLineTotalsRawMaterial record);
}
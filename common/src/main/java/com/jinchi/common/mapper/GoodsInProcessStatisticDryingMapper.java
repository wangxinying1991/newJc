package com.jinchi.common.mapper;

import com.jinchi.common.domain.GoodsInProcessStatisticDrying;
import com.jinchi.common.domain.GoodsInProcessStatisticDryingExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface GoodsInProcessStatisticDryingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int countByExample(GoodsInProcessStatisticDryingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int deleteByExample(GoodsInProcessStatisticDryingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    @Delete({
        "delete from goods_in_process_statistic_drying",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    @Insert({
        "insert into goods_in_process_statistic_drying (code, statistic_code, ",
        "process_code, material_code, ",
        "weight, Ni_concentration, ",
        "Co_concentration, Mn_concentration, ",
        "Ni_metallicity, Co_metallicity, ",
        "Mn_metallicity)",
        "values (#{code,jdbcType=INTEGER}, #{statisticCode,jdbcType=BIGINT}, ",
        "#{processCode,jdbcType=INTEGER}, #{materialCode,jdbcType=INTEGER}, ",
        "#{weight,jdbcType=REAL}, #{niConcentration,jdbcType=REAL}, ",
        "#{coConcentration,jdbcType=REAL}, #{mnConcentration,jdbcType=REAL}, ",
        "#{niMetallicity,jdbcType=REAL}, #{coMetallicity,jdbcType=REAL}, ",
        "#{mnMetallicity,jdbcType=REAL})"
    })
    int insert(GoodsInProcessStatisticDrying record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int insertSelective(GoodsInProcessStatisticDrying record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    List<GoodsInProcessStatisticDrying> selectByExample(GoodsInProcessStatisticDryingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, process_code, material_code, weight, Ni_concentration, ",
        "Co_concentration, Mn_concentration, Ni_metallicity, Co_metallicity, Mn_metallicity",
        "from goods_in_process_statistic_drying",
        "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GoodsInProcessStatisticDrying selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GoodsInProcessStatisticDrying record, @Param("example") GoodsInProcessStatisticDryingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GoodsInProcessStatisticDrying record, @Param("example") GoodsInProcessStatisticDryingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsInProcessStatisticDrying record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_drying
     *
     * @mbggenerated
     */
    @Update({
        "update goods_in_process_statistic_drying",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "process_code = #{processCode,jdbcType=INTEGER},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "weight = #{weight,jdbcType=REAL},",
          "Ni_concentration = #{niConcentration,jdbcType=REAL},",
          "Co_concentration = #{coConcentration,jdbcType=REAL},",
          "Mn_concentration = #{mnConcentration,jdbcType=REAL},",
          "Ni_metallicity = #{niMetallicity,jdbcType=REAL},",
          "Co_metallicity = #{coMetallicity,jdbcType=REAL},",
          "Mn_metallicity = #{mnMetallicity,jdbcType=REAL}",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GoodsInProcessStatisticDrying record);
}
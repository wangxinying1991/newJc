package com.jinchi.common.mapper;

import com.jinchi.common.domain.GoodsInProcessStatisticCompound;
import com.jinchi.common.domain.GoodsInProcessStatisticCompoundExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface GoodsInProcessStatisticCompoundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int countByExample(GoodsInProcessStatisticCompoundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int deleteByExample(GoodsInProcessStatisticCompoundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    @Delete({
        "delete from goods_in_process_statistic_compound",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    @Insert({
        "insert into goods_in_process_statistic_compound (statistic_code, process_code, ",
        "material_code, volumes, ",
        "solid_containing_content, weight, ",
        "ni_concentration, co_concentration, ",
        "mn_concentration, ni_metallicity, ",
        "co_metallicity, mn_metallicity)",
        "values (#{statisticCode,jdbcType=BIGINT}, #{processCode,jdbcType=INTEGER}, ",
        "#{materialCode,jdbcType=INTEGER}, #{volumes,jdbcType=REAL}, ",
        "#{solidContainingContent,jdbcType=REAL}, #{weight,jdbcType=REAL}, ",
        "#{niConcentration,jdbcType=REAL}, #{coConcentration,jdbcType=REAL}, ",
        "#{mnConcentration,jdbcType=REAL}, #{niMetallicity,jdbcType=REAL}, ",
        "#{coMetallicity,jdbcType=REAL}, #{mnMetallicity,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Integer.class)
    int insert(GoodsInProcessStatisticCompound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int insertSelective(GoodsInProcessStatisticCompound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    List<GoodsInProcessStatisticCompound> selectByExample(GoodsInProcessStatisticCompoundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, statistic_code, process_code, material_code, volumes, solid_containing_content, ",
        "weight, ni_concentration, co_concentration, mn_concentration, ni_metallicity, ",
        "co_metallicity, mn_metallicity",
        "from goods_in_process_statistic_compound",
        "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GoodsInProcessStatisticCompound selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GoodsInProcessStatisticCompound record, @Param("example") GoodsInProcessStatisticCompoundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GoodsInProcessStatisticCompound record, @Param("example") GoodsInProcessStatisticCompoundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsInProcessStatisticCompound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_in_process_statistic_compound
     *
     * @mbggenerated
     */
    @Update({
        "update goods_in_process_statistic_compound",
        "set statistic_code = #{statisticCode,jdbcType=BIGINT},",
          "process_code = #{processCode,jdbcType=INTEGER},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "volumes = #{volumes,jdbcType=REAL},",
          "solid_containing_content = #{solidContainingContent,jdbcType=REAL},",
          "weight = #{weight,jdbcType=REAL},",
          "ni_concentration = #{niConcentration,jdbcType=REAL},",
          "co_concentration = #{coConcentration,jdbcType=REAL},",
          "mn_concentration = #{mnConcentration,jdbcType=REAL},",
          "ni_metallicity = #{niMetallicity,jdbcType=REAL},",
          "co_metallicity = #{coMetallicity,jdbcType=REAL},",
          "mn_metallicity = #{mnMetallicity,jdbcType=REAL}",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GoodsInProcessStatisticCompound record);
}
package com.jinchi.common.mapper;

import com.jinchi.common.domain.BasicInfoTechLineCellMap;
import com.jinchi.common.domain.BasicInfoTechLineCellMapExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface BasicInfoTechLineCellMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int countByExample(BasicInfoTechLineCellMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int deleteByExample(BasicInfoTechLineCellMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    @Delete({
        "delete from basic_info_tech_line_cell_map",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    @Insert({
        "insert into basic_info_tech_line_cell_map (code, line_code, ",
        "line_name, material_code, ",
        "material_name)",
        "values (#{code,jdbcType=INTEGER}, #{lineCode,jdbcType=INTEGER}, ",
        "#{lineName,jdbcType=VARCHAR}, #{materialCode,jdbcType=INTEGER}, ",
        "#{materialName,jdbcType=VARCHAR})"
    })
    int insert(BasicInfoTechLineCellMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int insertSelective(BasicInfoTechLineCellMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    List<BasicInfoTechLineCellMap> selectByExample(BasicInfoTechLineCellMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, line_code, line_name, material_code, material_name",
        "from basic_info_tech_line_cell_map",
        "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BasicInfoTechLineCellMap selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BasicInfoTechLineCellMap record, @Param("example") BasicInfoTechLineCellMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BasicInfoTechLineCellMap record, @Param("example") BasicInfoTechLineCellMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BasicInfoTechLineCellMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_tech_line_cell_map
     *
     * @mbggenerated
     */
    @Update({
        "update basic_info_tech_line_cell_map",
        "set line_code = #{lineCode,jdbcType=INTEGER},",
          "line_name = #{lineName,jdbcType=VARCHAR},",
          "material_code = #{materialCode,jdbcType=INTEGER},",
          "material_name = #{materialName,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BasicInfoTechLineCellMap record);
}
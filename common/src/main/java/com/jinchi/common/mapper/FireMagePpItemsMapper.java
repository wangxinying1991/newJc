package com.jinchi.common.mapper;

import com.jinchi.common.domain.FireMagePpItems;
import com.jinchi.common.domain.FireMagePpItemsExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface FireMagePpItemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int countByExample(FireMagePpItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int deleteByExample(FireMagePpItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    @Delete({
        "delete from fire_mage_pp_items",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    @Insert({
        "insert into fire_mage_pp_items (process_code, process_name, ",
        "product_code, product_name, ",
        "item_codes, item_names)",
        "values (#{processCode,jdbcType=INTEGER}, #{processName,jdbcType=VARCHAR}, ",
        "#{productCode,jdbcType=INTEGER}, #{productName,jdbcType=VARCHAR}, ",
        "#{itemCodes,jdbcType=VARCHAR}, #{itemNames,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Long.class)
    int insert(FireMagePpItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int insertSelective(FireMagePpItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    List<FireMagePpItems> selectByExample(FireMagePpItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, process_code, process_name, product_code, product_name, item_codes, item_names",
        "from fire_mage_pp_items",
        "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    FireMagePpItems selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FireMagePpItems record, @Param("example") FireMagePpItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FireMagePpItems record, @Param("example") FireMagePpItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FireMagePpItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_pp_items
     *
     * @mbggenerated
     */
    @Update({
        "update fire_mage_pp_items",
        "set process_code = #{processCode,jdbcType=INTEGER},",
          "process_name = #{processName,jdbcType=VARCHAR},",
          "product_code = #{productCode,jdbcType=INTEGER},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "item_codes = #{itemCodes,jdbcType=VARCHAR},",
          "item_names = #{itemNames,jdbcType=VARCHAR}",
        "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(FireMagePpItems record);
}
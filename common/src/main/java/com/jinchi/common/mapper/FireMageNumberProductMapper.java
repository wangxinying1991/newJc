package com.jinchi.common.mapper;

import com.jinchi.common.domain.FireMageNumberProduct;
import com.jinchi.common.domain.FireMageNumberProductExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface FireMageNumberProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int countByExample(FireMageNumberProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int deleteByExample(FireMageNumberProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    @Delete({
        "delete from fire_mage_number_product",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    @Insert({
        "insert into fire_mage_number_product (value, description, ",
        "enable)",
        "values (#{value,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{enable,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Integer.class)
    int insert(FireMageNumberProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int insertSelective(FireMageNumberProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    List<FireMageNumberProduct> selectByExample(FireMageNumberProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, value, description, enable",
        "from fire_mage_number_product",
        "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    FireMageNumberProduct selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FireMageNumberProduct record, @Param("example") FireMageNumberProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FireMageNumberProduct record, @Param("example") FireMageNumberProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FireMageNumberProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_product
     *
     * @mbggenerated
     */
    @Update({
        "update fire_mage_number_product",
        "set value = #{value,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "enable = #{enable,jdbcType=BIT}",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FireMageNumberProduct record);
}
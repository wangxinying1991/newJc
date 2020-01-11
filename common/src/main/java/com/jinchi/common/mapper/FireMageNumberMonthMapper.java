package com.jinchi.common.mapper;

import com.jinchi.common.domain.FireMageNumberMonth;
import com.jinchi.common.domain.FireMageNumberMonthExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface FireMageNumberMonthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int countByExample(FireMageNumberMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int deleteByExample(FireMageNumberMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    @Delete({
        "delete from fire_mage_number_month",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    @Insert({
        "insert into fire_mage_number_month (value, description, ",
        "enable)",
        "values (#{value,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{enable,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="code", before=false, resultType=Integer.class)
    int insert(FireMageNumberMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int insertSelective(FireMageNumberMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    List<FireMageNumberMonth> selectByExample(FireMageNumberMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "code, value, description, enable",
        "from fire_mage_number_month",
        "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    FireMageNumberMonth selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FireMageNumberMonth record, @Param("example") FireMageNumberMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FireMageNumberMonth record, @Param("example") FireMageNumberMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FireMageNumberMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fire_mage_number_month
     *
     * @mbggenerated
     */
    @Update({
        "update fire_mage_number_month",
        "set value = #{value,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "enable = #{enable,jdbcType=BIT}",
        "where code = #{code,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FireMageNumberMonth record);
}
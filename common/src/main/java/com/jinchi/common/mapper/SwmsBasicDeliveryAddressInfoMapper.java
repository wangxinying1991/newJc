package com.jinchi.common.mapper;

import com.jinchi.common.domain.SwmsBasicDeliveryAddressInfo;
import com.jinchi.common.domain.SwmsBasicDeliveryAddressInfoExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SwmsBasicDeliveryAddressInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int countByExample(SwmsBasicDeliveryAddressInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int deleteByExample(SwmsBasicDeliveryAddressInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    @Delete({
        "delete from SWMS_basic_delivery_address_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    @Insert({
        "insert into SWMS_basic_delivery_address_info (delivery_address_name)",
        "values (#{deliveryAddressName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SwmsBasicDeliveryAddressInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int insertSelective(SwmsBasicDeliveryAddressInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    List<SwmsBasicDeliveryAddressInfo> selectByExample(SwmsBasicDeliveryAddressInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, delivery_address_name",
        "from SWMS_basic_delivery_address_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SwmsBasicDeliveryAddressInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SwmsBasicDeliveryAddressInfo record, @Param("example") SwmsBasicDeliveryAddressInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SwmsBasicDeliveryAddressInfo record, @Param("example") SwmsBasicDeliveryAddressInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SwmsBasicDeliveryAddressInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_basic_delivery_address_info
     *
     * @mbggenerated
     */
    @Update({
        "update SWMS_basic_delivery_address_info",
        "set delivery_address_name = #{deliveryAddressName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SwmsBasicDeliveryAddressInfo record);
}
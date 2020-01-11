package com.jinchi.app.mapper;

import com.jinchi.app.domain.BasicInfoDeviceStatus;
import com.jinchi.app.domain.BasicInfoDeviceStatusExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BasicInfoDeviceStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    int countByExample(BasicInfoDeviceStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    int deleteByExample(BasicInfoDeviceStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    @Insert({
            "insert into basic_info_device_status (code, name, ",
            "color)",
            "values (#{code,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
            "#{color,jdbcType=VARCHAR})"
    })
    int insert(BasicInfoDeviceStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    int insertSelective(BasicInfoDeviceStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    List<BasicInfoDeviceStatus> selectByExample(BasicInfoDeviceStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BasicInfoDeviceStatus record, @Param("example") BasicInfoDeviceStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table basic_info_device_status
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BasicInfoDeviceStatus record, @Param("example") BasicInfoDeviceStatusExample example);

    @Select({
            "select",
            "code, name, color",
            "from basic_info_device_status",
            "where code = #{code,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BasicInfoDeviceStatus selectByPrimaryKey(Integer code);
}
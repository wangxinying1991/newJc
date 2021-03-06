package com.jinchi.app.mapper;

import com.jinchi.app.domain.DeviceRepairAccessory;
import com.jinchi.app.domain.DeviceRepairAccessoryExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeviceRepairAccessoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    int countByExample(DeviceRepairAccessoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    int deleteByExample(DeviceRepairAccessoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    @Insert({
        "insert into device_repair_accessory (code, name, ",
        "specification, counts, ",
        "repair_code, units)",
        "values (#{code,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{specification,jdbcType=VARCHAR}, #{counts,jdbcType=INTEGER}, ",
        "#{repairCode,jdbcType=BIGINT}, #{units,jdbcType=TINYINT})"
    })
    int insert(DeviceRepairAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    int insertSelective(DeviceRepairAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    List<DeviceRepairAccessory> selectByExample(DeviceRepairAccessoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeviceRepairAccessory record, @Param("example") DeviceRepairAccessoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_repair_accessory
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeviceRepairAccessory record, @Param("example") DeviceRepairAccessoryExample example);
}
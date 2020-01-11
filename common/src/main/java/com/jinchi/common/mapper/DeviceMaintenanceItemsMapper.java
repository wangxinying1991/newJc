package com.jinchi.common.mapper;

import com.jinchi.common.domain.DeviceMaintenanceItems;
import com.jinchi.common.domain.DeviceMaintenanceItemsExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeviceMaintenanceItemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    int countByExample(DeviceMaintenanceItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    int deleteByExample(DeviceMaintenanceItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    @Insert({
        "insert into device_maintenance_items (code, device_name, ",
        "maintenance_items, maintenance_content, ",
        "opt_type, maintenance_frequency)",
        "values (#{code,jdbcType=BIGINT}, #{deviceName,jdbcType=VARCHAR}, ",
        "#{maintenanceItems,jdbcType=VARCHAR}, #{maintenanceContent,jdbcType=VARCHAR}, ",
        "#{optType,jdbcType=INTEGER}, #{maintenanceFrequency,jdbcType=VARCHAR})"
    })
    int insert(DeviceMaintenanceItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    int insertSelective(DeviceMaintenanceItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    List<DeviceMaintenanceItems> selectByExample(DeviceMaintenanceItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeviceMaintenanceItems record, @Param("example") DeviceMaintenanceItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_items
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeviceMaintenanceItems record, @Param("example") DeviceMaintenanceItemsExample example);

    List<DeviceMaintenanceItems> selectByCondition(@Param("sql") String sql);
}

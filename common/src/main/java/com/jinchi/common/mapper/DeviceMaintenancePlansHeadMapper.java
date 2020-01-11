package com.jinchi.common.mapper;

import com.jinchi.common.domain.DeviceMaintenancePlansHead;
import com.jinchi.common.domain.DeviceMaintenancePlansHeadExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface DeviceMaintenancePlansHeadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    int countByExample(DeviceMaintenancePlansHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    int deleteByExample(DeviceMaintenancePlansHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    @Insert({
        "insert into device_maintenance_plans_head (code, plan_name, ",
        "device_code, fixedassets_code, ",
        "device_name, dept_code, ",
        "maint_period, plan_date, ",
        "next_date, set_date, ",
        "set_people, edit_flag, ",
        "eff_flag)",
        "values (#{code,jdbcType=BIGINT}, #{planName,jdbcType=VARCHAR}, ",
        "#{deviceCode,jdbcType=BIGINT}, #{fixedassetsCode,jdbcType=VARCHAR}, ",
        "#{deviceName,jdbcType=VARCHAR}, #{deptCode,jdbcType=INTEGER}, ",
        "#{maintPeriod,jdbcType=INTEGER}, #{planDate,jdbcType=TIMESTAMP}, ",
        "#{nextDate,jdbcType=TIMESTAMP}, #{setDate,jdbcType=TIMESTAMP}, ",
        "#{setPeople,jdbcType=INTEGER}, #{editFlag,jdbcType=INTEGER}, ",
        "#{effFlag,jdbcType=INTEGER})"
    })
    int insert(DeviceMaintenancePlansHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    int insertSelective(DeviceMaintenancePlansHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    List<DeviceMaintenancePlansHead> selectByExample(DeviceMaintenancePlansHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeviceMaintenancePlansHead record, @Param("example") DeviceMaintenancePlansHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_maintenance_plans_head
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeviceMaintenancePlansHead record, @Param("example") DeviceMaintenancePlansHeadExample example);

    List<DeviceMaintenancePlansHead> selectByCondition(@Param("sql") String sql);
}
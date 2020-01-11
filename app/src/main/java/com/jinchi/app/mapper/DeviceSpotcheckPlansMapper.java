package com.jinchi.app.mapper;

import com.jinchi.app.domain.DeviceSpotcheckPlans;
import com.jinchi.app.domain.DeviceSpotcheckPlansExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeviceSpotcheckPlansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    int countByExample(DeviceSpotcheckPlansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    int deleteByExample(DeviceSpotcheckPlansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    @Insert({
        "insert into device_spotcheck_plans (code, model_code, ",
        "device_code, fixedassets_code, ",
        "device_name, dept_code, ",
        "eff_flag)",
        "values (#{code,jdbcType=BIGINT}, #{modelCode,jdbcType=BIGINT}, ",
        "#{deviceCode,jdbcType=BIGINT}, #{fixedassetsCode,jdbcType=VARCHAR}, ",
        "#{deviceName,jdbcType=VARCHAR}, #{deptCode,jdbcType=INTEGER}, ",
        "#{effFlag,jdbcType=BIT})"
    })
    int insert(DeviceSpotcheckPlans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    int insertSelective(DeviceSpotcheckPlans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    List<DeviceSpotcheckPlans> selectByExample(DeviceSpotcheckPlansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeviceSpotcheckPlans record, @Param("example") DeviceSpotcheckPlansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_spotcheck_plans
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeviceSpotcheckPlans record, @Param("example") DeviceSpotcheckPlansExample example);

    List<DeviceSpotcheckPlans> selectByCondition(@Param("sql") String sql);
}
package com.jinchi.app.mapper;

import com.jinchi.app.domain.DevicePatrolModelsHead;
import com.jinchi.app.domain.DevicePatrolModelsHeadExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DevicePatrolModelsHeadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    int countByExample(DevicePatrolModelsHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    int deleteByExample(DevicePatrolModelsHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    @Insert({
        "insert into device_patrol_models_head (code, dept_code, ",
        "patrol_name, check_type, ",
        "set_people, tabulatedate)",
        "values (#{code,jdbcType=BIGINT}, #{deptCode,jdbcType=INTEGER}, ",
        "#{patrolName,jdbcType=VARCHAR}, #{checkType,jdbcType=BIT}, ",
        "#{setPeople,jdbcType=INTEGER}, #{tabulatedate,jdbcType=TIMESTAMP})"
    })
    int insert(DevicePatrolModelsHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    int insertSelective(DevicePatrolModelsHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    List<DevicePatrolModelsHead> selectByExample(DevicePatrolModelsHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DevicePatrolModelsHead record, @Param("example") DevicePatrolModelsHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_patrol_models_head
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DevicePatrolModelsHead record, @Param("example") DevicePatrolModelsHeadExample example);

    List<DevicePatrolModelsHead> selectByCondition(@Param("sql") String sql);
}
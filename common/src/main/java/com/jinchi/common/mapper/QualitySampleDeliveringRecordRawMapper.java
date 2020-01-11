package com.jinchi.common.mapper;

import com.jinchi.common.domain.QualitySampleDeliveringRecordRaw;
import com.jinchi.common.domain.QualitySampleDeliveringRecordRawExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface QualitySampleDeliveringRecordRawMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int countByExample(QualitySampleDeliveringRecordRawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int deleteByExample(QualitySampleDeliveringRecordRawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    @Delete({
            "delete from quality_sample_delivering_record_raw",
            "where code = #{code,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    @Insert({
            "insert into quality_sample_delivering_record_raw (sample_id, standard_id)",
            "values (#{sampleId,jdbcType=INTEGER}, #{standardId,jdbcType=INTEGER})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "code", before = false, resultType = Long.class)
    int insert(QualitySampleDeliveringRecordRaw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int insertSelective(QualitySampleDeliveringRecordRaw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    List<QualitySampleDeliveringRecordRaw> selectByExample(QualitySampleDeliveringRecordRawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "code, sample_id, standard_id",
            "from quality_sample_delivering_record_raw",
            "where code = #{code,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    QualitySampleDeliveringRecordRaw selectByPrimaryKey(Long code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QualitySampleDeliveringRecordRaw record, @Param("example") QualitySampleDeliveringRecordRawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QualitySampleDeliveringRecordRaw record, @Param("example") QualitySampleDeliveringRecordRawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QualitySampleDeliveringRecordRaw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quality_sample_delivering_record_raw
     *
     * @mbggenerated
     */
    @Update({
            "update quality_sample_delivering_record_raw",
            "set sample_id = #{sampleId,jdbcType=INTEGER},",
            "standard_id = #{standardId,jdbcType=INTEGER}",
            "where code = #{code,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(QualitySampleDeliveringRecordRaw record);
}
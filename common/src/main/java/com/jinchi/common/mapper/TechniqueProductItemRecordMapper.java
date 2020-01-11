package com.jinchi.common.mapper;

import com.jinchi.common.domain.TechniqueProductItemRecord;
import com.jinchi.common.domain.TechniqueProductItemRecordExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TechniqueProductItemRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    int countByExample(TechniqueProductItemRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    int deleteByExample(TechniqueProductItemRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    @Insert({
        "insert into technique_product_item_record (id, product_material_id, ",
        "test_item_id)",
        "values (#{id,jdbcType=INTEGER}, #{productMaterialId,jdbcType=INTEGER}, ",
        "#{testItemId,jdbcType=INTEGER})"
    })
    int insert(TechniqueProductItemRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    int insertSelective(TechniqueProductItemRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    List<TechniqueProductItemRecord> selectByExample(TechniqueProductItemRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TechniqueProductItemRecord record, @Param("example") TechniqueProductItemRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technique_product_item_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TechniqueProductItemRecord record, @Param("example") TechniqueProductItemRecordExample example);
}
package com.jinchi.common.mapper;

import com.jinchi.common.domain.ProductionBatchRuleDetail;
import com.jinchi.common.domain.ProductionBatchRuleDetailExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface ProductionBatchRuleDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    int countByExample(ProductionBatchRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    int deleteByExample(ProductionBatchRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    @Insert({
        "insert into production_batch_rule_detail (code, rule_code, ",
        "rule_value, rule_desc, ",
        "default_flag)",
        "values (#{code,jdbcType=SMALLINT}, #{ruleCode,jdbcType=TINYINT}, ",
        "#{ruleValue,jdbcType=VARCHAR}, #{ruleDesc,jdbcType=VARCHAR}, ",
        "#{defaultFlag,jdbcType=BIT})"
    })
    int insert(ProductionBatchRuleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    int insertSelective(ProductionBatchRuleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    List<ProductionBatchRuleDetail> selectByExample(ProductionBatchRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductionBatchRuleDetail record, @Param("example") ProductionBatchRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_batch_rule_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductionBatchRuleDetail record, @Param("example") ProductionBatchRuleDetailExample example);

    List selectByConditions(@Param("sql") String sql);

    ProductionBatchRuleDetail selectById(@Param("sql") String sql);
}
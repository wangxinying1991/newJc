package com.jinchi.common.mapper;

import com.jinchi.common.domain.SwmsStockOutJournalAccount;
import com.jinchi.common.domain.SwmsStockOutJournalAccountExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface SwmsStockOutJournalAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int countByExample(SwmsStockOutJournalAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int deleteByExample(SwmsStockOutJournalAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    @Delete({
        "delete from SWMS_stock_out_journal_account",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    @Insert({
        "insert into SWMS_stock_out_journal_account (material_code, created_time, ",
        "flag)",
        "values (#{materialCode,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{flag,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SwmsStockOutJournalAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int insertSelective(SwmsStockOutJournalAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    List<SwmsStockOutJournalAccount> selectByExample(SwmsStockOutJournalAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, material_code, created_time, flag",
        "from SWMS_stock_out_journal_account",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    SwmsStockOutJournalAccount selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SwmsStockOutJournalAccount record, @Param("example") SwmsStockOutJournalAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SwmsStockOutJournalAccount record, @Param("example") SwmsStockOutJournalAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SwmsStockOutJournalAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWMS_stock_out_journal_account
     *
     * @mbggenerated
     */
    @Update({
        "update SWMS_stock_out_journal_account",
        "set material_code = #{materialCode,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "flag = #{flag,jdbcType=BIT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SwmsStockOutJournalAccount record);
}
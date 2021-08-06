package org.zkz.litemall.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zkz.litemall.db.domain.LitemallKeyword;
import org.zkz.litemall.db.domain.LitemallKeywordExample;

public interface LitemallKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    long countByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int insert(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int insertSelective(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectOneByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectOneByExampleSelective(@Param("example") LitemallKeywordExample example, @Param("selective") LitemallKeyword.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    List<LitemallKeyword> selectByExampleSelective(@Param("example") LitemallKeywordExample example, @Param("selective") LitemallKeyword.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    List<LitemallKeyword> selectByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallKeyword.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
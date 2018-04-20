package com.yaojiafeng.kotlin.mybatis

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * User: yaojiafeng
 * Date: 2018/4/19
 * Time: 上午11:47
 * Description:
 */
@Mapper
interface UserMapper {

    @Select("SELECT * FROM USER WHERE USERNAME = #{username}")
    fun findByUserName(@Param("username") username: String): List<User>

    @Insert("INSERT INTO USER(USERNAME, PASSWORD) VALUES(#{username}, #{password})")
    fun insert(@Param("username") username: String, @Param("password") password: String): Int
}
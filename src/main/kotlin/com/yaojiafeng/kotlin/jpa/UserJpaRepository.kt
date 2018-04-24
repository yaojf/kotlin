package com.yaojiafeng.kotlin.jpa

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午2:19
 * Description:
 */
interface UserJpaRepository : JpaRepository<User, Long> {

    fun findByUsername(username: String): List<User>

    fun findByUsernameAndPassword(username: String, password: String?): User

    @Query("from User u where u.username=:username")
    fun findUser(@Param("username") username: String): User

}
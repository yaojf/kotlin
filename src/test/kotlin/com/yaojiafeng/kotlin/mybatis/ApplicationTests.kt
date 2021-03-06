package com.yaojiafeng.kotlin.mybatis

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * User: yaojiafeng
 * Date: 2018/4/19
 * Time: 上午11:50
 * Description:
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    val log = LoggerFactory.getLogger(ApplicationTests::class.java)!!

    @Resource
    lateinit var userMapper: UserMapper

    @Test
    fun `MyBatis  test"`() {

        log.info("查询用户名为【quanke】的用户：${userMapper.findByUserName("quanke")}")

        userMapper.insert("quanke", "123")

        log.info("查询用户名为【quanke】的用户：${userMapper.findByUserName("quanke")}")

    }

    @Autowired
    private val jdbcTemplate: JdbcTemplate? = null


    @Test
    fun `jdbc test"`() {

        val count = jdbcTemplate!!.queryForObject("select count(1) from USER", Int::class.java)
        log.info("count:" + count.toString())
    }
}
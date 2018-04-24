package com.yaojiafeng.kotlin.jpa

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 下午2:26
 * Description:
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    val log = LoggerFactory.getLogger(ApplicationTests::class.java)!!

    @Autowired
    lateinit var userJpaRepository: UserJpaRepository

    @Test
    fun `jpa test"`() {

        val username = "quanke"
        val password = "123456"

        val user = User()

        user.username = username
        user.password = password
        userJpaRepository.save(user)

        log.info("总共用户: ${userJpaRepository.count()}")

        log.info("名字为quanke的用户: ${userJpaRepository.findByUsername("quanke")}")

    }

}
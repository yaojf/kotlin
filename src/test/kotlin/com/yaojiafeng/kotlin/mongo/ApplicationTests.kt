package com.yaojiafeng.kotlin.mongo

import com.yaojiafeng.kotlin.redis.ApplicationTests
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 上午10:37
 * Description:
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    val log = LoggerFactory.getLogger(ApplicationTests::class.java)!!

    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun `redis string test"`() {
        userRepository.save(User("quanke", 30))
        userRepository.save(User("quanke.name", 40))

        log.info("数据总条数：${userRepository.count()}")

        log.info("用户名字为 quanke : ${userRepository.findByUsername("quanke")}")

        userRepository.save(userRepository.findByUsername("quanke"))
    }

}
package com.yaojiafeng.kotlin.redis

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 上午9:49
 * Description:
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTests {

    val log = LoggerFactory.getLogger(ApplicationTests::class.java)!!

    @Resource
    lateinit var stringRedisTemplate: StringRedisTemplate

    @Resource
    lateinit var redisTemplate: RedisTemplate<String, User>

    @Test
    fun `redis string test"`() {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("url", "http://quanke.name")
        log.info("全科的博客地址: ${stringRedisTemplate.opsForValue().get("url")}")
    }

    @Test
    fun `redis object test"`() {
        // 保存对象
        val user = User("超人", 20)
        redisTemplate.opsForValue().set(user.username, user)

        log.info("超人的年龄：${redisTemplate.opsForValue().get("超人").age}")
    }

}
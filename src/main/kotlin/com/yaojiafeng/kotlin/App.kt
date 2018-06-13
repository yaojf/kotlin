package com.yaojiafeng.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@SpringBootApplication(scanBasePackages = ["com.yaojiafeng.kotlin"])
@EnableMongoAuditing//用于LastModifiedDate注解解释
@EnableRedisHttpSession
open class App


fun main(args: Array<String>) {
    SpringApplication(App::class.java).run(*args)
}
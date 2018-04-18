package com.yaojiafeng.kotlin

import com.yaojiafeng.kotlin.mongo.PointRepository
import com.yaojiafeng.kotlin.mongo.Point
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@SpringBootApplication(scanBasePackages = ["com.yaojiafeng.kotlin"])
open class App

fun main(args: Array<String>) {
    val context = SpringApplication(App::class.java).run(*args)
    val mongo = context.getBean("pointRepository", PointRepository::class) as PointRepository
//    mongo.save(Point(1,1))

    val list = mongo.findByX(1)
    val list2 = mongo.findByX(1,true)
}
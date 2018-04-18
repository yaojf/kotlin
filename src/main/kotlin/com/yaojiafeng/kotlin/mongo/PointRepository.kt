package com.yaojiafeng.kotlin.mongo

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface PointRepository : MongoRepository<Point, String> {

    fun findByX(x: Int, all: Boolean): MutableList<Point>

    @Query(fields = "{'x':1}")
    fun findByX(x: Int): MutableList<Point>
}
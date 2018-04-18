package com.yaojiafeng.kotlin.mongo

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * Created with IntelliJ IDEA.
 * User: yaojiafeng
 * Date: 2018/4/13
 * Time: 下午3:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Document(collection = "point")
class Point {

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    constructor()

    var x: Int = 0
    var y: Int = 0

    @Id
    lateinit var id: String

    @CreatedDate
    lateinit var createdAt: Date
    @LastModifiedDate
    lateinit var updatedAt: Date
}
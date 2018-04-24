package com.yaojiafeng.kotlin.mongo

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 上午10:29
 * Description:
 */
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "user")
data class User(var username: String = "", val age: Int? = 0) {
    @field:Id
    lateinit var id: String// 为string自动赋值，为null判断为新数据，设置createdAt

    @CreatedDate
    lateinit var createdAt: Date

    @LastModifiedDate
    lateinit var updatedAt: Date
}

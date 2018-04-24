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
interface UserRepository : MongoRepository<User, String> {

    fun findByUsername(username: String): User

}
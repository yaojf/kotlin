package com.yaojiafeng.kotlin.redis

/**
 * User: yaojiafeng
 * Date: 2018/4/24
 * Time: 上午9:48
 * Description:
 */
import java.io.Serializable

data class User(val username: String, val age: Int?) : Serializable
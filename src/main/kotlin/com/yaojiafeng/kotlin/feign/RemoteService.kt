package com.yaojiafeng.kotlin.feign

import feign.Headers
import feign.RequestLine

/**
 * User: yaojiafeng
 * Date: 2018/4/26
 * Time: 下午5:42
 * Description:
 */
interface RemoteService {

    @Headers("Content-Type: application/json", "Accept: application/json")
    @RequestLine("GET /users/list")
    fun getOwner(user: User): User
}
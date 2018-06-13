package com.yaojiafeng.kotlin.feign

import feign.Param
import feign.RequestLine

/**
 * User: yaojiafeng
 * Date: 2018/5/25
 * Time: 下午4:47
 * Description:
 */
interface GitHub {
    // RequestLine注解声明请求方法和请求地址,可以允许有查询参数
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    fun contributors(@Param("owner") owner: String, @Param("repo") repo: String): List<Contributor>
}
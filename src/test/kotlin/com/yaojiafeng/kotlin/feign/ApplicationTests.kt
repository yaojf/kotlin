package com.yaojiafeng.kotlin.feign

import com.netflix.config.ConfigurationManager
import feign.Feign
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.ribbon.RibbonClient
import org.junit.Test

/**
 * User: yaojiafeng
 * Date: 2018/4/26
 * Time: 下午5:43
 * Description:
 */
class ApplicationTests {

    @Test
    fun test() {
        ConfigurationManager.loadPropertiesFromResources("sample-client.properties")

        val param = User()
        param.username = "scott"

        val service = Feign.builder().client(RibbonClient.create()).encoder(JacksonEncoder())
                .decoder(JacksonDecoder()).target(RemoteService::class.java, "http://sample-client/")

        /**
         * 调用测试
         */
        for (i in 1..10) {
            val result = service.getOwner(param)
            println("${result.id},${result.username}")
        }
    }
}
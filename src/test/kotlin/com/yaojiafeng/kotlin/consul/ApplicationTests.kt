package com.yaojiafeng.kotlin.consul

import org.junit.Test
import com.orbitz.consul.AgentClient
import com.orbitz.consul.Consul
import com.orbitz.consul.KeyValueClient


/**
 * User: yaojiafeng
 * Date: 2018/6/20
 * Time: 下午2:19
 * Description:
 */
class ApplicationTests {

    @Test
    fun test() {
        val consul = Consul.builder().build() // connect to Consul on localhost
        val kvClient = consul.keyValueClient()

        kvClient.putValue("foo", "bar")

        val value = kvClient.getValueAsString("foo").get() // bar
    }

}
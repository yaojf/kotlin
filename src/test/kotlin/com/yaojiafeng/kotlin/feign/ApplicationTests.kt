package com.yaojiafeng.kotlin.feign

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder
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
        val github = Feign.builder()
                .decoder(GsonDecoder())
                .encoder(GsonEncoder())
                .target(GitHub::class.java, "https://api.github.com")

        // Fetch and print a list of the contributors to this library.
        val contributors = github.contributors("OpenFeign", "feign")
        for (contributor in contributors) {
            println(contributor.login + " (" + contributor.contributions + ")")
        }
    }
}
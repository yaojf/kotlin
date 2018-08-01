package com.yaojiafeng.kotlin.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * User: yaojiafeng
 * Date: 2018/6/20
 * Time: 下午2:30
 * Description:
 */
@Controller
class IndexController {

    @RequestMapping("/")
    @ResponseBody
    fun index(): String {
        return "hello world"
    }
}
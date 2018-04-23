package com.yaojiafeng.kotlin.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.validation.Valid

/**
 * User: yaojiafeng
 * Date: 2018/4/20
 * Time: 下午5:17
 * Description:
 */
@Controller
class HelloController {

    @GetMapping("/")
    fun index(@Valid userForm: UserForm): String {
        return "index"
    }


}
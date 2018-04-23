package com.yaojiafeng.kotlin.web

import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * User: yaojiafeng
 * Date: 2018/4/21
 * Time: 下午10:25
 * Description: 注解使用必须加 get:
 */
data class UserForm(@get:NotNull(message = "{name.required}") @get:Size(min = 2, max = 5, message = "{name.size}") var name: String? = "", @get:Min(18) var age: Int? = 0)

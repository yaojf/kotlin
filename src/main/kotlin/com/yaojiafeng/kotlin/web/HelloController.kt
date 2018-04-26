package com.yaojiafeng.kotlin.web

import com.yaojiafeng.kotlin.feign.User
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes


/**
 * User: yaojiafeng
 * Date: 2018/4/20
 * Time: 下午5:17
 * Description:
 */
@Controller
class HelloController {

    @ApiOperation(value = "首页", notes = "首页")
    @ApiImplicitParam(name = "userForm", value = "用户表单", required = true, dataType = "UserForm")
    @GetMapping("/")
    fun index(@Valid userForm: UserForm): String {
        return "index"
    }


    @RequestMapping(value = "/users/list", method = arrayOf(RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT))
    @Throws(InterruptedException::class)
    @ResponseBody
    fun list(@RequestBody user: User): User {
        val request = (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes).request
        user.id = request.localPort.toLong()
        user.username = user.username?.toUpperCase()
        return user
    }
}
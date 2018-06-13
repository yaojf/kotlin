package com.yaojiafeng.kotlin.web

import org.springframework.stereotype.Controller
import javax.servlet.http.HttpSession
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest


/**
 * User: yaojiafeng
 * Date: 2018/6/13
 * Time: 下午4:41
 * Description:
 */
@Controller
class CookieController {

    @RequestMapping("/test/cookie")
    fun cookie(@RequestParam("browser") browser: String, request: HttpServletRequest, session: HttpSession): String {
        //取出session中的browser
        val sessionBrowser = session.getAttribute("browser")
        if (sessionBrowser == null) {
            println("不存在session，设置browser=$browser")
            session.setAttribute("browser", browser)
        } else {
            println("存在session，browser=" + sessionBrowser.toString())
        }
        val cookies = request.getCookies()
        if (cookies != null && cookies!!.size > 0) {
            for (cookie in cookies!!) {
                println(cookie.getName() + " : " + cookie.getValue())
            }
        }
        return "index"
    }
}
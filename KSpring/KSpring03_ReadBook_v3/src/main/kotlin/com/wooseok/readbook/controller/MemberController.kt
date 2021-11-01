package com.wooseok.readbook.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping(value = ["/member"])
class MemberController {

    @RequestMapping(value = ["/login"],method = [RequestMethod.GET])
    fun login() : String {

        return "member/login"
    }
}
package com.wooseok.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

    /**
     * Spring 일반 Controller 에서
     * method 가 문자열을 return 하면
     * view 파일을 열여서 rendering 하여 client 로 보내라
     * 
     * RESTful API 방식
     * RestController 또는 method 에 @ResponseBody 가 부착되면
     * 문자열을 그대로 client 로 보내라
     */
    @RequestMapping(value = ["/"],method = [RequestMethod.GET])
    fun home():String {
        
        return "home"
    }
}
package com.wooseok.spring.controller

import com.wooseok.spring.service.OrderService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(value = ["/order"])
class OrderController(val oService:OrderService) {

    // localhost:8080/order/ 또는
    // localhost:8080/order  요청을 모두 수용
    @RequestMapping(value = ["","/"],method = [RequestMethod.GET])
    fun list(model: Model): String {

        val salesList = oService.selectAll()
        model["SALES"] = salesList
        return "order/list"
    }
}
package com.wooseok.spring.controller

import com.wooseok.spring.ConfigData
import com.wooseok.spring.models.Buyer
import com.wooseok.spring.service.BuyerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping(value = ["/buyer"])
class BuyerController(val bService:BuyerService) {

    // @GetMapping(name = "/list")
    @RequestMapping(value = ["/list"],method = [RequestMethod.GET])
    fun list(model: Model): String {

        val buyerList = bService.selectAll()
        model["BUYERS"] = buyerList;

        return "buyer/list"
    }

    // localhost:8080/buyer/detail
    @RequestMapping(value = ["/detail"],method = [RequestMethod.GET])
    fun detail(model:Model,@RequestParam("userid") userid:String):String {

        model["BUYER"] = bService.findById(userid)
        return "buyer/detail" // detail.html 을 열어라
    }

    @RequestMapping(value = ["/insert"],method = [RequestMethod.GET])
    fun insert(): String {

//        val insertBuyer = ConfigData.BUYER_LIST[0]
//        bService.insert(insertBuyer)

        return "buyer/write"
    }
}
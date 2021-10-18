package com.wooseok.spring.service

import com.wooseok.spring.model.Buyer

interface BuyerService {

    fun selectAll():Array<Buyer>
    fun findById(id:String):Buyer
}
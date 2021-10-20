package com.wooseok.spring.service

import com.wooseok.spring.models.Buyer

interface BuyerService {

    fun selectAll(): Array<Buyer>
    fun findById(userid: String): Buyer
    fun findByName(name: String): Array<Buyer>
    fun findByTel(tel: String): Array<Buyer>

    fun insert(buyer: Buyer): Buyer
    fun delete(userid: String): Buyer
    fun update(buyer: Buyer): Buyer
}
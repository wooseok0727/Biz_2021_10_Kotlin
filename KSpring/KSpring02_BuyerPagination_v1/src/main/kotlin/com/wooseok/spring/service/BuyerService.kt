package com.wooseok.spring.service

import com.wooseok.spring.models.Buyer
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface BuyerService {

    fun selectAll(): Array<Buyer>
    
    // Pageable 을 매개변수로 받고
    // Page<T> 를 return type 으로 갖는 함수 선언
    fun selectAll(pageable: Pageable): Page<Buyer>
    
    fun findById(userid: String): Buyer
    fun findByName(name: String): Array<Buyer>
    fun findByTel(tel: String): Array<Buyer>

    fun insert(): Buyer
    fun insert(buyer: Buyer): Buyer
    fun delete(userid: String)
    fun update(buyer: Buyer): Buyer
    fun selectWithPageable(intPage: Int): Array<Buyer>


}
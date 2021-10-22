package com.wooseok.spring.service

import com.wooseok.spring.models.Sales

interface OrderService {

    fun selectAll(): Array<Sales>
    fun findById(seq: Long): Sales

    fun findByUserid(userid: String): Array<Sales>
    fun findByPName(panme: String): Array<Sales>

    // 날짜점위를 지정하여 검색하기
    fun findByDateDistance(sDate: String, eDate: String): Array<Sales>

    fun insert(sales: Sales): Sales
    fun delete(seq: Long)
    fun update(sales: Sales): Sales
}
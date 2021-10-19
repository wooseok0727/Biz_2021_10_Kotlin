package com.wooseok.spring.models

/**
 * DTO(VO) 클래스
 */
data class Buyer(
    val userid: String,
    val name: String,
    val tel: String,
    val address: String,
    val manager: String,
    val manager_tel: String,
    val buy_total : Int,
)

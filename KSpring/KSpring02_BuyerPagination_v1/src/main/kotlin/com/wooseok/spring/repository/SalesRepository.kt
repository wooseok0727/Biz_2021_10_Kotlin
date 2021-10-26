package com.wooseok.spring.repository

import com.wooseok.spring.models.Buyer
import com.wooseok.spring.models.Sales
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

// Repository 인터페이스 생성
// JpaRepository 를 상속받고 데이터 DTO 와 테이블의 PK 값을
// Generic 으로 설정해 준다
interface SalesRepository:JpaRepository<Sales,Long> {

    fun findByUserid(userid: String): Array<Sales>
    fun findByPname(pname: String): Array<Sales>

}
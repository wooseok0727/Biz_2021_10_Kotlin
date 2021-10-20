package com.wooseok.spring.repository

import com.wooseok.spring.models.Buyer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// 현재 BuyerRepository interface 를 bean 으로 등록하라
// @Repository 는 선택적인 option 이다
@Repository
interface BuyerRepository:JpaRepository<Buyer,String> {

    /**
     * JpaRepository 를 상속받은 Repository 에서
     * 기본 CRUD 외에 다른 칼럼으로 조회하는 method 를 추가할 수 있다
     * 단, 조건이 있다
     * findBy 로 시작해야 한다
     * data(Entity) 클래스에 정의된 멤버 변수 이름만 설정이 가능하다
     */
    fun findByName(name: String): Array<Buyer>
    fun findByTel(tel: String): Array<Buyer>
    
    // fun findByUserName(userName: String): Array<Buyer> : 정의된 멤버변수가 아니므로 error 
}
package com.wooseok.spring.service.impl

import com.wooseok.spring.model.Buyer
import com.wooseok.spring.service.BuyerService
import org.springframework.stereotype.Service
import kotlin.random.Random

/**
 * BuyerService interface 를 implement 하여 클래스 선언
 */
@Service
class BuyerServiceImpl : BuyerService {

    /**
     * Kotlin 클래스 내에서 선언되며
     * 클래스가 작동되는데 필요한 필수 데이터나
     * 어떤 옵션을 초기화 하는 초기화 블럭 객체체     */
    companion object {

        val rnd:Random = Random(System.currentTimeMillis())
//        // Map 데이터 생성하기
//        val name = Pair("name" , "홍길동")
//        val id = Pair("id", "user")
//        val age = Pair("age",30)

        /**
         * Buyer DTO 를 사용하여 3명의 데이터를 선언하고
         * List 배열로 생성하였다
         */
        val userList = arrayOf(
            Buyer(id="admin", name="홍길동", age=30),
            Buyer(id="user", name="이몽룡", age=22),
            Buyer(id="test", name="성춘향", age=16),
        )
    }

    override fun selectAll():Array<Buyer> {
        return userList
    }

    override fun findById(id: String):Buyer {

        val num = rnd.nextInt(userList.size)
        return userList[num]
    }
}
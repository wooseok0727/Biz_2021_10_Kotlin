package com.wooseok.spring.service.impl

import com.wooseok.spring.ConfigData
import com.wooseok.spring.models.Buyer
import com.wooseok.spring.repository.BuyerRepository
import com.wooseok.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random


/**
 * 클래스의 매개변수를 사용하여 생성자 주입하기
 * class 클래스네임 ( 주입받을 객체, 변수 선언 )
 */
@Service("bServiceV1")
class BuyerServiceImplV1(val bRepo:BuyerRepository) : BuyerService {

    // setter 주입으로 와이어링 하기
//    @Autowired
//    private lateinit var bDao : BuyerRepository

    override fun selectAll(): Array<Buyer> {
        return bRepo.findAll().toTypedArray()
    }

    override fun selectWithPageable(intPage: Int): Array<Buyer> {
        // PageRequest.of(몇페이지, 몇개)
        val pageRequest = PageRequest.of(intPage,10)
        return bRepo.findWithPagination(pageRequest).toTypedArray()
    }

    override fun findById(userid: String): Buyer {
        // repository 의 findById() 는
        // 실제 데이터(Buyer)를 Optional 이라는 특별한 객체로
        // wrapping 하여 가져온다
        // 필요한 데이터는 .get() method 를 사용하여
        // 한번 더 추출해 주어야 한다
        val buyer:Optional<Buyer> = bRepo.findById(userid)
        return buyer.get()
        // return bRepo.getById(userid)
    }

    override fun findByName(name: String): Array<Buyer> {
        return bRepo.findByName(name)
    }

    override fun findByTel(tel: String): Array<Buyer> {
        return bRepo.findByTel(tel)
    }

    override fun insert(buyer: Buyer): Buyer {
        // Insert Or Update
        return bRepo.save(buyer);
    }

    override fun delete(userid: String) {
        bRepo.deleteById(userid)
    }

    override fun update(buyer: Buyer): Buyer {
        return bRepo.save(buyer)
    }




}
package com.wooseok.spring.service.impl

import com.wooseok.spring.ConfigData
import com.wooseok.spring.models.Buyer
import com.wooseok.spring.repository.BuyerRepository
import com.wooseok.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
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

    override fun findById(userid: String): Buyer {

//        val findUser = ConfigData.BUYER_LIST.filter { it.userid == userid }
//        return findUser[0]
        return bRepo.getById(userid)
    }

    override fun findByName(name: String): Array<Buyer> {

        val userNum = ConfigData.RND.nextInt(ConfigData.BUYER_LIST.size)
        return arrayOf(ConfigData.BUYER_LIST[userNum])
    }

    override fun findByTel(tel: String): Array<Buyer> {
        TODO("Not yet implemented")
    }

    override fun insert(buyer: Buyer): Buyer {

        // Insert Or Update
        return bRepo.save(buyer);
    }

    override fun delete(userid: String): Buyer {
        TODO("Not yet implemented")
    }

    override fun update(buyer: Buyer): Buyer {
        TODO("Not yet implemented")
    }


}
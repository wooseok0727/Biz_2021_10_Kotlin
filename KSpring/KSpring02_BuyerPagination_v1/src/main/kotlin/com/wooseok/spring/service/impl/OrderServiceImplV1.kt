package com.wooseok.spring.service.impl

import com.wooseok.spring.models.Sales
import com.wooseok.spring.repository.SalesRepository
import com.wooseok.spring.service.OrderService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

// Repo = Dao
@Service("oServiceV1")
class OrderServiceImplV1(val sRepo:SalesRepository):OrderService {

    override fun selectAll(): Array<Sales> {
        return sRepo.findAll().toTypedArray()
    }

    override fun selectAll(pageable: Pageable): Page<Sales> {
        return sRepo.findAll(pageable)
    }

    override fun findById(seq: Long): Sales {
        return sRepo.findById(seq).get()
    }

    override fun findByUserid(userid: String): Array<Sales> {
        return sRepo.findByUserid(userid)
    }

    override fun findByPName(panme: String): Array<Sales> {
        return sRepo.findByPname(panme)
    }

    override fun findByDateDistance(sDate: String, eDate: String): Array<Sales> {
        TODO("Not yet implemented")
    }

    override fun insert(sales: Sales): Sales {
        return sRepo.save(sales)
    }

    override fun delete(seq: Long) {
        sRepo.deleteById(seq)
    }

    override fun update(sales: Sales): Sales {
        return sRepo.save(sales)
    }


}
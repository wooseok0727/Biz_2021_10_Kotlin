package com.wooseok.readbook.service.impl

import com.wooseok.readbook.models.ReadBook
import com.wooseok.readbook.repository.ReadBookRepository
import com.wooseok.readbook.service.ReadBookService
import org.springframework.stereotype.Service

@Service("rServiceV1")
class ReadBookServiceImplV1(val rRepo: ReadBookRepository): ReadBookService {

    override fun selectAll(): Array<ReadBook> {
        TODO("Not yet implemented")
    }

    override fun insert(readBook: ReadBook): ReadBook {
        return rRepo.save(readBook)
    }

    override fun delete(seq: Long) {
        TODO("Not yet implemented")
    }

    override fun update(readBook: ReadBook): ReadBook {
        TODO("Not yet implemented")
    }
}
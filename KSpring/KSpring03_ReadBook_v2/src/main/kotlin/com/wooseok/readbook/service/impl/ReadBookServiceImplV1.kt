package com.wooseok.readbook.service.impl

import com.wooseok.readbook.models.BookDTO
import com.wooseok.readbook.models.ReadBookDTO
import com.wooseok.readbook.models.ReadBookVO
import com.wooseok.readbook.repository.BookRepository
import com.wooseok.readbook.repository.ReadBookRepository
import com.wooseok.readbook.service.ReadBookService
import org.springframework.stereotype.Service

@Service("readBookServiceV1")
class ReadBookServiceImplV1(val readBookRepo:ReadBookRepository,val bookRepo:BookRepository):ReadBookService {

    override fun readBookInsert(readBook:ReadBookDTO,book: BookDTO) {

        readBookRepo.save(readBook)
        bookRepo.save(book)
    }
}
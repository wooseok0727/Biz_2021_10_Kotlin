package com.wooseok.readbook.service

import com.wooseok.readbook.models.BookDTO
import com.wooseok.readbook.models.ReadBookDTO
import com.wooseok.readbook.models.ReadBookVO

interface ReadBookService {

    fun readBookInsert(readBook: ReadBookDTO, book: BookDTO)
}
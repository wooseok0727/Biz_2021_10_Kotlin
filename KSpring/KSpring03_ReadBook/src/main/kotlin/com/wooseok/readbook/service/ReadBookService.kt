package com.wooseok.readbook.service

import com.wooseok.readbook.models.ReadBook

interface ReadBookService {

    fun selectAll(): Array<ReadBook>

    fun insert(readBook: ReadBook): ReadBook
    fun delete(seq: Long)
    fun update(readBook: ReadBook): ReadBook
}
package com.wooseok.readbook.service

import com.wooseok.readbook.models.Book

interface BookService {

    fun selectAll(): Array<Book>

    fun insert(book: Book): Book
    fun delete(ISBN: String)
    fun update(book: Book): Book
}
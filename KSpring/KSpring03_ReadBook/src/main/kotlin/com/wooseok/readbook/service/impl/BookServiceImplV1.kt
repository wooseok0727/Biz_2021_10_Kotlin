package com.wooseok.readbook.service.impl

import com.wooseok.readbook.models.Book
import com.wooseok.readbook.repository.BookRepository
import com.wooseok.readbook.service.BookService
import org.springframework.stereotype.Service

@Service("bServiceV1")
class BookServiceImplV1(val bRepo:BookRepository) : BookService {

    override fun selectAll(): Array<Book> {
        TODO("Not yet implemented")
    }

    override fun insert(book: Book): Book {
        return bRepo.save(book)
    }

    override fun delete(ISBN: String) {
        TODO("Not yet implemented")
    }

    override fun update(book: Book): Book {
        TODO("Not yet implemented")
    }
}
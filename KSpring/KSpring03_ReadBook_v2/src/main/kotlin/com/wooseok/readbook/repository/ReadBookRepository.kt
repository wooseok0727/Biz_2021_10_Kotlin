package com.wooseok.readbook.repository

import com.wooseok.readbook.models.BookDTO
import com.wooseok.readbook.models.ReadBookDTO
import org.springframework.data.jpa.repository.JpaRepository

interface ReadBookRepository:JpaRepository<ReadBookDTO,Long> {}
interface BookRepository:JpaRepository<BookDTO,String> {}
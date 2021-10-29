package com.wooseok.readbook.controller

import com.wooseok.readbook.config.logger
import com.wooseok.readbook.models.BookDTO
import com.wooseok.readbook.models.ReadBookDTO
import com.wooseok.readbook.models.ReadBookVO
import com.wooseok.readbook.repository.BookRepository
import com.wooseok.readbook.repository.ReadBookRepository
import com.wooseok.readbook.service.ReadBookService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class ReadBookController(
    val rbService: ReadBookService) {

    @RequestMapping(value = ["/",""],method = [RequestMethod.GET])
    fun home() : String {
        return "redirect:/write"
    }

    @RequestMapping(value = ["/write"],method = [RequestMethod.GET])
    fun insert() : String {
        return "readbook/write"
    }

    @RequestMapping(value = ["/write"],method = [RequestMethod.POST])
    fun insert(readBook: ReadBookVO,readBookDTO: ReadBookDTO,bookDTO: BookDTO) : String {

        logger().debug(""">
            수신한 데이터 : 
            {}""", readBook.toString())

//        val readBookDTO = ReadBookDTO(0,readBook.isbn,readBook.title)
//        val bookDTO = BookDTO(readBook.isbn,readBook.title)

        rbService.readBookInsert(readBookDTO,bookDTO)

        return "redirect:/write"

    }
}
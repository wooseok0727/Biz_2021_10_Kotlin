package com.wooseok.readbook.controller

import com.wooseok.readbook.models.Book
import com.wooseok.readbook.models.ReadBook
import com.wooseok.readbook.service.BookService
import com.wooseok.readbook.service.ReadBookService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(value = ["/read"])
class ReadBookController(val bService: BookService,val rService: ReadBookService) {

    @RequestMapping(value = ["/insert"],method = [RequestMethod.GET])
    fun insert(model: Model): String {
        
        model["BOOK"] = Book()
        model["READBOOK"] = ReadBook()

        return "read/write"
    }

    @RequestMapping(value = ["/insert"],method = [RequestMethod.POST])
    fun insert(model: Model,book: Book,readBook: ReadBook): String {

        bService.insert(book);
        rService.insert(readBook)

        return "redirect:/read/insert"
    }
}


package com.wooseok.readbook.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name= "tbl_book", schema = "readbookDB")
data class Book(

    @Id
    @Column(columnDefinition = "CHAR(13)")
    var ISBN:String? = null,

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    var title:String? = null,

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    var comp:String? = null,

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    var author:String? = null,

    @Column(nullable = false)
    var price:Int? = null
)

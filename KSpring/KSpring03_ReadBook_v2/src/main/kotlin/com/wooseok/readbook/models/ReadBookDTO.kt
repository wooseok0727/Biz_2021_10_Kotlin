package com.wooseok.readbook.models

import javax.persistence.*

@Entity
@Table(name = "tbl_readbooks")
data class ReadBookDTO(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seq:Long? = 0L,

    @Column(columnDefinition = "VARCHAR(13)",nullable = false)
    var isbn:String,

    var title:String? = null,

    var sDate:String? = null,
    var sTime:String? = null,
    var eTime:String? = null,

    var subject:String? = null,
    var content:String? = null
)

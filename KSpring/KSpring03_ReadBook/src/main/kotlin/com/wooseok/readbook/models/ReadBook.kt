package com.wooseok.readbook.models

import javax.persistence.*

@Entity
@Table(name = "tbl_readBook", schema = "readbookDB")
data class ReadBook(

    @Id
    @Column(columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seq: Long = 1,

    @Column(columnDefinition = "CHAR(13)",nullable = false)
    var ISBN: String? = null,

    @Column(columnDefinition = "VARCHAR(10)",nullable = false)
    var rdate: String? = null,

    @Column(columnDefinition = "VARCHAR(10)",nullable = false)
    var stime: String? = null,

    @Column(columnDefinition = "VARCHAR(10)",nullable = true)
    var etime: String? = null,

    @Column(nullable = true)
    var rating: Int? = null,

    @Column(nullable = true)
    var comment: String? = null
)

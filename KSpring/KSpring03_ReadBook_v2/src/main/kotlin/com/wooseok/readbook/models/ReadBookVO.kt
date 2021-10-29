package com.wooseok.readbook.models

data class ReadBookVO(

    var isbn:String,
    var title:String,

    var sDate:String,
    var sTime:String,
    var eTime:String,

    var subject:String,
    var content:String
)

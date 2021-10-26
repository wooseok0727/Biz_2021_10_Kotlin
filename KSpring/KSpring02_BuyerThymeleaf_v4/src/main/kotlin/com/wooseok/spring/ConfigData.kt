package com.wooseok.spring

import com.wooseok.spring.models.Buyer
import kotlin.random.Random

class ConfigData {

    // public static final String APP_NAME = "나라상사 고객관리"
    // System.out.println( ConfigString.APP_NAME )
    // java static 키워드와 유사한 역할을 하는 객체
    companion object {
        const val APP_NAME = "나라상사 고객관리"
        const val APP_VERSION = "2021 v2"
        val RND: Random = Random(System.currentTimeMillis())
        val BUYER_LIST = arrayOf(
            Buyer(
                userid = "B001",
                name = "홍길동",
                address = "서울시",
                tel = "02-111-9999",
                manager = "이몽룡",
                manager_tel = "010-111-1111",
                buy_total = 10000
            ),
            Buyer(
                userid = "B002",
                name = "성춘향",
                address = "남원시",
                tel = "042-111-2222",
                manager = "월매",
                manager_tel = "010-222-1111",
                buy_total = 20000
            ),
            Buyer(
                userid = "B003",
                name = "임꺽정",
                address = "광주시",
                tel = "062-111-2222",
                manager = "아무개",
                manager_tel = "010-322-3311",
                buy_total = 30000
            ),
        )

    }
}
package com.wooseok.spring.models

import java.lang.reflect.Constructor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * DTO(VO) 클래스
 *
 * data class 를 사용하여 객체를 생성할 때
 * val buyer = Buyer(각 속성의 초기값) 처럼 초기값을 강제로 지정해야 한다
 * 
 * data class 를 사용하여 객체를 생성할 때
 *  때로는 요소값이 필요없는 빈(blank) 객체가 필요할 때도 있다
 *  이때를 대비하여
 *  각 속성(멤버) 변수에는 null 을 지정한다
 *  속성에 null 값을 지정하는 방법은 
 *  var 변수명? = null 형식으로 지정한다
 *
 *  val buyer = Buyer()
 *
 */

@Entity
@Table(name = "tbl_buyer", schema = "naraDB")
data class Buyer(

    @Id
    @Column(
        columnDefinition = "CHAR(4)",
        nullable = false, // NOT NULL
        unique = true, // UNIQUE
        name = "userid"
    )
    var userid: String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    var name: String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = true)
    var tel: String? = null,

    @Column(nullable = true)
    var address: String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = true)
    var manager: String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = true)
    var manager_tel: String? = null,

    @Column(nullable = true)
    var buy_total: Int? = null
)

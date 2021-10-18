package com.wooseok.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * web.xml 파일을 대신하는 boot 클래스
 */
@SpringBootApplication
class KSpringApplication

/**
 * Spring boot project 를 start 하는 함수
 */
fun main(args: Array<String>) {
	runApplication<KSpringApplication>(*args)
}

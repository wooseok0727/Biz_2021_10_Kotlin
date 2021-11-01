package com.wooseok.readbook.service

import com.wooseok.readbook.models.MemberVO
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

/**
 * Security Login Service 클래스
 * ( *UserDetailsService )
 *
 * Security Login Service UserDetailsService 를 상속받는다
 */
@Service
class MemberLoginService : UserDetailsService {

    // 가상의 member list 생성해 두기
    private val userList = listOf(
        MemberVO(username = "aaaaa", password = "12345"),
        MemberVO(username = "bbbbb", password = "12345"),
        MemberVO(username = "ccccc", password = "12345"),
    )

    // findByUserName(username) : UserDetails
    override fun loadUserByUsername(username: String?): UserDetails {

        // 배열.find {} : 배열의 요소중 원하는 값이 담겨 있는가?
        // 담겨 있으면 해당 값을 return 하고, 없으면 null return
        return userList.find { it.username == username }
            ?: throw UsernameNotFoundException("사용자 ID가 없습니다")
    }
}
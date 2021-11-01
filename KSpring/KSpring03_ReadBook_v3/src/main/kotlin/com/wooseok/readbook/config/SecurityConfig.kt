package com.wooseok.readbook.config

import org.springframework.boot.SpringBootConfiguration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

// 프로젝트 설정을 위한 클래스다
@SpringBootConfiguration
// 프로젝트에 Spring Security 설정을 추가한다
// Spring Security 를 Customizing 하겠다
@EnableWebSecurity
class SecurityConfig:WebSecurityConfigurerAdapter() {

    /**
     * 인증절차를 수행하는 policy 설정
     */
    override fun configure(http: HttpSecurity?) {

        // client 로부터 전달된 Request 가 인가된 요청인가를 확인하겠다
//        http?.authorizeRequests()
//            ?.antMatchers("/member/mypage")?.authenticated()
//        http?.authorizeRequests()
//            ?.antMatchers("/**")?.permitAll()

        // antMatchers(), mvcMatcher() 등은
        // authorizeRequests() 함수와 chaining 관계에 있는 함수들이다
        // authorizeRequests() 함수 아래에 다수의 antMatchers() 를
        // 계속해서 추가 할 수 있다
        http?.authorizeRequests()
            // member/mypage 로 req(요청)이 오면 인증절차를 수행하라
            ?.antMatchers("/member/mypage")?.authenticated()
            ?.antMatchers("/**")?.permitAll()

        // 단독으로 사용되는 method 함수들은
        // http.함수() 형식으로 사용한다
        // http?.httpBasic()
        // http?.formLogin()

        // 단독으로 사용되는 method 함수들을
        // chaining 방식으로 사용할때는 and() 함수로 연결해 준다
        //  ?.and()?.httpBasic() // popup 로그인
            ?.and()?.formLogin() // form 로그인
            // security 기본 form 화면을 보이는 대신
            // custom login page 로 redirect
            ?.loginPage("/member/login")
            // custom login form 의 action 과 같은 Url 을 지정
            ?.loginProcessingUrl("/login")
            ?.usernameParameter("userid")
            ?.passwordParameter("password")
    } // config(http)

    override fun configure(auth: AuthenticationManagerBuilder?) {

        auth?.inMemoryAuthentication()
            ?.withUser("bbbbb")
            ?.password("{noop}12345")
            ?.roles("USER","ADMIN")
    }
}
package com.wooseok.readbook.config

import com.wooseok.readbook.service.MemberLoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

// 프로젝트 설정을 위한 클래스다
@SpringBootConfiguration
// 프로젝트에 Spring Security 설정을 추가한다
// Spring Security 를 Customizing 하겠다
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

//    @Autowired
//    lateinit var mService : MemberLoginService

    override fun configure(web: WebSecurity?) {
        web?.ignoring()
            ?.antMatchers(
                "/static/**",
                "/static/css/**",
                "/static/js/**",
                "/static/images/**",
                "*.ico",
                "*.txt")
            ?.and()?.ignoring()
            ?.requestMatchers(PathRequest.toStaticResources().atCommonLocations())
    }

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
            ?.antMatchers("/home/merry")?.authenticated()
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
            ?.and()?.logout()
            ?.logoutRequestMatcher(AntPathRequestMatcher("/logout"))
            ?.logoutSuccessUrl("/member/mypage")
    } // config(http) end

    /**
     * "{noop}12345"
     * Spring Security 에서 제공하는 password 정책
     * 5.x 버전이상에서는 의무적으로 password 를 DB 에 저장하거나
     * 비교연산등을 할 때 반드시 암호화를 하도록 강제하고 있다
     *
     * 아직 암호화를 구현하지 않은 상태에서 테스트를 하기 위해서
     * 임시로 암호화 되지 않은 비밀번호를 사용해서
     * 비밀번호 비교를 하겠다 라는 의미의 메시지
     */
    override fun configure(auth: AuthenticationManagerBuilder?) {

//        auth?.inMemoryAuthentication()
//            ?.withUser("bbbbb")
//            ?.password("{noop}12345")
//            ?.roles("USER","ADMIN")

        // userDetailsService 인터페이스를 상속받은
        // MemberLoginService 클래스의 객체를 건네주고
        // 회원 정보 인증할 때 사용하라
        // MemberLoginService.loadUserByUsername() 함수를 실행하여
        // 사용자 정보를 달라
        auth?.userDetailsService(MemberLoginService())
            // auth 에 담긴 사용자정보에서 password 항목을 찾아서
            // CustomPasswordEncoder() 에게 보내서
            // 비밀번호가 맞는디 검사하라
            ?.passwordEncoder(CustomPasswordEncoder())
    }
}

class CustomPasswordEncoder : PasswordEncoder {
    override fun encode(plan: CharSequence?): String {
        return plan.toString()
    }

    override fun matches(plan: CharSequence?, crytp: String?): Boolean {
        return true
    }

}
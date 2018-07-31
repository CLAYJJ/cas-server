package com.sso.cas.server.config;

import com.sso.cas.server.service.CasUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 *
 * spring security config
 * @Author luo jiajia
 * @Date 2018/7/15 0015 下午 12:36
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CasUserInterface casUserInterface;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(s -> casUserInterface.findUserByname(s)).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/druid/*", "/casUser/loginPage", "/js/**", "/css/**", "/image/**").permitAll().anyRequest().authenticated()
                .and().formLogin().loginPage("/casUser/loginPage").failureForwardUrl("/casUser/loginPage?msg=loginfailure")
        .successForwardUrl("/casUser/login");
        http.csrf().ignoringAntMatchers("/druid/*");
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/css/**,/js/**");
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

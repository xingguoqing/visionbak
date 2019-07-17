//package com.xinggq.security.config;
//
//import com.xinggq.security.common.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
///**
// * @author xinggq
// * @date 2019-07-01 09:34
// * @description
// */
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    super.configure(http);
//  }
//
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth
//        .inMemoryAuthentication()
//        .withUser("root")
//        .password("root")
//        .roles("USER");
//  }
//
//
//  @Bean
//  public UserDetailsService systemUserService() {
//    return new UserService();
//  }
//}

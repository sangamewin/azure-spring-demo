//package com.example.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//
////@Configuration
//public class BasicAuthWebSecurityConfiguration {
////
////    @Autowired
////    private BasicAuthenticationEntryPoint authenticationEntryPoint;
////
////
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/public").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .httpBasic()
////                .authenticationEntryPoint(authenticationEntryPoint);
////        return http.build();
////    }
////
////  //  @Bean
//////    public InMemoryUserDetailsManager userDetailsService() {
//////        UserDetails user = User
//////                .withUsername("user")
//////                .password(passwordEncoder().encode("password"))
//////                .roles("USER_ROLE")
//////                .build();
//////        return new InMemoryUserDetailsManager(user);
//////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder(8);
////    }
//}

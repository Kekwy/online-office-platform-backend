package com.kekwy.oopt.server.config.security;

import com.kekwy.oopt.server.service.ITAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private ITAdminService adminService;

    @Autowired
    private RestAuthorizationEntryPoint restAuthorizationEntryPoint;

    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                // 基于 token，不需要 session
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                // 允许登录访问
                .authorizeHttpRequests().requestMatchers(
                        "/login",
                        "/logout",
                        "/css/**",
                        "/js/**",
                        "/index.html",
                        "favicon.ico",
                        "/doc.html",
                        "/webjars/**",
                        "/swagger-resources/**",
                        "/v3/api-docs/**",
                        "/captcha"
                        ).permitAll()
                // 除了上面，所有请求都要拦截
                .anyRequest().authenticated()
                .and()
                // 禁用缓存
                .headers().cacheControl();
        // 添加 jwt 登录授权过滤器
        http.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        // 添加自定义未授权和未登录结果返回
        http.exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthorizationEntryPoint);
        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        return adminService::getAdminUserName;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }

}

/*                       ,%%%%%%%%,
 *                      ,%%/\%%%%/\%%
 *                     ,%%%\c''''J/%%%
 *           %.        %%%%/ o  o \%%%
 *           `%%.      %%%%       |%%%
 *            `%%      `%%%%(__Y__)%%'
 *            //        ;%%%%`\-/%%%'
 *            ((      /   `%%%%%%%'
 *             \\     .'           |
 *              \\   /        \  | |
 *               \\/          ) | |
 *                \          /_ | |__
 *                (____________))))))) 攻城狮
 *
 */
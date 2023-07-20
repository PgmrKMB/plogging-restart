package com.namoonhee.plogging.config;

import com.namoonhee.plogging.interceptor.AdminInterceptor;
import com.namoonhee.plogging.interceptor.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

    @Autowired
    private Interceptor interceptor;

    @Autowired
    private AdminInterceptor adminInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        registry
        .addInterceptor(interceptor)
        .addPathPatterns("/mypage_new", "/activityform", "/adminmain");


        WebMvcConfigurer.super.addInterceptors(registry);
    }
    
}

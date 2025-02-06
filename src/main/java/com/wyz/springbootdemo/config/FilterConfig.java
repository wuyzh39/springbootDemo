package com.wyz.springbootdemo.config;

import com.wyz.springbootdemo.filter.FirstFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {

//    @Bean
    public FilterRegistrationBean<FirstFilter> customFilterRegistration() {
        FilterRegistrationBean<FirstFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new FirstFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
}

package com.wyz.springbootdemo.config;

import com.wyz.springbootdemo.interceptor.FirstInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

//    @Autowired
    private FirstInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("Registering Interceptor" + interceptor);
        registry.addInterceptor(interceptor).addPathPatterns("/**");
    }
}

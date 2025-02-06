package com.wyz.springbootdemo.interceptor;

import com.wyz.springbootdemo.wrapper.CustomResponseWrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[FirstInterceptor]preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("[FirstInterceptor]postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("[FirstInterceptor]afterCompletion");

        if (response instanceof CustomResponseWrapper) {
            System.out.println("[FirstInterceptor]afterCompletion: response is CustomResponseWrapper");
        } else {
            System.out.println("[FirstInterceptor]afterCompletion: response not CustomResponseWrapper");
        }
    }
}

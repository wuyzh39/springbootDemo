package com.wyz.springbootdemo.filter;

import com.wyz.springbootdemo.wrapper.CustomRequestWrapper;
import com.wyz.springbootdemo.wrapper.CustomResponseWrapper;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // do nothing
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        CustomRequestWrapper requestWrapper = new CustomRequestWrapper((HttpServletRequest) request);
        CustomResponseWrapper responseWrapper = new CustomResponseWrapper((HttpServletResponse) response);

        // 前置处理
        System.out.println("[FirstFilter]doFilter: before chain.doFilter");
        responseWrapper.setCustomAttribute("resp", "filter_response_wrapper");

        chain.doFilter(requestWrapper, responseWrapper);

        // 后置
        System.out.println("[FirstFilter]doFilter: after chain.doFilter");
        System.out.println("[FirstFilter]attribute: resp=" + responseWrapper.getCustomAttribute("resp"));
    }

    @Override
    public void destroy() {
        // do nothing
    }
}

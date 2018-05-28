package com.penguin.learn.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 1、Component注解直接将过滤器交给Spring容器管理，适合自定义过滤器
 * 2、在WebConfig中添加Bean，将自定义过滤器添加到过滤器链，适合第三方过滤器
 * 二者选择其一
 */
//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
//        System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));
    }
    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }
}

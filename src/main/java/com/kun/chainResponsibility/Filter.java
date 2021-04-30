package com.kun.chainResponsibility;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/30
 * @Version 1.0
 **/
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}

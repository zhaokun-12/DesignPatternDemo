package com.kun.chainResponsibility;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/30
 * @Version 1.0
 **/
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setMsg(request.getMsg().replace("tm", "特别"));
        chain.doChain(request, response);
        System.out.println(this);
    }
}

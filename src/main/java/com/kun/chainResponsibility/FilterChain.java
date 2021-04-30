package com.kun.chainResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/30
 * @Version 1.0
 **/
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    int index = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doChain(Request request, Response response) {
        if (filters.size() == index) {
            return;
        }
        filters.get(index++).doFilter(request, response, this);

    }
}

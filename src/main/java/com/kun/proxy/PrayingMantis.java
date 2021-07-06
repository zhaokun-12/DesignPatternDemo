package com.kun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/
public class PrayingMantis implements InvocationHandler {
    private BaseService baseService;

    public PrayingMantis(BaseService baseService) {
        this.baseService = baseService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理" + method.getName());
        method.invoke(baseService, args);
        secondaryMain();
        return null;
    }
    // 这里理解增强业务，即我们可以在实现InvocationHandler里面添加其他的业务，比如日志等等。
    private void secondaryMain(){
        System.out.println("螳螂捕蝉 - 次要业务  -- 后置增强");
    }
}

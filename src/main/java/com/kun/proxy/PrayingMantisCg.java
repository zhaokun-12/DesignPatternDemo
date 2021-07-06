package com.kun.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/

/**
 * 1、创建实体类 实现MethodInterceptor
 * 2、 getInstance 构建Enhancer
 */
public class PrayingMantisCg<T> implements MethodInterceptor {

    private T cicada;// 代理对象

    public T getInstance(T cicada) {
        this.cicada = cicada;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.cicada.getClass());
//        enhancer.setSuperclass(Cicada.class);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object o1 = methodProxy.invokeSuper(o, objects);
        secondaryMain();
        return o1;
    }
    private void secondaryMain() {
        System.out.println("螳螂捕蝉 - 次要业务");
    }

    public static void main(String[] args) {
        PrayingMantisCg<Cicada> prayingMantis = new PrayingMantisCg();
        Cicada instance = prayingMantis.getInstance(new Cicada());
        instance.mainService();
    }
}

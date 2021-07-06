package com.kun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/

/**
 * jdk动态代理
 * 1、首先,真实对象（被代理的对象）必须实现一个接口
 * 2、创建一个代理类，实现InvocationHandler接口，其中有一个这个接口的成员变量
 * 3、真实对象实例化，构建代理对象
 * 4、调用Proxy.newProxyInstance 返回代理对象
 *
 * debug时 代理部分重复运行，是因为idea debug调用了被代理对象的toString方法
 */
public class BeanFactory {
    public static BaseService newInstance(Class classFile) {
        // 1、创建真实对象
        Cicada cicada = new Cicada();
        // 2、创建代理对象
        InvocationHandler prayingMantis = new PrayingMantis(cicada);

        // 3、向JVM 所要代理对象
        Class classArrays[] = {BaseService.class};
        BaseService baseService = (BaseService)Proxy.newProxyInstance(classFile.getClassLoader(), classArrays, prayingMantis);
        return baseService;
    }

    public static void main(String[] args) {
        BaseService baseService = newInstance(Cicada.class);
        baseService.mainService();
        // 如果没有第三步，需要手动获取真实对象接口的各个方法去执行
//        Class<BaseService> baseServiceClass = BaseService.class;
//        Method[] methods = baseServiceClass.getMethods();
//        InvocationHandler invocationHandler = newInstance(Cicada.class);
//        try {
//            invocationHandler.invoke(null, methods[0], new Object[0]);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }
}

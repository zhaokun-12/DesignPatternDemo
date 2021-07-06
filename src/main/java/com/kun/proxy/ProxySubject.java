package com.kun.proxy;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/

/**
 * realSubject 的代理类  静态代理
 * 需要为每一个对象创建一个代理类
 * 像装饰器模式，代理模式是提供完全相同的接口
 * 装饰器模式是为了增强接口
 *
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public ProxySubject() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.realSubject = (RealSubject)this.getClass().getClassLoader().loadClass("com.kun.proxy.RealSubject").newInstance();
    }

    @Override
    public void doSomething() {
        System.out.println("---前置处理---");
        realSubject.doSomething();
        System.out.println("---后置处理---");
    }

    public static void main(String[] args) {
        //第一种方式
        new ProxySubject(new RealSubject()).doSomething();

        System.out.println("第二种方式");
        try {
            //第二种方式
            new ProxySubject().doSomething();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

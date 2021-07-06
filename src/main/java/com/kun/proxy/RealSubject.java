package com.kun.proxy;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/
public class RealSubject implements  Subject {
    @Override
    public void doSomething() {
        System.out.println("放学去打游戏");
    }
}

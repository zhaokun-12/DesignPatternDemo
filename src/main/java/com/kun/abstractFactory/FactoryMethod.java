package com.kun.abstractFactory;

/**
 * @Description
 * @Author zhaokun
 * 有了简单工厂模式，为什么还需要工厂方法模式？
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，
 * 根据客户端的选择条件动态实例化相关的类，
 * 对于客户端来说，去除了与具体产品的依赖。
 * 如果简单工厂模式需要改动，比如新增加一个运算，
 * 那么我们一定要给运算工厂类的方法里面加“Case”的分支条件的，
 * 修改原来的类。这样我们不但对扩展开放了，对修改也开放了，违背了开发-封闭原则的。
 * @Date 2021/4/26
 * @Version 1.0
 **/
public interface FactoryMethod {
    Operation createOperation();
}

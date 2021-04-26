package com.kun.abstractFactory;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new AddFactory();
        Operation operation = factoryMethod.createOperation();
        operation.setNumOne(1L);
        operation.setNumOne(4L);
        System.out.println("结果：" + operation.calculation());
    }
}

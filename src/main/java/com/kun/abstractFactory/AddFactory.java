package com.kun.abstractFactory;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class AddFactory implements FactoryMethod {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

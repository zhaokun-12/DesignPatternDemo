package com.kun.abstractFactory;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class OperationAdd extends Operation {
    @Override
    public double calculation() {
        return numOne + numTwo;
    }
}

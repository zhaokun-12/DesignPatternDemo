package com.kun.abstractFactory;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public abstract class Operation {
    protected double numOne;

    protected double numTwo;

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    public abstract double calculation();
}

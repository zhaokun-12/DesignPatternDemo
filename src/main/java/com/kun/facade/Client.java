package com.kun.facade;

/**
 * @Description
 * 门面模式（外观模式）
 * 2021/07/21  这里我认为只是对对一些复杂逻辑的再封装，
 * 其实我们暴露出来给前端的接口也同样可以叫做门面者模式，
 * 我们调用各个子模块（mapper）进行处理
 * @Author zhaokun
 * @Date 2021/7/21
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}

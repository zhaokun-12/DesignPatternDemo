package com.kun.proxy;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/7/5
 * @Version 1.0
 **/
public class Cicada implements BaseService {
    @Override
    public void mainService() {
        selfMe();
        System.out.println("主要业务，以蝉为例，当蝉出现业务调用时，螳螂监听到");
    }

    public void selfMe() {
        System.out.println("selfMe");
    }

    @Override
    public String eatService(String food) {
        System.out.println("开吃" + food);
        return food;
    }
}

package com.kun.strategy;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class Tank {
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    private Strategy strategy;

    public void launch() {
        System.out.println("发射" + ((strategy == null) ? "" : strategy.bullet()) + "子弹");
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.launch();
        tank.setStrategy(new MethodStrategy1());
        tank.launch();
    }
}

package com.kun.factory;

import com.kun.factory.food.Food;
import com.kun.factory.vehicle.Vehicle;
import com.kun.factory.weapon.Weapon;

/**
 * @Description
 * 抽象工厂
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public abstract class AbstractFactory {
    public abstract Food getFood();

    public abstract Vehicle getVehicle();

    public abstract Weapon getWeapon();

    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        factory.getFood().eat();
        factory.getVehicle().go();
        factory.getWeapon().attack();

    }
}

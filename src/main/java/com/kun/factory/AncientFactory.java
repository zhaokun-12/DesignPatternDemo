package com.kun.factory;

import com.kun.factory.food.BambooShoots;
import com.kun.factory.food.Food;
import com.kun.factory.vehicle.Horse;
import com.kun.factory.vehicle.Vehicle;
import com.kun.factory.weapon.Sword;
import com.kun.factory.weapon.Weapon;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class AncientFactory extends AbstractFactory {
    @Override
    public Food getFood() {
        return new BambooShoots();
    }

    @Override
    public Vehicle getVehicle() {
        return new Horse();
    }

    @Override
    public Weapon getWeapon() {
        return new Sword();
    }
}

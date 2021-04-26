package com.kun.factory;

import com.kun.factory.food.Beef;
import com.kun.factory.food.Food;
import com.kun.factory.vehicle.Car;
import com.kun.factory.vehicle.Vehicle;
import com.kun.factory.weapon.Firearm;
import com.kun.factory.weapon.Weapon;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/
public class ModernFactory extends AbstractFactory {
    @Override
    public Food getFood() {
        return new Beef();
    }

    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public Weapon getWeapon() {
        return new Firearm();
    }
}

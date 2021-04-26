package com.kun.factory;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/26
 * @Version 1.0
 **/

import com.kun.factory.food.BambooShoots;
import com.kun.factory.food.Beef;
import com.kun.factory.food.Food;

/**
 * 简单工厂
 */
public class FoodFactory {
    public static Food getFood(int type) {
        switch (type) {
            case 1: {
                return new BambooShoots();
            }
            case 2: {
                return new Beef();
            }
        }
        return new BambooShoots();
    }

    public static void main(String[] args) {
        Food food = FoodFactory.getFood(2);
        food.eat();
    }
}

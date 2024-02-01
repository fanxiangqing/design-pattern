package com.fxq.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 套餐
 */
public class Meal {

    private Meal() {

    }

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0F;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }

    public static class MealBuilder {
        /**
         * 素食套餐
         *
         * @return 套餐
         */
        public Meal prepareVegMeal() {
            Meal meal = new Meal();
            meal.addItem(new VegBurger());
            meal.addItem(new Coke());
            return meal;
        }

        /**
         * 肉食套餐
         *
         * @return 套餐
         */
        public Meal prepareNonVegMeal() {
            Meal meal = new Meal();
            meal.addItem(new ChickenBurger());
            meal.addItem(new Pepsi());
            return meal;
        }
    }

}

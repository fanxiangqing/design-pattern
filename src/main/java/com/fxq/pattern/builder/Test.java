package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 */
public class Test {
    public static void main(String[] args) {
        Meal.MealBuilder builder = new Meal.MealBuilder();
        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("准备肉食套餐");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        System.out.println("\n\n准备素食套餐");
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
    }
}

package com.mei.creationalpatterns.builderpattern.product;

import com.mei.creationalpatterns.builderpattern.food.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal
 * 套餐类
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:34
 */
public class Meal {
    private final List<Food> foodList = new ArrayList<Food>();

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void showFoodList() {
        for (Food food : foodList) {
            System.out.println("食物名称: " + food.name());
            System.out.println("食物价格: " + food.price());
            System.out.println("食物包装: " + food.packing().packName());
        }
    }

    public float getCalories() {
        float calories = 0;
        for (Food food : foodList) {
            calories += food.price();
        }
        return calories;
    }
}

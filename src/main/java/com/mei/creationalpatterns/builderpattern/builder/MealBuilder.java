package com.mei.creationalpatterns.builderpattern.builder;

import com.mei.creationalpatterns.builderpattern.food.Food;
import com.mei.creationalpatterns.builderpattern.product.Meal;

/**
 * MealBuilder
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:39
 */
public class MealBuilder {
    private static Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public MealBuilder addFood(Food food){
        meal.addFood(food);
        return this;
    }

    public Meal build(){
        return meal;
    }

    public static MealBuilder builder(){
        return new MealBuilder();
    }
}

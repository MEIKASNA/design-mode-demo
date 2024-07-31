package com.mei.creationalpatterns.builderpattern;


import com.mei.creationalpatterns.builderpattern.builder.MealBuilder;
import com.mei.creationalpatterns.builderpattern.food.ChickenBurger;
import com.mei.creationalpatterns.builderpattern.food.Cola;
import com.mei.creationalpatterns.builderpattern.food.VegBurger;
import com.mei.creationalpatterns.builderpattern.product.Meal;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午2:31
 */
public class Entrance {
    public static void main(String[] args) {
        Meal build = MealBuilder
                .builder()
                .addFood(new ChickenBurger())
                .addFood(new VegBurger())
                .addFood(new Cola())
                .build();
        build.showFoodList();
        System.out.println(build.getCalories());
    }
}

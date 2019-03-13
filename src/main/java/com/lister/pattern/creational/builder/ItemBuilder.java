package com.lister.pattern.creational.builder;

import com.lister.pattern.creational.builder.item.ChickenBurger;
import com.lister.pattern.creational.builder.item.Coke;
import com.lister.pattern.creational.builder.item.Item;
import com.lister.pattern.creational.builder.item.Pepsi;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        System.out.println(meal.getPrice());
        meal.showItem();
    }
}

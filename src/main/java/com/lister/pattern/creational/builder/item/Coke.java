package com.lister.pattern.creational.builder.item;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 5f;
    }
}

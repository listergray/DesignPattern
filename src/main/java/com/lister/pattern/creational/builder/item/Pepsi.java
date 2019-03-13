package com.lister.pattern.creational.builder.item;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 2f;
    }
}

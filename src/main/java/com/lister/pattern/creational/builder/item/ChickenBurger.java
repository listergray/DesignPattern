package com.lister.pattern.creational.builder.item;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 20f;
    }
    public String name(){
        return "chickenBurger";
    }
}

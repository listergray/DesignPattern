package com.lister.pattern.creational.builder.item;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25f;
    }

    public String name(){
        return "VegBugger";
    }
}

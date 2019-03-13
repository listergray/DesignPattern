package com.lister.pattern.creational.builder.item;

import com.lister.pattern.creational.builder.pack.Bottle;
import com.lister.pattern.creational.builder.pack.Packing;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}

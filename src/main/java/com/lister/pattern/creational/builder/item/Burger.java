package com.lister.pattern.creational.builder.item;

import com.lister.pattern.creational.builder.pack.Packing;
import com.lister.pattern.creational.builder.pack.Wapper;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wapper();
    }

    @Override
    public abstract float price();
}

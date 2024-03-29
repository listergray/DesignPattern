package com.lister.pattern.creational.builder.item;

import com.lister.pattern.creational.builder.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

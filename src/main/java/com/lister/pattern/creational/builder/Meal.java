package com.lister.pattern.creational.builder;

import com.lister.pattern.creational.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getPrice(){
        float price = 0;
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            price += item.price();
        }
        return price;
    }

    public void showItem(){
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            System.out.println("name:" + item.name());
            System.out.println("price:" + item.price());
            System.out.println("pack:" + item.packing().pack());
        }
    }
}

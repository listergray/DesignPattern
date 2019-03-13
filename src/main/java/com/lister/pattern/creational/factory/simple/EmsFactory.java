package com.lister.pattern.creational.factory.simple;

public class EmsFactory implements Sender {

    @Override
    public void send() {
        System.out.println("send by EMS");
    }
}

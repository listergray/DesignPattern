package com.lister.pattern.creational.factory.method.sender;

public class EmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("send by EMS");
    }
}

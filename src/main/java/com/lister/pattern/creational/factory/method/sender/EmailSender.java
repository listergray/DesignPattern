package com.lister.pattern.creational.factory.method.sender;

public class EmailSender implements Sender{

    @Override
    public void send() {
        System.out.println("send by email");
    }
}

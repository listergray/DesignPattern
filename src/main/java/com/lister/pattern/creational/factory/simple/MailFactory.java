package com.lister.pattern.creational.factory.simple;

public class MailFactory implements Sender {

    @Override
    public void send() {
        System.out.println("通过Email发送信息");
    }
}

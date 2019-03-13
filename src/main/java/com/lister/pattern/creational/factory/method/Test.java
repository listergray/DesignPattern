package com.lister.pattern.creational.factory.method;

import com.lister.pattern.creational.factory.method.factory.EmailSendFactory;
import com.lister.pattern.creational.factory.method.factory.SendFactory;
import com.lister.pattern.creational.factory.method.sender.Sender;

public class Test {
    public static void main(String[] args) {
        SendFactory sendFactory = new EmailSendFactory();
        Sender produce = sendFactory.produce();
        produce.send();
    }
}

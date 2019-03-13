package com.lister.pattern.creational.factory.method.factory;

import com.lister.pattern.creational.factory.method.sender.EmailSender;
import com.lister.pattern.creational.factory.method.sender.Sender;

public class EmsSendFactory implements SendFactory {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}

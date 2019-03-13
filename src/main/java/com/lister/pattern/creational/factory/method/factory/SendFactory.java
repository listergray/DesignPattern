package com.lister.pattern.creational.factory.method.factory;

import com.lister.pattern.creational.factory.method.sender.Sender;

public interface SendFactory {
    public Sender produce();
}

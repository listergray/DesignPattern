package com.lister.pattern.creational.factory.simple;

import com.lister.pattern.creational.factory.sendtype.SendType;

public class SendFactory {

    public void produce(SendType type){
        Sender sender = null;
        switch (type){
            case EMS:
                sender = new EmsFactory();
                break;
            case EMAIL:
                sender = new EmsFactory();
                break;
        }
        sender.send();
    }

    public static void main(String[] args) {
        SendFactory sendFactory =new SendFactory();
        SendType type = SendType.EMAIL;
        sendFactory.produce(type);
    }

}

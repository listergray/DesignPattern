package com.lister.pattern.creational.factory.abstractx;

import com.lister.pattern.creational.factory.abstractx.factory.IFactory;
import com.lister.pattern.creational.factory.abstractx.factory.PadFactory;
import com.lister.pattern.creational.factory.abstractx.produce.ILinux;
import com.lister.pattern.creational.factory.abstractx.produce.IMac;
import com.lister.pattern.creational.factory.abstractx.produce.IWin;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new PadFactory();
        ILinux linux = factory.produceLinux();
        IMac mac = factory.produceMac();
        IWin win = factory.produceWin();
        System.out.println(linux.show());
        System.out.println(mac.show());
        System.out.println(win.show());
    }
}

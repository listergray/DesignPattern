package com.lister.pattern.creational.factory.abstractx.factory;

import com.lister.pattern.creational.factory.abstractx.produce.ILinux;
import com.lister.pattern.creational.factory.abstractx.produce.IMac;
import com.lister.pattern.creational.factory.abstractx.produce.IWin;

public interface IFactory {
    public IWin produceWin();
    public ILinux produceLinux();
    public IMac produceMac();
}

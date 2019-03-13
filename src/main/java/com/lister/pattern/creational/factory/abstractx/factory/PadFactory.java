package com.lister.pattern.creational.factory.abstractx.factory;

import com.lister.pattern.creational.factory.abstractx.produce.*;

public class PadFactory implements IFactory{
    @Override
    public IWin produceWin() {
        return new PadWinProduce();
    }

    @Override
    public ILinux produceLinux() {
        return new PadLinuxProduce();
    }

    @Override
    public IMac produceMac() {
        return new PadMacProduce();
    }
}

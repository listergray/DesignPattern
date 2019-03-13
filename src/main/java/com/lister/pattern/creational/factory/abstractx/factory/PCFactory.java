package com.lister.pattern.creational.factory.abstractx.factory;

import com.lister.pattern.creational.factory.abstractx.produce.*;

public class PCFactory implements IFactory{
    @Override
    public IWin produceWin() {
        return new PCWinProduce();
    }

    @Override
    public ILinux produceLinux() {
        return new PCLinuxProduce();
    }

    @Override
    public IMac produceMac() {
        return new PCMacProduce();
    }
}

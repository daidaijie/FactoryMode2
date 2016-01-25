package com.net.first.factory;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}

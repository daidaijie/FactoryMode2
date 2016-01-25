package com.net.first.factory;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}

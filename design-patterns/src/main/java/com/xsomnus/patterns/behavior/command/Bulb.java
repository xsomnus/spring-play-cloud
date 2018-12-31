package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:21
 **/
public class Bulb implements Switchable {
    @Override
    public void on() {
        System.out.println("通电,灯亮");
    }

    @Override
    public void off() {
        System.out.println("断电,灯灭");
    }
}

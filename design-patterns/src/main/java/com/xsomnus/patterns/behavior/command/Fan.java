package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:22
 **/
public class Fan implements Switchable {

    @Override
    public void on() {
        System.out.println("通电, 风扇转动");
    }

    @Override
    public void off() {
        System.out.println("断电, 风扇停止");
    }
}

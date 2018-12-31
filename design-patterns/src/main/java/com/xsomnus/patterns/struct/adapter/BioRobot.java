package com.xsomnus.patterns.struct.adapter;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 00:15
 **/
public class BioRobot implements Robot {
    @Override
    public void cry() {
        System.out.println("仿生机器人叫...");
    }

    @Override
    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }
}

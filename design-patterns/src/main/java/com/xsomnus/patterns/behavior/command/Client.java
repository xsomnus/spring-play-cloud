package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:26
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println("===客户端用[开关]操作电器===");
        Switcher switcher = new Switcher();
        switcher.setSwitchable(new Bulb());
        switcher.btnOnClick();
        switcher.btnOffClick();

        switcher.setSwitchable(new Fan());
        switcher.btnOnClick();
        switcher.btnOffClick();

    }
}

package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:23
 **/
public class Switcher {

    private Switchable switchable;


    public void setSwitchable(Switchable switchable) {
        this.switchable = switchable;
    }

    public void btnOnClick() {
        System.out.println("按下开...");
        switchable.on();
    }

    public void btnOffClick() {
        System.out.println("按下关...");
        switchable.off();
    }
}

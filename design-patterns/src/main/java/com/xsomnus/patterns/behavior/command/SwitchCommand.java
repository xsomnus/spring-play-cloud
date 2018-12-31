package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:30
 **/
public class SwitchCommand implements Command {

    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void unexecute() {
        device.off();
    }
}

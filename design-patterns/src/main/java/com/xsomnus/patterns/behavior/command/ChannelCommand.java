package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:31
 **/
public class ChannelCommand implements Command {

    private Device device;

    public ChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.channelUp();
    }

    @Override
    public void unexecute() {
        device.channelDown();
    }
}

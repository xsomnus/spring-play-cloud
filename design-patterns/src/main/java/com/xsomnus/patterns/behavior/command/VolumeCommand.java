package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:32
 **/
public class VolumeCommand implements Command {

    private Device device;
    public VolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void unexecute() {
        device.volumeDown();
    }
}

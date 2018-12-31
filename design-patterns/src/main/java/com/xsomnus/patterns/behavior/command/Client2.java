package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:43
 **/
public class Client2 {
    public static void main(String[] args) {
        System.out.println("===客户用[遥控器]操作电器==");
        Device tv = new TV();
        Device radio = new Radio();

        Controller controller = new Controller();

        controller.bindOkCommand(new SwitchCommand(tv));
        controller.bindHorizontalCommand(new VolumeCommand(tv));
        controller.bindVericalCommand(new ChannelCommand(tv));

        controller.btnOkHold();
        controller.btnOkClick();
        controller.btnDownClick();
        controller.btnUpClick();
        controller.btnLeftClick();
        controller.btnRightClick();



        controller.bindOkCommand(new SwitchCommand(radio));
        controller.bindVericalCommand(new ChannelCommand(radio));
        controller.bindVericalCommand(new VolumeCommand(radio));

        controller.btnOkHold();
        controller.btnOkClick();
        controller.btnDownClick();
        controller.btnUpClick();
        controller.btnLeftClick();
        controller.btnRightClick();
    }
}

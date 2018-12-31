package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:33
 **/
public class Controller {
    private Command okCommand;
    private Command verticalCommand;
    private Command horizontalCommand;

    public void bindOkCommand(Command command) {
        this.okCommand = command;
    }

    public void bindVericalCommand(Command verticalCommand) {
        this.verticalCommand = verticalCommand;
    }

    public void bindHorizontalCommand(Command horizontalCommand) {
        this.horizontalCommand = horizontalCommand;
    }

    public void btnOkHold() {
        System.out.println("长按ok键");
        okCommand.execute();
    }

    public void btnOkClick() {
        System.out.println("点击ok键..");
        okCommand.unexecute();
    }

    public void btnUpClick() {
        System.out.print("单击↑按键……");
        verticalCommand.execute();
    }

    public void btnDownClick() {
        System.out.println("单击↓按键……");
        verticalCommand.unexecute();
    }

    public void btnLeftClick() {
        System.out.println("单击←按键……");
        horizontalCommand.execute();
    }

    public void btnRightClick() {
        System.out.println("单击→按键……");
        horizontalCommand.unexecute();
    }
}

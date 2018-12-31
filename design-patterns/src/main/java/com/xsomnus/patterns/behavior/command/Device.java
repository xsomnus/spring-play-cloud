package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:28
 **/
public interface Device extends Switchable{

    void channelUp();

    void channelDown();

    void volumeUp();

    void volumeDown();
}

package com.xsomnus.patterns.behavior.command;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 16:19
 **/
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 反执行命令
     */
    void unexecute();
}

package com.xsomnus.patterns.behavior.state;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:24
 */
public interface OrderState {

    void action(OrderContext context);
    void doPrint();
}

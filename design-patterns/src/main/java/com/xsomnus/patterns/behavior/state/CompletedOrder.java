package com.xsomnus.patterns.behavior.state;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:29
 */
public class CompletedOrder implements OrderState {
    @Override
    public void action(OrderContext context) {
        context.setOrderState(null);
    }

    @Override
    public void doPrint() {
        System.out.println("订单完成");
    }
}

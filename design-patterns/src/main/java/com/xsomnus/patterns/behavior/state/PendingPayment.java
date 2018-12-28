package com.xsomnus.patterns.behavior.state;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:27
 */
public class PendingPayment implements OrderState {
    @Override
    public void action(OrderContext context) {
        context.setOrderState(new PendingDeliveryOrder());
    }

    @Override
    public void doPrint() {
        System.out.println("付款了");
    }
}

package com.xsomnus.patterns.behavior.state;

import org.junit.Test;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:30
 */
public class OrderStateTest {

    @Test
    public void testOrderState() {
        OrderState orderState = new PendingPayment();
        OrderContext context = new OrderContext(orderState);
        context.printInfo();

        for (int i = 0; i < 3; i++) {
            context.action();
            context.printInfo();
        }
    }
}
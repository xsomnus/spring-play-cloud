package com.xsomnus.patterns.behavior.state;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:28
 */
public class PendingEvaluation implements OrderState {
    @Override
    public void action(OrderContext context) {
        context.setOrderState(new CompletedOrder());
    }

    @Override
    public void doPrint() {
        System.out.println("评价成功");
    }
}

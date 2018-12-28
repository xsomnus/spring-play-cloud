package com.xsomnus.patterns.behavior.state;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/28 0028 18:25
 */
@Data
@AllArgsConstructor
public class OrderContext {

    private OrderState orderState;

    public void action() {
        this.orderState.action(this);
    }

    public void printInfo() {
        if (this.orderState != null) {
            this.orderState.doPrint();
        }
    }
}

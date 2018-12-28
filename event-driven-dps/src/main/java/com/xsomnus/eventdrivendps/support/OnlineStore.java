package com.xsomnus.eventdrivendps.support;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:07
 */
public interface OnlineStore {

    String INPUT_ORDERS = "inboundOrders";
    String OUTPUT_STOCK = "outputStock";

    /**
     * #声明输入型channel,表示接收订单
     *
     */
    @Input("inboundOrders")
    SubscribableChannel orders();

    /**
     * 声明输出型channel，表示向供应商进货
     *
     */
    @Output("outputStock")
    MessageChannel stock();
}


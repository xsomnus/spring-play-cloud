package com.xsomnus.patterns.struct.bridge2;

/**
 * @author somnus_xiawenye
 * @since 2019/1/21 0021 10:09
 */
public class PendingDeliveryStatus implements Status{

    @Override
    public String getStatus() {
        return "待发货的";
    }
}

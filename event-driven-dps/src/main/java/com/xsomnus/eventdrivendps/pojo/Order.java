package com.xsomnus.eventdrivendps.pojo;

import lombok.Data;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:05
 */
@Data
public class Order {
    private Long orderId;
    private Long totalFee;
    private String remark;
}

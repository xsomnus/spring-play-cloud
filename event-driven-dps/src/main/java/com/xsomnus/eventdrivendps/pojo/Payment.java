package com.xsomnus.eventdrivendps.pojo;

import lombok.Data;

import java.time.OffsetDateTime;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:05
 */
@Data
public class Payment {

    private Long totalFee;
    private OffsetDateTime payTime;

}

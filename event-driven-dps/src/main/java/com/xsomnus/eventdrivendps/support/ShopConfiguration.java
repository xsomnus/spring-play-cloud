package com.xsomnus.eventdrivendps.support;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @author somnus_xiawenye
 * @since 2018/12/7 0007 17:09
 */
@EnableBinding(OnlineStore.class)
public class ShopConfiguration {

   @StreamListener(value=OnlineStore.INPUT_ORDERS)
   public void inputProductAdd(Message<String> message) {
       System.out.println("新增产品监听收到：" + message.getPayload());
   }




}

package com.xsomnus.patterns.struct.bridge2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author somnus_xiawenye
 * @since 2019/1/21 0021 10:10
 */
public class Bridge2Test {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Order order = new Order();
        order.setId("123");
        order.setStatus(new PendingDeliveryStatus());
        String s = objectMapper.writeValueAsString(order);
        System.out.println(s);


    }

}

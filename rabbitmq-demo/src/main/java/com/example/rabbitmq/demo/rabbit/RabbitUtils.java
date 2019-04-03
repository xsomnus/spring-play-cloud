package com.example.rabbitmq.demo.rabbit;

import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.UUID;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/3 0003 9:48
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 */
public final class RabbitUtils {
    public static void putOrderHandlerDelayMsg(RabbitTemplate template, Integer delaySeconds, String msg) {
        if (null == delaySeconds || delaySeconds < 0) delaySeconds = 0;
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        //声明消息处理器
        Integer finalDelaySeconds = delaySeconds;
        MessagePostProcessor messagePostProcessor = message -> {
            MessageProperties messageProperties = message.getMessageProperties();
            //设置编码
            messageProperties.setContentEncoding("utf-8");
            //设置过期时间,单位为毫秒
            messageProperties.setExpiration(String.format("%d", 1000 * finalDelaySeconds));
            return message;
        };
        template.convertAndSend(RabbitConst.DelayQueueSettings.DEAD_LETTER_EXCHANGE, RabbitConst.DelayQueueSettings.DEAD_LETTER_ROUTING_KEY, msg, messagePostProcessor, correlationData);
    }
}

package com.example.rabbitmq.demo.rabbit.listener;

import com.example.rabbitmq.demo.rabbit.RabbitConst;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/3 0003 9:45
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 */
@Slf4j
@Component
public class MessageConsumer {

    @RabbitListener(queues = RabbitConst.DelayQueueSettings.REDIRECT_QUEUE)
    public void realExecQueue(Message message, Channel channel) throws IOException {
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        String body = new String(message.getBody());
//        log.error("※延时队列※: message: {}\n, channel:{}\n, 消息内容为：{}\n", message, channel, body);
        log.error("message:{}", body);
    }

}

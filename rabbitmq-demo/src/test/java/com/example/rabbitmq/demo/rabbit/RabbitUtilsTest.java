package com.example.rabbitmq.demo.rabbit;

import com.example.rabbitmq.demo.RabbitmqDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/3 0003 9:50
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 *
 * 即使一个消息比在同一队列中的其他消息提前过期，提前过期的也不会优先进入死信队列，它们还是按照入库的顺序让消费者消费。如果第一进去的消息过期时间是1小时，那么死信队列的消费者也许等1小时才能收到第一个消息。参考官方文档发现“Only when expired messages reach the head of a queue will they actually be discarded (or dead-lettered).”只有当过期的消息到了队列的顶端（队首），才会被真正的丢弃或者进入死信队列。
 *
 * 所以在考虑使用RabbitMQ来实现延迟任务队列的时候，需要确保业务上每个任务的延迟时间是一致的。如果遇到不同的任务类型需要不同的延时的话，需要为每一种不同延迟时间的消息建立单独的消息队列。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = RabbitmqDemoApplication.class)
public class RabbitUtilsTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void putOrderHandlerDelayMsg() {
        int[] delayArr = new int[]{10, 10, 60, 60, 60, 30, 30, 30};
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < delayArr.length; i++) {
            RabbitUtils.putOrderHandlerDelayMsg(rabbitTemplate, delayArr[i], "test00" + i + "_value=" + delayArr[i]);
        }

    }
}
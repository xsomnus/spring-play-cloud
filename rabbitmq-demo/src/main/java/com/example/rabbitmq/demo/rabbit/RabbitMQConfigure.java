package com.example.rabbitmq.demo.rabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * @author somnus_xiawenye
 * @since 2019/1/22 0022 16:45
 */
@Slf4j
@Configuration
public class RabbitMQConfigure {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Bean
    public AmqpTemplate amqpTemplate() {
        log.info("配置rabbitMqTemplate属性");
        //使用jackson 消息转换器
        rabbitTemplate.setEncoding("UTF-8");
        //开启returnCallback --- yml需要配置 publisher-returns: true
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.setReturnCallback((message, replyCode, replyText, exchange, routingKey) -> {
            String correlationId = message.getMessageProperties().getCorrelationId();
            log.info("消息：{} 发送失败, 应答码：{} 原因：{} 交换机: {}  路由键: {}", correlationId, replyCode, replyText, exchange, routingKey);
        });
        //消息确认yml需要配置 publisher-returns: true
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (ack) {
                log.info("消息发送到exchange成功,id: {}", correlationData.getId());
            } else {
                log.info("消息发送到exchange失败,原因: {}", cause);
            }
        });

        return rabbitTemplate;
    }

    /*********************************************************
     ****
     ****   延时队列设置
     ****
     *********************************************************/
    /**
     * 死信队列跟交换机类型没有关系 不一定为directExchange  不影响该类型交换机的特性.
     *
     * @return the exchange
     */
    @Bean("deadLetterExchange")
    public Exchange deadLetterExchange() {
        return ExchangeBuilder.directExchange(RabbitConst.DelayQueueSettings.DEAD_LETTER_EXCHANGE).durable(true).build();
    }

    /**
     * 声明一个死信队列.
     * x-dead-letter-exchange   对应 死信交换机
     * x-dead-letter-routing-key  对应 死信队列
     *
     * @return the queue
     */
    @Bean("deadLetterQueue")
    public Queue deadLetterQueue() {
        Map<String, Object> args = new HashMap<>(2);
        //x-dead-letter-exchange  声明死信交换机
        args.put(RabbitConst.DelayQueueSettings.DEAD_LETTER_QUEUE_KEY_ID, RabbitConst.DelayQueueSettings.DEAD_LETTER_EXCHANGE);
        //x-dead-letter-routing-key  声明死信路由键
        args.put(RabbitConst.DelayQueueSettings.DEAD_LETTER_ROUTING_KEY_ID, RabbitConst.DelayQueueSettings.REDIRECT_QUEUE_ROUTING_KEY);
        return QueueBuilder.durable(RabbitConst.DelayQueueSettings.DEAD_LETTER_QUEUE_NAME).withArguments(args).build();
    }


    /**
     * 定义死信队列转发队列
     *
     * @return the queue
     */
    @Bean(RabbitConst.DelayQueueSettings.REDIRECT_QUEUE)
    public Queue redirectQueue() {
        return QueueBuilder.durable(RabbitConst.DelayQueueSettings.REDIRECT_QUEUE).build();
    }

    /**
     * 死信路由通过 DL_KEY 绑定键绑定到死信队列上.
     *
     * @return the binding
     */
    @Bean
    public Binding deadLetterBinding() {
        return new Binding(RabbitConst.DelayQueueSettings.DEAD_LETTER_QUEUE_NAME, Binding.DestinationType.QUEUE, RabbitConst.DelayQueueSettings.DEAD_LETTER_EXCHANGE, RabbitConst.DelayQueueSettings.DEAD_LETTER_ROUTING_KEY, null);

    }

    /**
     * 死信路由通过 KEY_R 绑定键绑定到死信队列上.
     *
     * @return the binding
     */
    @Bean
    public Binding redirectBinding() {
        return new Binding(RabbitConst.DelayQueueSettings.REDIRECT_QUEUE, Binding.DestinationType.QUEUE, RabbitConst.DelayQueueSettings.DEAD_LETTER_EXCHANGE, RabbitConst.DelayQueueSettings.REDIRECT_QUEUE_ROUTING_KEY, null);
    }


}

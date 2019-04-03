package com.example.rabbitmq.demo.rabbit;

/**
 * @author somnus_xiawenye
 * @since 2019/1/28 0028 10:04
 */
public final class RabbitConst {

    public static final class DelayQueueSettings {
        /**
         * 死信队列 交换机标识符
         */
        public static final String DEAD_LETTER_QUEUE_KEY_ID = "x-dead-letter-exchange";
        /**
         * 死信队列交换机绑定键标识符
         */
        public static final String DEAD_LETTER_ROUTING_KEY_ID = "x-dead-letter-routing-key";

        /**
         * 死信队列名称
         */
        public static final String DEAD_LETTER_QUEUE_NAME = "DL_QUEUE_V2";

        /**
         * 死信队列交换机名称
         */
        public static final String DEAD_LETTER_EXCHANGE = "DL_EXCHANGE_V2";

        /**
         * 死信队列交换机绑定键
         */
        public static final String DEAD_LETTER_ROUTING_KEY = "DL_KEY_V2";

        /**
         * 实际执行任务队列（延时转发队列）
         */
        public static final String REDIRECT_QUEUE = "REAL_EXEC_QUEUE_V2";

        /**
         * 实际执行任务队列交换机绑定键
         */
        public static final String REDIRECT_QUEUE_ROUTING_KEY = "KEY_R_V2";
    }

    public static final class RefundQueueSettings {
        /**
         * 死信队列 交换机标识符
         */
        public static final String DEAD_LETTER_QUEUE_KEY_ID = "x-dead-letter-exchange";
        /**
         * 死信队列交换机绑定键标识符
         */
        public static final String DEAD_LETTER_ROUTING_KEY_ID = "x-dead-letter-routing-key";

        /**
         * 死信队列名称
         */
        public static final String DEAD_LETTER_QUEUE_NAME = "DL_REFUND_QUEUE";

        /**
         * 死信队列交换机名称
         */
        public static final String DEAD_LETTER_EXCHANGE = "DL_REFUND_EXCHANGE";

        /**
         * 死信队列交换机绑定键
         */
        public static final String DEAD_LETTER_ROUTING_KEY = "DL_REFUND_KEY";

        /**
         * 实际执行任务队列（延时转发队列）
         */
        public static final String REDIRECT_QUEUE = "REFUND_QUEUE";

        /**
         * 实际执行任务队列交换机绑定键
         */
        public static final String REDIRECT_QUEUE_ROUTING_KEY = "REFUND_KEY_R";
    }


}

package xsomnus.learn_java.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/7 0007 16:46
 */
public class ExchangeTest {

    static class Producer implements Runnable {

        private List<String> buffer;

        private Exchanger<List<String>> exchanger;

        public Producer(List<String> buffer, Exchanger<List<String>> exchanger) {
            this.buffer = buffer;
            this.exchanger = exchanger;
        }

        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                System.out.println("生产者第" + i + "次提供");
                for (int j = 1; j <= 3; j++) {
                    System.out.println("生产者装入" + i + "--" + j);
                    buffer.add("buffer: " + i + "--" + j);
                }
                System.out.println("生产者装满， 等待与消费者交换.....");
                try {
                    exchanger.exchange(buffer);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }


    static class Consumer implements Runnable {

        private String name;

        private List<String> buffer;

        private final Exchanger<List<String>> exchanger;

        public Consumer(List<String> buffer, Exchanger<List<String>> exchanger, String name) {
            this.buffer = buffer;
            this.exchanger = exchanger;
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    buffer = exchanger.exchange(buffer);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("消费者第" + i + "次提取");
                for (int j = 1; j <= 3; j++) {
                    System.out.println("消费者"+ name +"：" + buffer.get(0));
                    buffer.remove(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> buffer1 = new ArrayList<>();
        List<String> buffer2 = new ArrayList<String>();
//        List<String> buffer3 = new ArrayList<String>();

        Exchanger<List<String>> exchanger = new Exchanger<>();

        Thread producerThread = new Thread(new Producer(buffer1,exchanger));
        Thread consumerThread = new Thread(new Consumer(buffer2,exchanger, "AA"));
//        Thread consumerThread3 = new Thread(new Consumer(buffer3,exchanger, "BB"));

        producerThread.start();
        consumerThread.start();
//        consumerThread3.start();
    }
}

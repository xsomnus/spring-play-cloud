package xsomnus.learn_java;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 16:56
 */
public class HashMapTest2 extends Thread{

    static HashMap<Integer, Integer> map = new HashMap<>(2);
    static AtomicInteger at = new AtomicInteger();

    @Override
    public void run() {
        while (at.get() < 100000) {
            map.put(at.get(), at.get());
            at.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        HashMapTest2 test2 = new HashMapTest2();
        HashMapTest2 test3 = new HashMapTest2();
        HashMapTest2 test4 = new HashMapTest2();
        HashMapTest2 test5= new HashMapTest2();
        HashMapTest2 test6 = new HashMapTest2();

        test2.start();
        test3.start();
        test4.start();
        test5.start();
        test6.start();
    }
}

package xsomnus.learn_java;

import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 16:15
 */
public class HashMapTest {

    public final static int THREAD_POOL_SIZE = 20;
    public final static int ADD_USER_COUNTS = 1000*10;
    //public final static  ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    public HashMap<String, String> users = new HashMap<>();
    public ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        HashMapTest test = new HashMapTest();
        test.testConcurrentHashMap();
        test.testHashMap();
    }

    public void testConcurrentHashMap() {

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        for (int i = 0; i < ADD_USER_COUNTS; i++)
            executorService.execute(() -> {
                //System.out.println();
                this.concurrentHashMap.put("name" + RandomUtils.nextInt(), "里斯" + RandomUtils.nextInt());
                System.out.println(Thread.currentThread().getName() + " is Running [ConcurrentHashMap]当前用户的数量 " + this.concurrentHashMap.size());
            });

        System.out.println("================" + this.concurrentHashMap.size());
        executorService.shutdown();
    }


    public void testHashMap() {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        for (int i = 0; i < ADD_USER_COUNTS; i++)
            executorService.execute(() -> {
                //System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " is Running");
                this.users.put("name" + RandomUtils.nextInt(), "里斯" + RandomUtils.nextInt());
                System.out.println(Thread.currentThread().getName() + " is Running" + " [HashMap]当前用户的数量 " + this.users.size());
            });

        System.out.println("================" + this.users.size());
        executorService.shutdown();
    }
}

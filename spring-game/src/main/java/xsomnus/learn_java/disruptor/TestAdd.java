package xsomnus.learn_java.disruptor;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author somnus_xiawenye
 * @since 2019/1/15 0015 17:02
 */
public class TestAdd {


    private static final long TIMES = 500000000;



    public static void main(String[] args) {
        long l1 = SingleThreadAdd();
        System.out.println(l1);

        System.out.println("-----");
        long l2 = SingleThreadWithCAS();
        System.out.println(l2);

        System.out.println("-----");
        long l3 = SingleThreadWithLock();
        System.out.println(l3);

        System.out.println("-----");
        long l4 = volatileWrite();
        System.out.println(l4);
    }


    private static long SingleThreadAdd() {
        long begin = System.currentTimeMillis();
        int r = 0;
        for (int i = 0; i < TIMES; i++) {
            r++;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+ (end - begin));
        return r;
    }

    private static long SingleThreadWithCAS() {
        long begin = System.currentTimeMillis();
        long r = 0;
        for (int i = 0; i < TIMES; i++) {
            new AtomicLong(r).getAndDecrement();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+ (end - begin));
        return r;
    }

    public static long SingleThreadWithLock() {
        long begin = System.currentTimeMillis();
        Long r = 0L;
        for (int i = 0; i < TIMES; i++) {
            synchronized (r) {
                r++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+ (end - begin));
        return r;
    }

    private static volatile Long vr = 0L;

    private static long volatileWrite() {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < TIMES; i++) {
            vr++;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+ (end - begin));
        return vr;
    }


}

package utc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/4 0004 17:13
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 */
public class ThreadPoolExecutorTest {


    final static int corePoolSize = 5;
    final static int maximumPoolSize = 10;
    final static long keepAliveTime = 200;
    final static ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(5);


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, workQueue, new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            threadPoolExecutor.execute(myTask);
            System.out.println("线程池中现在的线程数目是：" + threadPoolExecutor.getPoolSize() + ",  队列中正在等待执行的任务数量为：" +
                    threadPoolExecutor.getQueue().size());
        }
        threadPoolExecutor.shutdown();
    }

}

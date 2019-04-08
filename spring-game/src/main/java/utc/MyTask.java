package utc;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/4 0004 17:23
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 */
public class MyTask implements Runnable {

    private int num;

    public MyTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行的Task " + num);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyTask " + num + "执行完毕");

    }
}

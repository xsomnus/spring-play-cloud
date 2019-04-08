package xsomnus.learn_java.io.bitoper;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/4/4 0004 9:46
 * 当你发现自己的才华撑不起野心时，就请安静下来学习吧
 */
public class BitOperationTest {


    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            judge(i);
        }

        int x = 3;

        int y = x >> 1;

        System.out.println(y);
    }

    public static void judge(int x) {
        if ((x & 0x1) > 0 ) {
            System.out.println("奇数");
        }
        if ((x & 0x1) == 0) {
            System.out.println("偶数");
        }
    }

}

package xsomnus.learn_java;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/11 0011 14:45
 */
public class BitCalc {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        x = x ^ y ^ (y = x);
        System.out.println(x);
        System.out.println(y);

        String a = "a";
        String b = "b";

        int s = 423;
        System.out.println(s & (-s));
    }
}

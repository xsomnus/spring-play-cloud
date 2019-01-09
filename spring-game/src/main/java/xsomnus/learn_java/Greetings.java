package xsomnus.learn_java;

import com.Person;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/9 0009 9:23
 */
public class Greetings {

    void greet(FunctionalInterfaceA way) {
        Person zhangsan = new Person("张三", 23);
        way.hello(zhangsan);
        way.sayHi(zhangsan);
    }

    public static void main(String[] args) {
       Greetings g=  new Greetings();

        g.greet(person -> {
            String s = person.getAge() + "岁的" + person.getName() + "你好";
            System.out.println(s);
        });
    }
}

package xsomnus.learn_java;

import com.Person;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/9 0009 9:21
 */
@FunctionalInterface
public interface FunctionalInterfaceA {

    void sayHi(Person person);

    default void hello(Person person) {
        System.out.println("你好，" + person.getName());
    }
}

package xsomnus.learn_java;

import com.Person;

import static org.junit.Assert.*;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/9 0009 9:19
 */
public class TestInterfaceTest {

    public static void main(String[] args) {
        TestInterface testInterface = person -> System.out.println("hello" + person.getName());

        Person p = testInterface.person;
        System.out.println(p);
    }
}
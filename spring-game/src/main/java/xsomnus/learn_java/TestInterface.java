package xsomnus.learn_java;

import com.Person;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/9 0009 9:17
 */
public interface TestInterface {

    Person person = new Person("张三", 23);

    void sayHi(Person person);
}

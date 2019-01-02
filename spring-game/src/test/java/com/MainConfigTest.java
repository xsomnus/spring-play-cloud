package com;

import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.collection.Stream;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;


/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 10:53
 */
public class MainConfigTest {

    @Test
    public void testIOC1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        applicationContext.registerBean("zhansan",Person.class, "张三", 12);

        Object person = applicationContext.getBean("person");
        System.out.println(person);

        Object person1 = applicationContext.getBean("person");
        System.out.println(person);

        Object person2 = applicationContext.getBean("person");
        System.out.println(person);

        Object person3 = applicationContext.getBean("person");
        System.out.println(person);
//        ((AnnotationConfigApplicationContext) applicationContext).removeBeanDefinition("person");

        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }
    @Test
    public void testIOC2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void testStream() {

        List<Tuple2<Integer, String>> tuple2List = Stream.ofAll(1, 2, 3)
                .zip(List.of("a", "b"))
                .toList();

    }
}
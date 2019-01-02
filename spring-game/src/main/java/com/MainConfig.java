package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xsomnus_xiawenye
 * @since 2018/12/29 0029 10:47
 */
@Configuration
public class MainConfig {

    //@Scope(value = SCOPE_PROTOTYPE)
    @Bean
    public Person person() {
        System.out.println("向容器中添加对象");
        return new Person("夏文晔", 26);
    }

    @Bean("bill")
    @Conditional(value = {})
    public Person person1() {
        System.out.println("person2");
        return new Person("Bill Gates", 62);
    }

    @Bean("steve")
    public Person person2() {
        System.out.println("person3");
        return new Person("Steve Jobs", 62);
    }
}

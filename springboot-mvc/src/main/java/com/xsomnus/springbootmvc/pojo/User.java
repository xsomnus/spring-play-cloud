package com.xsomnus.springbootmvc.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/11 0011 11:01
 */
public class User implements People {

    @Getter
    private int age;
    private String motto;

    public User(int age, String motto) {
        this.age = age;
        this.motto = motto;
    }


    @Override
    public Wife t___N23DD() {
        return new Wife("ll", "23");
    }


    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        String ll = objectMapper.writeValueAsString(new User(12, "ll"));
//        System.out.println(ll);

        People people = new User(12, "ll");
        System.out.println(people.getClass());
    }
}

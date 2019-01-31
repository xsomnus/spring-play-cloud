package com.xsomnus.springbootmvc.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/11 0011 11:00
 */
public interface People {

    Wife t___N23DD();

    @Data
    class Wife implements Serializable {
        private String name;
        private String age;

        public Wife(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }

}

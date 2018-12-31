package com.xsomnus.patterns.struct.adapter;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 00:17
 **/
public class DogAdapter implements Robot {

    Dog dog;

    /**
     * 获取要适配的对象的引用
     */
    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void cry() {
        System.out.println("机器人模拟狗叫....");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模拟狗跑");
        dog.run();
    }
}

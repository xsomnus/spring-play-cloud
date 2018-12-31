package com.xsomnus.patterns.struct.adapter;

/**
 * @author xsomnus_xiawenye
 * @since 2018-12-31 00:21
 **/
public class Client {

    public static void main(String[] args) {
        BioRobot bioRobot = new BioRobot();
        Dog dog = new Dog();

        //将这只小狗包装到机器人中, 让其有点像机器人
        Robot dogRobot = new DogAdapter(dog);
        System.out.println("BioRob cry....");

        dogRobot.cry();
        dogRobot.move();
    }
}

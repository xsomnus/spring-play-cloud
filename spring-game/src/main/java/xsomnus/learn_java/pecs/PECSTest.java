package xsomnus.learn_java.pecs;

import xsomnus.learn_java.pecs.metadata.Apple;
import xsomnus.learn_java.pecs.metadata.Banana;
import xsomnus.learn_java.pecs.metadata.Fruit;
import xsomnus.learn_java.pecs.metadata.Orange;

import java.util.ArrayList;
import java.util.List;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/3/26 0026 14:00
 */
public class PECSTest {


    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("红色");
        apple.setName("富宏士");

        Orange orange = new Orange();
        orange.setPrice(12);
        orange.setName("橘子");

        Banana banana = new Banana();
        banana.setName("香蕉");
        banana.setWeight(1222);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);

        fruits.forEach(System.out::println);

        Fruit fruit = fruits.get(0);
        System.out.println(fruit);
    }

}

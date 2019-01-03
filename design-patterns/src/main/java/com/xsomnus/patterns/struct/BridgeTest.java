package com.xsomnus.patterns.struct;

import com.xsomnus.patterns.struct.bridge.Color;
import com.xsomnus.patterns.struct.bridge.Shape;
import com.xsomnus.patterns.struct.bridge.color.Black;
import com.xsomnus.patterns.struct.bridge.color.Blue;
import com.xsomnus.patterns.struct.bridge.color.White;
import com.xsomnus.patterns.struct.bridge.shapes.Circle;
import com.xsomnus.patterns.struct.bridge.shapes.Rectangle;
import com.xsomnus.patterns.struct.bridge.shapes.Square;

/**
 * 桥接模式包含如下角色：
 * <p>
 * Abstraction：抽象类  --- {@link Shape}
 * RefinedAbstraction：扩充抽象类 {@link Color}
 * Implementor：实现类接口 --{@link Circle,Rectangle,Square}
 * ConcreteImplementor：具体实现类  {@link White,Black,Blue}
 * </p>
 *
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:05
 */
public class BridgeTest {

    public static void main(String[] args) {
        Color white = new White();
        Color black = new Black();
        Color blue = new Blue();


        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();


        square.setColor(white);
        square.draw();

        square.setColor(blue);
        square.draw();

        circle.setColor(black);
        rectangle.setColor(blue);
        circle.draw();
        rectangle.draw();

    }
}

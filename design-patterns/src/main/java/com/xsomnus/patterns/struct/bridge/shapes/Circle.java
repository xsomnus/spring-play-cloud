package com.xsomnus.patterns.struct.bridge.shapes;

import com.xsomnus.patterns.struct.bridge.Shape;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:01
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }
}

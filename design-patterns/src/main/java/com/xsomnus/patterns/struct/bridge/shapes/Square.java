package com.xsomnus.patterns.struct.bridge.shapes;

import com.xsomnus.patterns.struct.bridge.Shape;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:02
 */
public class Square extends Shape {
    @Override
    public void draw() {
        color.paint("正方形");
    }
}

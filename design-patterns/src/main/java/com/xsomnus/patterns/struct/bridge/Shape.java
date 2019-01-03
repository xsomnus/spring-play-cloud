package com.xsomnus.patterns.struct.bridge;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 10:58
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

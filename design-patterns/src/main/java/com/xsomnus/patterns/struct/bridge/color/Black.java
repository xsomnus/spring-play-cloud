package com.xsomnus.patterns.struct.bridge.color;

import com.xsomnus.patterns.struct.bridge.Color;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:04
 */
public class Black implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("黑色的" + shape);
    }
}

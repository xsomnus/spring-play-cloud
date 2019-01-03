package com.xsomnus.patterns.struct.bridge.color;

import com.xsomnus.patterns.struct.bridge.Color;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:03
 */
public class Blue implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("蓝色的" + shape);
    }
}

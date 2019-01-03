package com.xsomnus.patterns.struct.bridge.color;

import com.xsomnus.patterns.struct.bridge.Color;

/**
 * @author xsomnus_xiawenye
 * @since 2019/1/3 0003 11:02
 */
public class White implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("白色的" + shape);
    }
}

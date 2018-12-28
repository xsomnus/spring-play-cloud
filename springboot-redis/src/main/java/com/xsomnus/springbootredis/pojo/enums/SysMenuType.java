package com.xsomnus.springbootredis.pojo.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author somnus_xiawenye
 * @since 2018/10/11 0011 18:29
 */
public enum SysMenuType implements IEnum<Integer> {
    MENU(1, "菜单"),
    BUTTON(2, "按钮");

    private final int code;
    private final String msg;

    SysMenuType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return code;
    }
}

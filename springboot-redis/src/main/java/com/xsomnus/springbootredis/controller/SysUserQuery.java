package com.xsomnus.springbootredis.controller;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author somnus_xiawenye
 * @since 2018/11/29 0029 17:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends PageQuery {
    private String username;
    private String telephone;
    private String aBc;
}

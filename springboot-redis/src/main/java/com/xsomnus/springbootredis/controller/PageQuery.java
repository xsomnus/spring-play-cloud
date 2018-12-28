package com.xsomnus.springbootredis.controller;

import lombok.Data;

/**
 * @author somnus_xiawenye
 * @since 2018/11/29 0029 17:29
 */
@Data
public class PageQuery {
    private Long page;
    private Long limit;
}

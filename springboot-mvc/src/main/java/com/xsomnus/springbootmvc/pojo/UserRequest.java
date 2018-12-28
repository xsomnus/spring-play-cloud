package com.xsomnus.springbootmvc.pojo;

import lombok.Data;

import java.time.OffsetDateTime;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 11:45
 */
@Data
public class UserRequest {
    private Long id;
    private String name;
    private String birthPlace;
    private OffsetDateTime birth;
}

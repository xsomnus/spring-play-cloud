package com.xsomnus.springbootmvc.config;

import org.assertj.core.data.Offset;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 12:07
 */
public class CustomOffsetDateTimeDeserializerTest {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Test
    public void deserialize() {
        LocalDateTime localDateTime = LocalDateTime.parse("1920-12-12 12:12:12", formatter);
        OffsetDateTime of = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(8));
        System.out.println(of);
    }
}
package com.xsomnus.springbootmvc.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 14:14
 */
public class CustomOffsetDateTimeSerialize extends JsonSerializer<OffsetDateTime> {

    public static final CustomOffsetDateTimeSerialize INSTANCE = new CustomOffsetDateTimeSerialize();

    @Override
    public void serialize(OffsetDateTime offsetDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(offsetDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

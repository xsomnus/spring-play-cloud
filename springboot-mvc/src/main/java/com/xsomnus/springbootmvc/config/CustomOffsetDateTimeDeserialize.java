package com.xsomnus.springbootmvc.config;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author somnus_xiawenye
 * @since 2018/11/28 0028 14:09
 */
public class CustomOffsetDateTimeDeserialize extends JsonDeserializer<OffsetDateTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static final CustomOffsetDateTimeDeserialize INSTANCE = new CustomOffsetDateTimeDeserialize();

    @Override
    public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String date = jsonParser.getValueAsString();
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        return OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(8));
    }
}

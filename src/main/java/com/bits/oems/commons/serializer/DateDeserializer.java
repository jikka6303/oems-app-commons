package com.bits.oems.commons.serializer;

import com.bits.oems.commons.constant.AppConstants;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDeserializer extends JsonDeserializer<LocalDate> {

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext context) throws IOException, JacksonException {
        String text = p.getText();
        if(StringUtils.isNotEmpty(text)) {
            return LocalDate.parse(text, DateTimeFormatter.ofPattern(AppConstants.DATE_FORMAT));
        }
        return null;
    }
}

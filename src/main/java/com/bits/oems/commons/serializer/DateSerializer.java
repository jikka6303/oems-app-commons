package com.bits.oems.commons.serializer;

import com.bits.oems.commons.constant.AppConstants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateSerializer extends JsonSerializer<LocalDate> {

	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		if (value != null) {
			gen.writeString(value.format(DateTimeFormatter.ofPattern(AppConstants.DATE_FORMAT)));
		} else {
			gen.writeString(StringUtils.EMPTY);
		}
	}
}

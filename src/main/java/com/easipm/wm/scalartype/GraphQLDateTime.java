package com.easipm.wm.scalartype; 

import org.springframework.stereotype.Component;
import graphql.schema.*;
import java.util.Objects;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import graphql.language.*;

@Component
public class GraphQLDateTime extends GraphQLScalarType {

	private static final String DEFAULT_NAME = "DateTime";

	public GraphQLDateTime() {
		this(DEFAULT_NAME);
	}

	public GraphQLDateTime(final String name) {

		super(name != null ? name : DEFAULT_NAME, "Date Time type", new Coercing<DateTime, String>() {

			private DateTime ConvertImpl(Object input) {
				if (input instanceof String) {
					String value = input.toString().replace("T", " ").replace(".000+0000", "");
					DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd' 'HH:mm:ss");
					DateTime dateTimeInUTC = formatter.withZoneUTC().parseDateTime(value);
					return dateTimeInUTC;
				} else {
					return null;
				}

			}

			@Override
			public String serialize(Object input) {

				if (input instanceof DateTime) {
					Objects.requireNonNull((DateTime) input, "datetime");
					return ((DateTime) input).toDateTime(DateTimeZone.UTC).toString().replace("Z", "+0000");

				} else {
					DateTime result = ConvertImpl(input);
					if (result == null) {
						throw new CoercingSerializeException("Invalid value '" + input + "' for DateTime");
					}
					Objects.requireNonNull(result, "datetime");
					return result.toString();
				}
			}

			@Override
			public DateTime parseValue(Object input) {
				DateTime result = ConvertImpl(input);
				if (result == null) {
					throw new CoercingParseValueException("Invalid value '" + input + "' for DateTime");
				}
				return result;
			}

			@Override
			public DateTime parseLiteral(Object input) {
				if (!(input instanceof StringValue)) {
					return null;
				}
				String value = ((StringValue) input).getValue();
				return ConvertImpl(value);
			}
		});
	}

}

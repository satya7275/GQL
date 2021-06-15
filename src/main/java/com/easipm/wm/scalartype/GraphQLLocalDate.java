package com.easipm.wm.scalartype;

import org.springframework.stereotype.Component;
import graphql.schema.*;
import java.time.LocalDate;
import graphql.language.*;

@Component
public class GraphQLLocalDate extends GraphQLScalarType {

	private static final String DEFAULT_NAME = "LocalDate";

	public GraphQLLocalDate() {
		this(DEFAULT_NAME);
	}

	public GraphQLLocalDate(final String name) {
		
		super("LocalDate", "Local Date Type",
				new Coercing<LocalDate, String>(){
			
			@Override
			public String serialize(Object input) throws CoercingSerializeException{
				return ((LocalDate) input).toString();
			}
			@Override
			public LocalDate parseValue(Object input) throws CoercingParseValueException{
				return LocalDate.parse((String) input);
		}
			@Override
			public LocalDate parseLiteral(Object input) throws CoercingParseLiteralException {
				if( input instanceof StringValue) {
					return LocalDate.parse(((StringValue) input).getValue());
				}else { 
					return LocalDate.now();
				}
			}
		});
}

}

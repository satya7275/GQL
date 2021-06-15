package com.easipm.wm.scalartype;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.schema.*;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import graphql.language.*;

@Component
public class GraphQLBlob extends GraphQLScalarType{
	
	private static final String DEFAULT_NAME = "Blob";
	
	public GraphQLBlob() {
		this(DEFAULT_NAME);
	}
	
	public GraphQLBlob(final String name) {
		
		super(name !=null ? name:DEFAULT_NAME, "Blob for Graphql",
				new Coercing<ByteBuffer, Object>(){
			

			@Override
			public Object serialize(Object o) throws  CoercingSerializeException{

				Object values = null;
				Charset charset = Charset.forName("UTF-8");
				String decoded_config_value = charset.decode((ByteBuffer) o).toString();
				try {
					values = new ObjectMapper().reader().forType(new TypeReference<Object>() {
					}).readValue(decoded_config_value);
				}catch (Exception e) {
					return decoded_config_value;
				}
				
				return values;
			}
			
			@Override
			public ByteBuffer parseValue(Object input) throws CoercingParseValueException {
				if (input instanceof String) {
					return ByteBuffer.wrap(((String) input).getBytes(Charset.forName("UTF-8")));
				}else {
					return null;
				}
			}
			@Override
			public ByteBuffer parseLiteral(Object input) throws CoercingParseLiteralException{
				if(!( input instanceof StringValue)) {
					return null;
				}
				input = ((StringValue) input).getValue();
				return ByteBuffer.wrap(((String) input).getBytes(Charset.forName("UTF-8")));
			}
		});
	}
	
}

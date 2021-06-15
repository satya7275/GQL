package com.easipm.wm.scalartype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import graphql.schema.*;
import graphql.scalars.*;

@Configuration
public class GraphQLScalarConfig {
	
	@Bean
	public GraphQLScalarType nonNegativeInt() {
		return ExtendedScalars.NonNegativeInt;
	}
	
	@Bean
	public GraphQLScalarType DateTime() {
		return ExtendedScalars.DateTime;
	}
	
}

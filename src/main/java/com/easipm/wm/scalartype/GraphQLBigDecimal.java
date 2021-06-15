package com.easipm.wm.scalartype;

import org.springframework.stereotype.Component;
import graphql.schema.*;
import java.math.BigDecimal;
import graphql.language.*;

@Component
public class GraphQLBigDecimal extends GraphQLScalarType {

	private static final String DEFAULT_NAME = "BigDecimal";

	public GraphQLBigDecimal() {
		this(DEFAULT_NAME);
	}

	public GraphQLBigDecimal(final String name) {

		super(name != null ? name : DEFAULT_NAME, "Built-in java.math.BigDecimal",
				new Coercing<BigDecimal, BigDecimal>() {

					private BigDecimal ConvertImpl(Object input) {
						if (input instanceof Number || input instanceof String) {
							try {
								return new BigDecimal(input.toString());
							} catch (NumberFormatException e) {
								return null;
							}

						}
						return null;
					}

					@Override
					public BigDecimal serialize(Object input) {
						BigDecimal result = ConvertImpl(input);
						if (result == null) {
							throw new CoercingSerializeException(
									"Expeccted type 'BigDecimal' but was '" + input + "'.");
						}
						return result;
					}

					@Override
					public BigDecimal parseValue(Object input) {
						BigDecimal result = ConvertImpl(input);
						if (result == null) {
							throw new CoercingParseValueException(
									"Expeccted type 'BigDecimal' but was '" + input + "'.");
						}
						return result;
					}

					@Override
					public BigDecimal parseLiteral(Object input) {
						if (input instanceof StringValue) {
							try {
								return new BigDecimal(((StringValue) input).getValue());
							} catch (NumberFormatException e) {
								throw new CoercingParseLiteralException(
										"Unable to turn AST input into a  'BigDecimal' : '" + input + "'.");
							}
						} else if (input instanceof IntValue) {
							return new BigDecimal(((IntValue) input).getValue());
						} else if (input instanceof FloatValue) {
							return ((FloatValue) input).getValue();
						}

						throw new CoercingParseLiteralException(
								" Expected AST type 'IntValue', 'StringValue', 'FloatValue' but was : '" + input
										+ "'.");
					}
				});
	}

}

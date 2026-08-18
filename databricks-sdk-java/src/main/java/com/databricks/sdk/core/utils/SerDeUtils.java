package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/** Utilities for serialization and deserialization in the Databricks Java SDK. */
@InternalApi
public class SerDeUtils {
  public static ObjectMapper createMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper
        .registerModule(new JavaTimeModule())
        .registerModule(new GuavaModule())
        .registerModule(new Jdk8Module())
        .registerModule(new ProtobufModule())
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    // Databricks services return int64 fields as either JSON numbers (123) or decimal strings
    // ("123"). Pin String->integer coercion so both deserialize into Long. Jackson does this by
    // default; pinning it guards against a silent regression if that default is ever tightened.
    mapper
        .coercionConfigFor(LogicalType.Integer)
        .setCoercion(CoercionInputShape.String, CoercionAction.TryConvert);
    return mapper;
  }
}

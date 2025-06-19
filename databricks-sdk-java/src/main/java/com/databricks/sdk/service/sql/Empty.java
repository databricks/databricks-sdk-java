// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/**
 * Represents an empty message, similar to google.protobuf.Empty, which is not available in the firm
 * right now.
 */
@Generated
@JsonSerialize(using = Empty.EmptySerializer.class)
@JsonDeserialize(using = Empty.EmptyDeserializer.class)
public class Empty {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(Empty.class).toString();
  }

  EmptyPb toPb() {
    EmptyPb pb = new EmptyPb();

    return pb;
  }

  static Empty fromPb(EmptyPb pb) {
    Empty model = new Empty();

    return model;
  }

  public static class EmptySerializer extends JsonSerializer<Empty> {
    @Override
    public void serialize(Empty value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EmptyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EmptyDeserializer extends JsonDeserializer<Empty> {
    @Override
    public Empty deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EmptyPb pb = mapper.readValue(p, EmptyPb.class);
      return Empty.fromPb(pb);
    }
  }
}

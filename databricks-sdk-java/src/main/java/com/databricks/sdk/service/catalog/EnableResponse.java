// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

@Generated
@JsonSerialize(using = EnableResponse.EnableResponseSerializer.class)
@JsonDeserialize(using = EnableResponse.EnableResponseDeserializer.class)
public class EnableResponse {

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
    return new ToStringer(EnableResponse.class).toString();
  }

  EnableResponsePb toPb() {
    EnableResponsePb pb = new EnableResponsePb();

    return pb;
  }

  static EnableResponse fromPb(EnableResponsePb pb) {
    EnableResponse model = new EnableResponse();

    return model;
  }

  public static class EnableResponseSerializer extends JsonSerializer<EnableResponse> {
    @Override
    public void serialize(EnableResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnableResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnableResponseDeserializer extends JsonDeserializer<EnableResponse> {
    @Override
    public EnableResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnableResponsePb pb = mapper.readValue(p, EnableResponsePb.class);
      return EnableResponse.fromPb(pb);
    }
  }
}

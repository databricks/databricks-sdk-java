// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = RemoveResponse.RemoveResponseSerializer.class)
@JsonDeserialize(using = RemoveResponse.RemoveResponseDeserializer.class)
public class RemoveResponse {

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
    return new ToStringer(RemoveResponse.class).toString();
  }

  RemoveResponsePb toPb() {
    RemoveResponsePb pb = new RemoveResponsePb();

    return pb;
  }

  static RemoveResponse fromPb(RemoveResponsePb pb) {
    RemoveResponse model = new RemoveResponse();

    return model;
  }

  public static class RemoveResponseSerializer extends JsonSerializer<RemoveResponse> {
    @Override
    public void serialize(RemoveResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RemoveResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RemoveResponseDeserializer extends JsonDeserializer<RemoveResponse> {
    @Override
    public RemoveResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RemoveResponsePb pb = mapper.readValue(p, RemoveResponsePb.class);
      return RemoveResponse.fromPb(pb);
    }
  }
}

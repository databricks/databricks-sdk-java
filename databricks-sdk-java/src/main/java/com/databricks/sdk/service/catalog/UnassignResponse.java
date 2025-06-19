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
@JsonSerialize(using = UnassignResponse.UnassignResponseSerializer.class)
@JsonDeserialize(using = UnassignResponse.UnassignResponseDeserializer.class)
public class UnassignResponse {

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
    return new ToStringer(UnassignResponse.class).toString();
  }

  UnassignResponsePb toPb() {
    UnassignResponsePb pb = new UnassignResponsePb();

    return pb;
  }

  static UnassignResponse fromPb(UnassignResponsePb pb) {
    UnassignResponse model = new UnassignResponse();

    return model;
  }

  public static class UnassignResponseSerializer extends JsonSerializer<UnassignResponse> {
    @Override
    public void serialize(UnassignResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnassignResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnassignResponseDeserializer extends JsonDeserializer<UnassignResponse> {
    @Override
    public UnassignResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnassignResponsePb pb = mapper.readValue(p, UnassignResponsePb.class);
      return UnassignResponse.fromPb(pb);
    }
  }
}

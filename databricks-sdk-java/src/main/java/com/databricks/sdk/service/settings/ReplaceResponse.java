// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = ReplaceResponse.ReplaceResponseSerializer.class)
@JsonDeserialize(using = ReplaceResponse.ReplaceResponseDeserializer.class)
public class ReplaceResponse {

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
    return new ToStringer(ReplaceResponse.class).toString();
  }

  ReplaceResponsePb toPb() {
    ReplaceResponsePb pb = new ReplaceResponsePb();

    return pb;
  }

  static ReplaceResponse fromPb(ReplaceResponsePb pb) {
    ReplaceResponse model = new ReplaceResponse();

    return model;
  }

  public static class ReplaceResponseSerializer extends JsonSerializer<ReplaceResponse> {
    @Override
    public void serialize(ReplaceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ReplaceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ReplaceResponseDeserializer extends JsonDeserializer<ReplaceResponse> {
    @Override
    public ReplaceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ReplaceResponsePb pb = mapper.readValue(p, ReplaceResponsePb.class);
      return ReplaceResponse.fromPb(pb);
    }
  }
}

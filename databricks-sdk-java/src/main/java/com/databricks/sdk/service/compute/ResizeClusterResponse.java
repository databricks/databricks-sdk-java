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
@JsonSerialize(using = ResizeClusterResponse.ResizeClusterResponseSerializer.class)
@JsonDeserialize(using = ResizeClusterResponse.ResizeClusterResponseDeserializer.class)
public class ResizeClusterResponse {

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
    return new ToStringer(ResizeClusterResponse.class).toString();
  }

  ResizeClusterResponsePb toPb() {
    ResizeClusterResponsePb pb = new ResizeClusterResponsePb();

    return pb;
  }

  static ResizeClusterResponse fromPb(ResizeClusterResponsePb pb) {
    ResizeClusterResponse model = new ResizeClusterResponse();

    return model;
  }

  public static class ResizeClusterResponseSerializer
      extends JsonSerializer<ResizeClusterResponse> {
    @Override
    public void serialize(
        ResizeClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResizeClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResizeClusterResponseDeserializer
      extends JsonDeserializer<ResizeClusterResponse> {
    @Override
    public ResizeClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResizeClusterResponsePb pb = mapper.readValue(p, ResizeClusterResponsePb.class);
      return ResizeClusterResponse.fromPb(pb);
    }
  }
}

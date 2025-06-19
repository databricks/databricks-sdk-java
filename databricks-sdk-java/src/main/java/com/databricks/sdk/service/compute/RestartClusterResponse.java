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
@JsonSerialize(using = RestartClusterResponse.RestartClusterResponseSerializer.class)
@JsonDeserialize(using = RestartClusterResponse.RestartClusterResponseDeserializer.class)
public class RestartClusterResponse {

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
    return new ToStringer(RestartClusterResponse.class).toString();
  }

  RestartClusterResponsePb toPb() {
    RestartClusterResponsePb pb = new RestartClusterResponsePb();

    return pb;
  }

  static RestartClusterResponse fromPb(RestartClusterResponsePb pb) {
    RestartClusterResponse model = new RestartClusterResponse();

    return model;
  }

  public static class RestartClusterResponseSerializer
      extends JsonSerializer<RestartClusterResponse> {
    @Override
    public void serialize(
        RestartClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestartClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestartClusterResponseDeserializer
      extends JsonDeserializer<RestartClusterResponse> {
    @Override
    public RestartClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestartClusterResponsePb pb = mapper.readValue(p, RestartClusterResponsePb.class);
      return RestartClusterResponse.fromPb(pb);
    }
  }
}

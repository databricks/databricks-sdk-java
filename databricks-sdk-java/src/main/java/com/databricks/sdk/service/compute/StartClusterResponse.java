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
@JsonSerialize(using = StartClusterResponse.StartClusterResponseSerializer.class)
@JsonDeserialize(using = StartClusterResponse.StartClusterResponseDeserializer.class)
public class StartClusterResponse {

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
    return new ToStringer(StartClusterResponse.class).toString();
  }

  StartClusterResponsePb toPb() {
    StartClusterResponsePb pb = new StartClusterResponsePb();

    return pb;
  }

  static StartClusterResponse fromPb(StartClusterResponsePb pb) {
    StartClusterResponse model = new StartClusterResponse();

    return model;
  }

  public static class StartClusterResponseSerializer extends JsonSerializer<StartClusterResponse> {
    @Override
    public void serialize(
        StartClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartClusterResponseDeserializer
      extends JsonDeserializer<StartClusterResponse> {
    @Override
    public StartClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartClusterResponsePb pb = mapper.readValue(p, StartClusterResponsePb.class);
      return StartClusterResponse.fromPb(pb);
    }
  }
}

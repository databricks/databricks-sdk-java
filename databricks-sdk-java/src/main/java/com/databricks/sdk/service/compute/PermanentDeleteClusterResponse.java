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
@JsonSerialize(
    using = PermanentDeleteClusterResponse.PermanentDeleteClusterResponseSerializer.class)
@JsonDeserialize(
    using = PermanentDeleteClusterResponse.PermanentDeleteClusterResponseDeserializer.class)
public class PermanentDeleteClusterResponse {

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
    return new ToStringer(PermanentDeleteClusterResponse.class).toString();
  }

  PermanentDeleteClusterResponsePb toPb() {
    PermanentDeleteClusterResponsePb pb = new PermanentDeleteClusterResponsePb();

    return pb;
  }

  static PermanentDeleteClusterResponse fromPb(PermanentDeleteClusterResponsePb pb) {
    PermanentDeleteClusterResponse model = new PermanentDeleteClusterResponse();

    return model;
  }

  public static class PermanentDeleteClusterResponseSerializer
      extends JsonSerializer<PermanentDeleteClusterResponse> {
    @Override
    public void serialize(
        PermanentDeleteClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermanentDeleteClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermanentDeleteClusterResponseDeserializer
      extends JsonDeserializer<PermanentDeleteClusterResponse> {
    @Override
    public PermanentDeleteClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermanentDeleteClusterResponsePb pb =
          mapper.readValue(p, PermanentDeleteClusterResponsePb.class);
      return PermanentDeleteClusterResponse.fromPb(pb);
    }
  }
}

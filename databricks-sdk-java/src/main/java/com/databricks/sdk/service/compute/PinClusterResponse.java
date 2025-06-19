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
@JsonSerialize(using = PinClusterResponse.PinClusterResponseSerializer.class)
@JsonDeserialize(using = PinClusterResponse.PinClusterResponseDeserializer.class)
public class PinClusterResponse {

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
    return new ToStringer(PinClusterResponse.class).toString();
  }

  PinClusterResponsePb toPb() {
    PinClusterResponsePb pb = new PinClusterResponsePb();

    return pb;
  }

  static PinClusterResponse fromPb(PinClusterResponsePb pb) {
    PinClusterResponse model = new PinClusterResponse();

    return model;
  }

  public static class PinClusterResponseSerializer extends JsonSerializer<PinClusterResponse> {
    @Override
    public void serialize(PinClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PinClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PinClusterResponseDeserializer extends JsonDeserializer<PinClusterResponse> {
    @Override
    public PinClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PinClusterResponsePb pb = mapper.readValue(p, PinClusterResponsePb.class);
      return PinClusterResponse.fromPb(pb);
    }
  }
}

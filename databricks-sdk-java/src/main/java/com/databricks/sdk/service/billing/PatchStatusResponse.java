// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
@JsonSerialize(using = PatchStatusResponse.PatchStatusResponseSerializer.class)
@JsonDeserialize(using = PatchStatusResponse.PatchStatusResponseDeserializer.class)
public class PatchStatusResponse {

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
    return new ToStringer(PatchStatusResponse.class).toString();
  }

  PatchStatusResponsePb toPb() {
    PatchStatusResponsePb pb = new PatchStatusResponsePb();

    return pb;
  }

  static PatchStatusResponse fromPb(PatchStatusResponsePb pb) {
    PatchStatusResponse model = new PatchStatusResponse();

    return model;
  }

  public static class PatchStatusResponseSerializer extends JsonSerializer<PatchStatusResponse> {
    @Override
    public void serialize(PatchStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchStatusResponseDeserializer
      extends JsonDeserializer<PatchStatusResponse> {
    @Override
    public PatchStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchStatusResponsePb pb = mapper.readValue(p, PatchStatusResponsePb.class);
      return PatchStatusResponse.fromPb(pb);
    }
  }
}

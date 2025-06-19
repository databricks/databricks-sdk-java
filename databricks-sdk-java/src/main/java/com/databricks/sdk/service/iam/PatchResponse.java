// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = PatchResponse.PatchResponseSerializer.class)
@JsonDeserialize(using = PatchResponse.PatchResponseDeserializer.class)
public class PatchResponse {

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
    return new ToStringer(PatchResponse.class).toString();
  }

  PatchResponsePb toPb() {
    PatchResponsePb pb = new PatchResponsePb();

    return pb;
  }

  static PatchResponse fromPb(PatchResponsePb pb) {
    PatchResponse model = new PatchResponse();

    return model;
  }

  public static class PatchResponseSerializer extends JsonSerializer<PatchResponse> {
    @Override
    public void serialize(PatchResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchResponseDeserializer extends JsonDeserializer<PatchResponse> {
    @Override
    public PatchResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchResponsePb pb = mapper.readValue(p, PatchResponsePb.class);
      return PatchResponse.fromPb(pb);
    }
  }
}

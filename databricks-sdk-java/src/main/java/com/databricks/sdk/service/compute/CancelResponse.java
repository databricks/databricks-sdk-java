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
@JsonSerialize(using = CancelResponse.CancelResponseSerializer.class)
@JsonDeserialize(using = CancelResponse.CancelResponseDeserializer.class)
public class CancelResponse {

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
    return new ToStringer(CancelResponse.class).toString();
  }

  CancelResponsePb toPb() {
    CancelResponsePb pb = new CancelResponsePb();

    return pb;
  }

  static CancelResponse fromPb(CancelResponsePb pb) {
    CancelResponse model = new CancelResponse();

    return model;
  }

  public static class CancelResponseSerializer extends JsonSerializer<CancelResponse> {
    @Override
    public void serialize(CancelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelResponseDeserializer extends JsonDeserializer<CancelResponse> {
    @Override
    public CancelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelResponsePb pb = mapper.readValue(p, CancelResponsePb.class);
      return CancelResponse.fromPb(pb);
    }
  }
}

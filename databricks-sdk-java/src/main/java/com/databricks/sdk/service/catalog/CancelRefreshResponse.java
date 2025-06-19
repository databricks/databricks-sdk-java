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
@JsonSerialize(using = CancelRefreshResponse.CancelRefreshResponseSerializer.class)
@JsonDeserialize(using = CancelRefreshResponse.CancelRefreshResponseDeserializer.class)
public class CancelRefreshResponse {

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
    return new ToStringer(CancelRefreshResponse.class).toString();
  }

  CancelRefreshResponsePb toPb() {
    CancelRefreshResponsePb pb = new CancelRefreshResponsePb();

    return pb;
  }

  static CancelRefreshResponse fromPb(CancelRefreshResponsePb pb) {
    CancelRefreshResponse model = new CancelRefreshResponse();

    return model;
  }

  public static class CancelRefreshResponseSerializer
      extends JsonSerializer<CancelRefreshResponse> {
    @Override
    public void serialize(
        CancelRefreshResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelRefreshResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelRefreshResponseDeserializer
      extends JsonDeserializer<CancelRefreshResponse> {
    @Override
    public CancelRefreshResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelRefreshResponsePb pb = mapper.readValue(p, CancelRefreshResponsePb.class);
      return CancelRefreshResponse.fromPb(pb);
    }
  }
}

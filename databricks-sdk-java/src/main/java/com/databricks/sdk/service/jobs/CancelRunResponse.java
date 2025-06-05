// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = CancelRunResponse.CancelRunResponseSerializer.class)
@JsonDeserialize(using = CancelRunResponse.CancelRunResponseDeserializer.class)
public class CancelRunResponse {

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
    return new ToStringer(CancelRunResponse.class).toString();
  }

  CancelRunResponsePb toPb() {
    CancelRunResponsePb pb = new CancelRunResponsePb();

    return pb;
  }

  static CancelRunResponse fromPb(CancelRunResponsePb pb) {
    CancelRunResponse model = new CancelRunResponse();

    return model;
  }

  public static class CancelRunResponseSerializer extends JsonSerializer<CancelRunResponse> {
    @Override
    public void serialize(CancelRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelRunResponseDeserializer extends JsonDeserializer<CancelRunResponse> {
    @Override
    public CancelRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelRunResponsePb pb = mapper.readValue(p, CancelRunResponsePb.class);
      return CancelRunResponse.fromPb(pb);
    }
  }
}

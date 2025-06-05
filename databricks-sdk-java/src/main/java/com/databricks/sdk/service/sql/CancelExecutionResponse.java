// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = CancelExecutionResponse.CancelExecutionResponseSerializer.class)
@JsonDeserialize(using = CancelExecutionResponse.CancelExecutionResponseDeserializer.class)
public class CancelExecutionResponse {

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
    return new ToStringer(CancelExecutionResponse.class).toString();
  }

  CancelExecutionResponsePb toPb() {
    CancelExecutionResponsePb pb = new CancelExecutionResponsePb();

    return pb;
  }

  static CancelExecutionResponse fromPb(CancelExecutionResponsePb pb) {
    CancelExecutionResponse model = new CancelExecutionResponse();

    return model;
  }

  public static class CancelExecutionResponseSerializer
      extends JsonSerializer<CancelExecutionResponse> {
    @Override
    public void serialize(
        CancelExecutionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelExecutionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelExecutionResponseDeserializer
      extends JsonDeserializer<CancelExecutionResponse> {
    @Override
    public CancelExecutionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelExecutionResponsePb pb = mapper.readValue(p, CancelExecutionResponsePb.class);
      return CancelExecutionResponse.fromPb(pb);
    }
  }
}

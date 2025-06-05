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
@JsonSerialize(using = CancelAllRunsResponse.CancelAllRunsResponseSerializer.class)
@JsonDeserialize(using = CancelAllRunsResponse.CancelAllRunsResponseDeserializer.class)
public class CancelAllRunsResponse {

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
    return new ToStringer(CancelAllRunsResponse.class).toString();
  }

  CancelAllRunsResponsePb toPb() {
    CancelAllRunsResponsePb pb = new CancelAllRunsResponsePb();

    return pb;
  }

  static CancelAllRunsResponse fromPb(CancelAllRunsResponsePb pb) {
    CancelAllRunsResponse model = new CancelAllRunsResponse();

    return model;
  }

  public static class CancelAllRunsResponseSerializer
      extends JsonSerializer<CancelAllRunsResponse> {
    @Override
    public void serialize(
        CancelAllRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelAllRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelAllRunsResponseDeserializer
      extends JsonDeserializer<CancelAllRunsResponse> {
    @Override
    public CancelAllRunsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelAllRunsResponsePb pb = mapper.readValue(p, CancelAllRunsResponsePb.class);
      return CancelAllRunsResponse.fromPb(pb);
    }
  }
}

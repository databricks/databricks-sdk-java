// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = ExecuteQueryResponse.ExecuteQueryResponseSerializer.class)
@JsonDeserialize(using = ExecuteQueryResponse.ExecuteQueryResponseDeserializer.class)
public class ExecuteQueryResponse {

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
    return new ToStringer(ExecuteQueryResponse.class).toString();
  }

  ExecuteQueryResponsePb toPb() {
    ExecuteQueryResponsePb pb = new ExecuteQueryResponsePb();

    return pb;
  }

  static ExecuteQueryResponse fromPb(ExecuteQueryResponsePb pb) {
    ExecuteQueryResponse model = new ExecuteQueryResponse();

    return model;
  }

  public static class ExecuteQueryResponseSerializer extends JsonSerializer<ExecuteQueryResponse> {
    @Override
    public void serialize(
        ExecuteQueryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExecuteQueryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExecuteQueryResponseDeserializer
      extends JsonDeserializer<ExecuteQueryResponse> {
    @Override
    public ExecuteQueryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExecuteQueryResponsePb pb = mapper.readValue(p, ExecuteQueryResponsePb.class);
      return ExecuteQueryResponse.fromPb(pb);
    }
  }
}

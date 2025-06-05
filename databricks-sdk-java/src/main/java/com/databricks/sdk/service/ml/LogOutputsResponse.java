// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = LogOutputsResponse.LogOutputsResponseSerializer.class)
@JsonDeserialize(using = LogOutputsResponse.LogOutputsResponseDeserializer.class)
public class LogOutputsResponse {

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
    return new ToStringer(LogOutputsResponse.class).toString();
  }

  LogOutputsResponsePb toPb() {
    LogOutputsResponsePb pb = new LogOutputsResponsePb();

    return pb;
  }

  static LogOutputsResponse fromPb(LogOutputsResponsePb pb) {
    LogOutputsResponse model = new LogOutputsResponse();

    return model;
  }

  public static class LogOutputsResponseSerializer extends JsonSerializer<LogOutputsResponse> {
    @Override
    public void serialize(LogOutputsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogOutputsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogOutputsResponseDeserializer extends JsonDeserializer<LogOutputsResponse> {
    @Override
    public LogOutputsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogOutputsResponsePb pb = mapper.readValue(p, LogOutputsResponsePb.class);
      return LogOutputsResponse.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = LogBatchResponse.LogBatchResponseSerializer.class)
@JsonDeserialize(using = LogBatchResponse.LogBatchResponseDeserializer.class)
public class LogBatchResponse {

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
    return new ToStringer(LogBatchResponse.class).toString();
  }

  LogBatchResponsePb toPb() {
    LogBatchResponsePb pb = new LogBatchResponsePb();

    return pb;
  }

  static LogBatchResponse fromPb(LogBatchResponsePb pb) {
    LogBatchResponse model = new LogBatchResponse();

    return model;
  }

  public static class LogBatchResponseSerializer extends JsonSerializer<LogBatchResponse> {
    @Override
    public void serialize(LogBatchResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogBatchResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogBatchResponseDeserializer extends JsonDeserializer<LogBatchResponse> {
    @Override
    public LogBatchResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogBatchResponsePb pb = mapper.readValue(p, LogBatchResponsePb.class);
      return LogBatchResponse.fromPb(pb);
    }
  }
}

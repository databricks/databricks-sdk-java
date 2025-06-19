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
@JsonSerialize(using = LogMetricResponse.LogMetricResponseSerializer.class)
@JsonDeserialize(using = LogMetricResponse.LogMetricResponseDeserializer.class)
public class LogMetricResponse {

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
    return new ToStringer(LogMetricResponse.class).toString();
  }

  LogMetricResponsePb toPb() {
    LogMetricResponsePb pb = new LogMetricResponsePb();

    return pb;
  }

  static LogMetricResponse fromPb(LogMetricResponsePb pb) {
    LogMetricResponse model = new LogMetricResponse();

    return model;
  }

  public static class LogMetricResponseSerializer extends JsonSerializer<LogMetricResponse> {
    @Override
    public void serialize(LogMetricResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogMetricResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogMetricResponseDeserializer extends JsonDeserializer<LogMetricResponse> {
    @Override
    public LogMetricResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogMetricResponsePb pb = mapper.readValue(p, LogMetricResponsePb.class);
      return LogMetricResponse.fromPb(pb);
    }
  }
}

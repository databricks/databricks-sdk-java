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
@JsonSerialize(using = LogParamResponse.LogParamResponseSerializer.class)
@JsonDeserialize(using = LogParamResponse.LogParamResponseDeserializer.class)
public class LogParamResponse {

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
    return new ToStringer(LogParamResponse.class).toString();
  }

  LogParamResponsePb toPb() {
    LogParamResponsePb pb = new LogParamResponsePb();

    return pb;
  }

  static LogParamResponse fromPb(LogParamResponsePb pb) {
    LogParamResponse model = new LogParamResponse();

    return model;
  }

  public static class LogParamResponseSerializer extends JsonSerializer<LogParamResponse> {
    @Override
    public void serialize(LogParamResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogParamResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogParamResponseDeserializer extends JsonDeserializer<LogParamResponse> {
    @Override
    public LogParamResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogParamResponsePb pb = mapper.readValue(p, LogParamResponsePb.class);
      return LogParamResponse.fromPb(pb);
    }
  }
}

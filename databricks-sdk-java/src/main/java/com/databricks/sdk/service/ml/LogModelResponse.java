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
@JsonSerialize(using = LogModelResponse.LogModelResponseSerializer.class)
@JsonDeserialize(using = LogModelResponse.LogModelResponseDeserializer.class)
public class LogModelResponse {

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
    return new ToStringer(LogModelResponse.class).toString();
  }

  LogModelResponsePb toPb() {
    LogModelResponsePb pb = new LogModelResponsePb();

    return pb;
  }

  static LogModelResponse fromPb(LogModelResponsePb pb) {
    LogModelResponse model = new LogModelResponse();

    return model;
  }

  public static class LogModelResponseSerializer extends JsonSerializer<LogModelResponse> {
    @Override
    public void serialize(LogModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogModelResponseDeserializer extends JsonDeserializer<LogModelResponse> {
    @Override
    public LogModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogModelResponsePb pb = mapper.readValue(p, LogModelResponsePb.class);
      return LogModelResponse.fromPb(pb);
    }
  }
}

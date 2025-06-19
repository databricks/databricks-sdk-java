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
@JsonSerialize(using = LogInputsResponse.LogInputsResponseSerializer.class)
@JsonDeserialize(using = LogInputsResponse.LogInputsResponseDeserializer.class)
public class LogInputsResponse {

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
    return new ToStringer(LogInputsResponse.class).toString();
  }

  LogInputsResponsePb toPb() {
    LogInputsResponsePb pb = new LogInputsResponsePb();

    return pb;
  }

  static LogInputsResponse fromPb(LogInputsResponsePb pb) {
    LogInputsResponse model = new LogInputsResponse();

    return model;
  }

  public static class LogInputsResponseSerializer extends JsonSerializer<LogInputsResponse> {
    @Override
    public void serialize(LogInputsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogInputsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogInputsResponseDeserializer extends JsonDeserializer<LogInputsResponse> {
    @Override
    public LogInputsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogInputsResponsePb pb = mapper.readValue(p, LogInputsResponsePb.class);
      return LogInputsResponse.fromPb(pb);
    }
  }
}

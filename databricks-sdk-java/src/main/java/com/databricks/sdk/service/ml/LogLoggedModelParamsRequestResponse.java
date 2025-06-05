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
@JsonSerialize(
    using = LogLoggedModelParamsRequestResponse.LogLoggedModelParamsRequestResponseSerializer.class)
@JsonDeserialize(
    using =
        LogLoggedModelParamsRequestResponse.LogLoggedModelParamsRequestResponseDeserializer.class)
public class LogLoggedModelParamsRequestResponse {

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
    return new ToStringer(LogLoggedModelParamsRequestResponse.class).toString();
  }

  LogLoggedModelParamsRequestResponsePb toPb() {
    LogLoggedModelParamsRequestResponsePb pb = new LogLoggedModelParamsRequestResponsePb();

    return pb;
  }

  static LogLoggedModelParamsRequestResponse fromPb(LogLoggedModelParamsRequestResponsePb pb) {
    LogLoggedModelParamsRequestResponse model = new LogLoggedModelParamsRequestResponse();

    return model;
  }

  public static class LogLoggedModelParamsRequestResponseSerializer
      extends JsonSerializer<LogLoggedModelParamsRequestResponse> {
    @Override
    public void serialize(
        LogLoggedModelParamsRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogLoggedModelParamsRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogLoggedModelParamsRequestResponseDeserializer
      extends JsonDeserializer<LogLoggedModelParamsRequestResponse> {
    @Override
    public LogLoggedModelParamsRequestResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogLoggedModelParamsRequestResponsePb pb =
          mapper.readValue(p, LogLoggedModelParamsRequestResponsePb.class);
      return LogLoggedModelParamsRequestResponse.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Get the latest logs for a served model */
@Generated
@JsonSerialize(using = LogsRequest.LogsRequestSerializer.class)
@JsonDeserialize(using = LogsRequest.LogsRequestDeserializer.class)
public class LogsRequest {
  /** The name of the serving endpoint that the served model belongs to. This field is required. */
  private String name;

  /** The name of the served model that logs will be retrieved for. This field is required. */
  private String servedModelName;

  public LogsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LogsRequest setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogsRequest that = (LogsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(servedModelName, that.servedModelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedModelName);
  }

  @Override
  public String toString() {
    return new ToStringer(LogsRequest.class)
        .add("name", name)
        .add("servedModelName", servedModelName)
        .toString();
  }

  LogsRequestPb toPb() {
    LogsRequestPb pb = new LogsRequestPb();
    pb.setName(name);
    pb.setServedModelName(servedModelName);

    return pb;
  }

  static LogsRequest fromPb(LogsRequestPb pb) {
    LogsRequest model = new LogsRequest();
    model.setName(pb.getName());
    model.setServedModelName(pb.getServedModelName());

    return model;
  }

  public static class LogsRequestSerializer extends JsonSerializer<LogsRequest> {
    @Override
    public void serialize(LogsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogsRequestDeserializer extends JsonDeserializer<LogsRequest> {
    @Override
    public LogsRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogsRequestPb pb = mapper.readValue(p, LogsRequestPb.class);
      return LogsRequest.fromPb(pb);
    }
  }
}

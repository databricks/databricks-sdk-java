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

@Generated
@JsonSerialize(using = ServerLogsResponse.ServerLogsResponseSerializer.class)
@JsonDeserialize(using = ServerLogsResponse.ServerLogsResponseDeserializer.class)
public class ServerLogsResponse {
  /** The most recent log lines of the model server processing invocation requests. */
  private String logs;

  public ServerLogsResponse setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerLogsResponse that = (ServerLogsResponse) o;
    return Objects.equals(logs, that.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    return new ToStringer(ServerLogsResponse.class).add("logs", logs).toString();
  }

  ServerLogsResponsePb toPb() {
    ServerLogsResponsePb pb = new ServerLogsResponsePb();
    pb.setLogs(logs);

    return pb;
  }

  static ServerLogsResponse fromPb(ServerLogsResponsePb pb) {
    ServerLogsResponse model = new ServerLogsResponse();
    model.setLogs(pb.getLogs());

    return model;
  }

  public static class ServerLogsResponseSerializer extends JsonSerializer<ServerLogsResponse> {
    @Override
    public void serialize(ServerLogsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServerLogsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServerLogsResponseDeserializer extends JsonDeserializer<ServerLogsResponse> {
    @Override
    public ServerLogsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServerLogsResponsePb pb = mapper.readValue(p, ServerLogsResponsePb.class);
      return ServerLogsResponse.fromPb(pb);
    }
  }
}

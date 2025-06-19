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
@JsonSerialize(using = BuildLogsResponse.BuildLogsResponseSerializer.class)
@JsonDeserialize(using = BuildLogsResponse.BuildLogsResponseDeserializer.class)
public class BuildLogsResponse {
  /** The logs associated with building the served entity's environment. */
  private String logs;

  public BuildLogsResponse setLogs(String logs) {
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
    BuildLogsResponse that = (BuildLogsResponse) o;
    return Objects.equals(logs, that.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    return new ToStringer(BuildLogsResponse.class).add("logs", logs).toString();
  }

  BuildLogsResponsePb toPb() {
    BuildLogsResponsePb pb = new BuildLogsResponsePb();
    pb.setLogs(logs);

    return pb;
  }

  static BuildLogsResponse fromPb(BuildLogsResponsePb pb) {
    BuildLogsResponse model = new BuildLogsResponse();
    model.setLogs(pb.getLogs());

    return model;
  }

  public static class BuildLogsResponseSerializer extends JsonSerializer<BuildLogsResponse> {
    @Override
    public void serialize(BuildLogsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BuildLogsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BuildLogsResponseDeserializer extends JsonDeserializer<BuildLogsResponse> {
    @Override
    public BuildLogsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BuildLogsResponsePb pb = mapper.readValue(p, BuildLogsResponsePb.class);
      return BuildLogsResponse.fromPb(pb);
    }
  }
}

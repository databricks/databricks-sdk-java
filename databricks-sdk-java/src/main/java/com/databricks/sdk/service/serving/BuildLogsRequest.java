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

/** Get build logs for a served model */
@Generated
@JsonSerialize(using = BuildLogsRequest.BuildLogsRequestSerializer.class)
@JsonDeserialize(using = BuildLogsRequest.BuildLogsRequestDeserializer.class)
public class BuildLogsRequest {
  /** The name of the serving endpoint that the served model belongs to. This field is required. */
  private String name;

  /** The name of the served model that build logs will be retrieved for. This field is required. */
  private String servedModelName;

  public BuildLogsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public BuildLogsRequest setServedModelName(String servedModelName) {
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
    BuildLogsRequest that = (BuildLogsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(servedModelName, that.servedModelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedModelName);
  }

  @Override
  public String toString() {
    return new ToStringer(BuildLogsRequest.class)
        .add("name", name)
        .add("servedModelName", servedModelName)
        .toString();
  }

  BuildLogsRequestPb toPb() {
    BuildLogsRequestPb pb = new BuildLogsRequestPb();
    pb.setName(name);
    pb.setServedModelName(servedModelName);

    return pb;
  }

  static BuildLogsRequest fromPb(BuildLogsRequestPb pb) {
    BuildLogsRequest model = new BuildLogsRequest();
    model.setName(pb.getName());
    model.setServedModelName(pb.getServedModelName());

    return model;
  }

  public static class BuildLogsRequestSerializer extends JsonSerializer<BuildLogsRequest> {
    @Override
    public void serialize(BuildLogsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BuildLogsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BuildLogsRequestDeserializer extends JsonDeserializer<BuildLogsRequest> {
    @Override
    public BuildLogsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BuildLogsRequestPb pb = mapper.readValue(p, BuildLogsRequestPb.class);
      return BuildLogsRequest.fromPb(pb);
    }
  }
}

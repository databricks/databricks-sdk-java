// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** A storage location in Workspace Filesystem (WSFS) */
@Generated
@JsonSerialize(using = WorkspaceStorageInfo.WorkspaceStorageInfoSerializer.class)
@JsonDeserialize(using = WorkspaceStorageInfo.WorkspaceStorageInfoDeserializer.class)
public class WorkspaceStorageInfo {
  /** wsfs destination, e.g. `workspace:/cluster-init-scripts/setup-datadog.sh` */
  private String destination;

  public WorkspaceStorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceStorageInfo that = (WorkspaceStorageInfo) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceStorageInfo.class).add("destination", destination).toString();
  }

  WorkspaceStorageInfoPb toPb() {
    WorkspaceStorageInfoPb pb = new WorkspaceStorageInfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static WorkspaceStorageInfo fromPb(WorkspaceStorageInfoPb pb) {
    WorkspaceStorageInfo model = new WorkspaceStorageInfo();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class WorkspaceStorageInfoSerializer extends JsonSerializer<WorkspaceStorageInfo> {
    @Override
    public void serialize(
        WorkspaceStorageInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceStorageInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceStorageInfoDeserializer
      extends JsonDeserializer<WorkspaceStorageInfo> {
    @Override
    public WorkspaceStorageInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceStorageInfoPb pb = mapper.readValue(p, WorkspaceStorageInfoPb.class);
      return WorkspaceStorageInfo.fromPb(pb);
    }
  }
}

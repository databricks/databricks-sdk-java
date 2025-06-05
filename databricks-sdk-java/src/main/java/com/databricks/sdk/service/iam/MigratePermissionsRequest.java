// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = MigratePermissionsRequest.MigratePermissionsRequestSerializer.class)
@JsonDeserialize(using = MigratePermissionsRequest.MigratePermissionsRequestDeserializer.class)
public class MigratePermissionsRequest {
  /** The name of the workspace group that permissions will be migrated from. */
  private String fromWorkspaceGroupName;

  /** The maximum number of permissions that will be migrated. */
  private Long size;

  /** The name of the account group that permissions will be migrated to. */
  private String toAccountGroupName;

  /** WorkspaceId of the associated workspace where the permission migration will occur. */
  private Long workspaceId;

  public MigratePermissionsRequest setFromWorkspaceGroupName(String fromWorkspaceGroupName) {
    this.fromWorkspaceGroupName = fromWorkspaceGroupName;
    return this;
  }

  public String getFromWorkspaceGroupName() {
    return fromWorkspaceGroupName;
  }

  public MigratePermissionsRequest setSize(Long size) {
    this.size = size;
    return this;
  }

  public Long getSize() {
    return size;
  }

  public MigratePermissionsRequest setToAccountGroupName(String toAccountGroupName) {
    this.toAccountGroupName = toAccountGroupName;
    return this;
  }

  public String getToAccountGroupName() {
    return toAccountGroupName;
  }

  public MigratePermissionsRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigratePermissionsRequest that = (MigratePermissionsRequest) o;
    return Objects.equals(fromWorkspaceGroupName, that.fromWorkspaceGroupName)
        && Objects.equals(size, that.size)
        && Objects.equals(toAccountGroupName, that.toAccountGroupName)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromWorkspaceGroupName, size, toAccountGroupName, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(MigratePermissionsRequest.class)
        .add("fromWorkspaceGroupName", fromWorkspaceGroupName)
        .add("size", size)
        .add("toAccountGroupName", toAccountGroupName)
        .add("workspaceId", workspaceId)
        .toString();
  }

  MigratePermissionsRequestPb toPb() {
    MigratePermissionsRequestPb pb = new MigratePermissionsRequestPb();
    pb.setFromWorkspaceGroupName(fromWorkspaceGroupName);
    pb.setSize(size);
    pb.setToAccountGroupName(toAccountGroupName);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static MigratePermissionsRequest fromPb(MigratePermissionsRequestPb pb) {
    MigratePermissionsRequest model = new MigratePermissionsRequest();
    model.setFromWorkspaceGroupName(pb.getFromWorkspaceGroupName());
    model.setSize(pb.getSize());
    model.setToAccountGroupName(pb.getToAccountGroupName());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class MigratePermissionsRequestSerializer
      extends JsonSerializer<MigratePermissionsRequest> {
    @Override
    public void serialize(
        MigratePermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MigratePermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MigratePermissionsRequestDeserializer
      extends JsonDeserializer<MigratePermissionsRequest> {
    @Override
    public MigratePermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MigratePermissionsRequestPb pb = mapper.readValue(p, MigratePermissionsRequestPb.class);
      return MigratePermissionsRequest.fromPb(pb);
    }
  }
}

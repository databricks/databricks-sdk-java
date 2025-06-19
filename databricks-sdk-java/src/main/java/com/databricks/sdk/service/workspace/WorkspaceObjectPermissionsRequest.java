// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = WorkspaceObjectPermissionsRequest.WorkspaceObjectPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = WorkspaceObjectPermissionsRequest.WorkspaceObjectPermissionsRequestDeserializer.class)
public class WorkspaceObjectPermissionsRequest {
  /** */
  private Collection<WorkspaceObjectAccessControlRequest> accessControlList;

  /** The workspace object for which to get or manage permissions. */
  private String workspaceObjectId;

  /** The workspace object type for which to get or manage permissions. */
  private String workspaceObjectType;

  public WorkspaceObjectPermissionsRequest setAccessControlList(
      Collection<WorkspaceObjectAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WorkspaceObjectAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public WorkspaceObjectPermissionsRequest setWorkspaceObjectId(String workspaceObjectId) {
    this.workspaceObjectId = workspaceObjectId;
    return this;
  }

  public String getWorkspaceObjectId() {
    return workspaceObjectId;
  }

  public WorkspaceObjectPermissionsRequest setWorkspaceObjectType(String workspaceObjectType) {
    this.workspaceObjectType = workspaceObjectType;
    return this;
  }

  public String getWorkspaceObjectType() {
    return workspaceObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermissionsRequest that = (WorkspaceObjectPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(workspaceObjectId, that.workspaceObjectId)
        && Objects.equals(workspaceObjectType, that.workspaceObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, workspaceObjectId, workspaceObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("workspaceObjectId", workspaceObjectId)
        .add("workspaceObjectType", workspaceObjectType)
        .toString();
  }

  WorkspaceObjectPermissionsRequestPb toPb() {
    WorkspaceObjectPermissionsRequestPb pb = new WorkspaceObjectPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setWorkspaceObjectId(workspaceObjectId);
    pb.setWorkspaceObjectType(workspaceObjectType);

    return pb;
  }

  static WorkspaceObjectPermissionsRequest fromPb(WorkspaceObjectPermissionsRequestPb pb) {
    WorkspaceObjectPermissionsRequest model = new WorkspaceObjectPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setWorkspaceObjectId(pb.getWorkspaceObjectId());
    model.setWorkspaceObjectType(pb.getWorkspaceObjectType());

    return model;
  }

  public static class WorkspaceObjectPermissionsRequestSerializer
      extends JsonSerializer<WorkspaceObjectPermissionsRequest> {
    @Override
    public void serialize(
        WorkspaceObjectPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceObjectPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceObjectPermissionsRequestDeserializer
      extends JsonDeserializer<WorkspaceObjectPermissionsRequest> {
    @Override
    public WorkspaceObjectPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceObjectPermissionsRequestPb pb =
          mapper.readValue(p, WorkspaceObjectPermissionsRequestPb.class);
      return WorkspaceObjectPermissionsRequest.fromPb(pb);
    }
  }
}

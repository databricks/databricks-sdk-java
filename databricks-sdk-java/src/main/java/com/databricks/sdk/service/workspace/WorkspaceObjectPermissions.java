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
@JsonSerialize(using = WorkspaceObjectPermissions.WorkspaceObjectPermissionsSerializer.class)
@JsonDeserialize(using = WorkspaceObjectPermissions.WorkspaceObjectPermissionsDeserializer.class)
public class WorkspaceObjectPermissions {
  /** */
  private Collection<WorkspaceObjectAccessControlResponse> accessControlList;

  /** */
  private String objectId;

  /** */
  private String objectType;

  public WorkspaceObjectPermissions setAccessControlList(
      Collection<WorkspaceObjectAccessControlResponse> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<WorkspaceObjectAccessControlResponse> getAccessControlList() {
    return accessControlList;
  }

  public WorkspaceObjectPermissions setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public WorkspaceObjectPermissions setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermissions that = (WorkspaceObjectPermissions) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissions.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  WorkspaceObjectPermissionsPb toPb() {
    WorkspaceObjectPermissionsPb pb = new WorkspaceObjectPermissionsPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static WorkspaceObjectPermissions fromPb(WorkspaceObjectPermissionsPb pb) {
    WorkspaceObjectPermissions model = new WorkspaceObjectPermissions();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class WorkspaceObjectPermissionsSerializer
      extends JsonSerializer<WorkspaceObjectPermissions> {
    @Override
    public void serialize(
        WorkspaceObjectPermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceObjectPermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceObjectPermissionsDeserializer
      extends JsonDeserializer<WorkspaceObjectPermissions> {
    @Override
    public WorkspaceObjectPermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceObjectPermissionsPb pb = mapper.readValue(p, WorkspaceObjectPermissionsPb.class);
      return WorkspaceObjectPermissions.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = WorkspaceObjectPermission.WorkspaceObjectPermissionSerializer.class)
@JsonDeserialize(using = WorkspaceObjectPermission.WorkspaceObjectPermissionDeserializer.class)
public class WorkspaceObjectPermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private WorkspaceObjectPermissionLevel permissionLevel;

  public WorkspaceObjectPermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public WorkspaceObjectPermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public WorkspaceObjectPermission setPermissionLevel(
      WorkspaceObjectPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WorkspaceObjectPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermission that = (WorkspaceObjectPermission) o;
    return Objects.equals(inherited, that.inherited)
        && Objects.equals(inheritedFromObject, that.inheritedFromObject)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, inheritedFromObject, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  WorkspaceObjectPermissionPb toPb() {
    WorkspaceObjectPermissionPb pb = new WorkspaceObjectPermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static WorkspaceObjectPermission fromPb(WorkspaceObjectPermissionPb pb) {
    WorkspaceObjectPermission model = new WorkspaceObjectPermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class WorkspaceObjectPermissionSerializer
      extends JsonSerializer<WorkspaceObjectPermission> {
    @Override
    public void serialize(
        WorkspaceObjectPermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceObjectPermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceObjectPermissionDeserializer
      extends JsonDeserializer<WorkspaceObjectPermission> {
    @Override
    public WorkspaceObjectPermission deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceObjectPermissionPb pb = mapper.readValue(p, WorkspaceObjectPermissionPb.class);
      return WorkspaceObjectPermission.fromPb(pb);
    }
  }
}

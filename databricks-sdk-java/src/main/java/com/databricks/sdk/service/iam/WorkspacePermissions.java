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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = WorkspacePermissions.WorkspacePermissionsSerializer.class)
@JsonDeserialize(using = WorkspacePermissions.WorkspacePermissionsDeserializer.class)
public class WorkspacePermissions {
  /** Array of permissions defined for a workspace. */
  private Collection<PermissionOutput> permissions;

  public WorkspacePermissions setPermissions(Collection<PermissionOutput> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<PermissionOutput> getPermissions() {
    return permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspacePermissions that = (WorkspacePermissions) o;
    return Objects.equals(permissions, that.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspacePermissions.class).add("permissions", permissions).toString();
  }

  WorkspacePermissionsPb toPb() {
    WorkspacePermissionsPb pb = new WorkspacePermissionsPb();
    pb.setPermissions(permissions);

    return pb;
  }

  static WorkspacePermissions fromPb(WorkspacePermissionsPb pb) {
    WorkspacePermissions model = new WorkspacePermissions();
    model.setPermissions(pb.getPermissions());

    return model;
  }

  public static class WorkspacePermissionsSerializer extends JsonSerializer<WorkspacePermissions> {
    @Override
    public void serialize(
        WorkspacePermissions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspacePermissionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspacePermissionsDeserializer
      extends JsonDeserializer<WorkspacePermissions> {
    @Override
    public WorkspacePermissions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspacePermissionsPb pb = mapper.readValue(p, WorkspacePermissionsPb.class);
      return WorkspacePermissions.fromPb(pb);
    }
  }
}

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

/**
 * The output format for existing workspace PermissionAssignment records, which contains some info
 * for user consumption.
 */
@Generated
@JsonSerialize(using = PermissionAssignment.PermissionAssignmentSerializer.class)
@JsonDeserialize(using = PermissionAssignment.PermissionAssignmentDeserializer.class)
public class PermissionAssignment {
  /** Error response associated with a workspace permission assignment, if any. */
  private String error;

  /** The permissions level of the principal. */
  private Collection<WorkspacePermission> permissions;

  /** Information about the principal assigned to the workspace. */
  private PrincipalOutput principal;

  public PermissionAssignment setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public PermissionAssignment setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public PermissionAssignment setPrincipal(PrincipalOutput principal) {
    this.principal = principal;
    return this;
  }

  public PrincipalOutput getPrincipal() {
    return principal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignment that = (PermissionAssignment) o;
    return Objects.equals(error, that.error)
        && Objects.equals(permissions, that.permissions)
        && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, permissions, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionAssignment.class)
        .add("error", error)
        .add("permissions", permissions)
        .add("principal", principal)
        .toString();
  }

  PermissionAssignmentPb toPb() {
    PermissionAssignmentPb pb = new PermissionAssignmentPb();
    pb.setError(error);
    pb.setPermissions(permissions);
    pb.setPrincipal(principal);

    return pb;
  }

  static PermissionAssignment fromPb(PermissionAssignmentPb pb) {
    PermissionAssignment model = new PermissionAssignment();
    model.setError(pb.getError());
    model.setPermissions(pb.getPermissions());
    model.setPrincipal(pb.getPrincipal());

    return model;
  }

  public static class PermissionAssignmentSerializer extends JsonSerializer<PermissionAssignment> {
    @Override
    public void serialize(
        PermissionAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionAssignmentDeserializer
      extends JsonDeserializer<PermissionAssignment> {
    @Override
    public PermissionAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionAssignmentPb pb = mapper.readValue(p, PermissionAssignmentPb.class);
      return PermissionAssignment.fromPb(pb);
    }
  }
}

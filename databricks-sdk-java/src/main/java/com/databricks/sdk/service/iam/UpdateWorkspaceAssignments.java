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
@JsonSerialize(using = UpdateWorkspaceAssignments.UpdateWorkspaceAssignmentsSerializer.class)
@JsonDeserialize(using = UpdateWorkspaceAssignments.UpdateWorkspaceAssignmentsDeserializer.class)
public class UpdateWorkspaceAssignments {
  /**
   * Array of permissions assignments to update on the workspace. Valid values are "USER" and
   * "ADMIN" (case-sensitive). If both "USER" and "ADMIN" are provided, "ADMIN" takes precedence.
   * Other values will be ignored. Note that excluding this field, or providing unsupported values,
   * will have the same effect as providing an empty list, which will result in the deletion of all
   * permissions for the principal.
   */
  private Collection<WorkspacePermission> permissions;

  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID. */
  private Long workspaceId;

  public UpdateWorkspaceAssignments setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public UpdateWorkspaceAssignments setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAssignments setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceAssignments that = (UpdateWorkspaceAssignments) o;
    return Objects.equals(permissions, that.permissions)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignments.class)
        .add("permissions", permissions)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  UpdateWorkspaceAssignmentsPb toPb() {
    UpdateWorkspaceAssignmentsPb pb = new UpdateWorkspaceAssignmentsPb();
    pb.setPermissions(permissions);
    pb.setPrincipalId(principalId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static UpdateWorkspaceAssignments fromPb(UpdateWorkspaceAssignmentsPb pb) {
    UpdateWorkspaceAssignments model = new UpdateWorkspaceAssignments();
    model.setPermissions(pb.getPermissions());
    model.setPrincipalId(pb.getPrincipalId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class UpdateWorkspaceAssignmentsSerializer
      extends JsonSerializer<UpdateWorkspaceAssignments> {
    @Override
    public void serialize(
        UpdateWorkspaceAssignments value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateWorkspaceAssignmentsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateWorkspaceAssignmentsDeserializer
      extends JsonDeserializer<UpdateWorkspaceAssignments> {
    @Override
    public UpdateWorkspaceAssignments deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateWorkspaceAssignmentsPb pb = mapper.readValue(p, UpdateWorkspaceAssignmentsPb.class);
      return UpdateWorkspaceAssignments.fromPb(pb);
    }
  }
}

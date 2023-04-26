// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateWorkspaceAssignments class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateWorkspaceAssignments {
  /** Array of permissions assignments to update on the workspace. */
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID. */
  private Long workspaceId;

  /**
   * <p>Setter for the field <code>permissions</code>.</p>
   *
   * @param permissions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.UpdateWorkspaceAssignments} object
   */
  public UpdateWorkspaceAssignments setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  /**
   * <p>Setter for the field <code>principalId</code>.</p>
   *
   * @param principalId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.UpdateWorkspaceAssignments} object
   */
  public UpdateWorkspaceAssignments setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * <p>Getter for the field <code>principalId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPrincipalId() {
    return principalId;
  }

  /**
   * <p>Setter for the field <code>workspaceId</code>.</p>
   *
   * @param workspaceId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.UpdateWorkspaceAssignments} object
   */
  public UpdateWorkspaceAssignments setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceAssignments that = (UpdateWorkspaceAssignments) o;
    return Objects.equals(permissions, that.permissions)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permissions, principalId, workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignments.class)
        .add("permissions", permissions)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}

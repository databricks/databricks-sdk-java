// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete permissions assignment
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteWorkspaceAssignmentRequest {
  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID. */
  private Long workspaceId;

  /**
   * <p>Setter for the field <code>principalId</code>.</p>
   *
   * @param principalId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.DeleteWorkspaceAssignmentRequest} object
   */
  public DeleteWorkspaceAssignmentRequest setPrincipalId(Long principalId) {
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
   * @return a {@link com.databricks.sdk.service.iam.DeleteWorkspaceAssignmentRequest} object
   */
  public DeleteWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    DeleteWorkspaceAssignmentRequest that = (DeleteWorkspaceAssignmentRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(principalId, workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAssignmentRequest.class)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}

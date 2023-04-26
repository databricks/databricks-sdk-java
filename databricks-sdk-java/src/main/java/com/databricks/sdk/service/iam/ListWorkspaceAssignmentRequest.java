// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get permission assignments
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListWorkspaceAssignmentRequest {
  /** The workspace ID for the account. */
  private Long workspaceId;

  /**
   * <p>Setter for the field <code>workspaceId</code>.</p>
   *
   * @param workspaceId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListWorkspaceAssignmentRequest} object
   */
  public ListWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    ListWorkspaceAssignmentRequest that = (ListWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }
}

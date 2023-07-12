// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get permission assignments
 */
@Generated
public class ListWorkspaceAssignmentRequest {
  /**
   * The workspace ID for the account.
   */
  
  private Long workspaceId;
  
  public ListWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    ListWorkspaceAssignmentRequest that = (ListWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentRequest.class)
      .add("workspaceId", workspaceId).toString();
  }
}

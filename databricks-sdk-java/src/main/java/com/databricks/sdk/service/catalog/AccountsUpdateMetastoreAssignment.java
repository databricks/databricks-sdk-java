// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountsUpdateMetastoreAssignment {
  /** */
  @JsonProperty("metastore_assignment")
  private UpdateMetastoreAssignment metastoreAssignment;

  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  /** Workspace ID. */
  @JsonIgnore private Long workspaceId;

  public AccountsUpdateMetastoreAssignment setMetastoreAssignment(
      UpdateMetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public UpdateMetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  public AccountsUpdateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    AccountsUpdateMetastoreAssignment that = (AccountsUpdateMetastoreAssignment) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment, metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}

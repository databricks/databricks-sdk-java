// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateMetastoreAssignment {
  /** The name of the default catalog for the metastore. */
  @JsonProperty("default_catalog_name")
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  public UpdateMetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public UpdateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public UpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
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
    UpdateMetastoreAssignment that = (UpdateMetastoreAssignment) o;
    return Objects.equals(defaultCatalogName, that.defaultCatalogName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCatalogName, metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMetastoreAssignment.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}

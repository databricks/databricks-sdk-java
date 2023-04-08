// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetastoreAssignment {
  /** The name of the default catalog in the metastore. */
  @JsonProperty("default_catalog_name")
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The unique ID of the Databricks workspace. */
  @JsonProperty("workspace_id")
  private String workspaceId;

  public MetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  public MetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public MetastoreAssignment setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public String getWorkspaceId() {
    return workspaceId;
  }
}

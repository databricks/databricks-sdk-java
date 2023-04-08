// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get all workspaces assigned to a metastore */
public class ListAccountMetastoreAssignmentsRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  public ListAccountMetastoreAssignmentsRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }
}

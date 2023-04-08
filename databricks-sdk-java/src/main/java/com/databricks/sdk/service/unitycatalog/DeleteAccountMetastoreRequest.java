// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a metastore */
public class DeleteAccountMetastoreRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  public DeleteAccountMetastoreRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }
}

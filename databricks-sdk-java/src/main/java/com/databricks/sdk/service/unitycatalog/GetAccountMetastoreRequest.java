// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get a metastore */
public class GetAccountMetastoreRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  public GetAccountMetastoreRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }
}

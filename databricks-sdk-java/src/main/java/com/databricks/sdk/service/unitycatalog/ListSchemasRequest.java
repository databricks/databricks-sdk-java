// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

/** List schemas */
public class ListSchemasRequest {
  /** Parent catalog for schemas of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  public ListSchemasRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }
}

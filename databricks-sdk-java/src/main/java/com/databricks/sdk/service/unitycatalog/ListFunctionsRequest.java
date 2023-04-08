// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

/** List functions */
public class ListFunctionsRequest {
  /** Name of parent catalog for functions of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /** Parent schema of functions. */
  @QueryParam("schema_name")
  private String schemaName;

  public ListFunctionsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListFunctionsRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }
}

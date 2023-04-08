// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsRequest that = (ListFunctionsRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsRequest.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List Volumes */
public class ListVolumesRequest {
  /** The identifier of the catalog */
  @QueryParam("catalog_name")
  private String catalogName;

  /** The identifier of the schema */
  @QueryParam("schema_name")
  private String schemaName;

  public ListVolumesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListVolumesRequest setSchemaName(String schemaName) {
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
    ListVolumesRequest that = (ListVolumesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVolumesRequest.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .toString();
  }
}

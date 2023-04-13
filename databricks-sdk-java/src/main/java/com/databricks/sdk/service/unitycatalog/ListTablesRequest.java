// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List tables */
public class ListTablesRequest {
  /** Name of parent catalog for tables of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /** Whether delta metadata should be included in the response. */
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  /** Parent schema of tables. */
  @QueryParam("schema_name")
  private String schemaName;

  public ListTablesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListTablesRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public ListTablesRequest setSchemaName(String schemaName) {
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
    ListTablesRequest that = (ListTablesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, includeDeltaMetadata, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesRequest.class)
        .add("catalogName", catalogName)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("schemaName", schemaName)
        .toString();
  }
}

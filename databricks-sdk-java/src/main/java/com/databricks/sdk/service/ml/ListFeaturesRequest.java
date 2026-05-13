// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListFeaturesRequest {
  /** Name of parent catalog for features of interest. */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /** The maximum number of results to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page based on a previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Name of parent schema relative to its parent catalog. */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListFeaturesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListFeaturesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListFeaturesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListFeaturesRequest setSchemaName(String schemaName) {
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
    ListFeaturesRequest that = (ListFeaturesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, pageSize, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFeaturesRequest.class)
        .add("catalogName", catalogName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

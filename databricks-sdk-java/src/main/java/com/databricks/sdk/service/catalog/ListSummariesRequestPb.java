// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List table summaries */
@Generated
class ListSummariesRequestPb {
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  @JsonIgnore
  @QueryParam("include_manifest_capabilities")
  private Boolean includeManifestCapabilities;

  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("schema_name_pattern")
  private String schemaNamePattern;

  @JsonIgnore
  @QueryParam("table_name_pattern")
  private String tableNamePattern;

  public ListSummariesRequestPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListSummariesRequestPb setIncludeManifestCapabilities(
      Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  public ListSummariesRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSummariesRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSummariesRequestPb setSchemaNamePattern(String schemaNamePattern) {
    this.schemaNamePattern = schemaNamePattern;
    return this;
  }

  public String getSchemaNamePattern() {
    return schemaNamePattern;
  }

  public ListSummariesRequestPb setTableNamePattern(String tableNamePattern) {
    this.tableNamePattern = tableNamePattern;
    return this;
  }

  public String getTableNamePattern() {
    return tableNamePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSummariesRequestPb that = (ListSummariesRequestPb) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaNamePattern, that.schemaNamePattern)
        && Objects.equals(tableNamePattern, that.tableNamePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        includeManifestCapabilities,
        maxResults,
        pageToken,
        schemaNamePattern,
        tableNamePattern);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSummariesRequestPb.class)
        .add("catalogName", catalogName)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaNamePattern", schemaNamePattern)
        .add("tableNamePattern", tableNamePattern)
        .toString();
  }
}

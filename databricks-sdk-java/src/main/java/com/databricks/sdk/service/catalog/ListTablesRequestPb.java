// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List tables */
@Generated
class ListTablesRequestPb {
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  @JsonIgnore
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  @JsonIgnore
  @QueryParam("include_manifest_capabilities")
  private Boolean includeManifestCapabilities;

  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore
  @QueryParam("omit_columns")
  private Boolean omitColumns;

  @JsonIgnore
  @QueryParam("omit_properties")
  private Boolean omitProperties;

  @JsonIgnore
  @QueryParam("omit_username")
  private Boolean omitUsername;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListTablesRequestPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListTablesRequestPb setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListTablesRequestPb setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public ListTablesRequestPb setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  public ListTablesRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListTablesRequestPb setOmitColumns(Boolean omitColumns) {
    this.omitColumns = omitColumns;
    return this;
  }

  public Boolean getOmitColumns() {
    return omitColumns;
  }

  public ListTablesRequestPb setOmitProperties(Boolean omitProperties) {
    this.omitProperties = omitProperties;
    return this;
  }

  public Boolean getOmitProperties() {
    return omitProperties;
  }

  public ListTablesRequestPb setOmitUsername(Boolean omitUsername) {
    this.omitUsername = omitUsername;
    return this;
  }

  public Boolean getOmitUsername() {
    return omitUsername;
  }

  public ListTablesRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListTablesRequestPb setSchemaName(String schemaName) {
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
    ListTablesRequestPb that = (ListTablesRequestPb) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(omitColumns, that.omitColumns)
        && Objects.equals(omitProperties, that.omitProperties)
        && Objects.equals(omitUsername, that.omitUsername)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        includeBrowse,
        includeDeltaMetadata,
        includeManifestCapabilities,
        maxResults,
        omitColumns,
        omitProperties,
        omitUsername,
        pageToken,
        schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesRequestPb.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .add("maxResults", maxResults)
        .add("omitColumns", omitColumns)
        .add("omitProperties", omitProperties)
        .add("omitUsername", omitUsername)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

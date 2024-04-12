// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List tables */
@Generated
public class ListTablesRequest {
  /** Name of parent catalog for tables of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Whether to include tables in the response for which the principal can only access selective
   * metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /** Whether delta metadata should be included in the response. */
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  /**
   * Maximum number of tables to return. If not set, all the tables are returned (not recommended).
   * - when set to a value greater than 0, the page length is the minimum of this value and a server
   * configured value; - when set to 0, the page length is set to a server configured value
   * (recommended); - when set to a value less than 0, an invalid parameter error is returned;
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Whether to omit the columns of the table from the response or not. */
  @QueryParam("omit_columns")
  private Boolean omitColumns;

  /** Whether to omit the properties of the table from the response or not. */
  @QueryParam("omit_properties")
  private Boolean omitProperties;

  /** Opaque token to send for the next page of results (pagination). */
  @QueryParam("page_token")
  private String pageToken;

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

  public ListTablesRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListTablesRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public ListTablesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListTablesRequest setOmitColumns(Boolean omitColumns) {
    this.omitColumns = omitColumns;
    return this;
  }

  public Boolean getOmitColumns() {
    return omitColumns;
  }

  public ListTablesRequest setOmitProperties(Boolean omitProperties) {
    this.omitProperties = omitProperties;
    return this;
  }

  public Boolean getOmitProperties() {
    return omitProperties;
  }

  public ListTablesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
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
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(omitColumns, that.omitColumns)
        && Objects.equals(omitProperties, that.omitProperties)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        includeBrowse,
        includeDeltaMetadata,
        maxResults,
        omitColumns,
        omitProperties,
        pageToken,
        schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("maxResults", maxResults)
        .add("omitColumns", omitColumns)
        .add("omitProperties", omitProperties)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

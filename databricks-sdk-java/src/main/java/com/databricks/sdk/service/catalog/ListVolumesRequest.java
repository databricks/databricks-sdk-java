// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List Volumes */
@Generated
public class ListVolumesRequest {
  /** The identifier of the catalog */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Whether to include volumes in the response for which the principal can only access selective
   * metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * Maximum number of volumes to return (page length).
   *
   * <p>If not set, the page length is set to a server configured value (10000, as of 1/29/2024). -
   * when set to a value greater than 0, the page length is the minimum of this value and a server
   * configured value (10000, as of 1/29/2024); - when set to 0, the page length is set to a server
   * configured value (10000, as of 1/29/2024) (recommended); - when set to a value less than 0, an
   * invalid parameter error is returned;
   *
   * <p>Note: this parameter controls only the maximum number of volumes to return. The actual
   * number of volumes returned in a page may be smaller than this value, including 0, even if there
   * are more pages.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /**
   * Opaque token returned by a previous request. It must be included in the request to retrieve the
   * next page of results (pagination).
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The identifier of the schema */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListVolumesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListVolumesRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListVolumesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListVolumesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
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
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, includeBrowse, maxResults, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVolumesRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

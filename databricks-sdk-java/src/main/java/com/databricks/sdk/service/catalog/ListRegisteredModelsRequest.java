// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List Registered Models */
@Generated
public class ListRegisteredModelsRequest {
  /**
   * The identifier of the catalog under which to list registered models. If specified, schema_name
   * must be specified.
   */
  @JsonIgnore
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Whether to include registered models in the response for which the principal can only access
   * selective metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * Max number of registered models to return.
   *
   * <p>If both catalog and schema are specified: - when max_results is not specified, the page
   * length is set to a server configured value (10000, as of 4/2/2024). - when set to a value
   * greater than 0, the page length is the minimum of this value and a server configured value
   * (10000, as of 4/2/2024); - when set to 0, the page length is set to a server configured value
   * (10000, as of 4/2/2024); - when set to a value less than 0, an invalid parameter error is
   * returned;
   *
   * <p>If neither schema nor catalog is specified: - when max_results is not specified, the page
   * length is set to a server configured value (100, as of 4/2/2024). - when set to a value greater
   * than 0, the page length is the minimum of this value and a server configured value (1000, as of
   * 4/2/2024); - when set to 0, the page length is set to a server configured value (100, as of
   * 4/2/2024); - when set to a value less than 0, an invalid parameter error is returned;
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The identifier of the schema under which to list registered models. If specified, catalog_name
   * must be specified.
   */
  @JsonIgnore
  @QueryParam("schema_name")
  private String schemaName;

  public ListRegisteredModelsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListRegisteredModelsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListRegisteredModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListRegisteredModelsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListRegisteredModelsRequest setSchemaName(String schemaName) {
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
    ListRegisteredModelsRequest that = (ListRegisteredModelsRequest) o;
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
    return new ToStringer(ListRegisteredModelsRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

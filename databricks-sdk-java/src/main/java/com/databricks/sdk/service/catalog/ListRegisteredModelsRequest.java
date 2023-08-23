// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List Registered Models */
@Generated
public class ListRegisteredModelsRequest {
  /**
   * The identifier of the catalog under which to list registered models. If specified, schema_name
   * must be specified.
   */
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Max number of registered models to return. If catalog and schema are unspecified, max_results
   * must be specified. If max_results is unspecified, we return all results, starting from the page
   * specified by page_token.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The identifier of the schema under which to list registered models. If specified, catalog_name
   * must be specified.
   */
  @QueryParam("schema_name")
  private String schemaName;

  public ListRegisteredModelsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
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
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, maxResults, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegisteredModelsRequest.class)
        .add("catalogName", catalogName)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }
}

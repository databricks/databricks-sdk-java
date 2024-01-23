// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List schemas */
@Generated
public class ListSchemasRequest {
  /** Parent catalog for schemas of interest. */
  @QueryParam("catalog_name")
  private String catalogName;

  /**
   * Maximum number of schemas to return. If not set, all the schemas are returned (not
   * recommended). - when set to a value greater than 0, the page length is the minimum of this
   * value and a server configured value; - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value less than 0, an invalid parameter error
   * is returned;
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  @QueryParam("page_token")
  private String pageToken;

  public ListSchemasRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListSchemasRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSchemasRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasRequest that = (ListSchemasRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchemasRequest.class)
        .add("catalogName", catalogName)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}

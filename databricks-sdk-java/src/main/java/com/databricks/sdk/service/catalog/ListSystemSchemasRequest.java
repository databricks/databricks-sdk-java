// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSystemSchemasRequest {
  /**
   * Maximum number of schemas to return. - When set to 0, the page length is set to a server
   * configured value (recommended); - When set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - When set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all the schemas are returned (not
   * recommended).
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** The ID for the metastore in which the system schema resides. */
  @JsonIgnore private String metastoreId;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListSystemSchemasRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSystemSchemasRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ListSystemSchemasRequest setPageToken(String pageToken) {
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
    ListSystemSchemasRequest that = (ListSystemSchemasRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, metastoreId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasRequest.class)
        .add("maxResults", maxResults)
        .add("metastoreId", metastoreId)
        .add("pageToken", pageToken)
        .toString();
  }
}

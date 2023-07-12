// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * List models
 */
@Generated
public class ListModelsRequest {
  /**
   * Maximum number of registered models desired. Max threshold is 1000.
   */
  @QueryParam("max_results")
  private Long maxResults;
  
  /**
   * Pagination token to go to the next page based on a previous query.
   */
  @QueryParam("page_token")
  private String pageToken;
  
  public ListModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }
  
  public ListModelsRequest setPageToken(String pageToken) {
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
    ListModelsRequest that = (ListModelsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
    && Objects.equals(pageToken, that.pageToken)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelsRequest.class)
      .add("maxResults", maxResults)
      .add("pageToken", pageToken).toString();
  }
}

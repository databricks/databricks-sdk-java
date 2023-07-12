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
 * List experiments
 */
@Generated
public class ListExperimentsRequest {
  /**
   * Maximum number of experiments desired. If `max_results` is unspecified,
   * return all experiments. If `max_results` is too large, it'll be
   * automatically capped at 1000. Callers of this endpoint are encouraged to
   * pass max_results explicitly and leverage page_token to iterate through
   * experiments.
   */
  @QueryParam("max_results")
  private Long maxResults;
  
  /**
   * Token indicating the page of experiments to fetch
   */
  @QueryParam("page_token")
  private String pageToken;
  
  /**
   * Qualifier for type of experiments to be returned. If unspecified, return
   * only active experiments.
   */
  @QueryParam("view_type")
  private String viewType;
  
  public ListExperimentsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }
  
  public ListExperimentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }
  
  public ListExperimentsRequest setViewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

  public String getViewType() {
    return viewType;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExperimentsRequest that = (ListExperimentsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
    && Objects.equals(pageToken, that.pageToken)
    && Objects.equals(viewType, that.viewType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, viewType);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExperimentsRequest.class)
      .add("maxResults", maxResults)
      .add("pageToken", pageToken)
      .add("viewType", viewType).toString();
  }
}

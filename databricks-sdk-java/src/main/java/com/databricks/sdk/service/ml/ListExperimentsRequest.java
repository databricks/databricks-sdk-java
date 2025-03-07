// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List experiments */
@Generated
public class ListExperimentsRequest {
  /**
   * Maximum number of experiments desired. If `max_results` is unspecified, return all experiments.
   * If `max_results` is too large, it'll be automatically capped at 1000. Callers of this endpoint
   * are encouraged to pass max_results explicitly and leverage page_token to iterate through
   * experiments.
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Token indicating the page of experiments to fetch */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  @JsonIgnore
  @QueryParam("view_type")
  private ViewType viewType;

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

  public ListExperimentsRequest setViewType(ViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  public ViewType getViewType() {
    return viewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExperimentsRequest that = (ListExperimentsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(viewType, that.viewType);
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
        .add("viewType", viewType)
        .toString();
  }
}

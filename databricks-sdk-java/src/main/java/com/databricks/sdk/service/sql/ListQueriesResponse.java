// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListQueriesResponse {
  /** Whether there is another page of results. */
  @JsonProperty("has_next_page")
  private Boolean hasNextPage;

  /** A token that can be used to get the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("res")
  private java.util.List<QueryInfo> res;

  public ListQueriesResponse setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  public ListQueriesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQueriesResponse setRes(java.util.List<QueryInfo> res) {
    this.res = res;
    return this;
  }

  public java.util.List<QueryInfo> getRes() {
    return res;
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListQueriesResponse {
  /** Whether there is another page of results. */
  @JsonProperty("has_next_page")
  private Boolean hasNextPage;

  /** A token that can be used to get the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("res")
  private Collection<QueryInfo> res;

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

  public ListQueriesResponse setRes(Collection<QueryInfo> res) {
    this.res = res;
    return this;
  }

  public Collection<QueryInfo> getRes() {
    return res;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueriesResponse that = (ListQueriesResponse) o;
    return Objects.equals(hasNextPage, that.hasNextPage)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(res, that.res);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, nextPageToken, res);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueriesResponse.class)
        .add("hasNextPage", hasNextPage)
        .add("nextPageToken", nextPageToken)
        .add("res", res)
        .toString();
  }
}

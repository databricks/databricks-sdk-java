// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListUsersResponse {
  /** Total results returned in the response. */
  @JsonProperty("itemsPerPage")
  private Long itemsPerPage;

  /** User objects returned in the response. */
  @JsonProperty("Resources")
  private java.util.List<User> resources;

  /** Starting index of all the results that matched the request filters. First item is number 1. */
  @JsonProperty("startIndex")
  private Long startIndex;

  /** Total results that match the request filters. */
  @JsonProperty("totalResults")
  private Long totalResults;

  public ListUsersResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  public ListUsersResponse setResources(java.util.List<User> resources) {
    this.resources = resources;
    return this;
  }

  public java.util.List<User> getResources() {
    return resources;
  }

  public ListUsersResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  public ListUsersResponse setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  public Long getTotalResults() {
    return totalResults;
  }
}

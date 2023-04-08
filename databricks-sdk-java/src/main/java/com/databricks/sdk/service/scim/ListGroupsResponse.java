// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListGroupsResponse {
  /** Total results returned in the response. */
  @JsonProperty("itemsPerPage")
  private Long itemsPerPage;

  /** User objects returned in the response. */
  @JsonProperty("Resources")
  private java.util.List<Group> resources;

  /** Starting index of all the results that matched the request filters. First item is number 1. */
  @JsonProperty("startIndex")
  private Long startIndex;

  /** Total results that match the request filters. */
  @JsonProperty("totalResults")
  private Long totalResults;

  public ListGroupsResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  public ListGroupsResponse setResources(java.util.List<Group> resources) {
    this.resources = resources;
    return this;
  }

  public java.util.List<Group> getResources() {
    return resources;
  }

  public ListGroupsResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  public ListGroupsResponse setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  public Long getTotalResults() {
    return totalResults;
  }
}

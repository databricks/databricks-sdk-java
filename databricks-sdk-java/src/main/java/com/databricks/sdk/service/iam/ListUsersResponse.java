// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListUsersResponse {
  /** Total results returned in the response. */
  @JsonProperty("itemsPerPage")
  private Long itemsPerPage;

  /** User objects returned in the response. */
  @JsonProperty("Resources")
  private Collection<User> resources;

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

  public ListUsersResponse setResources(Collection<User> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<User> getResources() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUsersResponse that = (ListUsersResponse) o;
    return Objects.equals(itemsPerPage, that.itemsPerPage)
        && Objects.equals(resources, that.resources)
        && Objects.equals(startIndex, that.startIndex)
        && Objects.equals(totalResults, that.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, startIndex, totalResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUsersResponse.class)
        .add("itemsPerPage", itemsPerPage)
        .add("resources", resources)
        .add("startIndex", startIndex)
        .add("totalResults", totalResults)
        .toString();
  }
}

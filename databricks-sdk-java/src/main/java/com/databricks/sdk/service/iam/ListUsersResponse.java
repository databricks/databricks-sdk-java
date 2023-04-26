// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListUsersResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>itemsPerPage</code>.</p>
   *
   * @param itemsPerPage a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListUsersResponse} object
   */
  public ListUsersResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * <p>Getter for the field <code>itemsPerPage</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  /**
   * <p>Setter for the field <code>resources</code>.</p>
   *
   * @param resources a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.ListUsersResponse} object
   */
  public ListUsersResponse setResources(Collection<User> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * <p>Getter for the field <code>resources</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<User> getResources() {
    return resources;
  }

  /**
   * <p>Setter for the field <code>startIndex</code>.</p>
   *
   * @param startIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListUsersResponse} object
   */
  public ListUsersResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>startIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartIndex() {
    return startIndex;
  }

  /**
   * <p>Setter for the field <code>totalResults</code>.</p>
   *
   * @param totalResults a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListUsersResponse} object
   */
  public ListUsersResponse setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * <p>Getter for the field <code>totalResults</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTotalResults() {
    return totalResults;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, startIndex, totalResults);
  }

  /** {@inheritDoc} */
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

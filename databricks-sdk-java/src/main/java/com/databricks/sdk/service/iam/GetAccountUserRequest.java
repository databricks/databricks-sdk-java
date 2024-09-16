// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get user details */
@Generated
public class GetAccountUserRequest {
  /** Comma-separated list of attributes to return in response. */
  @JsonIgnore
  @QueryParam("attributes")
  private String attributes;

  /** Desired number of results per page. Default is 10000. */
  @JsonIgnore
  @QueryParam("count")
  private Long count;

  /** Comma-separated list of attributes to exclude in response. */
  @JsonIgnore
  @QueryParam("excludedAttributes")
  private String excludedAttributes;

  /**
   * Query by which the results have to be filtered. Supported operators are equals(`eq`),
   * contains(`co`), starts with(`sw`) and not equals(`ne`). Additionally, simple expressions can be
   * formed using logical operators - `and` and `or`. The [SCIM RFC] has more details but we
   * currently only support simple expressions.
   *
   * <p>[SCIM RFC]: https://tools.ietf.org/html/rfc7644#section-3.4.2.2
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /** Unique ID for a user in the Databricks account. */
  @JsonIgnore private String id;

  /**
   * Attribute to sort the results. Multi-part paths are supported. For example, `userName`,
   * `name.givenName`, and `emails`.
   */
  @JsonIgnore
  @QueryParam("sortBy")
  private String sortBy;

  /** The order to sort the results. */
  @JsonIgnore
  @QueryParam("sortOrder")
  private GetSortOrder sortOrder;

  /** Specifies the index of the first result. First item is number 1. */
  @JsonIgnore
  @QueryParam("startIndex")
  private Long startIndex;

  public GetAccountUserRequest setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  public String getAttributes() {
    return attributes;
  }

  public GetAccountUserRequest setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public GetAccountUserRequest setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  public GetAccountUserRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public GetAccountUserRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GetAccountUserRequest setSortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public String getSortBy() {
    return sortBy;
  }

  public GetAccountUserRequest setSortOrder(GetSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public GetSortOrder getSortOrder() {
    return sortOrder;
  }

  public GetAccountUserRequest setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountUserRequest that = (GetAccountUserRequest) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(count, that.count)
        && Objects.equals(excludedAttributes, that.excludedAttributes)
        && Objects.equals(filter, that.filter)
        && Objects.equals(id, that.id)
        && Objects.equals(sortBy, that.sortBy)
        && Objects.equals(sortOrder, that.sortOrder)
        && Objects.equals(startIndex, that.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, count, excludedAttributes, filter, id, sortBy, sortOrder, startIndex);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountUserRequest.class)
        .add("attributes", attributes)
        .add("count", count)
        .add("excludedAttributes", excludedAttributes)
        .add("filter", filter)
        .add("id", id)
        .add("sortBy", sortBy)
        .add("sortOrder", sortOrder)
        .add("startIndex", startIndex)
        .toString();
  }
}

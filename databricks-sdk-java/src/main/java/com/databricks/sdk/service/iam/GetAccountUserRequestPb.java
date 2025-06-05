// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get user details. */
@Generated
class GetAccountUserRequestPb {
  @JsonIgnore
  @QueryParam("attributes")
  private String attributes;

  @JsonIgnore
  @QueryParam("count")
  private Long count;

  @JsonIgnore
  @QueryParam("excludedAttributes")
  private String excludedAttributes;

  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  @JsonIgnore private String id;

  @JsonIgnore
  @QueryParam("sortBy")
  private String sortBy;

  @JsonIgnore
  @QueryParam("sortOrder")
  private GetSortOrder sortOrder;

  @JsonIgnore
  @QueryParam("startIndex")
  private Long startIndex;

  public GetAccountUserRequestPb setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  public String getAttributes() {
    return attributes;
  }

  public GetAccountUserRequestPb setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public GetAccountUserRequestPb setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  public GetAccountUserRequestPb setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public GetAccountUserRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GetAccountUserRequestPb setSortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public String getSortBy() {
    return sortBy;
  }

  public GetAccountUserRequestPb setSortOrder(GetSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public GetSortOrder getSortOrder() {
    return sortOrder;
  }

  public GetAccountUserRequestPb setStartIndex(Long startIndex) {
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
    GetAccountUserRequestPb that = (GetAccountUserRequestPb) o;
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
    return new ToStringer(GetAccountUserRequestPb.class)
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

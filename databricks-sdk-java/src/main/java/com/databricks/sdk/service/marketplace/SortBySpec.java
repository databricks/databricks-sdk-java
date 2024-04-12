// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SortBySpec {
  /** The field on which to sort the listing. */
  @JsonProperty("sort_by")
  @QueryParam("sort_by")
  private SortBy sortBy;

  /** The order in which to sort the listing. */
  @JsonProperty("sort_order")
  @QueryParam("sort_order")
  private SortOrder sortOrder;

  public SortBySpec setSortBy(SortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public SortBy getSortBy() {
    return sortBy;
  }

  public SortBySpec setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public SortOrder getSortOrder() {
    return sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SortBySpec that = (SortBySpec) o;
    return Objects.equals(sortBy, that.sortBy) && Objects.equals(sortOrder, that.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }

  @Override
  public String toString() {
    return new ToStringer(SortBySpec.class)
        .add("sortBy", sortBy)
        .add("sortOrder", sortOrder)
        .toString();
  }
}

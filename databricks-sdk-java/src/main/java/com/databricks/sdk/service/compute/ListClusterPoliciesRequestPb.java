// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List cluster policies */
@Generated
class ListClusterPoliciesRequestPb {
  @JsonIgnore
  @QueryParam("sort_column")
  private ListSortColumn sortColumn;

  @JsonIgnore
  @QueryParam("sort_order")
  private ListSortOrder sortOrder;

  public ListClusterPoliciesRequestPb setSortColumn(ListSortColumn sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

  public ListSortColumn getSortColumn() {
    return sortColumn;
  }

  public ListClusterPoliciesRequestPb setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClusterPoliciesRequestPb that = (ListClusterPoliciesRequestPb) o;
    return Objects.equals(sortColumn, that.sortColumn) && Objects.equals(sortOrder, that.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortColumn, sortOrder);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClusterPoliciesRequestPb.class)
        .add("sortColumn", sortColumn)
        .add("sortOrder", sortOrder)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List cluster policies */
@Generated
public class ListPolicies {
  /**
   * The cluster policy attribute to sort by. * `POLICY_CREATION_TIME` - Sort result list by policy
   * creation time. * `POLICY_NAME` - Sort result list by policy name.
   */
  @QueryParam("sort_column")
  private PolicySortColumn sortColumn;

  /**
   * The order in which the policies get listed. * `DESC` - Sort result list in descending order. *
   * `ASC` - Sort result list in ascending order.
   */
  @QueryParam("sort_order")
  private ListOrder sortOrder;

  public ListPolicies setSortColumn(PolicySortColumn sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

  public PolicySortColumn getSortColumn() {
    return sortColumn;
  }

  public ListPolicies setSortOrder(ListOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public ListOrder getSortOrder() {
    return sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPolicies that = (ListPolicies) o;
    return Objects.equals(sortColumn, that.sortColumn) && Objects.equals(sortOrder, that.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortColumn, sortOrder);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicies.class)
        .add("sortColumn", sortColumn)
        .add("sortOrder", sortOrder)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a cluster policy
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListClusterPoliciesRequest {
  /**
   * The cluster policy attribute to sort by. * `POLICY_CREATION_TIME` - Sort result list by policy
   * creation time. * `POLICY_NAME` - Sort result list by policy name.
   */
  @QueryParam("sort_column")
  private ListSortColumn sortColumn;

  /**
   * The order in which the policies get listed. * `DESC` - Sort result list in descending order. *
   * `ASC` - Sort result list in ascending order.
   */
  @QueryParam("sort_order")
  private ListSortOrder sortOrder;

  /**
   * <p>Setter for the field <code>sortColumn</code>.</p>
   *
   * @param sortColumn a {@link com.databricks.sdk.service.compute.ListSortColumn} object
   * @return a {@link com.databricks.sdk.service.compute.ListClusterPoliciesRequest} object
   */
  public ListClusterPoliciesRequest setSortColumn(ListSortColumn sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

  /**
   * <p>Getter for the field <code>sortColumn</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ListSortColumn} object
   */
  public ListSortColumn getSortColumn() {
    return sortColumn;
  }

  /**
   * <p>Setter for the field <code>sortOrder</code>.</p>
   *
   * @param sortOrder a {@link com.databricks.sdk.service.compute.ListSortOrder} object
   * @return a {@link com.databricks.sdk.service.compute.ListClusterPoliciesRequest} object
   */
  public ListClusterPoliciesRequest setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * <p>Getter for the field <code>sortOrder</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ListSortOrder} object
   */
  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClusterPoliciesRequest that = (ListClusterPoliciesRequest) o;
    return Objects.equals(sortColumn, that.sortColumn) && Objects.equals(sortOrder, that.sortOrder);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(sortColumn, sortOrder);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListClusterPoliciesRequest.class)
        .add("sortColumn", sortColumn)
        .add("sortOrder", sortOrder)
        .toString();
  }
}

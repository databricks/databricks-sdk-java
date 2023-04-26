// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get all workspaces assigned to a metastore
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListAccountMetastoreAssignmentsRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsRequest} object
   */
  public ListAccountMetastoreAssignmentsRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountMetastoreAssignmentsRequest that = (ListAccountMetastoreAssignmentsRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListAccountMetastoreAssignmentsRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }
}

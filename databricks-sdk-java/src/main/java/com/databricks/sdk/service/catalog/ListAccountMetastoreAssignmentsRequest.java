// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get all workspaces assigned to a metastore */
@Generated
public class ListAccountMetastoreAssignmentsRequest {
  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  public ListAccountMetastoreAssignmentsRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountMetastoreAssignmentsRequest that = (ListAccountMetastoreAssignmentsRequest) o;
    return Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountMetastoreAssignmentsRequest.class)
        .add("metastoreId", metastoreId)
        .toString();
  }
}

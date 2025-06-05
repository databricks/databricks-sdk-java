// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountsMetastoreAssignmentPb {
  @JsonProperty("metastore_assignment")
  private MetastoreAssignment metastoreAssignment;

  public AccountsMetastoreAssignmentPb setMetastoreAssignment(
      MetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public MetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsMetastoreAssignmentPb that = (AccountsMetastoreAssignmentPb) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsMetastoreAssignmentPb.class)
        .add("metastoreAssignment", metastoreAssignment)
        .toString();
  }
}

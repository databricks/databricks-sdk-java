// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The workspace metastore assignment was successfully returned. */
@Generated
public class AccountsMetastoreAssignment {
  /** */
  @JsonProperty("metastore_assignment")
  private MetastoreAssignment metastoreAssignment;

  public AccountsMetastoreAssignment setMetastoreAssignment(
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
    AccountsMetastoreAssignment that = (AccountsMetastoreAssignment) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .toString();
  }
}

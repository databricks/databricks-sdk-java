// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DeleteDataResultPb {
  @JsonProperty("failed_primary_keys")
  private Collection<String> failedPrimaryKeys;

  @JsonProperty("success_row_count")
  private Long successRowCount;

  public DeleteDataResultPb setFailedPrimaryKeys(Collection<String> failedPrimaryKeys) {
    this.failedPrimaryKeys = failedPrimaryKeys;
    return this;
  }

  public Collection<String> getFailedPrimaryKeys() {
    return failedPrimaryKeys;
  }

  public DeleteDataResultPb setSuccessRowCount(Long successRowCount) {
    this.successRowCount = successRowCount;
    return this;
  }

  public Long getSuccessRowCount() {
    return successRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDataResultPb that = (DeleteDataResultPb) o;
    return Objects.equals(failedPrimaryKeys, that.failedPrimaryKeys)
        && Objects.equals(successRowCount, that.successRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedPrimaryKeys, successRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataResultPb.class)
        .add("failedPrimaryKeys", failedPrimaryKeys)
        .add("successRowCount", successRowCount)
        .toString();
  }
}

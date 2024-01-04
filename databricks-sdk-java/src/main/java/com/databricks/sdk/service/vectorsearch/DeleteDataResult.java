// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Result of the upsert or delete operation. */
@Generated
public class DeleteDataResult {
  /** List of primary keys for rows that failed to process. */
  @JsonProperty("failed_primary_keys")
  private Collection<String> failedPrimaryKeys;

  /** Count of successfully processed rows. */
  @JsonProperty("success_row_count")
  private Long successRowCount;

  public DeleteDataResult setFailedPrimaryKeys(Collection<String> failedPrimaryKeys) {
    this.failedPrimaryKeys = failedPrimaryKeys;
    return this;
  }

  public Collection<String> getFailedPrimaryKeys() {
    return failedPrimaryKeys;
  }

  public DeleteDataResult setSuccessRowCount(Long successRowCount) {
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
    DeleteDataResult that = (DeleteDataResult) o;
    return Objects.equals(failedPrimaryKeys, that.failedPrimaryKeys)
        && Objects.equals(successRowCount, that.successRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedPrimaryKeys, successRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataResult.class)
        .add("failedPrimaryKeys", failedPrimaryKeys)
        .add("successRowCount", successRowCount)
        .toString();
  }
}

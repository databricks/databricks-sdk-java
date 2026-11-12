// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Counts of the requests in a batch. */
@Generated
public class BatchRequestCounts {
  /** Output only. The number of requests that failed. The service does not retry them. */
  @JsonProperty("failed")
  private Long failed;

  /** Output only. The number of requests that were processed successfully. */
  @JsonProperty("succeeded")
  private Long succeeded;

  /** Output only. The number of requests in the batch. */
  @JsonProperty("total")
  private Long total;

  public BatchRequestCounts setFailed(Long failed) {
    this.failed = failed;
    return this;
  }

  public Long getFailed() {
    return failed;
  }

  public BatchRequestCounts setSucceeded(Long succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  public Long getSucceeded() {
    return succeeded;
  }

  public BatchRequestCounts setTotal(Long total) {
    this.total = total;
    return this;
  }

  public Long getTotal() {
    return total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchRequestCounts that = (BatchRequestCounts) o;
    return Objects.equals(failed, that.failed)
        && Objects.equals(succeeded, that.succeeded)
        && Objects.equals(total, that.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, succeeded, total);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchRequestCounts.class)
        .add("failed", failed)
        .add("succeeded", succeeded)
        .add("total", total)
        .toString();
  }
}

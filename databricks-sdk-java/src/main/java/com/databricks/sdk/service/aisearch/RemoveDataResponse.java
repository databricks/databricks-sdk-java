// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response for RemoveData. */
@Generated
public class RemoveDataResponse {
  /** Per-row outcome of the delete. */
  @JsonProperty("result")
  private DataModificationResult result;

  /** Overall status of the delete. */
  @JsonProperty("status")
  private DataModificationStatus status;

  public RemoveDataResponse setResult(DataModificationResult result) {
    this.result = result;
    return this;
  }

  public DataModificationResult getResult() {
    return result;
  }

  public RemoveDataResponse setStatus(DataModificationStatus status) {
    this.status = status;
    return this;
  }

  public DataModificationStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveDataResponse that = (RemoveDataResponse) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveDataResponse.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpsertDataVectorIndexResponse {
  /** Result of the upsert or delete operation. */
  @JsonProperty("result")
  private UpsertDataResult result;

  /** Status of the upsert operation. */
  @JsonProperty("status")
  private UpsertDataStatus status;

  public UpsertDataVectorIndexResponse setResult(UpsertDataResult result) {
    this.result = result;
    return this;
  }

  public UpsertDataResult getResult() {
    return result;
  }

  public UpsertDataVectorIndexResponse setStatus(UpsertDataStatus status) {
    this.status = status;
    return this;
  }

  public UpsertDataStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataVectorIndexResponse that = (UpsertDataVectorIndexResponse) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexResponse.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }
}

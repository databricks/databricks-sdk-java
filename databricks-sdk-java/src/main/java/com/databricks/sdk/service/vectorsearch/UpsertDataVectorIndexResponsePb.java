// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpsertDataVectorIndexResponsePb {
  @JsonProperty("result")
  private UpsertDataResult result;

  @JsonProperty("status")
  private UpsertDataStatus status;

  public UpsertDataVectorIndexResponsePb setResult(UpsertDataResult result) {
    this.result = result;
    return this;
  }

  public UpsertDataResult getResult() {
    return result;
  }

  public UpsertDataVectorIndexResponsePb setStatus(UpsertDataStatus status) {
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
    UpsertDataVectorIndexResponsePb that = (UpsertDataVectorIndexResponsePb) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexResponsePb.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DeleteDataVectorIndexResponsePb {
  @JsonProperty("result")
  private DeleteDataResult result;

  @JsonProperty("status")
  private DeleteDataStatus status;

  public DeleteDataVectorIndexResponsePb setResult(DeleteDataResult result) {
    this.result = result;
    return this;
  }

  public DeleteDataResult getResult() {
    return result;
  }

  public DeleteDataVectorIndexResponsePb setStatus(DeleteDataStatus status) {
    this.status = status;
    return this;
  }

  public DeleteDataStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDataVectorIndexResponsePb that = (DeleteDataVectorIndexResponsePb) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexResponsePb.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }
}

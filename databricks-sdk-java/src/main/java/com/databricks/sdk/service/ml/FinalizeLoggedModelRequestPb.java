// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FinalizeLoggedModelRequestPb {
  @JsonIgnore private String modelId;

  @JsonProperty("status")
  private LoggedModelStatus status;

  public FinalizeLoggedModelRequestPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public FinalizeLoggedModelRequestPb setStatus(LoggedModelStatus status) {
    this.status = status;
    return this;
  }

  public LoggedModelStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinalizeLoggedModelRequestPb that = (FinalizeLoggedModelRequestPb) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeLoggedModelRequestPb.class)
        .add("modelId", modelId)
        .add("status", status)
        .toString();
  }
}

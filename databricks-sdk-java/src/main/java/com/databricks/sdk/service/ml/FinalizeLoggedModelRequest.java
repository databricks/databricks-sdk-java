// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FinalizeLoggedModelRequest {
  /** The ID of the logged model to finalize. */
  @JsonIgnore private String modelId;

  /**
   * Whether or not the model is ready for use. ``"LOGGED_MODEL_UPLOAD_FAILED"`` indicates that
   * something went wrong when logging the model weights / agent code.
   */
  @JsonProperty("status")
  private LoggedModelStatus status;

  public FinalizeLoggedModelRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public FinalizeLoggedModelRequest setStatus(LoggedModelStatus status) {
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
    FinalizeLoggedModelRequest that = (FinalizeLoggedModelRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeLoggedModelRequest.class)
        .add("modelId", modelId)
        .add("status", status)
        .toString();
  }
}

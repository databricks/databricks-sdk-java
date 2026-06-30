// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteLoggedModelRequest {
  /** The ID of the logged model to delete. */
  @JsonIgnore private String modelId;

  public DeleteLoggedModelRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteLoggedModelRequest that = (DeleteLoggedModelRequest) o;
    return Objects.equals(modelId, that.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteLoggedModelRequest.class).add("modelId", modelId).toString();
  }
}

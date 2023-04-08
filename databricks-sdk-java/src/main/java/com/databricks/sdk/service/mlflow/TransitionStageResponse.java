// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TransitionStageResponse {
  /** */
  @JsonProperty("model_version")
  private ModelVersionDatabricks modelVersion;

  public TransitionStageResponse setModelVersion(ModelVersionDatabricks modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public ModelVersionDatabricks getModelVersion() {
    return modelVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitionStageResponse that = (TransitionStageResponse) o;
    return Objects.equals(modelVersion, that.modelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionStageResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TransitionStageResponse {
  /** Updated model version */
  @JsonProperty("model_version_databricks")
  private ModelVersionDatabricks modelVersionDatabricks;

  public TransitionStageResponse setModelVersionDatabricks(
      ModelVersionDatabricks modelVersionDatabricks) {
    this.modelVersionDatabricks = modelVersionDatabricks;
    return this;
  }

  public ModelVersionDatabricks getModelVersionDatabricks() {
    return modelVersionDatabricks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitionStageResponse that = (TransitionStageResponse) o;
    return Objects.equals(modelVersionDatabricks, that.modelVersionDatabricks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersionDatabricks);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionStageResponse.class)
        .add("modelVersionDatabricks", modelVersionDatabricks)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a LoggedModel output of a Run. */
@Generated
class ModelOutputPb {
  @JsonProperty("model_id")
  private String modelId;

  @JsonProperty("step")
  private Long step;

  public ModelOutputPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public ModelOutputPb setStep(Long step) {
    this.step = step;
    return this;
  }

  public Long getStep() {
    return step;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelOutputPb that = (ModelOutputPb) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(step, that.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, step);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelOutputPb.class).add("modelId", modelId).add("step", step).toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a LoggedModel output of a Run. */
@Generated
public class ModelOutput {
  /** The unique identifier of the model. */
  @JsonProperty("model_id")
  private String modelId;

  /** The step at which the model was produced. */
  @JsonProperty("step")
  private Long step;

  public ModelOutput setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public ModelOutput setStep(Long step) {
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
    ModelOutput that = (ModelOutput) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(step, that.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, step);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelOutput.class).add("modelId", modelId).add("step", step).toString();
  }
}

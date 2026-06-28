// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for reranking query results with a reranker model. */
@Generated
public class RerankerConfig {
  /**
   * Reranker identifier: "databricks_reranker" for the base model, or a Model Serving endpoint name
   * when `model_type` is MODEL_TYPE_FINETUNED.
   */
  @JsonProperty("model")
  private String model;

  /** Discriminator for how `model` is interpreted. */
  @JsonProperty("model_type")
  private RerankerConfigModelType modelType;

  /** Parameters controlling reranking. */
  @JsonProperty("parameters")
  private RerankerConfigRerankerParameters parameters;

  public RerankerConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public RerankerConfig setModelType(RerankerConfigModelType modelType) {
    this.modelType = modelType;
    return this;
  }

  public RerankerConfigModelType getModelType() {
    return modelType;
  }

  public RerankerConfig setParameters(RerankerConfigRerankerParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  public RerankerConfigRerankerParameters getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RerankerConfig that = (RerankerConfig) o;
    return Objects.equals(model, that.model)
        && Objects.equals(modelType, that.modelType)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, modelType, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfig.class)
        .add("model", model)
        .add("modelType", modelType)
        .add("parameters", parameters)
        .toString();
  }
}

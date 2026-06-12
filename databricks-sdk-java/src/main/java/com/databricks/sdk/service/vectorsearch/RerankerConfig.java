// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RerankerConfig {
  /**
   * Reranker identifier:
   *
   * <ul>
   *   <li>When model_type=BASE/UNSPECIFIED: must be "databricks_reranker".
   *   <li>When model_type=FINETUNED: the Model Serving endpoint name hosting a finetuned reranker.
   * </ul>
   */
  @JsonProperty("model")
  private String model;

  /** Parameters that control how the reranker processes the query results. */
  @JsonProperty("parameters")
  private RerankerConfigRerankerParameters parameters;

  public RerankerConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
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
    return Objects.equals(model, that.model) && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfig.class)
        .add("model", model)
        .add("parameters", parameters)
        .toString();
  }
}

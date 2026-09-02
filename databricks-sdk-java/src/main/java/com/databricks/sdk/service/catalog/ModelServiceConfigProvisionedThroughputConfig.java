// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for a provisioned-throughput foundation-model destination. References a
 * pre-existing Model Serving endpoint that serves the model; sizing (provisioned throughput, burst
 * scaling, model version) is owned by the Model Serving endpoint itself, not by this message.
 */
@Generated
public class ModelServiceConfigProvisionedThroughputConfig {
  /**
   * UC model FQN of the model served by the backing endpoint (e.g.,
   * `system.ai.databricks-claude-opus-4-6`). Resolved from Model Serving at Create/Update time.
   */
  @JsonProperty("model")
  private String model;

  /**
   * Name of the backing Model Serving endpoint serving the provisioned- throughput foundation
   * model, in the form `serving-endpoints/{name}`. The same Unity Catalog model can be served on
   * multiple Model Serving endpoints with different throughput, regions, or configurations. The
   * caller selects the endpoint to which this destination routes. The endpoint must exist at create
   * time.
   */
  @JsonProperty("model_serving_endpoint")
  private String modelServingEndpoint;

  public ModelServiceConfigProvisionedThroughputConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public ModelServiceConfigProvisionedThroughputConfig setModelServingEndpoint(
      String modelServingEndpoint) {
    this.modelServingEndpoint = modelServingEndpoint;
    return this;
  }

  public String getModelServingEndpoint() {
    return modelServingEndpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigProvisionedThroughputConfig that =
        (ModelServiceConfigProvisionedThroughputConfig) o;
    return Objects.equals(model, that.model)
        && Objects.equals(modelServingEndpoint, that.modelServingEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, modelServingEndpoint);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigProvisionedThroughputConfig.class)
        .add("model", model)
        .add("modelServingEndpoint", modelServingEndpoint)
        .toString();
  }
}

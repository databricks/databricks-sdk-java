// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for a pay-per-token foundation-model destination. Identifies the foundation model
 * by its UC resource name; the platform resolves it to a Model Serving endpoint at request time.
 */
@Generated
public class ModelServiceConfigPayPerTokenConfig {
  /** Resource name of the UC model. Format: `models/{catalog}.{schema}.{model}`. */
  @JsonProperty("model")
  private String model;

  public ModelServiceConfigPayPerTokenConfig setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigPayPerTokenConfig that = (ModelServiceConfigPayPerTokenConfig) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigPayPerTokenConfig.class).add("model", model).toString();
  }
}

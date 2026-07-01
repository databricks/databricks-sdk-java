// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TelemetryConfig {
  /** Configuration for inference table payload logging, including sampling. */
  @JsonProperty("inference_table_config")
  private TelemetryInferenceTableConfig inferenceTableConfig;

  public TelemetryConfig setInferenceTableConfig(
      TelemetryInferenceTableConfig inferenceTableConfig) {
    this.inferenceTableConfig = inferenceTableConfig;
    return this;
  }

  public TelemetryInferenceTableConfig getInferenceTableConfig() {
    return inferenceTableConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelemetryConfig that = (TelemetryConfig) o;
    return Objects.equals(inferenceTableConfig, that.inferenceTableConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inferenceTableConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(TelemetryConfig.class)
        .add("inferenceTableConfig", inferenceTableConfig)
        .toString();
  }
}

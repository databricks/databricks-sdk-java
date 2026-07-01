// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Customer-facing AcceleratorType: hardware accelerator type for the AiRuntime workload. Per-node
 * accelerator count is encoded in the value name (e.g. `GPU_8xH100` means 8 H100s per node).
 */
@Generated
public enum ComputeSpecAcceleratorType {
  @JsonProperty("GPU_1xA10")
  GPU_1X_A10,

  @JsonProperty("GPU_1xH100")
  GPU_1X_H100,

  @JsonProperty("GPU_8xH100")
  GPU_8X_H100,
}

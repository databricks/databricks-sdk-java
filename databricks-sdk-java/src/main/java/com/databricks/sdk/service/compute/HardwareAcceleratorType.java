// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HardwareAcceleratorType: The type of hardware accelerator to use for compute workloads. NOTE:
 * This enum is referenced and is intended to be used by other Databricks services that need to
 * specify hardware accelerator requirements for AI compute workloads.
 */
@Generated
public enum HardwareAcceleratorType {
  @JsonProperty("GPU_1xA10")
  GPU_1X_A10,

  @JsonProperty("GPU_8xH100")
  GPU_8X_H100,
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The pipeline state. */
@Generated
public enum PipelineState {
  @JsonProperty("DELETED")
  DELETED,

  @JsonProperty("DEPLOYING")
  DEPLOYING,

  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("IDLE")
  IDLE,

  @JsonProperty("RECOVERING")
  RECOVERING,

  @JsonProperty("RESETTING")
  RESETTING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("STARTING")
  STARTING,

  @JsonProperty("STOPPING")
  STOPPING,
}

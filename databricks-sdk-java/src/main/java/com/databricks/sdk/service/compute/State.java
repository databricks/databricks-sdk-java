// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Current state of the cluster. */
@Generated
public enum State {
  @JsonProperty("ERROR")
  ERROR,

  @JsonProperty("PENDING")
  PENDING,

  @JsonProperty("RESIZING")
  RESIZING,

  @JsonProperty("RESTARTING")
  RESTARTING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("TERMINATED")
  TERMINATED,

  @JsonProperty("TERMINATING")
  TERMINATING,

  @JsonProperty("UNKNOWN")
  UNKNOWN,
}

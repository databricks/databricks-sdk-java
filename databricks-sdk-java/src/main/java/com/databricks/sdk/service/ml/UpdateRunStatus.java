// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Updated status of the run. */
@Generated
public enum UpdateRunStatus {
  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("FINISHED")
  FINISHED,

  @JsonProperty("KILLED")
  KILLED,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("SCHEDULED")
  SCHEDULED,
}

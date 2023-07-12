// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum RunResultState {
  @JsonProperty("CANCELED")
  CANCELED, // The run was canceled at user request.

  @JsonProperty("EXCLUDED")
  EXCLUDED, // The run was skipped because the necessary conditions were not met.

  @JsonProperty("FAILED")
  FAILED, // The task completed with an error.

  @JsonProperty("MAXIMUM_CONCURRENT_RUNS_REACHED")
  MAXIMUM_CONCURRENT_RUNS_REACHED, // The run was skipped because the maximum concurrent runs were
  // reached.

  @JsonProperty("SUCCESS")
  SUCCESS, // The task completed successfully.

  @JsonProperty("SUCCESS_WITH_FAILURES")
  SUCCESS_WITH_FAILURES, // The job run completed successfully with some failures; leaf tasks were
  // successful.

  @JsonProperty("TIMEDOUT")
  TIMEDOUT, // The run was stopped after reaching the timeout.

  @JsonProperty("UPSTREAM_CANCELED")
  UPSTREAM_CANCELED, // The run was skipped because an upstream task was canceled.

  @JsonProperty("UPSTREAM_FAILED")
  UPSTREAM_FAILED, // The run was skipped because of an upstream failure.
}

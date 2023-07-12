// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/** This describes an enum */
@Generated
public enum RunResultState {
  CANCELED, // The run was canceled at user request.
  EXCLUDED, // The run was skipped because the necessary conditions were not met.
  FAILED, // The task completed with an error.
  MAXIMUM_CONCURRENT_RUNS_REACHED, // The run was skipped because the maximum concurrent runs were
  // reached.
  SUCCESS, // The task completed successfully.
  SUCCESS_WITH_FAILURES, // The job run completed successfully with some failures; leaf tasks were
  // successful.
  TIMEDOUT, // The run was stopped after reaching the timeout.
  UPSTREAM_CANCELED, // The run was skipped because an upstream task was canceled.
  UPSTREAM_FAILED, // The run was skipped because of an upstream failure.
}

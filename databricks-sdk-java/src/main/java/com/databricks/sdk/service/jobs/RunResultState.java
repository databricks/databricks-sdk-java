// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * A value indicating the run's result. The possible values are:
 *
 * <ul>
 *   <li>{@code SUCCESS}: The task completed successfully.
 *   <li>{@code FAILED}: The task completed with an error.
 *   <li>{@code TIMEDOUT}: The run was stopped after reaching the timeout.
 *   <li>{@code CANCELED}: The run was canceled at user request.
 *   <li>{@code MAXIMUM_CONCURRENT_RUNS_REACHED}: The run was skipped because the maximum concurrent
 *       runs were reached.
 *   <li>{@code EXCLUDED}: The run was skipped because the necessary conditions were not met.
 *   <li>{@code SUCCESS_WITH_FAILURES}: The job run completed successfully with some failures; leaf
 *       tasks were successful.
 *   <li>{@code UPSTREAM_FAILED}: The run was skipped because of an upstream failure.
 *   <li>{@code UPSTREAM_CANCELED}: The run was skipped because an upstream task was canceled.
 *   <li>{@code DISABLED}: The run was skipped because it was disabled explicitly by the user.
 * </ul>
 */
@Generated
public enum RunResultState {
  CANCELED, // The run was canceled at user request.
  DISABLED, // The run was skipped because it was disabled explicitly by the user.
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

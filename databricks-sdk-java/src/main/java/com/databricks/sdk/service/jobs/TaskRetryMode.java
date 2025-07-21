// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * task retry mode of the continuous job * NEVER: The failed task will not be retried. * ON_FAILURE:
 * Retry a failed task if at least one other task in the job is still running its first attempt.
 * When this condition is no longer met or the retry limit is reached, the job run is cancelled and
 * a new run is started.
 */
@Generated
public enum TaskRetryMode {
  NEVER,
  ON_FAILURE,
}

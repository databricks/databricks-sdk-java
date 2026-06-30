// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Copied from elastic-spark-common/api/messages/runs.proto. Using the original definition to avoid
 * cyclic dependency.
 */
@Generated
public enum CleanRoomTaskRunResultState {
  CANCELED,
  DISABLED,
  EVICTED,
  EXCLUDED,
  FAILED,
  MAXIMUM_CONCURRENT_RUNS_REACHED,
  RUN_RESULT_STATE_UNSPECIFIED,
  SUCCESS,
  SUCCESS_WITH_FAILURES,
  TIMEDOUT,
  UPSTREAM_CANCELED,
  UPSTREAM_EVICTED,
  UPSTREAM_FAILED,
}

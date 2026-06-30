// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Copied from elastic-spark-common/api/messages/runs.proto. Using the original definition to remove
 * coupling with jobs API definition
 */
@Generated
public enum CleanRoomTaskRunLifeCycleState {
  BLOCKED,
  INTERNAL_ERROR,
  PENDING,
  QUEUED,
  RUNNING,
  RUN_LIFE_CYCLE_STATE_UNSPECIFIED,
  SKIPPED,
  TERMINATED,
  TERMINATING,
  WAITING_FOR_RETRY,
}

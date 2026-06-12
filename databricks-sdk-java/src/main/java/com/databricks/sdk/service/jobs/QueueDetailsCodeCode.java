// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The reason for queuing the run.
 *
 * <ul>
 *   <li>{@code ACTIVE_RUNS_LIMIT_REACHED}: The run was queued due to reaching the workspace limit
 *       of active task runs.
 *   <li>{@code MAX_CONCURRENT_RUNS_REACHED}: The run was queued due to reaching the per-job limit
 *       of concurrent job runs.
 *   <li>{@code ACTIVE_RUN_JOB_TASKS_LIMIT_REACHED}: The run was queued due to reaching the
 *       workspace limit of active run job tasks.
 * </ul>
 */
@Generated
public enum QueueDetailsCodeCode {
  ACTIVE_RUNS_LIMIT_REACHED, // The run was queued due to reaching the workspace limit of active
  // task runs.
  ACTIVE_RUN_JOB_TASKS_LIMIT_REACHED, // The run was queued due to reaching the workspace limit of
  // active run job
  // tasks.
  MAX_CONCURRENT_RUNS_REACHED, // The run was queued due to reaching the per-job limit of concurrent
  // job runs.
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * Scheduling priority class for a workload — its priority and preemptability when the scheduler
 * ranks pending work.
 */
@Generated
public enum AiRuntimeTaskPriorityClass {
  BEST_EFFORT,
  CRITICAL,
  NORMAL,
}

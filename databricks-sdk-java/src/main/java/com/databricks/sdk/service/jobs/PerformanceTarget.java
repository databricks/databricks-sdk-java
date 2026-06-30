// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * PerformanceTarget defines how performant (lower latency) or cost efficient the execution of run
 * on serverless compute should be. The performance mode on the job or pipeline should map to a
 * performance setting that is passed to Cluster Manager (see cluster-common PerformanceTarget).
 */
@Generated
public enum PerformanceTarget {
  PERFORMANCE_OPTIMIZED,
  STANDARD,
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * This field determines whether the spark executors will be scheduled to run on preemptible VMs,
 * on-demand VMs, or preemptible VMs with a fallback to on-demand VMs if the former is unavailable.
 */
@Generated
public enum GcpAvailability {
  ON_DEMAND_GCP,
  PREEMPTIBLE_GCP,
  PREEMPTIBLE_WITH_FALLBACK_GCP,
}

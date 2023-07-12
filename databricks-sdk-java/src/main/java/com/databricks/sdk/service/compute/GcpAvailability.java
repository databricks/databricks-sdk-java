// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This field determines whether the instance pool will contain preemptible VMs, on-demand VMs, or
 * preemptible VMs with a fallback to on-demand VMs if the former is unavailable.
 */
@Generated
public enum GcpAvailability {
  @JsonProperty("ON_DEMAND_GCP")
  ON_DEMAND_GCP,

  @JsonProperty("PREEMPTIBLE_GCP")
  PREEMPTIBLE_GCP,

  @JsonProperty("PREEMPTIBLE_WITH_FALLBACK_GCP")
  PREEMPTIBLE_WITH_FALLBACK_GCP,
}

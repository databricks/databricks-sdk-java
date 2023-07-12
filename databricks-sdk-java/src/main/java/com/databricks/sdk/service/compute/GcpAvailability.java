// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * This field determines whether the instance pool will contain preemptible VMs,
 * on-demand VMs, or preemptible VMs with a fallback to on-demand VMs if the
 * former is unavailable.
 */
@Generated
public enum GcpAvailability{
  ON_DEMAND_GCP,
  PREEMPTIBLE_GCP,
  PREEMPTIBLE_WITH_FALLBACK_GCP,
  
}
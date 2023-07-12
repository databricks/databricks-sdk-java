// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configurations whether the warehouse should use spot instances. */
@Generated
public enum SpotInstancePolicy {
  @JsonProperty("COST_OPTIMIZED")
  COST_OPTIMIZED,

  @JsonProperty("POLICY_UNSPECIFIED")
  POLICY_UNSPECIFIED,

  @JsonProperty("RELIABILITY_OPTIMIZED")
  RELIABILITY_OPTIMIZED,
}

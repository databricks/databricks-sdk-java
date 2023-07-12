// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** lowest-price | diversified | capacity-optimized */
@Generated
public enum FleetSpotOptionAllocationStrategy {
  @JsonProperty("CAPACITY_OPTIMIZED")
  CAPACITY_OPTIMIZED,

  @JsonProperty("DIVERSIFIED")
  DIVERSIFIED,

  @JsonProperty("LOWEST_PRICE")
  LOWEST_PRICE,

  @JsonProperty("PRIORITIZED")
  PRIORITIZED,
}

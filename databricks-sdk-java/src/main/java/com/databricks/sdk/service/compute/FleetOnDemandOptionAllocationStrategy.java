// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Only lowest-price and prioritized are allowed */
@Generated
public enum FleetOnDemandOptionAllocationStrategy {
  @JsonProperty("CAPACITY_OPTIMIZED")
  CAPACITY_OPTIMIZED,

  @JsonProperty("DIVERSIFIED")
  DIVERSIFIED,

  @JsonProperty("LOWEST_PRICE")
  LOWEST_PRICE,

  @JsonProperty("PRIORITIZED")
  PRIORITIZED,
}

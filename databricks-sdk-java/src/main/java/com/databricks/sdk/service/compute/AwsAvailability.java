// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Availability type used for all subsequent nodes past the `first_on_demand` ones.
 *
 * <p>Note: If `first_on_demand` is zero, this availability type will be used for the entire
 * cluster.
 */
@Generated
public enum AwsAvailability {
  @JsonProperty("ON_DEMAND")
  ON_DEMAND,

  @JsonProperty("SPOT")
  SPOT,

  @JsonProperty("SPOT_WITH_FALLBACK")
  SPOT_WITH_FALLBACK,
}

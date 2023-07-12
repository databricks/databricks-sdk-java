// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Availability type used for all subsequent nodes past the `first_on_demand` ones. Note: If
 * `first_on_demand` is zero (which only happens on pool clusters), this availability type will be
 * used for the entire cluster.
 */
@Generated
public enum AzureAvailability {
  @JsonProperty("ON_DEMAND_AZURE")
  ON_DEMAND_AZURE,

  @JsonProperty("SPOT_AZURE")
  SPOT_AZURE,

  @JsonProperty("SPOT_WITH_FALLBACK_AZURE")
  SPOT_WITH_FALLBACK_AZURE,
}

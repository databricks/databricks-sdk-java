// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shows the Availability type used for the spot nodes.
 *
 * <p>The default value is defined by InstancePoolConf.instancePoolDefaultAzureAvailability
 */
@Generated
public enum InstancePoolAzureAttributesAvailability {
  @JsonProperty("ON_DEMAND_AZURE")
  ON_DEMAND_AZURE,

  @JsonProperty("SPOT_AZURE")
  SPOT_AZURE,

  @JsonProperty("SPOT_WITH_FALLBACK_AZURE")
  SPOT_WITH_FALLBACK_AZURE,
}

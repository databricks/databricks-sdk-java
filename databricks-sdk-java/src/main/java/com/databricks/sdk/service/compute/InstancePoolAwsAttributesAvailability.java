// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Availability type used for the spot nodes.
 *
 * <p>The default value is defined by InstancePoolConf.instancePoolDefaultAwsAvailability
 */
@Generated
public enum InstancePoolAwsAttributesAvailability {
  @JsonProperty("ON_DEMAND")
  ON_DEMAND,

  @JsonProperty("SPOT")
  SPOT,

  @JsonProperty("SPOT_WITH_FALLBACK")
  SPOT_WITH_FALLBACK,
}

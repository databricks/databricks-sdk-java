// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Availability type used for all subsequent nodes past the `first_on_demand` ones.
 *
 * <p>Note: If `first_on_demand` is zero, this availability type will be used for the entire
 * cluster.
 */
@Generated
public enum AwsAvailability {
  ON_DEMAND,

  SPOT,

  SPOT_WITH_FALLBACK,
}

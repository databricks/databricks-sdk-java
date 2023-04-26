// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

/**
 * Availability type used for all subsequent nodes past the `first_on_demand` ones.
 *
 * <p>Note: If `first_on_demand` is zero, this availability type will be used for the entire
 * cluster.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public enum AwsAvailability {
  ON_DEMAND,
  SPOT,
  SPOT_WITH_FALLBACK,
}

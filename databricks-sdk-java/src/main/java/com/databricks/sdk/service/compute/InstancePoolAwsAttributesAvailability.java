// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

/**
 * Availability type used for the spot nodes.
 *
 * <p>The default value is defined by InstancePoolConf.instancePoolDefaultAwsAvailability
 */
public enum InstancePoolAwsAttributesAvailability {
  ON_DEMAND,
  SPOT,
  SPOT_WITH_FALLBACK,
}

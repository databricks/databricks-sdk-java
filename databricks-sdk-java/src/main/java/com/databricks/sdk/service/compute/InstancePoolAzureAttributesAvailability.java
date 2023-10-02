// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Shows the Availability type used for the spot nodes.
 *
 * <p>The default value is defined by InstancePoolConf.instancePoolDefaultAzureAvailability
 */
@Generated
public enum InstancePoolAzureAttributesAvailability {
  ON_DEMAND_AZURE,
  SPOT_AZURE,
}

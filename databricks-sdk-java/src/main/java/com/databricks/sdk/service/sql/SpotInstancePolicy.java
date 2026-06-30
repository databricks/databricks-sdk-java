// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * EndpointSpotInstancePolicy configures whether the endpoint should use spot instances.
 *
 * <p>The breakdown of how the EndpointSpotInstancePolicy converts to per cloud configurations is:
 *
 * <p>+-------+--------------------------------------+--------------------------------+ | Cloud |
 * COST_OPTIMIZED | RELIABILITY_OPTIMIZED |
 * +-------+--------------------------------------+--------------------------------+ | AWS | On
 * Demand Driver with Spot Executors | On Demand Driver and Executors | | AZURE | On Demand Driver
 * and Executors | On Demand Driver and Executors |
 * +-------+--------------------------------------+--------------------------------+
 */
@Generated
public enum SpotInstancePolicy {
  COST_OPTIMIZED,
  POLICY_UNSPECIFIED,
  RELIABILITY_OPTIMIZED,
}

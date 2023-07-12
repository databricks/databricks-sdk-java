// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Availability type used for all subsequent nodes past the `first_on_demand`
 * ones. Note: If `first_on_demand` is zero (which only happens on pool
 * clusters), this availability type will be used for the entire cluster.
 */
@Generated
public enum AzureAvailability{
  ON_DEMAND_AZURE,
  SPOT_AZURE,
  SPOT_WITH_FALLBACK_AZURE,
  
}
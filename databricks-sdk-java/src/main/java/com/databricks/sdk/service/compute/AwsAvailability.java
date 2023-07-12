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
 * ones.
 * 
 * Note: If `first_on_demand` is zero, this availability type will be used for
 * the entire cluster.
 */
@Generated
public enum AwsAvailability{
  ON_DEMAND,
  SPOT,
  SPOT_WITH_FALLBACK,
  
}
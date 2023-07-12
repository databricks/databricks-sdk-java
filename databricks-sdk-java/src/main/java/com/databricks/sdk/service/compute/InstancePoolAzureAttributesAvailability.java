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
 * Shows the Availability type used for the spot nodes.
 * 
 * The default value is defined by
 * InstancePoolConf.instancePoolDefaultAzureAvailability
 */
@Generated
public enum InstancePoolAzureAttributesAvailability{
  ON_DEMAND_AZURE,
  SPOT_AZURE,
  SPOT_WITH_FALLBACK_AZURE,
  
}
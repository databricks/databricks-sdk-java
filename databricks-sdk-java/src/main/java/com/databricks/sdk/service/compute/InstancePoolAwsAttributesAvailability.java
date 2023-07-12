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
 * Availability type used for the spot nodes.
 * 
 * The default value is defined by
 * InstancePoolConf.instancePoolDefaultAwsAvailability
 */
@Generated
public enum InstancePoolAwsAttributesAvailability{
  ON_DEMAND,
  SPOT,
  SPOT_WITH_FALLBACK,
  
}
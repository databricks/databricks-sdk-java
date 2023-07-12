// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Configurations whether the warehouse should use spot instances.
 */
@Generated
public enum SpotInstancePolicy{
  COST_OPTIMIZED,
  POLICY_UNSPECIFIED,
  RELIABILITY_OPTIMIZED,
  
}
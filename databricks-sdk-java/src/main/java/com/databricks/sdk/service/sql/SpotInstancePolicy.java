// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Configurations whether the warehouse should use spot instances.
 */
public enum SpotInstancePolicy{
    COST_OPTIMIZED,
    POLICY_UNSPECIFIED,
    RELIABILITY_OPTIMIZED,
    
}
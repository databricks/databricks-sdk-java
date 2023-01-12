// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Shows the Availability type used for the spot nodes.
 * 
 * The default value is defined by
 * InstancePoolConf.instancePoolDefaultAzureAvailability
 */
public enum InstancePoolAzureAttributesAvailability{
    ON_DEMAND_AZURE,
    SPOT_AZURE,
    SPOT_WITH_FALLBACK_AZURE,
    
}
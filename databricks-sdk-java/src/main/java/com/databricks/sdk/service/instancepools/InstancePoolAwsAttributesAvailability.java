// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Availability type used for the spot nodes.
 * 
 * The default value is defined by
 * InstancePoolConf.instancePoolDefaultAwsAvailability
 */
public enum InstancePoolAwsAttributesAvailability{
    ON_DEMAND,
    SPOT,
    SPOT_WITH_FALLBACK,
    
}
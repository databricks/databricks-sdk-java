// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Only lowest-price and prioritized are allowed
 */
public enum FleetOnDemandOptionAllocationStrategy{
    CAPACITY_OPTIMIZED,
    DIVERSIFIED,
    LOWEST_PRICE,
    PRIORITIZED,
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Availability type used for all subsequent nodes past the `first_on_demand`
 * ones. Note: If `first_on_demand` is zero (which only happens on pool
 * clusters), this availability type will be used for the entire cluster.
 */
public enum AzureAvailability{
    ON_DEMAND_AZURE,
    SPOT_AZURE,
    SPOT_WITH_FALLBACK_AZURE,
    
}
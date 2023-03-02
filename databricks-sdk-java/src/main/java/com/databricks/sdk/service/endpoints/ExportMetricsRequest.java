// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Retrieve the metrics corresponding to a serving endpoint for the current time
 * in Prometheus or OpenMetrics exposition format
 */
@Generated("databricks-sdk-generator")
public class ExportMetricsRequest {
    /**
     * The name of the serving endpoint to retrieve metrics for. This field is
     * required.
     */
    
    private String name;
    
    public ExportMetricsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}

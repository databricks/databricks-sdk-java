// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RunData {
    /**
     * Run metrics.
     */
    @JsonProperty("metrics")
    private java.util.List<Metric> metrics;
    
    /**
     * Run parameters.
     */
    @JsonProperty("params")
    private java.util.List<Param> params;
    
    /**
     * Additional metadata key-value pairs.
     */
    @JsonProperty("tags")
    private java.util.List<RunTag> tags;
    
    public RunData setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public java.util.List<Metric> getMetrics() {
        return metrics;
    }
    
    public RunData setParams(java.util.List<Param> params) {
        this.params = params;
        return this;
    }

    public java.util.List<Param> getParams() {
        return params;
    }
    
    public RunData setTags(java.util.List<RunTag> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<RunTag> getTags() {
        return tags;
    }
    
}

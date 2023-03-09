// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Metric {
    /**
     * Key identifying this metric.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * Step at which to log the metric.
     */
    @JsonProperty("step")
    private Long step;
    
    /**
     * The timestamp at which this metric was recorded.
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    
    /**
     * Value associated with this metric.
     */
    @JsonProperty("value")
    private Float value;
    
    public Metric setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public Metric setStep(Long step) {
        this.step = step;
        return this;
    }

    public Long getStep() {
        return step;
    }
    
    public Metric setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }
    
    public Metric setValue(Float value) {
        this.value = value;
        return this;
    }

    public Float getValue() {
        return value;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Run {
    /**
     * Run data.
     */
    @JsonProperty("data")
    private RunData data;
    
    /**
     * Run metadata.
     */
    @JsonProperty("info")
    private RunInfo info;
    
    public Run setData(RunData data) {
        this.data = data;
        return this;
    }

    public RunData getData() {
        return data;
    }
    
    public Run setInfo(RunInfo info) {
        this.info = info;
        return this;
    }

    public RunInfo getInfo() {
        return info;
    }
    
}

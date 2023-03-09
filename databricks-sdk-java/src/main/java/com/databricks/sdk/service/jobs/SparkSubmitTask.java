// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SparkSubmitTask {
    /**
     * Command-line parameters passed to spark submit.
     * 
     * Use [Task parameter variables] to set parameters containing information
     * about job runs.
     * 
     * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
     */
    @JsonProperty("parameters")
    private java.util.List<String> parameters;
    
    public SparkSubmitTask setParameters(java.util.List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public java.util.List<String> getParameters() {
        return parameters;
    }
    
}

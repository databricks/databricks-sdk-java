// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class LogModel {
    /**
     * MLmodel file in json format.
     */
    @JsonProperty("model_json")
    private String modelJson;
    
    /**
     * ID of the run to log under
     */
    @JsonProperty("run_id")
    private String runId;
    
    public LogModel setModelJson(String modelJson) {
        this.modelJson = modelJson;
        return this;
    }

    public String getModelJson() {
        return modelJson;
    }
    
    public LogModel setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateRunResponse {
    /**
     * Updated metadata of the run.
     */
    @JsonProperty("run_info")
    private RunInfo runInfo;
    
    public UpdateRunResponse setRunInfo(RunInfo runInfo) {
        this.runInfo = runInfo;
        return this;
    }

    public RunInfo getRunInfo() {
        return runInfo;
    }
    
}

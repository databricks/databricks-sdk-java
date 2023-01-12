// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateRun {
    /**
     * Unix timestamp in milliseconds of when the run ended.
     */
    @JsonProperty("end_time")
    private Long endTime;
    
    /**
     * ID of the run to update. Must be provided.
     */
    @JsonProperty("run_id")
    private String runId;
    
    /**
     * [Deprecated, use run_id instead] ID of the run to update.. This field
     * will be removed in a future MLflow version.
     */
    @JsonProperty("run_uuid")
    private String runUuid;
    
    /**
     * Updated status of the run.
     */
    @JsonProperty("status")
    private UpdateRunStatus status;
    
    public UpdateRun setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }
    
    public UpdateRun setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public UpdateRun setRunUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
    }

    public String getRunUuid() {
        return runUuid;
    }
    
    public UpdateRun setStatus(UpdateRunStatus status) {
        this.status = status;
        return this;
    }

    public UpdateRunStatus getStatus() {
        return status;
    }
    
}

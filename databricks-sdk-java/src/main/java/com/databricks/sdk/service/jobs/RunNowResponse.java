// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RunNowResponse {
    /**
     * A unique identifier for this job run. This is set to the same value as
     * `run_id`.
     */
    @JsonProperty("number_in_job")
    private Long numberInJob;
    
    /**
     * The globally unique ID of the newly triggered run.
     */
    @JsonProperty("run_id")
    private Long runId;
    
    public RunNowResponse setNumberInJob(Long numberInJob) {
        this.numberInJob = numberInJob;
        return this;
    }

    public Long getNumberInJob() {
        return numberInJob;
    }
    
    public RunNowResponse setRunId(Long runId) {
        this.runId = runId;
        return this;
    }

    public Long getRunId() {
        return runId;
    }
    
}

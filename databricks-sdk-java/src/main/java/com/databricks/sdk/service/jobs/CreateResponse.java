// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateResponse {
    /**
     * The canonical identifier for the newly created job.
     */
    @JsonProperty("job_id")
    private Long jobId;
    
    public CreateResponse setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
}

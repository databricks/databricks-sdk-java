// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class JobSpecWithoutSecret {
    /**
     * ID of the job that the webhook runs.
     */
    @JsonProperty("job_id")
    private String jobId;
    
    /**
     * URL of the workspace containing the job that this webhook runs. Defaults
     * to the workspace URL in which the webhook is created. If not specified,
     * the job’s workspace is assumed to be the same as the webhook’s.
     */
    @JsonProperty("workspace_url")
    private String workspaceUrl;
    
    public JobSpecWithoutSecret setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }
    
    public JobSpecWithoutSecret setWorkspaceUrl(String workspaceUrl) {
        this.workspaceUrl = workspaceUrl;
        return this;
    }

    public String getWorkspaceUrl() {
        return workspaceUrl;
    }
    
}

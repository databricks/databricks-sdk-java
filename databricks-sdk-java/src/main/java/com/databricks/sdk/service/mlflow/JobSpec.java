// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class JobSpec {
    /**
     * The personal access token used to authorize webhook's job runs.
     */
    @JsonProperty("access_token")
    private String accessToken;
    
    /**
     * ID of the job that the webhook runs.
     */
    @JsonProperty("job_id")
    private String jobId;
    
    /**
     * URL of the workspace containing the job that this webhook runs. If not
     * specified, the job’s workspace URL is assumed to be the same as the
     * workspace where the webhook is created.
     */
    @JsonProperty("workspace_url")
    private String workspaceUrl;
    
    public JobSpec setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }
    
    public JobSpec setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }
    
    public JobSpec setWorkspaceUrl(String workspaceUrl) {
        this.workspaceUrl = workspaceUrl;
        return this;
    }

    public String getWorkspaceUrl() {
        return workspaceUrl;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BaseJob {
    /**
     * The time at which this job was created in epoch milliseconds
     * (milliseconds since 1/1/1970 UTC).
     */
    @JsonProperty("created_time")
    private Long createdTime;
    
    /**
     * The creator user name. This field won’t be included in the response if
     * the user has already been deleted.
     */
    @JsonProperty("creator_user_name")
    private String creatorUserName;
    
    /**
     * The canonical identifier for this job.
     */
    @JsonProperty("job_id")
    private Long jobId;
    
    /**
     * Settings for this job and all of its runs. These settings can be updated
     * using the `resetJob` method.
     */
    @JsonProperty("settings")
    private JobSettings settings;
    
    public BaseJob setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Long getCreatedTime() {
        return createdTime;
    }
    
    public BaseJob setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }
    
    public BaseJob setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
    public BaseJob setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }

    public JobSettings getSettings() {
        return settings;
    }
    
}

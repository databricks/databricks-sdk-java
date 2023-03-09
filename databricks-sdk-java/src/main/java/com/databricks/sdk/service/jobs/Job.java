// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Job {
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
     * The user name that the job runs as. `run_as_user_name` is based on the
     * current job settings, and is set to the creator of the job if job access
     * control is disabled, or the `is_owner` permission if job access control
     * is enabled.
     */
    @JsonProperty("run_as_user_name")
    private String runAsUserName;
    
    /**
     * Settings for this job and all of its runs. These settings can be updated
     * using the `resetJob` method.
     */
    @JsonProperty("settings")
    private JobSettings settings;
    
    /**
     * History of the file arrival trigger associated with the job.
     */
    @JsonProperty("trigger_history")
    private TriggerHistory triggerHistory;
    
    public Job setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Long getCreatedTime() {
        return createdTime;
    }
    
    public Job setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }
    
    public Job setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
    public Job setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
        return this;
    }

    public String getRunAsUserName() {
        return runAsUserName;
    }
    
    public Job setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }

    public JobSettings getSettings() {
        return settings;
    }
    
    public Job setTriggerHistory(TriggerHistory triggerHistory) {
        this.triggerHistory = triggerHistory;
        return this;
    }

    public TriggerHistory getTriggerHistory() {
        return triggerHistory;
    }
    
}

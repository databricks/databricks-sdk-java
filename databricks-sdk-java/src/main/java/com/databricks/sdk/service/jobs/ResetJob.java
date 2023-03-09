// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ResetJob {
    /**
     * The canonical identifier of the job to reset. This field is required.
     */
    @JsonProperty("job_id")
    private Long jobId;
    
    /**
     * The new settings of the job. These settings completely replace the old
     * settings.
     * 
     * Changes to the field `JobSettings.timeout_seconds` are applied to active
     * runs. Changes to other fields are applied to future runs only.
     */
    @JsonProperty("new_settings")
    private JobSettings newSettings;
    
    public ResetJob setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
    public ResetJob setNewSettings(JobSettings newSettings) {
        this.newSettings = newSettings;
        return this;
    }

    public JobSettings getNewSettings() {
        return newSettings;
    }
    
}

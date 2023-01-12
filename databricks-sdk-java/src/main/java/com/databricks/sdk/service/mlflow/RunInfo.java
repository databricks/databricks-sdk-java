// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RunInfo {
    /**
     * URI of the directory where artifacts should be uploaded. This can be a
     * local path (starting with "/"), or a distributed file system (DFS) path,
     * like `s3://bucket/directory` or `dbfs:/my/directory`. If not set, the
     * local `./mlruns` directory is chosen.
     */
    @JsonProperty("artifact_uri")
    private String artifactUri;
    
    /**
     * Unix timestamp of when the run ended in milliseconds.
     */
    @JsonProperty("end_time")
    private Long endTime;
    
    /**
     * The experiment ID.
     */
    @JsonProperty("experiment_id")
    private String experimentId;
    
    /**
     * Current life cycle stage of the experiment : OneOf("active", "deleted")
     */
    @JsonProperty("lifecycle_stage")
    private String lifecycleStage;
    
    /**
     * Unique identifier for the run.
     */
    @JsonProperty("run_id")
    private String runId;
    
    /**
     * [Deprecated, use run_id instead] Unique identifier for the run. This
     * field will be removed in a future MLflow version.
     */
    @JsonProperty("run_uuid")
    private String runUuid;
    
    /**
     * Unix timestamp of when the run started in milliseconds.
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    /**
     * Current status of the run.
     */
    @JsonProperty("status")
    private RunInfoStatus status;
    
    /**
     * User who initiated the run. This field is deprecated as of MLflow 1.0,
     * and will be removed in a future MLflow release. Use 'mlflow.user' tag
     * instead.
     */
    @JsonProperty("user_id")
    private String userId;
    
    public RunInfo setArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
    }

    public String getArtifactUri() {
        return artifactUri;
    }
    
    public RunInfo setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }
    
    public RunInfo setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
    public RunInfo setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
        return this;
    }

    public String getLifecycleStage() {
        return lifecycleStage;
    }
    
    public RunInfo setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public RunInfo setRunUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
    }

    public String getRunUuid() {
        return runUuid;
    }
    
    public RunInfo setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }
    
    public RunInfo setStatus(RunInfoStatus status) {
        this.status = status;
        return this;
    }

    public RunInfoStatus getStatus() {
        return status;
    }
    
    public RunInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
}

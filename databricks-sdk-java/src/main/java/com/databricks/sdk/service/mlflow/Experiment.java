// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Experiment {
    /**
     * Location where artifacts for the experiment are stored.
     */
    @JsonProperty("artifact_location")
    private String artifactLocation;
    
    /**
     * Creation time
     */
    @JsonProperty("creation_time")
    private Long creationTime;
    
    /**
     * Unique identifier for the experiment.
     */
    @JsonProperty("experiment_id")
    private String experimentId;
    
    /**
     * Last update time
     */
    @JsonProperty("last_update_time")
    private Long lastUpdateTime;
    
    /**
     * Current life cycle stage of the experiment: "active" or "deleted".
     * Deleted experiments are not returned by APIs.
     */
    @JsonProperty("lifecycle_stage")
    private String lifecycleStage;
    
    /**
     * Human readable name that identifies the experiment.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Tags: Additional metadata key-value pairs.
     */
    @JsonProperty("tags")
    private java.util.List<ExperimentTag> tags;
    
    public Experiment setArtifactLocation(String artifactLocation) {
        this.artifactLocation = artifactLocation;
        return this;
    }

    public String getArtifactLocation() {
        return artifactLocation;
    }
    
    public Experiment setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Long getCreationTime() {
        return creationTime;
    }
    
    public Experiment setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
    public Experiment setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }
    
    public Experiment setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
        return this;
    }

    public String getLifecycleStage() {
        return lifecycleStage;
    }
    
    public Experiment setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public Experiment setTags(java.util.List<ExperimentTag> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<ExperimentTag> getTags() {
        return tags;
    }
    
}

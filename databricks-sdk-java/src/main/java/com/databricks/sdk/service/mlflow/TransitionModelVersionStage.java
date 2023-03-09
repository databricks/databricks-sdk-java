// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TransitionModelVersionStage {
    /**
     * When transitioning a model version to a particular stage, this flag
     * dictates whether all existing model versions in that stage should be
     * atomically moved to the "archived" stage. This ensures that at-most-one
     * model version exists in the target stage. This field is *required* when
     * transitioning a model versions's stage
     */
    @JsonProperty("archive_existing_versions")
    private Boolean archiveExistingVersions;
    
    /**
     * Name of the registered model
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Transition `model_version` to new stage.
     */
    @JsonProperty("stage")
    private String stage;
    
    /**
     * Model version number
     */
    @JsonProperty("version")
    private String version;
    
    public TransitionModelVersionStage setArchiveExistingVersions(Boolean archiveExistingVersions) {
        this.archiveExistingVersions = archiveExistingVersions;
        return this;
    }

    public Boolean getArchiveExistingVersions() {
        return archiveExistingVersions;
    }
    
    public TransitionModelVersionStage setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public TransitionModelVersionStage setStage(String stage) {
        this.stage = stage;
        return this;
    }

    public String getStage() {
        return stage;
    }
    
    public TransitionModelVersionStage setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ApproveTransitionRequest {
    /**
     * Specifies whether to archive all current model versions in the target
     * stage.
     */
    @JsonProperty("archive_existing_versions")
    private Boolean archiveExistingVersions;
    
    /**
     * User-provided comment on the action.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Name of the model.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Target stage of the transition. Valid values are:
     * 
     * * `None`: The initial stage of a model version.
     * 
     * * `Staging`: Staging or pre-production stage.
     * 
     * * `Production`: Production stage.
     * 
     * * `Archived`: Archived stage.
     */
    @JsonProperty("stage")
    private Stage stage;
    
    /**
     * Version of the model.
     */
    @JsonProperty("version")
    private String version;
    
    public ApproveTransitionRequest setArchiveExistingVersions(Boolean archiveExistingVersions) {
        this.archiveExistingVersions = archiveExistingVersions;
        return this;
    }

    public Boolean getArchiveExistingVersions() {
        return archiveExistingVersions;
    }
    
    public ApproveTransitionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public ApproveTransitionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ApproveTransitionRequest setStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    public Stage getStage() {
        return stage;
    }
    
    public ApproveTransitionRequest setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}

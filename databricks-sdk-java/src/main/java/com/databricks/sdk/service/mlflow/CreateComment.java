// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateComment {
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
     * Version of the model.
     */
    @JsonProperty("version")
    private String version;
    
    public CreateComment setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CreateComment setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateComment setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}

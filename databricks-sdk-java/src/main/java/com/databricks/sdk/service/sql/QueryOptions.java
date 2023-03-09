// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class QueryOptions {
    /**
     * The timestamp when this query was moved to trash. Only present when the
     * `is_archived` property is `true`. Trashed items are deleted after thirty
     * days.
     */
    @JsonProperty("moved_to_trash_at")
    private String movedToTrashAt;
    
    /**
     
     */
    @JsonProperty("parameters")
    private java.util.List<Parameter> parameters;
    
    public QueryOptions setMovedToTrashAt(String movedToTrashAt) {
        this.movedToTrashAt = movedToTrashAt;
        return this;
    }

    public String getMovedToTrashAt() {
        return movedToTrashAt;
    }
    
    public QueryOptions setParameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public java.util.List<Parameter> getParameters() {
        return parameters;
    }
    
}

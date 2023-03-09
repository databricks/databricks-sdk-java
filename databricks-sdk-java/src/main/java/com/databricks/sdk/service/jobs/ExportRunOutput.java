// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ExportRunOutput {
    /**
     * The exported content in HTML format (one for every view item).
     */
    @JsonProperty("views")
    private java.util.List<ViewItem> views;
    
    public ExportRunOutput setViews(java.util.List<ViewItem> views) {
        this.views = views;
        return this;
    }

    public java.util.List<ViewItem> getViews() {
        return views;
    }
    
}

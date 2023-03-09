// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ExportResponse {
    /**
     * The base64-encoded content. If the limit (10MB) is exceeded, exception
     * with error code **MAX_NOTEBOOK_SIZE_EXCEEDED** will be thrown.
     */
    @JsonProperty("content")
    private String content;
    
    public ExportResponse setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }
    
}

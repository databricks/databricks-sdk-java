// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListArtifactsResponse {
    /**
     * File location and metadata for artifacts.
     */
    @JsonProperty("files")
    private java.util.List<FileInfo> files;
    
    /**
     * Token that can be used to retrieve the next page of artifact results
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * Root artifact directory for the run.
     */
    @JsonProperty("root_uri")
    private String rootUri;
    
    public ListArtifactsResponse setFiles(java.util.List<FileInfo> files) {
        this.files = files;
        return this;
    }

    public java.util.List<FileInfo> getFiles() {
        return files;
    }
    
    public ListArtifactsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListArtifactsResponse setRootUri(String rootUri) {
        this.rootUri = rootUri;
        return this;
    }

    public String getRootUri() {
        return rootUri;
    }
    
}

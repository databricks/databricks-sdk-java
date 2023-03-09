// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ClusterLibraryStatuses {
    /**
     * Unique identifier for the cluster.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * Status of all libraries on the cluster.
     */
    @JsonProperty("library_statuses")
    private java.util.List<LibraryFullStatus> libraryStatuses;
    
    public ClusterLibraryStatuses setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ClusterLibraryStatuses setLibraryStatuses(java.util.List<LibraryFullStatus> libraryStatuses) {
        this.libraryStatuses = libraryStatuses;
        return this;
    }

    public java.util.List<LibraryFullStatus> getLibraryStatuses() {
        return libraryStatuses;
    }
    
}

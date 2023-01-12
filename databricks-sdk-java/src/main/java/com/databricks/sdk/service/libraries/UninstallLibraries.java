// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UninstallLibraries {
    /**
     * Unique identifier for the cluster on which to uninstall these libraries.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * The libraries to uninstall.
     */
    @JsonProperty("libraries")
    private java.util.List<Library> libraries;
    
    public UninstallLibraries setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public UninstallLibraries setLibraries(java.util.List<Library> libraries) {
        this.libraries = libraries;
        return this;
    }

    public java.util.List<Library> getLibraries() {
        return libraries;
    }
    
}

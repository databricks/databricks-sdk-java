// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ClusterSpec {
    /**
     * If existing_cluster_id, the ID of an existing cluster that is used for
     * all runs of this job. When running jobs on an existing cluster, you may
     * need to manually restart the cluster if it stops responding. We suggest
     * running jobs on new clusters for greater reliability
     */
    @JsonProperty("existing_cluster_id")
    private String existingClusterId;
    
    /**
     * An optional list of libraries to be installed on the cluster that
     * executes the job. The default value is an empty list.
     */
    @JsonProperty("libraries")
    private java.util.List<Object /* MISSING TYPE */> libraries;
    
    /**
     * If new_cluster, a description of a cluster that is created for each run.
     */
    @JsonProperty("new_cluster")
    private Object /* MISSING TYPE */ newCluster;
    
    public ClusterSpec setExistingClusterId(String existingClusterId) {
        this.existingClusterId = existingClusterId;
        return this;
    }

    public String getExistingClusterId() {
        return existingClusterId;
    }
    
    public ClusterSpec setLibraries(java.util.List<Object /* MISSING TYPE */> libraries) {
        this.libraries = libraries;
        return this;
    }

    public java.util.List<Object /* MISSING TYPE */> getLibraries() {
        return libraries;
    }
    
    public ClusterSpec setNewCluster(Object /* MISSING TYPE */ newCluster) {
        this.newCluster = newCluster;
        return this;
    }

    public Object /* MISSING TYPE */ getNewCluster() {
        return newCluster;
    }
    
}

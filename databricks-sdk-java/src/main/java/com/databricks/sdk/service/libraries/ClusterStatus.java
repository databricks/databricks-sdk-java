// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get status
 */
@Generated("databricks-sdk-generator")
public class ClusterStatus {
    /**
     * Unique identifier of the cluster whose status should be retrieved.
     */
    @QueryParam("cluster_id")
    private String clusterId;
    
    public ClusterStatus setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
}

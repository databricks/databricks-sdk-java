// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get cluster info
 */
@Generated("databricks-sdk-generator")
public class Get {
    /**
     * The cluster about which to retrieve information.
     */
    @QueryParam("cluster_id")
    private String clusterId;
    
    public Get setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
}

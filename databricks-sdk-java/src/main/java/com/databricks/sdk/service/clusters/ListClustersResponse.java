// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListClustersResponse {
    /**
     * <needs content added>
     */
    @JsonProperty("clusters")
    private java.util.List<ClusterInfo> clusters;
    
    public ListClustersResponse setClusters(java.util.List<ClusterInfo> clusters) {
        this.clusters = clusters;
        return this;
    }

    public java.util.List<ClusterInfo> getClusters() {
        return clusters;
    }
    
}

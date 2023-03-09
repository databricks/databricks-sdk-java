// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ClusterEvent {
    /**
     * <needs content added>
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * <needs content added>
     */
    @JsonProperty("data_plane_event_details")
    private DataPlaneEventDetails dataPlaneEventDetails;
    
    /**
     * <needs content added>
     */
    @JsonProperty("details")
    private EventDetails details;
    
    /**
     * The timestamp when the event occurred, stored as the number of
     * milliseconds since the Unix epoch. If not provided, this will be assigned
     * by the Timeline service.
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    
    /**
     
     */
    @JsonProperty("type")
    private EventType typeValue;
    
    public ClusterEvent setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ClusterEvent setDataPlaneEventDetails(DataPlaneEventDetails dataPlaneEventDetails) {
        this.dataPlaneEventDetails = dataPlaneEventDetails;
        return this;
    }

    public DataPlaneEventDetails getDataPlaneEventDetails() {
        return dataPlaneEventDetails;
    }
    
    public ClusterEvent setDetails(EventDetails details) {
        this.details = details;
        return this;
    }

    public EventDetails getDetails() {
        return details;
    }
    
    public ClusterEvent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }
    
    public ClusterEvent setType(EventType typeValue) {
        this.typeValue = typeValue;
        return this;
    }

    public EventType getType() {
        return typeValue;
    }
    
}

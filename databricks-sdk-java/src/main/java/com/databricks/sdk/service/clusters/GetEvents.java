// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetEvents {
    /**
     * The ID of the cluster to retrieve events about.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * The end time in epoch milliseconds. If empty, returns events up to the
     * current time.
     */
    @JsonProperty("end_time")
    private Long endTime;
    
    /**
     * An optional set of event types to filter on. If empty, all event types
     * are returned.
     */
    @JsonProperty("event_types")
    private java.util.List<EventType> eventTypes;
    
    /**
     * The maximum number of events to include in a page of events. Defaults to
     * 50, and maximum allowed value is 500.
     */
    @JsonProperty("limit")
    private Long limit;
    
    /**
     * The offset in the result set. Defaults to 0 (no offset). When an offset
     * is specified and the results are requested in descending order, the
     * end_time field is required.
     */
    @JsonProperty("offset")
    private Long offset;
    
    /**
     * The order to list events in; either "ASC" or "DESC". Defaults to "DESC".
     */
    @JsonProperty("order")
    private GetEventsOrder order;
    
    /**
     * The start time in epoch milliseconds. If empty, returns events starting
     * from the beginning of time.
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    public GetEvents setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public GetEvents setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }
    
    public GetEvents setEventTypes(java.util.List<EventType> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public java.util.List<EventType> getEventTypes() {
        return eventTypes;
    }
    
    public GetEvents setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getLimit() {
        return limit;
    }
    
    public GetEvents setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    public Long getOffset() {
        return offset;
    }
    
    public GetEvents setOrder(GetEventsOrder order) {
        this.order = order;
        return this;
    }

    public GetEventsOrder getOrder() {
        return order;
    }
    
    public GetEvents setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }
    
}

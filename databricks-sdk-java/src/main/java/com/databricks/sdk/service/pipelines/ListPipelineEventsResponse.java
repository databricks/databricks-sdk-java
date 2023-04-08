// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListPipelineEventsResponse {
    /**
     * The list of events matching the request criteria.
     */
    @JsonProperty("events")
    private java.util.List<PipelineEvent> events;
    
    /**
     * If present, a token to fetch the next page of events.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * If present, a token to fetch the previous page of events.
     */
    @JsonProperty("prev_page_token")
    private String prevPageToken;
    
    public ListPipelineEventsResponse setEvents(java.util.List<PipelineEvent> events) {
        this.events = events;
        return this;
    }

    public java.util.List<PipelineEvent> getEvents() {
        return events;
    }
    
    public ListPipelineEventsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListPipelineEventsResponse setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
        return this;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }
    
}

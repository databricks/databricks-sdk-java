// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetEventsResponse {
    /**
     * <content needs to be added>
     */
    @JsonProperty("events")
    private java.util.List<ClusterEvent> events;
    
    /**
     * The parameters required to retrieve the next page of events. Omitted if
     * there are no more events to read.
     */
    @JsonProperty("next_page")
    private GetEvents nextPage;
    
    /**
     * The total number of events filtered by the start_time, end_time, and
     * event_types.
     */
    @JsonProperty("total_count")
    private Long totalCount;
    
    public GetEventsResponse setEvents(java.util.List<ClusterEvent> events) {
        this.events = events;
        return this;
    }

    public java.util.List<ClusterEvent> getEvents() {
        return events;
    }
    
    public GetEventsResponse setNextPage(GetEvents nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public GetEvents getNextPage() {
        return nextPage;
    }
    
    public GetEventsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Long getTotalCount() {
        return totalCount;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListRunsResponse {
    /**
     * If true, additional runs matching the provided filter are available for
     * listing.
     */
    @JsonProperty("has_more")
    private Boolean hasMore;
    
    /**
     * A list of runs, from most recently started to least.
     */
    @JsonProperty("runs")
    private java.util.List<Run> runs;
    
    public ListRunsResponse setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }
    
    public ListRunsResponse setRuns(java.util.List<Run> runs) {
        this.runs = runs;
        return this;
    }

    public java.util.List<Run> getRuns() {
        return runs;
    }
    
}

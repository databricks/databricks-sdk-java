// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SearchRunsResponse {
    /**
     * Token for the next page of runs.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * Runs that match the search criteria.
     */
    @JsonProperty("runs")
    private java.util.List<Run> runs;
    
    public SearchRunsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public SearchRunsResponse setRuns(java.util.List<Run> runs) {
        this.runs = runs;
        return this;
    }

    public java.util.List<Run> getRuns() {
        return runs;
    }
    
}

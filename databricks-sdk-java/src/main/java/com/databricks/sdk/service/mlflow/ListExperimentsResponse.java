// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListExperimentsResponse {
    /**
     * Paginated Experiments beginning with the first item on the requested
     * page.
     */
    @JsonProperty("experiments")
    private java.util.List<Experiment> experiments;
    
    /**
     * Token that can be used to retrieve the next page of experiments. Empty
     * token means no more experiment is available for retrieval.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    public ListExperimentsResponse setExperiments(java.util.List<Experiment> experiments) {
        this.experiments = experiments;
        return this;
    }

    public java.util.List<Experiment> getExperiments() {
        return experiments;
    }
    
    public ListExperimentsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
}

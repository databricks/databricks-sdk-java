// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List experiments
 */
public class ListExperimentsRequest {
    /**
     * Maximum number of experiments desired. If `max_results` is unspecified,
     * return all experiments. If `max_results` is too large, it'll be
     * automatically capped at 1000. Callers of this endpoint are encouraged to
     * pass max_results explicitly and leverage page_token to iterate through
     * experiments.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * Token indicating the page of experiments to fetch
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     * Qualifier for type of experiments to be returned. If unspecified, return
     * only active experiments.
     */
    @QueryParam("view_type")
    private String viewType;
    
    public ListExperimentsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListExperimentsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public ListExperimentsRequest setViewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    public String getViewType() {
        return viewType;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SearchExperiments {
    /**
     * String representing a SQL filter condition (e.g. "name ILIKE
     * 'my-experiment%'")
     */
    @JsonProperty("filter")
    private String filter;
    
    /**
     * Maximum number of experiments desired. Max threshold is 3000.
     */
    @JsonProperty("max_results")
    private Long maxResults;
    
    /**
     * List of columns for ordering search results, which can include experiment
     * name and last updated timestamp with an optional "DESC" or "ASC"
     * annotation, where "ASC" is the default. Tiebreaks are done by experiment
     * id DESC.
     */
    @JsonProperty("order_by")
    private java.util.List<String> orderBy;
    
    /**
     * Token indicating the page of experiments to fetch
     */
    @JsonProperty("page_token")
    private String pageToken;
    
    /**
     * Qualifier for type of experiments to be returned. If unspecified, return
     * only active experiments.
     */
    @JsonProperty("view_type")
    private SearchExperimentsViewType viewType;
    
    public SearchExperiments setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getFilter() {
        return filter;
    }
    
    public SearchExperiments setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public SearchExperiments setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public java.util.List<String> getOrderBy() {
        return orderBy;
    }
    
    public SearchExperiments setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public SearchExperiments setViewType(SearchExperimentsViewType viewType) {
        this.viewType = viewType;
        return this;
    }

    public SearchExperimentsViewType getViewType() {
        return viewType;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Searches model versions
 */
public class SearchModelVersionsRequest {
    /**
     * String filter condition, like "name='my-model-name'". Must be a single
     * boolean condition, with string values wrapped in single quotes.
     */
    @QueryParam("filter")
    private String filter;
    
    /**
     * Maximum number of models desired. Max threshold is 10K.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * List of columns to be ordered by including model name, version, stage
     * with an optional "DESC" or "ASC" annotation, where "ASC" is the default.
     * Tiebreaks are done by latest stage transition timestamp, followed by name
     * ASC, followed by version DESC.
     */
    @QueryParam("order_by")
    private java.util.List<String> orderBy;
    
    /**
     * Pagination token to go to next page based on previous search query.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public SearchModelVersionsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getFilter() {
        return filter;
    }
    
    public SearchModelVersionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public SearchModelVersionsRequest setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public java.util.List<String> getOrderBy() {
        return orderBy;
    }
    
    public SearchModelVersionsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List Queries
 */
public class ListQueryHistoryRequest {
    /**
     * A filter to limit query history results. This field is optional.
     */
    @QueryParam("filter_by")
    private QueryFilter filterBy;
    
    /**
     * Whether to include metrics about query.
     */
    @QueryParam("include_metrics")
    private Boolean includeMetrics;
    
    /**
     * Limit the number of results returned in one page. The default is 100.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * A token that can be used to get the next page of results.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public ListQueryHistoryRequest setFilterBy(QueryFilter filterBy) {
        this.filterBy = filterBy;
        return this;
    }

    public QueryFilter getFilterBy() {
        return filterBy;
    }
    
    public ListQueryHistoryRequest setIncludeMetrics(Boolean includeMetrics) {
        this.includeMetrics = includeMetrics;
        return this;
    }

    public Boolean getIncludeMetrics() {
        return includeMetrics;
    }
    
    public ListQueryHistoryRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListQueryHistoryRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

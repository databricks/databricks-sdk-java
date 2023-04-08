// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List pipeline events
 */
public class ListPipelineEvents {
    /**
     * Criteria to select a subset of results, expressed using a SQL-like
     * syntax. The supported filters are:
     * 
     * 1. level='INFO' (or WARN or ERROR)
     * 
     * 2. level in ('INFO', 'WARN')
     * 
     * 3. id='[event-id]'
     * 
     * 4. timestamp > 'TIMESTAMP' (or >=,<,<=,=)
     * 
     * Composite expressions are supported, for example: level in ('ERROR',
     * 'WARN') AND timestamp> '2021-07-22T06:37:33.083Z'
     */
    @QueryParam("filter")
    private String filter;
    
    /**
     * Max number of entries to return in a single page. The system may return
     * fewer than max_results events in a response, even if there are more
     * events available.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * A string indicating a sort order by timestamp for the results, for
     * example, ["timestamp asc"]. The sort order can be ascending or
     * descending. By default, events are returned in descending order by
     * timestamp.
     */
    @QueryParam("order_by")
    private java.util.List<String> orderBy;
    
    /**
     * Page token returned by previous call. This field is mutually exclusive
     * with all fields in this request except max_results. An error is returned
     * if any fields other than max_results are set when this field is set.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     
     */
    
    private String pipelineId;
    
    public ListPipelineEvents setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getFilter() {
        return filter;
    }
    
    public ListPipelineEvents setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListPipelineEvents setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public java.util.List<String> getOrderBy() {
        return orderBy;
    }
    
    public ListPipelineEvents setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public ListPipelineEvents setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
}

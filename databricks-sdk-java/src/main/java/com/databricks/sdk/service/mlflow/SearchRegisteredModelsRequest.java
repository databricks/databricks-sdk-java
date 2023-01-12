// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Search models
 */
@Generated("databricks-sdk-generator")
public class SearchRegisteredModelsRequest {
    /**
     * String filter condition, like "name LIKE 'my-model-name'". Interpreted in
     * the backend automatically as "name LIKE '%my-model-name%'". Single
     * boolean condition, with string values wrapped in single quotes.
     */
    @QueryParam("filter")
    private String filter;
    
    /**
     * Maximum number of models desired. Default is 100. Max threshold is 1000.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * List of columns for ordering search results, which can include model name
     * and last updated timestamp with an optional "DESC" or "ASC" annotation,
     * where "ASC" is the default. Tiebreaks are done by model name ASC.
     */
    @QueryParam("order_by")
    private java.util.List<String> orderBy;
    
    /**
     * Pagination token to go to the next page based on a previous search query.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public SearchRegisteredModelsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getFilter() {
        return filter;
    }
    
    public SearchRegisteredModelsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public SearchRegisteredModelsRequest setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public java.util.List<String> getOrderBy() {
        return orderBy;
    }
    
    public SearchRegisteredModelsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

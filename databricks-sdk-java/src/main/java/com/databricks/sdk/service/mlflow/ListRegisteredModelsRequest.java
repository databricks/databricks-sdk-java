// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List models
 */
@Generated("databricks-sdk-generator")
public class ListRegisteredModelsRequest {
    /**
     * Maximum number of registered models desired. Max threshold is 1000.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * Pagination token to go to the next page based on a previous query.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public ListRegisteredModelsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListRegisteredModelsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

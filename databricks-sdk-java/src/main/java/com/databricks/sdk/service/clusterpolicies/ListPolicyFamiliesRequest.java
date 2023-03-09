// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListPolicyFamiliesRequest {
    /**
     * The max number of policy families to return.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * A token that can be used to get the next page of results.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public ListPolicyFamiliesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListPolicyFamiliesRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

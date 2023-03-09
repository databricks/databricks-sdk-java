// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get repos
 */
public class List {
    /**
     * Token used to get the next page of results. If not specified, returns the
     * first page of results as well as a next page token if there are more
     * results.
     */
    @QueryParam("next_page_token")
    private String nextPageToken;
    
    /**
     * Filters repos that have paths starting with the given path prefix.
     */
    @QueryParam("path_prefix")
    private String pathPrefix;
    
    public List setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public List setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    public String getPathPrefix() {
        return pathPrefix;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListUpdatesResponse {
    /**
     * If present, then there are more results, and this a token to be used in a
     * subsequent request to fetch the next page.
     */
    @JsonProperty("next_page_token")
    private String nextPageToken;
    
    /**
     * If present, then this token can be used in a subsequent request to fetch
     * the previous page.
     */
    @JsonProperty("prev_page_token")
    private String prevPageToken;
    
    /**
     
     */
    @JsonProperty("updates")
    private java.util.List<UpdateInfo> updates;
    
    public ListUpdatesResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }
    
    public ListUpdatesResponse setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
        return this;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }
    
    public ListUpdatesResponse setUpdates(java.util.List<UpdateInfo> updates) {
        this.updates = updates;
        return this;
    }

    public java.util.List<UpdateInfo> getUpdates() {
        return updates;
    }
    
}

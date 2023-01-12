// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List pipeline updates
 */
@Generated("databricks-sdk-generator")
public class ListUpdates {
    /**
     * Max number of entries to return in a single page.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * Page token returned by previous call
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     * The pipeline to return updates for.
     */
    
    private String pipelineId;
    
    /**
     * If present, returns updates until and including this update_id.
     */
    @QueryParam("until_update_id")
    private String untilUpdateId;
    
    public ListUpdates setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public ListUpdates setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public ListUpdates setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
    public ListUpdates setUntilUpdateId(String untilUpdateId) {
        this.untilUpdateId = untilUpdateId;
        return this;
    }

    public String getUntilUpdateId() {
        return untilUpdateId;
    }
    
}

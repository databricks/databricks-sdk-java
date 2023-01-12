// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get history of a given metric within a run
 */
@Generated("databricks-sdk-generator")
public class GetHistoryRequest {
    /**
     * Maximum number of Metric records to return per paginated request. Default
     * is set to 25,000. If set higher than 25,000, a request Exception will be
     * raised.
     */
    @QueryParam("max_results")
    private Long maxResults;
    
    /**
     * Name of the metric.
     */
    @QueryParam("metric_key")
    private String metricKey;
    
    /**
     * Token indicating the page of metric histories to fetch.
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     * ID of the run from which to fetch metric values. Must be provided.
     */
    @QueryParam("run_id")
    private String runId;
    
    /**
     * [Deprecated, use run_id instead] ID of the run from which to fetch metric
     * values. This field will be removed in a future MLflow version.
     */
    @QueryParam("run_uuid")
    private String runUuid;
    
    public GetHistoryRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public Long getMaxResults() {
        return maxResults;
    }
    
    public GetHistoryRequest setMetricKey(String metricKey) {
        this.metricKey = metricKey;
        return this;
    }

    public String getMetricKey() {
        return metricKey;
    }
    
    public GetHistoryRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public GetHistoryRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public GetHistoryRequest setRunUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
    }

    public String getRunUuid() {
        return runUuid;
    }
    
}

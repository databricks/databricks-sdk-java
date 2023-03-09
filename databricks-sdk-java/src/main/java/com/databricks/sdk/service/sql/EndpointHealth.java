// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class EndpointHealth {
    /**
     * Details about errors that are causing current degraded/failed status.
     */
    @JsonProperty("details")
    private String details;
    
    /**
     * The reason for failure to bring up clusters for this endpoint. This is
     * available when status is 'FAILED' and sometimes when it is DEGRADED.
     */
    @JsonProperty("failure_reason")
    private TerminationReason failureReason;
    
    /**
     * Deprecated. split into summary and details for security
     */
    @JsonProperty("message")
    private String message;
    
    /**
     * Health status of the endpoint.
     */
    @JsonProperty("status")
    private Status status;
    
    /**
     * A short summary of the health status in case of degraded/failed
     * endpoints.
     */
    @JsonProperty("summary")
    private String summary;
    
    public EndpointHealth setDetails(String details) {
        this.details = details;
        return this;
    }

    public String getDetails() {
        return details;
    }
    
    public EndpointHealth setFailureReason(TerminationReason failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public TerminationReason getFailureReason() {
        return failureReason;
    }
    
    public EndpointHealth setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }
    
    public EndpointHealth setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Status getStatus() {
        return status;
    }
    
    public EndpointHealth setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getSummary() {
        return summary;
    }
    
}

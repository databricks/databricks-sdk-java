// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class LogSyncStatus {
    /**
     * The timestamp of last attempt. If the last attempt fails,
     * `last_exception` will contain the exception in the last attempt.
     */
    @JsonProperty("last_attempted")
    private Long lastAttempted;
    
    /**
     * The exception thrown in the last attempt, it would be null (omitted in
     * the response) if there is no exception in last attempted.
     */
    @JsonProperty("last_exception")
    private String lastException;
    
    public LogSyncStatus setLastAttempted(Long lastAttempted) {
        this.lastAttempted = lastAttempted;
        return this;
    }

    public Long getLastAttempted() {
        return lastAttempted;
    }
    
    public LogSyncStatus setLastException(String lastException) {
        this.lastException = lastException;
        return this;
    }

    public String getLastException() {
        return lastException;
    }
    
}

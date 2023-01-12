// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TimeRange {
    /**
     * Limit results to queries that started before this time.
     */
    @JsonProperty("end_time_ms")
    private Long endTimeMs;
    
    /**
     * Limit results to queries that started after this time.
     */
    @JsonProperty("start_time_ms")
    private Long startTimeMs;
    
    public TimeRange setEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
        return this;
    }

    public Long getEndTimeMs() {
        return endTimeMs;
    }
    
    public TimeRange setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
        return this;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }
    
}

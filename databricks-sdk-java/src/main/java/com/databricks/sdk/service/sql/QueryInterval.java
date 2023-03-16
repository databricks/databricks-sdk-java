// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class QueryInterval {
    /**
     * For weekly runs, the day of the week to start the run.
     */
    @JsonProperty("day_of_week")
    private String dayOfWeek;
    
    /**
     * Integer number of seconds between runs.
     */
    @JsonProperty("interval")
    private Long interval;
    
    /**
     * For daily, weekly, and monthly runs, the time of day to start the run.
     */
    @JsonProperty("time")
    private String time;
    
    /**
     * A date after which this schedule no longer applies.
     */
    @JsonProperty("until")
    private String until;
    
    public QueryInterval setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
    
    public QueryInterval setInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    public Long getInterval() {
        return interval;
    }
    
    public QueryInterval setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return time;
    }
    
    public QueryInterval setUntil(String until) {
        this.until = until;
        return this;
    }

    public String getUntil() {
        return until;
    }
    
}

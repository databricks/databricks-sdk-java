// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class FileArrivalTriggerSettings {
    /**
     * If set, the trigger starts a run only after the specified amount of time
     * passed since the last time the trigger fired. The minimum allowed value
     * is 60 seconds
     */
    @JsonProperty("min_time_between_trigger_seconds")
    private Long minTimeBetweenTriggerSeconds;
    
    /**
     * URL to be monitored for file arrivals. The path must point to the root or
     * a subpath of the external location.
     */
    @JsonProperty("url")
    private String url;
    
    /**
     * If set, the trigger starts a run only after no file activity has occurred
     * for the specified amount of time. This makes it possible to wait for a
     * batch of incoming files to arrive before triggering a run. The minimum
     * allowed value is 60 seconds.
     */
    @JsonProperty("wait_after_last_change_seconds")
    private Long waitAfterLastChangeSeconds;
    
    public FileArrivalTriggerSettings setMinTimeBetweenTriggerSeconds(Long minTimeBetweenTriggerSeconds) {
        this.minTimeBetweenTriggerSeconds = minTimeBetweenTriggerSeconds;
        return this;
    }

    public Long getMinTimeBetweenTriggerSeconds() {
        return minTimeBetweenTriggerSeconds;
    }
    
    public FileArrivalTriggerSettings setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
    public FileArrivalTriggerSettings setWaitAfterLastChangeSeconds(Long waitAfterLastChangeSeconds) {
        this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
        return this;
    }

    public Long getWaitAfterLastChangeSeconds() {
        return waitAfterLastChangeSeconds;
    }
    
}

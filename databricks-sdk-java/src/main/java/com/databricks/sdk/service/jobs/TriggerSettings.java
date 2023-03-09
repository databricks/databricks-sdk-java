// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TriggerSettings {
    /**
     * File arrival trigger settings.
     */
    @JsonProperty("file_arrival")
    private FileArrivalTriggerSettings fileArrival;
    
    /**
     * Whether this trigger is paused or not.
     */
    @JsonProperty("pause_status")
    private TriggerSettingsPauseStatus pauseStatus;
    
    public TriggerSettings setFileArrival(FileArrivalTriggerSettings fileArrival) {
        this.fileArrival = fileArrival;
        return this;
    }

    public FileArrivalTriggerSettings getFileArrival() {
        return fileArrival;
    }
    
    public TriggerSettings setPauseStatus(TriggerSettingsPauseStatus pauseStatus) {
        this.pauseStatus = pauseStatus;
        return this;
    }

    public TriggerSettingsPauseStatus getPauseStatus() {
        return pauseStatus;
    }
    
}

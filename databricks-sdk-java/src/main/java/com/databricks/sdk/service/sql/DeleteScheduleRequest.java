// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a refresh schedule
 */
@Generated("databricks-sdk-generator")
public class DeleteScheduleRequest {
    /**
     
     */
    
    private String alertId;
    
    /**
     
     */
    
    private String scheduleId;
    
    public DeleteScheduleRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return alertId;
    }
    
    public DeleteScheduleRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    public String getScheduleId() {
        return scheduleId;
    }
    
}

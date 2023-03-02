// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * [DEPRECATED] Get refresh schedules
 */
@Generated("databricks-sdk-generator")
public class ListSchedulesRequest {
    /**
     
     */
    
    private String alertId;
    
    public ListSchedulesRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return alertId;
    }
    
}

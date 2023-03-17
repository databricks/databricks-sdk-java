// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateSubscription {
    /**
     * ID of the alert.
     */
    @JsonProperty("alert_id")
    private String alertId;
    
    /**
     * ID of the alert subscriber (if subscribing an alert destination). Alert
     * destinations can be configured by admins through the UI. See
     * [here](/sql/admin/alert-destinations.html).
     */
    @JsonProperty("destination_id")
    private String destinationId;
    
    /**
     * ID of the alert subscriber (if subscribing a user).
     */
    @JsonProperty("user_id")
    private Long userId;
    
    public CreateSubscription setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return alertId;
    }
    
    public CreateSubscription setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    public String getDestinationId() {
        return destinationId;
    }
    
    public CreateSubscription setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }
    
}

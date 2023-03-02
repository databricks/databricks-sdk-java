// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * [DEPRECATED] Unsubscribe to an alert
 */
@Generated("databricks-sdk-generator")
public class UnsubscribeRequest {
    /**
     
     */
    
    private String alertId;
    
    /**
     
     */
    
    private String subscriptionId;
    
    public UnsubscribeRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return alertId;
    }
    
    public UnsubscribeRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }
    
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlTaskAlert {
    /**
     * The canonical identifier of the SQL alert.
     */
    @JsonProperty("alert_id")
    private String alertId;
    
    /**
     * If true, the alert notifications are not sent to subscribers.
     */
    @JsonProperty("pause_subscriptions")
    private Boolean pauseSubscriptions;
    
    /**
     * If specified, alert notifications are sent to subscribers.
     */
    @JsonProperty("subscriptions")
    private java.util.List<SqlTaskSubscription> subscriptions;
    
    public SqlTaskAlert setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    public String getAlertId() {
        return alertId;
    }
    
    public SqlTaskAlert setPauseSubscriptions(Boolean pauseSubscriptions) {
        this.pauseSubscriptions = pauseSubscriptions;
        return this;
    }

    public Boolean getPauseSubscriptions() {
        return pauseSubscriptions;
    }
    
    public SqlTaskAlert setSubscriptions(java.util.List<SqlTaskSubscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public java.util.List<SqlTaskSubscription> getSubscriptions() {
        return subscriptions;
    }
    
}

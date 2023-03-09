// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SqlTaskSubscription {
    /**
     * The canonical identifier of the destination to receive email
     * notification.
     */
    @JsonProperty("destination_id")
    private String destinationId;
    
    /**
     * The user name to receive the subscription email.
     */
    @JsonProperty("user_name")
    private String userName;
    
    public SqlTaskSubscription setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    public String getDestinationId() {
        return destinationId;
    }
    
    public SqlTaskSubscription setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}

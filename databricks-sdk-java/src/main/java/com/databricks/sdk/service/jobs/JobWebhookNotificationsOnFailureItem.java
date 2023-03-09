// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class JobWebhookNotificationsOnFailureItem {
    /**
     
     */
    @JsonProperty("id")
    private String id;
    
    public JobWebhookNotificationsOnFailureItem setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}

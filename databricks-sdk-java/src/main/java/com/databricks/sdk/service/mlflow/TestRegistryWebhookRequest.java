// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TestRegistryWebhookRequest {
    /**
     * If `event` is specified, the test trigger uses the specified event. If
     * `event` is not specified, the test trigger uses a randomly chosen event
     * associated with the webhook.
     */
    @JsonProperty("event")
    private RegistryWebhookEvent event;
    
    /**
     * Webhook ID
     */
    @JsonProperty("id")
    private String id;
    
    public TestRegistryWebhookRequest setEvent(RegistryWebhookEvent event) {
        this.event = event;
        return this;
    }

    public RegistryWebhookEvent getEvent() {
        return event;
    }
    
    public TestRegistryWebhookRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}

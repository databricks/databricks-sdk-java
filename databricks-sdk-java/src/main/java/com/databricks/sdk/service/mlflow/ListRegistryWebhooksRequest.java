// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List registry webhooks
 */
public class ListRegistryWebhooksRequest {
    /**
     * If `events` is specified, any webhook with one or more of the specified
     * trigger events is included in the output. If `events` is not specified,
     * webhooks of all event types are included in the output.
     */
    @QueryParam("events")
    private java.util.List<RegistryWebhookEvent> events;
    
    /**
     * If not specified, all webhooks associated with the specified events are
     * listed, regardless of their associated model.
     */
    @QueryParam("model_name")
    private String modelName;
    
    /**
     * Token indicating the page of artifact results to fetch
     */
    @QueryParam("page_token")
    private String pageToken;
    
    public ListRegistryWebhooksRequest setEvents(java.util.List<RegistryWebhookEvent> events) {
        this.events = events;
        return this;
    }

    public java.util.List<RegistryWebhookEvent> getEvents() {
        return events;
    }
    
    public ListRegistryWebhooksRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return modelName;
    }
    
    public ListRegistryWebhooksRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
}

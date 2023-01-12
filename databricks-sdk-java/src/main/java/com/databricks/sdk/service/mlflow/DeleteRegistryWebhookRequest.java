// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a webhook
 */
@Generated("databricks-sdk-generator")
public class DeleteRegistryWebhookRequest {
    /**
     * Webhook ID required to delete a registry webhook.
     */
    @QueryParam("id")
    private String id;
    
    public DeleteRegistryWebhookRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}

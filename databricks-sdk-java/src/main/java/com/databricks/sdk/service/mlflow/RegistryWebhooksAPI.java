// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class RegistryWebhooksAPI {
    private final RegistryWebhooksService impl;

    /** Regular-use constructor */
    public RegistryWebhooksAPI(ApiClient apiClient) {
        impl = new RegistryWebhooksImpl(apiClient);
    }

    /** Constructor for mocks */
    public RegistryWebhooksAPI(RegistryWebhooksService mock) {
        impl = mock;
    }
	
	/**
     * Create a webhook.
     * 
     * **NOTE**: This endpoint is in Public Preview.
     * 
     * Creates a registry webhook.
     */
    public CreateResponse create(CreateRegistryWebhook request) {
        return impl.create(request);
    }
    
	/**
     * Delete a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Deletes a registry webhook.
     */
    public void delete(DeleteRegistryWebhookRequest request) {
        impl.delete(request);
    }
    
	/**
     * List registry webhooks.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Lists all registry webhooks.
     */
    public ListRegistryWebhooks list(ListRegistryWebhooksRequest request) {
        return impl.list(request);
    }
    
	/**
     * Test a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Tests a registry webhook.
     */
    public TestRegistryWebhookResponse test(TestRegistryWebhookRequest request) {
        return impl.test(request);
    }
    
	/**
     * Update a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Updates a registry webhook.
     */
    public void update(UpdateRegistryWebhook request) {
        impl.update(request);
    }
    
    public RegistryWebhooksService impl() {
        return impl;
    }
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class RegistryWebhooksAPI implements RegistryWebhooksService {
    private final ApiClient apiClient;

    public RegistryWebhooksAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a webhook.
     * 
     * **NOTE**: This endpoint is in Public Preview.
     * 
     * Creates a registry webhook.
     */
    @Override
    public CreateResponse create(CreateRegistryWebhook request) {
        String path = "/api/2.0/mlflow/registry-webhooks/create";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Deletes a registry webhook.
     */
    @Override
    public void delete(DeleteRegistryWebhookRequest request) {
        String path = "/api/2.0/mlflow/registry-webhooks/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * List registry webhooks.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Lists all registry webhooks.
     */
    @Override
    public ListRegistryWebhooks list(ListRegistryWebhooksRequest request) {
        String path = "/api/2.0/mlflow/registry-webhooks/list";
        return apiClient.GET(path, request, ListRegistryWebhooks.class);
    }
    
	/**
     * Test a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Tests a registry webhook.
     */
    @Override
    public TestRegistryWebhookResponse test(TestRegistryWebhookRequest request) {
        String path = "/api/2.0/mlflow/registry-webhooks/test";
        return apiClient.POST(path, request, TestRegistryWebhookResponse.class);
    }
    
	/**
     * Update a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Updates a registry webhook.
     */
    @Override
    public void update(UpdateRegistryWebhook request) {
        String path = "/api/2.0/mlflow/registry-webhooks/update";
        apiClient.PATCH(path, request, Void.class);
    }
    
}
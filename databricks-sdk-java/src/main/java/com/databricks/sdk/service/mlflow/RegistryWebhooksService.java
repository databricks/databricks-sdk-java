// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface RegistryWebhooksService {
	/**
     * Create a webhook.
     * 
     * **NOTE**: This endpoint is in Public Preview.
     * 
     * Creates a registry webhook.
     */
    CreateResponse create(CreateRegistryWebhook createRegistryWebhook);
    
	/**
     * Delete a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Deletes a registry webhook.
     */
    void delete(DeleteRegistryWebhookRequest deleteRegistryWebhookRequest);
    
	/**
     * List registry webhooks.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Lists all registry webhooks.
     */
    ListRegistryWebhooks list(ListRegistryWebhooksRequest listRegistryWebhooksRequest);
    
	/**
     * Test a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Tests a registry webhook.
     */
    TestRegistryWebhookResponse test(TestRegistryWebhookRequest testRegistryWebhookRequest);
    
	/**
     * Update a webhook.
     * 
     * **NOTE:** This endpoint is in Public Preview.
     * 
     * Updates a registry webhook.
     */
    void update(UpdateRegistryWebhook updateRegistryWebhook);
    
}
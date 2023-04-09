// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface RegistryWebhooksService {
  /**
   * Create a webhook.
   *
   * <p>**NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   */
  CreateResponse create(CreateRegistryWebhook createRegistryWebhook);

  /**
   * Delete a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   */
  void delete(DeleteRegistryWebhookRequest deleteRegistryWebhookRequest);

  /**
   * List registry webhooks.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   */
  ListRegistryWebhooks list(ListRegistryWebhooksRequest listRegistryWebhooksRequest);

  /**
   * Test a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   */
  TestRegistryWebhookResponse test(TestRegistryWebhookRequest testRegistryWebhookRequest);

  /**
   * Update a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   */
  void update(UpdateRegistryWebhook updateRegistryWebhook);
}

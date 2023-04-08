// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

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

  public CreateResponse create(Collection<RegistryWebhookEvent> events) {
    return create(new CreateRegistryWebhook().setEvents(events));
  }

  /**
   * Create a webhook.
   *
   * <p>**NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   */
  public CreateResponse create(CreateRegistryWebhook request) {
    return impl.create(request);
  }

  /**
   * Delete a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   */
  public void delete(DeleteRegistryWebhookRequest request) {
    impl.delete(request);
  }

  /**
   * List registry webhooks.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   */
  public ListRegistryWebhooks list(ListRegistryWebhooksRequest request) {
    return impl.list(request);
  }

  public TestRegistryWebhookResponse test(String id) {
    return test(new TestRegistryWebhookRequest().setId(id));
  }

  /**
   * Test a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   */
  public TestRegistryWebhookResponse test(TestRegistryWebhookRequest request) {
    return impl.test(request);
  }

  public void update(String id) {
    update(new UpdateRegistryWebhook().setId(id));
  }

  /**
   * Update a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   */
  public void update(UpdateRegistryWebhook request) {
    impl.update(request);
  }

  public RegistryWebhooksService impl() {
    return impl;
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistryWebhooksAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RegistryWebhooksAPI.class);

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
  public Iterable<RegistryWebhook> list(ListRegistryWebhooksRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListRegistryWebhooks::getWebhooks,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
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

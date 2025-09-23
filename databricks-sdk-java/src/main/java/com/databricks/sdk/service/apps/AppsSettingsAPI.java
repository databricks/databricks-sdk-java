// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Apps Settings manage the settings for the Apps service on a customer's Databricks instance. */
@Generated
public class AppsSettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AppsSettingsAPI.class);

  private final AppsSettingsService impl;

  /** Regular-use constructor */
  public AppsSettingsAPI(ApiClient apiClient) {
    impl = new AppsSettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AppsSettingsAPI(AppsSettingsService mock) {
    impl = mock;
  }

  /** Creates a custom template. */
  public CustomTemplate createCustomTemplate(CreateCustomTemplateRequest request) {
    return impl.createCustomTemplate(request);
  }

  public CustomTemplate deleteCustomTemplate(String name) {
    return deleteCustomTemplate(new DeleteCustomTemplateRequest().setName(name));
  }

  /** Deletes the custom template with the specified name. */
  public CustomTemplate deleteCustomTemplate(DeleteCustomTemplateRequest request) {
    return impl.deleteCustomTemplate(request);
  }

  public CustomTemplate getCustomTemplate(String name) {
    return getCustomTemplate(new GetCustomTemplateRequest().setName(name));
  }

  /** Gets the custom template with the specified name. */
  public CustomTemplate getCustomTemplate(GetCustomTemplateRequest request) {
    return impl.getCustomTemplate(request);
  }

  /** Lists all custom templates in the workspace. */
  public Iterable<CustomTemplate> listCustomTemplates(ListCustomTemplatesRequest request) {
    return new Paginator<>(
        request,
        impl::listCustomTemplates,
        ListCustomTemplatesResponse::getTemplates,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates the custom template with the specified name. Note that the template name cannot be
   * updated.
   */
  public CustomTemplate updateCustomTemplate(UpdateCustomTemplateRequest request) {
    return impl.updateCustomTemplate(request);
  }

  public AppsSettingsService impl() {
    return impl;
  }
}

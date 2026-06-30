// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;

/**
 * Apps Settings manage the settings for the Apps service on a customer's Databricks instance.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AppsSettingsService {
  /** Creates a custom template. */
  CustomTemplate createCustomTemplate(CreateCustomTemplateRequest createCustomTemplateRequest);

  /** Deletes the custom template with the specified name. */
  CustomTemplate deleteCustomTemplate(DeleteCustomTemplateRequest deleteCustomTemplateRequest);

  /** Gets the custom template with the specified name. */
  CustomTemplate getCustomTemplate(GetCustomTemplateRequest getCustomTemplateRequest);

  /** Lists all custom templates in the workspace. */
  ListCustomTemplatesResponse listCustomTemplates(
      ListCustomTemplatesRequest listCustomTemplatesRequest);

  /**
   * Updates the custom template with the specified name. Note that the template name cannot be
   * updated.
   */
  CustomTemplate updateCustomTemplate(UpdateCustomTemplateRequest updateCustomTemplateRequest);
}

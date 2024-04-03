// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether enhanced security monitoring is enabled for the current workspace. If the
 * compliance security profile is enabled, this is automatically enabled. By default, it is
 * disabled. However, if the compliance security profile is enabled, this is automatically enabled.
 *
 * <p>If the compliance security profile is disabled, you can enable or disable this setting and it
 * is not permanent.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EsmEnablementService {
  /**
   * Get the enhanced security monitoring setting.
   *
   * <p>Gets the enhanced security monitoring setting.
   */
  EsmEnablementSetting get(GetEsmEnablementSettingRequest getEsmEnablementSettingRequest);

  /**
   * Update the enhanced security monitoring setting.
   *
   * <p>Updates the enhanced security monitoring setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  EsmEnablementSetting update(UpdateEsmEnablementSettingRequest updateEsmEnablementSettingRequest);
}

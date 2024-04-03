// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether to enable the compliance security profile for the current workspace. Enabling it
 * on a workspace is permanent. By default, it is turned off.
 *
 * <p>This settings can NOT be disabled once it is enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CspEnablementService {
  /**
   * Get the compliance security profile setting.
   *
   * <p>Gets the compliance security profile setting.
   */
  CspEnablementSetting get(GetCspEnablementSettingRequest getCspEnablementSettingRequest);

  /**
   * Update the compliance security profile setting.
   *
   * <p>Updates the compliance security profile setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  CspEnablementSetting update(UpdateCspEnablementSettingRequest updateCspEnablementSettingRequest);
}

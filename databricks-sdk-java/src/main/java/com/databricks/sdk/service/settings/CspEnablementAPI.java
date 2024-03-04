// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether to enable the compliance security profile for the current workspace. Enabling it
 * on a workspace is permanent. By default, it is turned off.
 *
 * <p>This settings can NOT be disabled once it is enabled.
 */
@Generated
public class CspEnablementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CspEnablementAPI.class);

  private final CspEnablementService impl;

  /** Regular-use constructor */
  public CspEnablementAPI(ApiClient apiClient) {
    impl = new CspEnablementImpl(apiClient);
  }

  /** Constructor for mocks */
  public CspEnablementAPI(CspEnablementService mock) {
    impl = mock;
  }

  /**
   * Get the compliance security profile setting.
   *
   * <p>Gets the compliance security profile setting.
   */
  public CspEnablementSetting get(GetCspEnablementRequest request) {
    return impl.get(request);
  }

  public CspEnablementSetting update(
      boolean allowMissing, CspEnablementSetting setting, String fieldMask) {
    return update(
        new UpdateCspEnablementSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the compliance security profile setting.
   *
   * <p>Updates the compliance security profile setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public CspEnablementSetting update(UpdateCspEnablementSettingRequest request) {
    return impl.update(request);
  }

  public CspEnablementService impl() {
    return impl;
  }
}

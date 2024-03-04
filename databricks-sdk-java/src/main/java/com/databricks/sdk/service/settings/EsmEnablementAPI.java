// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether enhanced security monitoring is enabled for the current workspace. If the
 * compliance security profile is enabled, this is automatically enabled. By default, it is
 * disabled. However, if the compliance security profile is enabled, this is automatically enabled.
 *
 * <p>If the compliance security profile is disabled, you can enable or disable this setting and it
 * is not permanent.
 */
@Generated
public class EsmEnablementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EsmEnablementAPI.class);

  private final EsmEnablementService impl;

  /** Regular-use constructor */
  public EsmEnablementAPI(ApiClient apiClient) {
    impl = new EsmEnablementImpl(apiClient);
  }

  /** Constructor for mocks */
  public EsmEnablementAPI(EsmEnablementService mock) {
    impl = mock;
  }

  /**
   * Get the enhanced security monitoring setting.
   *
   * <p>Gets the enhanced security monitoring setting.
   */
  public EsmEnablementSetting get(GetEsmEnablementRequest request) {
    return impl.get(request);
  }

  public EsmEnablementSetting update(
      boolean allowMissing, EsmEnablementSetting setting, String fieldMask) {
    return update(
        new UpdateEsmEnablementSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the enhanced security monitoring setting.
   *
   * <p>Updates the enhanced security monitoring setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public EsmEnablementSetting update(UpdateEsmEnablementSettingRequest request) {
    return impl.update(request);
  }

  public EsmEnablementService impl() {
    return impl;
  }
}

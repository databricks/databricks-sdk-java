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
public class EnhancedSecurityMonitoringAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnhancedSecurityMonitoringAPI.class);

  private final EnhancedSecurityMonitoringService impl;

  /** Regular-use constructor */
  public EnhancedSecurityMonitoringAPI(ApiClient apiClient) {
    impl = new EnhancedSecurityMonitoringImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnhancedSecurityMonitoringAPI(EnhancedSecurityMonitoringService mock) {
    impl = mock;
  }

  /** Gets the enhanced security monitoring setting. */
  public EnhancedSecurityMonitoringSetting get(
      GetEnhancedSecurityMonitoringSettingRequest request) {
    return impl.get(request);
  }

  public EnhancedSecurityMonitoringSetting update(
      boolean allowMissing, EnhancedSecurityMonitoringSetting setting, String fieldMask) {
    return update(
        new UpdateEnhancedSecurityMonitoringSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Updates the enhanced security monitoring setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a `GET` request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public EnhancedSecurityMonitoringSetting update(
      UpdateEnhancedSecurityMonitoringSettingRequest request) {
    return impl.update(request);
  }

  public EnhancedSecurityMonitoringService impl() {
    return impl;
  }
}

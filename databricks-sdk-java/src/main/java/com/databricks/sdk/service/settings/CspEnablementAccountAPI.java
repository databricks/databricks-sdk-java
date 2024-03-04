// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The compliance security profile settings at the account level control whether to enable it for
 * new workspaces. By default, this account-level setting is disabled for new workspaces. After
 * workspace creation, account admins can enable the compliance security profile individually for
 * each workspace.
 *
 * <p>This settings can be disabled so that new workspaces do not have compliance security profile
 * enabled by default.
 */
@Generated
public class CspEnablementAccountAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CspEnablementAccountAPI.class);

  private final CspEnablementAccountService impl;

  /** Regular-use constructor */
  public CspEnablementAccountAPI(ApiClient apiClient) {
    impl = new CspEnablementAccountImpl(apiClient);
  }

  /** Constructor for mocks */
  public CspEnablementAccountAPI(CspEnablementAccountService mock) {
    impl = mock;
  }

  /**
   * Get the compliance security profile setting for new workspaces.
   *
   * <p>Gets the compliance security profile setting for new workspaces.
   */
  public CspEnablementAccountSetting get(GetCspEnablementAccountRequest request) {
    return impl.get(request);
  }

  public CspEnablementAccountSetting update(
      boolean allowMissing, CspEnablementAccountSetting setting, String fieldMask) {
    return update(
        new UpdateCspEnablementAccountSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the compliance security profile setting for new workspaces.
   *
   * <p>Updates the value of the compliance security profile setting for new workspaces.
   */
  public CspEnablementAccountSetting update(UpdateCspEnablementAccountSettingRequest request) {
    return impl.update(request);
  }

  public CspEnablementAccountService impl() {
    return impl;
  }
}

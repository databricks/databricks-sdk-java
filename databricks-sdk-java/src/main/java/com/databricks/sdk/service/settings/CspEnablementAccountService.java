// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The compliance security profile settings at the account level control whether to enable it for
 * new workspaces. By default, this account-level setting is disabled for new workspaces. After
 * workspace creation, account admins can enable the compliance security profile individually for
 * each workspace.
 *
 * <p>This settings can be disabled so that new workspaces do not have compliance security profile
 * enabled by default.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CspEnablementAccountService {
  /**
   * Get the compliance security profile setting for new workspaces.
   *
   * <p>Gets the compliance security profile setting for new workspaces.
   */
  CspEnablementAccountSetting get(
      GetCspEnablementAccountSettingRequest getCspEnablementAccountSettingRequest);

  /**
   * Update the compliance security profile setting for new workspaces.
   *
   * <p>Updates the value of the compliance security profile setting for new workspaces.
   */
  CspEnablementAccountSetting update(
      UpdateCspEnablementAccountSettingRequest updateCspEnablementAccountSettingRequest);
}

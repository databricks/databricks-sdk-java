// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The enhanced security monitoring setting at the account level controls whether to enable the
 * feature on new workspaces. By default, this account-level setting is disabled for new workspaces.
 * After workspace creation, account admins can enable enhanced security monitoring individually for
 * each workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EsmEnablementAccountService {
  /**
   * Get the enhanced security monitoring setting for new workspaces.
   *
   * <p>Gets the enhanced security monitoring setting for new workspaces.
   */
  EsmEnablementAccountSetting get(GetEsmEnablementAccountRequest getEsmEnablementAccountRequest);

  /**
   * Update the enhanced security monitoring setting for new workspaces.
   *
   * <p>Updates the value of the enhanced security monitoring setting for new workspaces.
   */
  EsmEnablementAccountSetting update(
      UpdateEsmEnablementAccountSettingRequest updateEsmEnablementAccountSettingRequest);
}

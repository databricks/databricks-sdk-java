// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The Personal Compute enablement setting lets you control which users can use the Personal Compute
 * default policy to create compute resources. By default all users in all workspaces have access
 * (ON), but you can change the setting to instead let individual workspaces configure access
 * control (DELEGATE).
 *
 * <p>There is only one instance of this setting per account. Since this setting has a default
 * value, this setting is present on all accounts even though it's never set on a given account.
 * Deletion reverts the value of the setting back to the default value.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountSettingsService {
  /**
   * Delete Personal Compute setting.
   *
   * <p>Reverts back the Personal Compute setting value to default (ON)
   */
  DeletePersonalComputeSettingResponse deletePersonalComputeSetting(
      DeletePersonalComputeSettingRequest deletePersonalComputeSettingRequest);

  /**
   * Get the compliance security profile setting for new workspaces.
   *
   * <p>Gets the compliance security profile setting for new workspaces.
   */
  CspEnablementAccountSetting getCspEnablementAccountSetting(
      GetCspEnablementAccountSettingRequest getCspEnablementAccountSettingRequest);

  /**
   * Get the enhanced security monitoring setting for new workspaces.
   *
   * <p>Gets the enhanced security monitoring setting for new workspaces.
   */
  EsmEnablementAccountSetting getEsmEnablementAccountSetting(
      GetEsmEnablementAccountSettingRequest getEsmEnablementAccountSettingRequest);

  /**
   * Get Personal Compute setting.
   *
   * <p>Gets the value of the Personal Compute setting.
   */
  PersonalComputeSetting getPersonalComputeSetting(
      GetPersonalComputeSettingRequest getPersonalComputeSettingRequest);

  /**
   * Update the compliance security profile setting for new workspaces.
   *
   * <p>Updates the value of the compliance security profile setting for new workspaces.
   */
  CspEnablementAccountSetting updateCspEnablementAccountSetting(
      UpdateCspEnablementAccountSettingRequest updateCspEnablementAccountSettingRequest);

  /**
   * Update the enhanced security monitoring setting for new workspaces.
   *
   * <p>Updates the value of the enhanced security monitoring setting for new workspaces.
   */
  EsmEnablementAccountSetting updateEsmEnablementAccountSetting(
      UpdateEsmEnablementAccountSettingRequest updateEsmEnablementAccountSettingRequest);

  /**
   * Update Personal Compute setting.
   *
   * <p>Updates the value of the Personal Compute setting.
   */
  PersonalComputeSetting updatePersonalComputeSetting(
      UpdatePersonalComputeSettingRequest updatePersonalComputeSettingRequest);
}

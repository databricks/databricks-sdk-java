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
   * Get Personal Compute setting.
   *
   * <p>Gets the value of the Personal Compute setting.
   */
  PersonalComputeSetting readPersonalComputeSetting(
      ReadPersonalComputeSettingRequest readPersonalComputeSettingRequest);

  /**
   * Update Personal Compute setting.
   *
   * <p>Updates the value of the Personal Compute setting.
   */
  PersonalComputeSetting updatePersonalComputeSetting(
      UpdatePersonalComputeSettingRequest updatePersonalComputeSettingRequest);
}

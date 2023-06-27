// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * TBD
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
   * <p>TBD
   */
  DeletePersonalComputeSettingResponse deletePersonalComputeSetting(
      DeletePersonalComputeSettingRequest deletePersonalComputeSettingRequest);

  /**
   * Get Personal Compute setting.
   *
   * <p>TBD
   */
  PersonalComputeSetting readPersonalComputeSetting(
      ReadPersonalComputeSettingRequest readPersonalComputeSettingRequest);

  /**
   * Update Personal Compute setting.
   *
   * <p>TBD
   */
  PersonalComputeSetting updatePersonalComputeSetting(
      UpdatePersonalComputeSettingRequest updatePersonalComputeSettingRequest);
}

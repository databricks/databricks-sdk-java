// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** TBD */
@Generated
public class AccountSettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountSettingsAPI.class);

  private final AccountSettingsService impl;

  /** Regular-use constructor */
  public AccountSettingsAPI(ApiClient apiClient) {
    impl = new AccountSettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountSettingsAPI(AccountSettingsService mock) {
    impl = mock;
  }

  /**
   * Delete Personal Compute setting.
   *
   * <p>TBD
   */
  public DeletePersonalComputeSettingResponse deletePersonalComputeSetting(
      DeletePersonalComputeSettingRequest request) {
    return impl.deletePersonalComputeSetting(request);
  }

  /**
   * Get Personal Compute setting.
   *
   * <p>TBD
   */
  public PersonalComputeSetting readPersonalComputeSetting(
      ReadPersonalComputeSettingRequest request) {
    return impl.readPersonalComputeSetting(request);
  }

  /**
   * Update Personal Compute setting.
   *
   * <p>TBD
   */
  public PersonalComputeSetting updatePersonalComputeSetting(
      UpdatePersonalComputeSettingRequest request) {
    return impl.updatePersonalComputeSetting(request);
  }

  public AccountSettingsService impl() {
    return impl;
  }
}

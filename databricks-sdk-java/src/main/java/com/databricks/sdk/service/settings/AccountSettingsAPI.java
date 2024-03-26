// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Accounts Settings API allows users to manage settings at the account level. */
@Generated
public class AccountSettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountSettingsAPI.class);

  private final AccountSettingsService impl;

  private CspEnablementAccountAPI cspEnablementAccountAPI;

  private EsmEnablementAccountAPI esmEnablementAccountAPI;

  private PersonalComputeAPI personalComputeAPI;

  /** Regular-use constructor */
  public AccountSettingsAPI(ApiClient apiClient) {
    impl = new AccountSettingsImpl(apiClient);

    cspEnablementAccountAPI = new CspEnablementAccountAPI(apiClient);

    esmEnablementAccountAPI = new EsmEnablementAccountAPI(apiClient);

    personalComputeAPI = new PersonalComputeAPI(apiClient);
  }

  /** Constructor for mocks */
  public AccountSettingsAPI(AccountSettingsService mock) {
    impl = mock;
  }

  /**
   * The compliance security profile settings at the account level control whether to enable it for
   * new workspaces.
   */
  public CspEnablementAccountAPI CspEnablementAccount() {
    return cspEnablementAccountAPI;
  }

  /**
   * The enhanced security monitoring setting at the account level controls whether to enable the
   * feature on new workspaces.
   */
  public EsmEnablementAccountAPI EsmEnablementAccount() {
    return esmEnablementAccountAPI;
  }

  /**
   * The Personal Compute enablement setting lets you control which users can use the Personal
   * Compute default policy to create compute resources.
   */
  public PersonalComputeAPI PersonalCompute() {
    return personalComputeAPI;
  }

  public AccountSettingsService impl() {
    return impl;
  }
}

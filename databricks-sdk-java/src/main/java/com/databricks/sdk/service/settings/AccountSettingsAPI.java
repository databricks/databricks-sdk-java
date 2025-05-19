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

  private DisableLegacyFeaturesAPI disableLegacyFeaturesAPI;

  private EnableIpAccessListsAPI enableIpAccessListsAPI;

  private EsmEnablementAccountAPI esmEnablementAccountAPI;

  private LlmProxyPartnerPoweredAccountAPI llmProxyPartnerPoweredAccountAPI;

  private LlmProxyPartnerPoweredEnforceAPI llmProxyPartnerPoweredEnforceAPI;

  private PersonalComputeAPI personalComputeAPI;

  /** Regular-use constructor */
  public AccountSettingsAPI(ApiClient apiClient) {
    impl = new AccountSettingsImpl(apiClient);

    cspEnablementAccountAPI = new CspEnablementAccountAPI(apiClient);

    disableLegacyFeaturesAPI = new DisableLegacyFeaturesAPI(apiClient);

    enableIpAccessListsAPI = new EnableIpAccessListsAPI(apiClient);

    esmEnablementAccountAPI = new EsmEnablementAccountAPI(apiClient);

    llmProxyPartnerPoweredAccountAPI = new LlmProxyPartnerPoweredAccountAPI(apiClient);

    llmProxyPartnerPoweredEnforceAPI = new LlmProxyPartnerPoweredEnforceAPI(apiClient);

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

  /** Disable legacy features for new Databricks workspaces. */
  public DisableLegacyFeaturesAPI DisableLegacyFeatures() {
    return disableLegacyFeaturesAPI;
  }

  /** Controls the enforcement of IP access lists for accessing the account console. */
  public EnableIpAccessListsAPI EnableIpAccessLists() {
    return enableIpAccessListsAPI;
  }

  /**
   * The enhanced security monitoring setting at the account level controls whether to enable the
   * feature on new workspaces.
   */
  public EsmEnablementAccountAPI EsmEnablementAccount() {
    return esmEnablementAccountAPI;
  }

  /** Determines if partner powered models are enabled or not for a specific account. */
  public LlmProxyPartnerPoweredAccountAPI LlmProxyPartnerPoweredAccount() {
    return llmProxyPartnerPoweredAccountAPI;
  }

  /**
   * Determines if the account-level partner-powered setting value is enforced upon the
   * workspace-level partner-powered setting.
   */
  public LlmProxyPartnerPoweredEnforceAPI LlmProxyPartnerPoweredEnforce() {
    return llmProxyPartnerPoweredEnforceAPI;
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

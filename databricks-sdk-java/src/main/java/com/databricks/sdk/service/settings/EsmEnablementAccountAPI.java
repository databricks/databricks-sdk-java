// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The enhanced security monitoring setting at the account level controls whether to enable the
 * feature on new workspaces. By default, this account-level setting is disabled for new workspaces.
 * After workspace creation, account admins can enable enhanced security monitoring individually for
 * each workspace.
 */
@Generated
public class EsmEnablementAccountAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EsmEnablementAccountAPI.class);

  private final EsmEnablementAccountService impl;

  /** Regular-use constructor */
  public EsmEnablementAccountAPI(ApiClient apiClient) {
    impl = new EsmEnablementAccountImpl(apiClient);
  }

  /** Constructor for mocks */
  public EsmEnablementAccountAPI(EsmEnablementAccountService mock) {
    impl = mock;
  }

  /** Gets the enhanced security monitoring setting for new workspaces. */
  public EsmEnablementAccountSetting get(GetEsmEnablementAccountSettingRequest request) {
    return impl.get(request);
  }

  /** Updates the value of the enhanced security monitoring setting for new workspaces. */
  public EsmEnablementAccountSetting update(UpdateEsmEnablementAccountSettingRequest request) {
    return impl.update(request);
  }

  public EsmEnablementAccountService impl() {
    return impl;
  }
}

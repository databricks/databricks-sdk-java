// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** APIs to manage account level settings */
@Generated
public class AccountSettingsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(AccountSettingsV2API.class);

  private final AccountSettingsV2Service impl;

  /** Regular-use constructor */
  public AccountSettingsV2API(ApiClient apiClient) {
    impl = new AccountSettingsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public AccountSettingsV2API(AccountSettingsV2Service mock) {
    impl = mock;
  }

  public Setting getPublicAccountSetting(String name) {
    return getPublicAccountSetting(new GetPublicAccountSettingRequest().setName(name));
  }

  /** Get a setting value at account level */
  public Setting getPublicAccountSetting(GetPublicAccountSettingRequest request) {
    return impl.getPublicAccountSetting(request);
  }

  public Setting patchPublicAccountSetting(String name, Setting setting) {
    return patchPublicAccountSetting(
        new PatchPublicAccountSettingRequest().setName(name).setSetting(setting));
  }

  /** Patch a setting value at account level */
  public Setting patchPublicAccountSetting(PatchPublicAccountSettingRequest request) {
    return impl.patchPublicAccountSetting(request);
  }

  public AccountSettingsV2Service impl() {
    return impl;
  }
}

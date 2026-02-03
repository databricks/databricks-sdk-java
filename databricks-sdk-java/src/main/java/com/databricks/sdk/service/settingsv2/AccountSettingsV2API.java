// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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

  /**
   * Get a setting value at account level. See :method:settingsv2/listaccountsettingsmetadata for
   * list of setting available via public APIs at account level.
   */
  public Setting getPublicAccountSetting(GetPublicAccountSettingRequest request) {
    return impl.getPublicAccountSetting(request);
  }

  public UserPreference getPublicAccountUserPreference(String userId, String name) {
    return getPublicAccountUserPreference(
        new GetPublicAccountUserPreferenceRequest().setUserId(userId).setName(name));
  }

  /**
   * Get a user preference for a specific user. User preferences are personal settings that allow
   * individual customization without affecting other users. See
   * :method:settingsv2/listaccountuserpreferencesmetadata for list of user preferences available
   * via public APIs.
   */
  public UserPreference getPublicAccountUserPreference(
      GetPublicAccountUserPreferenceRequest request) {
    return impl.getPublicAccountUserPreference(request);
  }

  /**
   * List valid setting keys and metadata. These settings are available to be referenced via GET
   * :method:settingsv2/getpublicaccountsetting and PATCH
   * :method:settingsv2/patchpublicaccountsetting APIs
   */
  public Iterable<SettingsMetadata> listAccountSettingsMetadata(
      ListAccountSettingsMetadataRequest request) {
    return new Paginator<>(
        request,
        impl::listAccountSettingsMetadata,
        ListAccountSettingsMetadataResponse::getSettingsMetadata,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<SettingsMetadata> listAccountUserPreferencesMetadata(String userId) {
    return listAccountUserPreferencesMetadata(
        new ListAccountUserPreferencesMetadataRequest().setUserId(userId));
  }

  /**
   * List valid user preferences and their metadata for a specific user. User preferences are
   * personal settings that allow individual customization without affecting other users. These
   * settings are available to be referenced via GET
   * :method:settingsv2/getpublicaccountuserpreference and PATCH
   * :method:settingsv2/patchpublicaccountuserpreference APIs
   */
  public Iterable<SettingsMetadata> listAccountUserPreferencesMetadata(
      ListAccountUserPreferencesMetadataRequest request) {
    return new Paginator<>(
        request,
        impl::listAccountUserPreferencesMetadata,
        ListAccountUserPreferencesMetadataResponse::getSettingsMetadata,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Patch a setting value at account level. See :method:settingsv2/listaccountsettingsmetadata for
   * list of setting available via public APIs at account level. To determine the correct field to
   * include in a patch request, refer to the type field of the setting returned in the
   * :method:settingsv2/listaccountsettingsmetadata response.
   *
   * <p>Note: Page refresh is required for changes to take effect in UI.
   */
  public Setting patchPublicAccountSetting(PatchPublicAccountSettingRequest request) {
    return impl.patchPublicAccountSetting(request);
  }

  /**
   * Update a user preference for a specific user. User preferences are personal settings that allow
   * individual customization without affecting other users. See
   * :method:settingsv2/listaccountuserpreferencesmetadata for list of user preferences available
   * via public APIs.
   *
   * <p>Note: Page refresh is required for changes to take effect in UI.
   */
  public UserPreference patchPublicAccountUserPreference(
      PatchPublicAccountUserPreferenceRequest request) {
    return impl.patchPublicAccountUserPreference(request);
  }

  public AccountSettingsV2Service impl() {
    return impl;
  }
}

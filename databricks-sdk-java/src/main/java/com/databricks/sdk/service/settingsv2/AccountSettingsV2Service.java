// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;

/**
 * APIs to manage account level settings
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountSettingsV2Service {
  /**
   * Get a setting value at account level. See :method:settingsv2/listaccountsettingsmetadata for
   * list of setting available via public APIs at account level.
   */
  Setting getPublicAccountSetting(GetPublicAccountSettingRequest getPublicAccountSettingRequest);

  /**
   * Get a user preference for a specific user. User preferences are personal settings that allow
   * individual customization without affecting other users. See
   * :method:settingsv2/listaccountuserpreferencesmetadata for list of user preferences available
   * via public APIs.
   */
  UserPreference getPublicAccountUserPreference(
      GetPublicAccountUserPreferenceRequest getPublicAccountUserPreferenceRequest);

  /**
   * List valid setting keys and metadata. These settings are available to be referenced via GET
   * :method:settingsv2/getpublicaccountsetting and PATCH
   * :method:settingsv2/patchpublicaccountsetting APIs
   */
  ListAccountSettingsMetadataResponse listAccountSettingsMetadata(
      ListAccountSettingsMetadataRequest listAccountSettingsMetadataRequest);

  /**
   * List valid user preferences and their metadata for a specific user. User preferences are
   * personal settings that allow individual customization without affecting other users. These
   * settings are available to be referenced via GET
   * :method:settingsv2/getpublicaccountuserpreference and PATCH
   * :method:settingsv2/patchpublicaccountuserpreference APIs
   */
  ListAccountUserPreferencesMetadataResponse listAccountUserPreferencesMetadata(
      ListAccountUserPreferencesMetadataRequest listAccountUserPreferencesMetadataRequest);

  /**
   * Patch a setting value at account level. See :method:settingsv2/listaccountsettingsmetadata for
   * list of setting available via public APIs at account level. To determine the correct field to
   * include in a patch request, refer to the type field of the setting returned in the
   * :method:settingsv2/listaccountsettingsmetadata response.
   *
   * <p>Note: Page refresh is required for changes to take effect in UI.
   */
  Setting patchPublicAccountSetting(
      PatchPublicAccountSettingRequest patchPublicAccountSettingRequest);

  /**
   * Update a user preference for a specific user. User preferences are personal settings that allow
   * individual customization without affecting other users. See
   * :method:settingsv2/listaccountuserpreferencesmetadata for list of user preferences available
   * via public APIs.
   *
   * <p>Note: Page refresh is required for changes to take effect in UI.
   */
  UserPreference patchPublicAccountUserPreference(
      PatchPublicAccountUserPreferenceRequest patchPublicAccountUserPreferenceRequest);
}

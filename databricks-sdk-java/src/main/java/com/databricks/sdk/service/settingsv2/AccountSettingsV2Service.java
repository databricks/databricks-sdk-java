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
   * List valid setting keys and metadata. These settings are available to be referenced via GET
   * :method:settingsv2/getpublicaccountsetting and PATCH
   * :method:settingsv2/patchpublicaccountsetting APIs
   */
  ListAccountSettingsMetadataResponse listAccountSettingsMetadata(
      ListAccountSettingsMetadataRequest listAccountSettingsMetadataRequest);

  /**
   * Patch a setting value at account level. See :method:settingsv2/listaccountsettingsmetadata for
   * list of setting available via public APIs at account level.
   */
  Setting patchPublicAccountSetting(
      PatchPublicAccountSettingRequest patchPublicAccountSettingRequest);
}

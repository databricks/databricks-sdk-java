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
  /** Get a setting value at account level */
  Setting getPublicAccountSetting(GetPublicAccountSettingRequest getPublicAccountSettingRequest);

  /** Patch a setting value at account level */
  Setting patchPublicAccountSetting(
      PatchPublicAccountSettingRequest patchPublicAccountSettingRequest);
}

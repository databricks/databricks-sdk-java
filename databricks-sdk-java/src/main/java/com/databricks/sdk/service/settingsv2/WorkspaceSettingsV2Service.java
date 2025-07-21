// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;

/**
 * APIs to manage workspace level settings
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceSettingsV2Service {
  /** Get a setting value at workspace level */
  Setting getPublicWorkspaceSetting(
      GetPublicWorkspaceSettingRequest getPublicWorkspaceSettingRequest);

  /** Patch a setting value at workspace level */
  Setting patchPublicWorkspaceSetting(
      PatchPublicWorkspaceSettingRequest patchPublicWorkspaceSettingRequest);
}

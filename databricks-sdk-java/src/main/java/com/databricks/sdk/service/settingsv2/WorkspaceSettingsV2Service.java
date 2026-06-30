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
  /**
   * Get a setting value at workspace level. See :method:settingsv2/listworkspacesettingsmetadata
   * for list of setting available via public APIs.
   */
  Setting getPublicWorkspaceSetting(
      GetPublicWorkspaceSettingRequest getPublicWorkspaceSettingRequest);

  /**
   * List valid setting keys and metadata. These settings are available to be referenced via GET
   * :method:settingsv2/getpublicworkspacesetting and PATCH
   * :method:settingsv2/patchpublicworkspacesetting APIs
   */
  ListWorkspaceSettingsMetadataResponse listWorkspaceSettingsMetadata(
      ListWorkspaceSettingsMetadataRequest listWorkspaceSettingsMetadataRequest);

  /**
   * Patch a setting value at workspace level. See :method:settingsv2/listworkspacesettingsmetadata
   * for list of setting available via public APIs at workspace level. To determine the correct
   * field to include in a patch request, refer to the type field of the setting returned in the
   * :method:settingsv2/listworkspacesettingsmetadata response.
   *
   * <p>Note: Page refresh is required for changes to take effect in UI.
   */
  Setting patchPublicWorkspaceSetting(
      PatchPublicWorkspaceSettingRequest patchPublicWorkspaceSettingRequest);
}

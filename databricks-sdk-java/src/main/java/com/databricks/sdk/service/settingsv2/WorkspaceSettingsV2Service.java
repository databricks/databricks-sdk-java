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

  /**
   * List valid setting keys and metadata. These settings are available to referenced via [GET
   * /api/2.1/settings/{name}](#~1api~1workspace~1settingsv2~1getpublicworkspacesetting) and [PATCH
   * /api/2.1/settings/{name}](#~1api~1workspace~1settingsv2~patchpublicworkspacesetting) APIs
   */
  ListWorkspaceSettingsMetadataResponse listWorkspaceSettingsMetadata(
      ListWorkspaceSettingsMetadataRequest listWorkspaceSettingsMetadataRequest);

  /** Patch a setting value at workspace level */
  Setting patchPublicWorkspaceSetting(
      PatchPublicWorkspaceSettingRequest patchPublicWorkspaceSettingRequest);
}

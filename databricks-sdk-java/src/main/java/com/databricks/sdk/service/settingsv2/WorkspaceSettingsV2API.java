// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** APIs to manage workspace level settings */
@Generated
public class WorkspaceSettingsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceSettingsV2API.class);

  private final WorkspaceSettingsV2Service impl;

  /** Regular-use constructor */
  public WorkspaceSettingsV2API(ApiClient apiClient) {
    impl = new WorkspaceSettingsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceSettingsV2API(WorkspaceSettingsV2Service mock) {
    impl = mock;
  }

  public Setting getPublicWorkspaceSetting(String name) {
    return getPublicWorkspaceSetting(new GetPublicWorkspaceSettingRequest().setName(name));
  }

  /** Get a setting value at workspace level */
  public Setting getPublicWorkspaceSetting(GetPublicWorkspaceSettingRequest request) {
    return impl.getPublicWorkspaceSetting(request);
  }

  public Setting patchPublicWorkspaceSetting(String name, Setting setting) {
    return patchPublicWorkspaceSetting(
        new PatchPublicWorkspaceSettingRequest().setName(name).setSetting(setting));
  }

  /** Patch a setting value at workspace level */
  public Setting patchPublicWorkspaceSetting(PatchPublicWorkspaceSettingRequest request) {
    return impl.patchPublicWorkspaceSetting(request);
  }

  public WorkspaceSettingsV2Service impl() {
    return impl;
  }
}
